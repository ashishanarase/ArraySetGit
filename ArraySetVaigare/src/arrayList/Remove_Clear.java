package arrayList;

import java.util.ArrayList;      //remove object from ArrayList                                 //
class Remove_Clear               //use remove() remove one-one object
{                                //use clear() all object remove
	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(true);      //0
		obj.add("Hello");   //1
		obj.add("apple");   //2 index_value
		obj.add('H');       //3
		System.out.println(obj);

		obj.remove("Hello");      //remove()>>> passing value
		System.out.println(obj);

		obj.remove(0);             //remove()>>>passing index value
		System.out.println(obj);

		obj.clear();                //clear()>>> Remove all object
		System.out.println(obj);
	}
}
