package vector;

import java.util.Vector;   //read the object present inside the Vector based on index value
class get 
{
	public static void main(String[] args) 
	{
		Vector obj=new Vector();
		obj.add(12);
		obj.add(true);
		obj.add("Hello");
		for (int i=0;i<obj.size();i++ )
		{
			System.out.println(obj.get(i));
		}
	}
}
