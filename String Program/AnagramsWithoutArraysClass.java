import java.util.Scanner;

public class AnagramsWithoutArraysClass {

    static boolean isAnagram(String a, String b) 
    {
        if(a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int index;
        for(int i=0;i<a.length();i++)
        {
            index=b.indexOf(a.charAt(i));
            if(index==-1)
                return false;
            else
            {
                //this removes b[index]
                b = b.substring(0,index) + b.substring(index+1);
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
