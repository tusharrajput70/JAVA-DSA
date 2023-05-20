
import java.util.ArrayList;

public class ConatainerWithMostWaterFLIPKART {

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
		
		int lp=0;
		int rp=height.size()-1;
		int maxwater=0;
		while(lp<rp) {
			//calculation of Maximum water
			int ht=Math.min(height.get(lp), height.get(rp));
			int dis=rp-lp;
			int water=ht*dis;
			maxwater=Math.max(maxwater, water);
			
			//
			if(lp<rp) {
				lp++;
			}
			else {
				rp--;
			}
		}
		System.out.println("Maximum Water can be contained is :"+maxwater);
		
	}

}
