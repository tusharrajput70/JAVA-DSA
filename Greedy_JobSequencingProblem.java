import java.util.*;

/**
 * Greedy_JobSequencingProblem
 */
public class Greedy_JobSequencingProblem {

	

	public static void main(String[] args) {
		int job[][]= {{0,4,20},{1,1,10},{2,1,40},{3,1,30}};
		//here 0th column represents index; 1st column represents ending time; 2nd column represents profit
		Arrays.sort(job,Comparator.comparingDouble(o->o[2]));
		ArrayList<Integer> ans=new ArrayList<>();
		int lastdeadline=0;
		int profit=0;
		
		for(int i=job.length-1;i>=0;i--) {
			if(job[i][1]>lastdeadline) {
				ans.add(job[i][0]);
				profit+=job[i][2];
				lastdeadline=job[i][1];
			}
		}
		System.out.println("maximum profit is: "+profit+" by doing "+ans.size()+" jobs");
		for(int i=0;i<ans.size();i++) {
			System.out.print("Job"+ans.get(i)+" ");
		}
	}
}
