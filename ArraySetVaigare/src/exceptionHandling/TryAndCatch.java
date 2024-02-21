package exceptionHandling;

public class TryAndCatch {

	public static void main(String[] args) {

		try {
			int a = 4/0;

		}
		catch(Exception e){
			e.printStackTrace();			
		}
	}

}
