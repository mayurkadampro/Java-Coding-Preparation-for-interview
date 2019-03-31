import java.io.*;
import java.util.ArrayList;
class Student implements Serializable{
	private String name;
	private int roll_no;
	
	public Student(String name,int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}
	
	public String getName(){
		return name;
	}
	
	public int getRoll_no(){
		return roll_no;
	}
	
	
}

class serializableExample{
	public static void main(String args[])throws IOException{
		Console input = System.console();
		ArrayList<Student> arraylist = new ArrayList<>();
		File file = new File("MyObject.ser");
		if(file.exists()){
		try{
		FileInputStream fis = new FileInputStream("MyObject.ser");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		arraylist = (ArrayList<Student>)(ois.readObject());
		ois.close();
		}catch(ClassNotFoundException e){
			System.out.println("src file is not avaliable");
		}
		}
		
		while(true){
			System.out.println();
			System.out.println("1 --> Add data");
			System.out.println("2 --> View data");
			System.out.println("3 --> Delete data");
			System.out.println("4 --> Exit");
			int res = Integer.parseInt(input.readLine("Select Your Options : "));
			
			if(res == 1){
				String name = input.readLine("Enter Student Name : ");
				int rollNo = Integer.parseInt(input.readLine("Enter Student RollNo : "));
				Student stud = new Student(name,rollNo);
				arraylist.add(stud);
				System.out.println("Data added Successfully...");
			}else if(res == 2){
				for(Student data : arraylist)
					System.out.println(data.getName()+" "+data.getRoll_no());
			}else if(res == 3){
				int rollNo = Integer.parseInt(input.readLine("Enter Student RollNo which you want to delete : "));
				arraylist.remove(new Integer(rollNo));
				System.out.println("Data delete Successfully...");
				
			}else if(res == 4){
				FileOutputStream fs = new FileOutputStream("MyObject.ser");
				BufferedOutputStream br = new BufferedOutputStream(fs);
				ObjectOutputStream os = new ObjectOutputStream(br);
				os.writeObject(arraylist);
				os.close();
				break;
				
			}else{
				System.out.println("Invalid Option...");
			}
			
		}
		
		
		
		
		//Student stud = new Student("Mayur",01);
		//System.out.println(stud.getName()+" "+stud.getRoll_no());
	}
}