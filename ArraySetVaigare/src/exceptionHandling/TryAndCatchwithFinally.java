package exceptionHandling;

public class TryAndCatchwithFinally {

	public static void main(String[] args) {

		try {
			int a = 4/0;
		}
		catch(Exception e){
			e.printStackTrace();			
		}
		finally {
			System.out.println("This is my Finally Block");
		}
	}
}
