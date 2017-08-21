package urjanet;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st;
		st=s.nextLine();
		StringBuffer str=new StringBuffer(" "+st);
		System.out.println(str.reverse());
		s.close();
	}

}
