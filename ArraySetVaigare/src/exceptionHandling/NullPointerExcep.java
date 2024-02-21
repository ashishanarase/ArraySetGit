package exceptionHandling;

public class NullPointerExcep {


	// A Java program to demonstrate that invoking a method
	// on null causes NullPointerException

	public static void main (String[] args)
	{
		// Initializing String variable with null value
		String name = null;

		// Checking if ptr.equals null or works fine.
		try
		{
			// This line of code throws NullPointerException
			// because name is null
			if (name.equals("Ashish"))
				System.out.print("Same");
			else
				System.out.print("Not Same");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}
}


