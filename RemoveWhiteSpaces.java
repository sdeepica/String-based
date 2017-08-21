package urjanet;
import java.util.Scanner;
public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String witoutspace=str.replaceAll("\\s","");
		System.out.println(witoutspace);
		s.close();
		
	}

}
