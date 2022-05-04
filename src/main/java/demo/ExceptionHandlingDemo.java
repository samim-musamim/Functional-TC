package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Exception Handling Conepts");

			int i = 1 / 0;

			System.out.println("Completed");
		}

		catch (Exception e) {
			System.out.println("I am inside the catch block");
			System.out.println(e.getMessage());
			
			
			
		}
		finally {
			System.out.println("I am inside finally block");
		}

	}

}
