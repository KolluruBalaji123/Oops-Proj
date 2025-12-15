package Day9;

import java.util.Arrays;

public class MutableImmutableChanges {

	public static void main(String[] args) {
		// Mutable
		int a[]= {10,20,60,30,40,50};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}  
