package parts;
import java.util.Scanner;
import java.util.Arrays;
public class Part1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		String a = scan.nextLine().toLowerCase().replaceAll(" ", "");
		System.out.print("Input: ");
		String b = scan.nextLine().toLowerCase().replaceAll(" ", "");
		scan.close();
		String[] i1 = new String[a.length()];
		String[] i2 = new String[b.length()];
		for (int i=0; i<a.length();i++)
			i1[i]=a.substring(i,i+1);
		for (int i=0; i<b.length();i++)
			i2[i]=b.substring(i,i+1);
		Arrays.sort(i1);
		Arrays.sort(i2);
		System.out.println(Arrays.equals(i1,i2));
	}

}
