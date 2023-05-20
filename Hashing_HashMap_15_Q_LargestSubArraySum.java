import java.util.*;
public class Hashing_HashMap_15_Q_LargestSubArraySum {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};

        HashMap<Integer,Integer> map=new HashMap<>();
        //      Sum,Idx

        int sum=0;
        int len=0;
        int check=len;
        int start=0;
        int end=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){   // if value of sum is equal to value of key(sum) in hashmap then
                len=Math.max(len, j-map.get(sum));  // we find the length of this particular subarray
                if(len!=check){
                    start=map.get(sum)+1;
                    end=j;
                }
                check=len;
            }else{
                map.put(sum, j);
            }
        }
        System.out.println("Largest sub array with sum 0 is of size: "+len+" starts from index "+start+" and ends with index "+end);
    }
}
