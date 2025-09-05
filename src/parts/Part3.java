package parts;
public class Part3 {

	public static boolean isMagic(int[][] s) {
		int x = s[0][0]+s[0][1]+s[0][2];
		for (int i=0;i<3;i++) {
			//rows
			if (s[i][0]+s[i][1]+s[i][2]!=x) {
				return false;
			}
			//columns
			if (s[0][i]+s[1][i]+s[2][i]!=x) {
				return false;
			}
		}
		if (s[0][0]+s[1][1]+s[2][2]!=x||s[0][2]+s[1][1]+s[2][0]!=x)
			return false;
		return true;
	}
	public static void main(String[] args) {
		//3x3 2D array
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
		};
		System.out.println(a[0][0]+" "+a[0][1]+" "+a[0][2]);
		System.out.println(a[1][0]+" "+a[1][1]+" "+a[1][2]);
		System.out.println(a[2][0]+" "+a[2][1]+" "+a[2][2]);
		if (isMagic(a))
			System.out.println("This array is a magic square.");
		else
			System.out.println("This array is not a magic square.");
	}
}
