package vector;

import java.util.Vector;     //Advance for loop make for homogenus Vector
class Advance_For_Loop_homo  //OR for each loop
{
	public static void main(String[] args) 
	{
		Vector<Integer> obj=new Vector<Integer>();
		obj.add(10);
		obj.add(11);
		obj.add(12);

		for (Object var:obj)  //Advance for loop OR For each loop  
		{
			System.out.println(var);
		}
	}
}
