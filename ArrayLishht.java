import java.util.ArrayList;

public class ArrayLishht {

	public static void main(String[] args) {
		ArrayList <Integer> list=new ArrayList<>();
		
		//to add element we use (listName).add("element"); function time complexity is O(1)
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		//to get element we use (ListName).get("index");  time complexity is O(1)
		System.out.println(list.get(3));
		
		//to delete or remove an element we use (ListName).remove("index");
		list.remove(1);
		System.out.println(list);
		
		//to set any element at any index is (listName).set("index","element"); 
		list.set(0, 2);
		System.out.println(list);
		
		
		//to check weather the element exists in list or not we use (listName).contains("element"); fn returns true or false 
		
		System.out.println(list.contains(2));
		System.out.println(list.contains(11));
		
		
		//to any element at any particular index then we use (listName).add("index","element"); with complexity O(n)
		list.add(2,9);
		System.out.println(list);
		//here we can see when we add our element at 2nd index the element initially present at that index gets shifted next index
		
		//to find the size of arrayList we use (listNme).size();
		System.out.println(list.size());
		
		
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
