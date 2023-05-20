
import java.util.ArrayList;

public class MultidimensionalArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList <Integer>> Main=new ArrayList<>();
		ArrayList<Integer> arr=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
		ArrayList<Integer> arr3=new ArrayList<>();
		for(int i=1;i<=5;i++) {
			arr.add(i);
			arr2.add(i*2);
			arr3.add(i*3);
		}
		Main.add(arr);
		Main.add(arr2);
		Main.add(arr3);
		System.out.println(Main);
		
		for(int i=0;i<Main.size();i++) {
			System.out.println(Main.get(i));
			
		}
		for(int i=0;i<Main.size();i++) {
			ArrayList<Integer> curr=Main.get(i);
			for(int j=0;j<curr.size();j++) {
			System.out.print(curr.get(j)+" ");	
			}
			System.out.println();
		}
		
	}

}
