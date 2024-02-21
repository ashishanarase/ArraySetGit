package arrayInterview;

import java.util.ArrayList;     //making ArrayList As Homogenious
class Diamond_Bracket 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(12);
		obj.add(13);    //we can not allow diff value
		obj.add(14);
	    for (int i=0;i<obj.size();i++)
	    {
			System.out.println(obj.get(i));
	    }
	}
}
