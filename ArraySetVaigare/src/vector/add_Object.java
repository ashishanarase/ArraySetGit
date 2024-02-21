package vector;

import java.util.Vector;    //add object into three way
class add_Object              //1] add(value)              Ex:- add("Hello");
                              //2] add(index_value,value)  Ex:- add(1,"Hello");
{                            //3] add(ref_variable_Vector) ex:- add(obj1)
	public static void main(String[] args) 
	{
		Vector obj=new Vector();
		obj.add(12);
		obj.add(true);
		obj.add("Hello");          //1st way
		System.out.println(obj);

		obj.add(1,"true");         //2nd way
		System.out.println(obj);
	}
}
