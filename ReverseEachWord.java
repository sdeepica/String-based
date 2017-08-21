package urjanet;
import java.util.Scanner;
public class ReverseEachWord {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		String[] store=input.split(" ");
		for(String out:store) {
		StringBuffer sb=new StringBuffer(out);
		System.out.print(sb.reverse()+" ");
		}
		s.close();
		}

}
