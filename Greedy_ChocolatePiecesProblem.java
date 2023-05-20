import java.util.*;
/**
 * Greedy_ChocolatePiecesProblem
 */
public class Greedy_ChocolatePiecesProblem {

	
	public static void main(String[] args) {
		Integer verticalCut[]= {2,1,3,1,4};
		Integer horizontalCut[]= {4,1,2};
		
		//sorting of both arrays in descending order
		Arrays.sort(verticalCut,Comparator.reverseOrder());
		Arrays.sort(horizontalCut,Comparator.reverseOrder());
		int vp=1,hp=1;
		int i=0,j=0;
		int cost=0;
		while(i<verticalCut.length&&j<horizontalCut.length) {		//&&(Logical And)
			int first=verticalCut[i];
			int second=horizontalCut[j];
			if(first>second) {
				cost+=first*hp;
				vp++;
				i++;
			}else {
				cost+=second*vp;
				hp++;
				j++;
			}
		}
		while(i<verticalCut.length) {
			cost+=verticalCut[i]*hp;
			vp++;
			i++;
		}
		while(j<horizontalCut.length) {
			cost+=horizontalCut[i]*vp;
			hp++;
			j++;
		}
		System.out.println("Minimum cost of cuts is ="+cost);
	}

}
