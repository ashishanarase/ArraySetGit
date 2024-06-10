package arrayInterview;

public class DuplicateElements {

	public static void main(String[] args) {

		//Brute Force Method=Limitation Element can not be repeated more than two times	
		int [] a = {1,2,3,1,2,3,5};	//Initialization & Declaration3

		System.out.println("Duplicate Values In Given Array");

		for (int i=0; i<a.length-1;i++) {

			for (int j= i+1; j<a.length;j++) {
				if (a[i]==a[j]) {
					System.out.print(a[j]+", ");
				}
			}
		}
	}

}
