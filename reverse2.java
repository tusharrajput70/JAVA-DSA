import java.util.*;

public class reverse2 {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);

 System.out.print("enter number");
 int n=sc.nextInt();
 sc.close();
while(n!=0) {
	int k=n%10;
	System.out.print(k);
	n=n/10;
}
	}

}
