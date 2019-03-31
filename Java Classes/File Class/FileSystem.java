import java.util.*;
import java.io.*;
class FileSystem
{
	public static void main(String args[])throws IOException{
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println();
			System.out.println("1 --> Create Directory ");
			System.out.println("2 --> Create File ");
			System.out.println("3 --> Delete File ");
			System.out.println("4 --> Rename File ");
			System.out.println("5 --> exit ");
			System.out.println("Enter Your Option");
			int res = sc.nextInt();
			System.out.println();
			if(res == 1){
				System.out.println("Enter Directory Name To Create : ");
				String dictname = sc.next();
				File dict = new File(dictname);
				if(dict.exists()){
					System.out.println("Directory Already exists...");
				}else{
				dict.mkdir();
				System.out.println("Directory Created...");
				}
			}else if(res == 2){
				System.out.println("Enter File Name To Create : ");
				String filename = sc.next();
				File file = new File(filename);
				if(file.exists()){
					System.out.println("File Already exists...");
				}else{
				
				file.createNewFile();
				System.out.println("File Created...");
				}
				
			}else if(res == 3){
				System.out.println("Enter File Name To Delete : ");
				String filename = sc.next();
				File file = new File(filename);
				if(!file.exists()){
					System.out.println("File Does Not exists...");
				}else{
				file.delete();
				System.out.println("File Delete Successfully...");
				}
				
			}else if(res == 4){
				System.out.println("Enter File Name To Rename : ");
				String filename = sc.next();
				File file = new File(filename);
				System.out.println("Enter Name Which You Want To Give : ");
				String newFile = sc.next();
				File file1 = new File(newFile);
				if(!file.exists()){
					System.out.println("File Does Not exists...");
				}else{
				file.renameTo(file1);
				System.out.println("File Rename Successfully...");
				}
			}else if(res == 5){
				break;
				
			}else{
				System.out.println("Invalid Option...");
			}
			
		}
	}
}