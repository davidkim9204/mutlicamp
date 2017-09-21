package day24;

import day23.Member;
import day23.MemberDao;

public class MemberService {
	private MemberDao mDao;

	public MemberService() {
		mDao = MemberDao.getInstance();
	}

	public int join(String name, String userid, String pwd, String email, String phone, int admin) {
		Member member = new Member();
		member.setName(name);
		member.setUserid(userid);
		member.setPwd(pwd);
		member.setEmail(email);
		member.setPhone(phone);
		member.setAdmin(admin);
		int result = mDao.insertMember(member);
		return result;
	}

	public int login(String userid, String pwd) {
		int result = 0;
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
