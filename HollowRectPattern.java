import java.util.*;

public class HollowRectPattern {
	public static void pattern(int rows,int column) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=column;j++) {
				if(i==1||j==1||i==rows||j==column) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("this is a program which helps you to make a hollow pattern");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
		System.out.println("enter number of columns");
		int column=sc.nextInt();
		pattern(rows,column);
		sc.close();
		

	}

}
