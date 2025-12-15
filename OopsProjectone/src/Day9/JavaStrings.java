package Day9;

public class JavaStrings {

	public static void main(String[] args) {
		String s="balaji";	
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev =rev+s.charAt(i);
			
		
		}
		System.out.println("reverse string is "+rev);
		

	}

}
