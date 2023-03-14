package ch16.sec05.exam02;

	public class MethodReferenecExample {
		public static void main(String[] args) {
			Person person = new Person();
			person.ordering(String :: compareToIgnoreCase);
		}
}
