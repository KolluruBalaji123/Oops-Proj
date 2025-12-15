package Day8;

import java.util.Arrays;

public class Substringsdemo {

	public static void main(String[] args) {
		String s="selenium";
		System.out.println(s.substring(1,5));
		//covering to upper and lower cases
		 String s1="Java";
		 System.out.println(s1.toUpperCase());
		 System.out.println(s1.toLowerCase());
		 //split
		  String s2="abc@gmail.com";
		 String a[]=s2.split("@");
		 System.out.println(Arrays.toString(a));
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 String amount ="$15,20,30";
		 String amount1 = "123,abc@xyz";
		 String arr[]=amount1.split(",");
		 System.out.println(Arrays.toString(arr));
		 
		 System.out.println(amount.replace("$", ""));
		 
		 
		 
		 

	}

}
