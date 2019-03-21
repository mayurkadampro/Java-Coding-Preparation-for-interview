class Teacher{
	String designation = "Teacher";
	String collegeName = "Edureka";
	void does(){
		System.out.println("Teaching");
	}
}

public class Inheritance extends Teacher{
	String mainSubject = "Spark";
	public static void main(String args[]){
	Inheritance obj = new Inheritance();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
}
}