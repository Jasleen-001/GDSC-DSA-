//https://leetcode.com/problems/3sum/
import java.util.*;
public class ThreeSum {

	public static void main(String[] args) {
		int[] nums= {-2,0,1,1,2};
		Arrays.sort(nums);
        List<List<Integer>> arr=new LinkedList<>();                  
       
        for(int i=0;i<nums.length-2;i++) {
        	if(i>0 && nums[i]==nums[i-1]) continue;
        int beg=i+1;
        int end =nums.length-1;
        int res=0-nums[i];
        while(beg<end) {  //{-4,-3,-2,-1,}
        	if(nums[beg]+nums[end]==res) {
        		arr.add(Arrays.asList(nums[i],nums[beg],nums[end]));
        	while(beg<end && nums[beg]==nums[beg+1]) beg++;
        	while(beg<end && nums[end]==nums[end-1]) end--;
        	beg++;
        	end--;
        	}
        	else if(nums[beg]+nums[end]<res) {
        		beg++;
        			if(nums[beg]==nums[beg+1]) { beg++;
        		}}
        	else {
        		end--;
        		if(nums[end]==nums[end-1]) {
        			end--;
        		}
        }
        
        }
        }
        
        
     
  for(int i=0;i<arr.size();i++) 
	    	System.out.print(arr.get(i)+" ");
}}
