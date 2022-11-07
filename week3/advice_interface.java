public class advice_interface {

	public static void main(String[] args) {
	
		Department_of_information information = new Department_of_information();
		
		Department_of_Computer computer = new Department_of_Computer();
	}

}



class Department_of_information implements interface_example{

	@Override
	public void max_person(int applied_student) {
		// TODO Auto-generated method stub
		int max_department_student = 50;
		if(applied_student > max_department_student) {
			System.out.println(applied_student - max_department_student
					+ "명의 학생을 떨어집니다.");			
		}
		else {
			System.out.println("모두 합격하였습니다.");
		}
	}
	

	@Override
	public int required_credit() {
		// TODO Auto-generated method stub
		int required_credit = 140;
		return required_credit;
	}

	@Override
	public void required_subject() {
		// TODO Auto-generated method stub
		String [] essential_subject = new String []  {
			"자료구조", "신호및시스템", "데이터통신", "컴퓨터네트워크"} ;
		
		for (String subject : essential_subject) {
			System.out.println(" 필수 들어야 할 과목은 " + subject + "입니다.");
		}
	}

	@Override
	public void department_event() {
		// TODO Auto-generated method stub
		String [] department_event = new String []  {
				"해오름식", "과MT" } ;
		for (String event : department_event ) {
			System.out.println(" 우리 과 학회는 " + event + "입니다.");
		}
		
	}

	@Override
	public void department_professor() {
		// TODO Auto-generated method stub
		String [] department_professor = new String []  {
				"홍길동", "김철수", "박영희" } ;
		for (String professor : department_professor ) {
			System.out.println(" 우리 과 학회는 " + professor + "입니다.");
		}
	}

	@Override
	public void department_session() {
		// TODO Auto-generated method stub
		String [] department_session = new String []  {
				"Advice", "FICS" } ;
		for (String session : department_session ) {
			System.out.println(" 우리 과 학회는 " + session + "입니다.");
		}
	}

}

class Department_of_Computer implements interface_example{


	@Override
	public void max_person(int applied_student) {
		// TODO Auto-generated method stub
		int max_department_student = 100;
		if(applied_student > max_department_student) {
			System.out.println(applied_student - max_department_student
					+ "명의 학생을 떨어집니다.");			
		}
		else {
			System.out.println("모두 합격하였습니다.");
		}
	}
	

	@Override
	public int required_credit() {
		// TODO Auto-generated method stub
		int required_credit = 150;
		return required_credit;
	}

	@Override
	public void required_subject() {
		// TODO Auto-generated method stub
		String [] essential_subject = new String []  {
			"자료구조", "컴파일러구성론", "딥러닝", "자연어처리"} ;
		
		for (String subject : essential_subject) {
			System.out.println(" 필수 들어야 할 과목은 " + subject + "입니다.");
		}
	}

	@Override
	public void department_event() {
		// TODO Auto-generated method stub
		String [] department_event = new String []  {
				"해오름식", "과MT" } ;
		for (String event : department_event ) {
			System.out.println(" 우리 과 교수님은 " + event + "입니다.");
		}
		
	}

	@Override
	public void department_professor() {
		// TODO Auto-generated method stub
		String [] department_professor = new String []  {
				"차민철", "이철수", "외국인교수님" } ;
		for (String professor : department_professor ) {
			System.out.println(" 우리 과 교수님은 " + professor + "입니다.");
		}
	}

	@Override
	public void department_session() {
		// TODO Auto-generated method stub
		String [] department_session = new String []  {
				"Advice", "FICS" } ;
		for (String session : department_session ) {
			System.out.println(" 우리 과 학회는 " + session + "입니다.");
		}
	}

}
