package day33;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NaverApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clientId = "MqX7vvNGZaqbv0WUDAQP";// 애플리케이션 클라이언트 아이디값";
		String clientSecret = "M_Z_LPCkiB";// 애플리케이션 클라이언트 시크릿값";
		try {
			String text = URLEncoder.encode("빅데이터", "UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/book.json?query=" + text; // json
																							// 결과
			// String apiURL =
			// "https://openapi.naver.com/v1/search/blog.xml?query="+ text; //
			// xml 결과
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Naver-Client-Id", clientId);
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) { // 정상 호출
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else { // 에러 발생
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			System.out.println(response.toString());
			
			// json 파싱
			Map<String, Object> map = new HashMap<String, Object>();
			ObjectMapper mapper = new ObjectMapper();
			map = mapper.readValue(response.toString(), new TypeReference<HashMap<String, Object>>(){});
			
			//System.out.println(map.get("items"));
			
			ArrayList<Map<String, Object>> items = (ArrayList) map.get("items");
			for(Map<String, Object> item : items)
				System.out.println(item.get("title"));
			
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
