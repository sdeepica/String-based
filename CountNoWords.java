package urjanet;
import java.util.Scanner;
public class CountNoWords {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] words=str.split(" ");
		System.out.println("The number of words are: "+words.length);
		s.close();
	}

}
