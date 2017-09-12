package day17;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		String name = "/Users/";
		File dir = new File(name);
		String[] fileNames = dir.list(); // 현재 디렉토리의 전체 파일 리스트
		for (String s : fileNames) {
			File f = new File(name + "/" + s); // 절대 경로로 이름을 주어야 함
			System.out.println("===============================");
			System.out.println("이름: " + f.getName());
			System.out.println("경로: " + f.getPath());
			System.out.println("부모: " + f.getParent());
			System.out.println("절대경로: " + f.getAbsolutePath());
			System.out.println("정규경로: " + f.getCanonicalPath());
			System.out.println("디렉토리 여부:" + f.isDirectory());
			System.out.println("파일 여부:" + f.isFile());
			System.out.println("===============================");
		}
	}
}
