class Encap{
	private int rollNo;
	private int age;
	private String name;
	
	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getRollNo(){
		return rollNo;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
}

class Encapsulation{
	public static void main(String args[]){
		Encap cap = new Encap();
		
		// Work Fine
		cap.setAge(23);
		cap.setRollNo(01);
		cap.setName("Mayur Kadam");
		System.out.println(cap.getRollNo());
		System.out.println(cap.getAge());
		System.out.println(cap.getName());
		
		// Not work at all due to private access member
		/*
		for make it work remove private specifier from instance variable
		cap.rollNo = 01;
		cap.age = 25;
		cap.name = "Mayur";
		System.out.println(cap.getAge());
		System.out.println(cap.getRollNo());
		System.out.println(cap.getName());
		*/
	}
}




