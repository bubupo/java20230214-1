package ch13.sec05;

public class GenericExample {
	public static void main(String[] args) {
		
		Course.registerCoures1(new Applicant<Person>(new Person()));
		Course.registerCoures1(new Applicant<Worker>(new Worker()));
		Course.registerCoures1(new Applicant<Student>(new Student()));
		Course.registerCoures1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCoures1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.registerCoures2(new Applicant<Student>(new Student()));
		Course.registerCoures2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCoures2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		Course.registerCoures3(new Applicant<Person>(new Person()));
		Course.registerCoures3(new Applicant<Worker>(new Worker()));
	}
}
