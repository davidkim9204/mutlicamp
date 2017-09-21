package day23;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao sDao = new StudentDao();
		for (Student s : sDao.selectAll())
			System.out.println(s);

	}

}
