package day23;

import java.util.Scanner;

public class MemberTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1:회원가입||2:로그인||3:종료");
			int sel = scanner.nextInt();
			scanner.nextLine();
			if (sel == 1) {
				//6가지 멤버에 대한 정보를 받아서
				//Member객체로 묶어서
				//MemberDao의 insertMember에 전달
				//그리고 반환되는 result값에 따라
				//성공인지 실패인지 출력
				System.out.print("이름 : ");
				String name = scanner.nextLine();
				System.out.print("아이디 : ");
				String userid = scanner.nextLine();
				System.out.print("비번 : ");
				String pwd = scanner.nextLine();
				System.out.print("이메일 : ");
				String email = scanner.nextLine();
				System.out.print("폰번 : ");
				String phone = scanner.nextLine();
				System.out.print("관리자여부 : ");
				int admin = scanner.nextInt();
				scanner.nextLine();
				
				int result = join(name, userid, pwd, 
						email, phone, admin);
				
				if(result > 0)
					System.out.println("가입성공");
				else	
					System.out.println("가입실패");
				

			} else if (sel == 2) {
				// 로그인해볼까
				System.out.println("아이디를 입력하세요");
				String userid = scanner.nextLine();
				System.out.println("비밀번호를 입력하세요");
				String pwd = scanner.nextLine();
				
				int result = login(userid, pwd);
				
				if (result == 0)
					System.out.println("아이디가 존재하지 않음");
				else if (result == 1)
					System.out.println("로그인 성공");
				else
					System.out.println("비번이 틀림");

			} else if (sel == 3)
				break;
			else
				System.out.println("잘못누르셨어");

		}
	}
	
	public static int join(String name, String userid,String pwd
			, String email, String phone, int admin){
		MemberDao mDao = MemberDao.getInstance();
		Member member= new Member();
		member.setName(name);
		member.setUserid(userid);
		member.setPwd(pwd);
		member.setEmail(email);
		member.setPhone(phone);
		member.setAdmin(admin);
		int result = mDao.insertMember(member);
		return result;
	}
	public static int login(String userid, String pwd){
		int result = 0;
		MemberDao mDao = MemberDao.getInstance();
		Member member = mDao.selectOne(userid);
		if (member == null)
			result = 0;
		else if (member.getPwd().equals(pwd))
			result = 1;
		else
			result = 2;
		return result;
	}
}
