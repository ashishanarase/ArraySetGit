package vector;

import java.util.Vector;     //macking Vector As Homogenious
class Diamond_Bracket 
{
	public static void main(String[] args) 
	{
		Vector<Integer> obj=new Vector<Integer>();
		obj.add(12);
		obj.add(13);    //we can not allow diff value
		obj.add(14);
	    for (int i=0;i<obj.size();i++)
	    {
			System.out.println(obj.get(i));
	    }
	}
}
