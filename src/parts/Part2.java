package parts;
import java.util.Scanner;
public class Part2 {
	public static long f(int a) {
		long fac=1;
		if (a<2)
			return fac;
		for (int i=2;i<=a;i++)
			fac*=i;
		return fac;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		int x = scan.nextInt();
		scan.close();
		
		for(int n=0;n<x;n++) {
			for (int i=0;i<x-n;i++)
				System.out.print("  ");
			for (int k=0;k<=n;k++) {
				System.out.print((f(n)/(f(k)*f(n-k)))+"   ");
				}
			System.out.println();
			}
		}
}
