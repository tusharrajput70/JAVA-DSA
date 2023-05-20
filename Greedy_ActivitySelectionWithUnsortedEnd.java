
import java.util.*;
/**
 * Greedy_ActivitySelectionWithUnsortedEnd
 */
public class Greedy_ActivitySelectionWithUnsortedEnd {

	public static void main(String[] args) {
		int start[]= {3,1,0,5,8,5};
		int end[]= {4,2,6,7,9,9};
		//to sort on the basis of end first we make a 2d array in which column 0 contains indexs,col 1 contains start time,col 2 contains end time
		int activities[][]=new int[start.length][3];
		for(int i=0;i<start.length;i++) {
			activities[i][0]=i;
			activities[i][1]=start[i];
			activities[i][2]=end[i];
		}
		// to sort on the basis of 2 column we use 
		Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
		int maxAct=0;
		ArrayList<Integer> ans=new ArrayList<>();
		
		//1st activity
		maxAct=1;
		ans.add(activities[0][0]);
		int lastEnd=activities[0][2];
		for(int i=1;i<end.length;i++) {
			if(activities[i][1]>=lastEnd) {
				//activity select
				maxAct++;
				ans.add(activities[i][0]);
				lastEnd=activities[i][2];
			}
		}
		
		System.out.println("MaxActivities :"+maxAct);
		for(int i=0;i<ans.size();i++) {
			System.out.print("A"+ans.get(i)+" ");
		}
	}

}