package Day11;

public class Studentdata {
	int sid;
	String sname;
	char grad;
	void printStudentData() {
	System.out.println(sid+ " "+ sname+" "+grad);
	}
	void setStudentdata(int id, String name, char gr) {

     sid=id;
     sname=name;
     grad =gr;
		
	}
	 Studentdata(int id, String name, char gr) {
		 sid=id;
	     sname=name;
	     grad =gr;
	}


}
