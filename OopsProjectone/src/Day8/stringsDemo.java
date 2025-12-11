package Day8;

public class stringsDemo {

	public static void main(String[] args) {
		String s="   welcome   ";
		
		System.out.println(s.length());
		System.out.println(s);
		System.out.println(s.trim().length());
		//ChartAT() returns a character from a string baed on index
		// index starts from 0
		 String s1= "welcome";
		 System.out.println(s1.charAt(3));
		 //contain() returns true or false
		 System.out.println(s1.contains("wel"));
		 System.out.println(s1.contains("come"));
		 System.out.println(s1.contains("bala"));
		 System.out.println(s1.replace("c", "x"));
		 System.out.println(s1);
		 System.out.println(s1.replace("welcome", "balaji"));
		 
	}

}
