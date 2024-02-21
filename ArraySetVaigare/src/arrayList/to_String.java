package arrayList;

import java.util.ArrayList;
public class to_String 
{
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(true);
		obj.add("kiwi");
		obj.add(12);
		obj.add('H');
		System.out.println(obj);
		
		Object[] var=obj.toArray();

		for (int i=0;i<var.length;i++ )
		{
			System.out.println(var[i]);
		}
	}
}
