
import java.util.ArrayList;

public class ConatainerWithMostWaterFLIPKART2 {

	public static void main(String[] args) {
		ArrayList<Integer> height=new ArrayList<>();
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<height.size();i++) {
			int min=0;
			for(int j=i+1;j<height.size();j++) {
				if(height.get(i)>height.get(j)) {
					min=height.get(j);
				}
				else {
					min=height.get(i);
				}
				int dis=j-i;
				int water=dis*min;
				if(water>max) {
					max=water;
				}
			}
		}
		System.out.println("Maximum Water can be contained is :"+max);
	}
	

}
