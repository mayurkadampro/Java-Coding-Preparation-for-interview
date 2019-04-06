import java.util.*;
class SortingComparator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Subject : ");
		int n = sc.nextInt();
		SubCode sco[] = new SubCode[n];
		Checker checker = new Checker();
		for(int i=0;i<n;i++){
			sco[i] = new SubCode(sc.nextInt(),sc.nextInt());
		}
		
		Arrays.sort(sco,checker);
		System.out.println("\nAfter Sorting In Ascending Order");
		for(int i = 0; i < n; i++){
            System.out.printf("%d %d\n", sco[i].subCode, sco[i].marks);
        }
	}
}

class Checker implements Comparator<SubCode>{
	public int compare(SubCode a, SubCode b){
		if(b.subCode == a.subCode){
			return a.marks - b.marks;
		}
		return a.subCode - b.subCode;
	}
	
}

class SubCode{
	int subCode;
	int marks;
	
	public SubCode(int subCode,int marks){
		this.subCode = subCode;
		this.marks = marks;
	}
}









