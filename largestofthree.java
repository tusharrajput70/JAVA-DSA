import java.util.*;

public class largestofthree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		sc.close();
			if(a>b) {
				if(a>c) {
					System.out.println(a+" is greater");
				}
				else
					System.out.println(c+" is greater");
			}
			else {
				if(b>c) {
					System.out.println(b+" is greater");
				}
				else {
					System.out.println(c+" is greater");
				}
			}
			
		

	}

}
