/*
 Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

 */
import java.util.Arrays;

public class FirstLastIndex {

	public static void main(String[] args) {
		int nums[]= {2,2};
		int target=2;
		int ans[]= solution(nums,target);
		System.out.println(Arrays.toString(ans));
}
static int[] solution(int nums[],int target) {
		int beg=0,last=nums.length-1;
		int mid;
		if(nums.length==0)
			return new int[]{-1,-1};
		 while(beg<=last){
	            mid=beg+(last-beg)/2;
	            if(nums[mid]==target){
	                int start=findStart(nums,mid,target);
	                int end=findEnd(nums,mid,last,target);
	               	return new int[]{start,end};
	            }
	            else if(nums[mid]<target)
	                beg=mid+1;
	            else
	                last=mid-1;
	        }
					
		return new int[]{-1,-1};
	
	}
//()
static int findStart(int[] nums,int mid ,int target) {
	int start=mid;
	int i=mid;
	//for(int i=mid;i>=0;i--) 
	while(i>=0){
        if(nums[i]==target)
            start=i;
        else break;
        
      i--;
	}
	
	return start;	
}
static int findEnd(int[] nums,int mid ,int last,int target) {
	int end=mid;
	for(int i=mid;i<=last;i++) {
        if(nums[i]==target)
            end=i;
        else break;
	}
	return end;	
}


}
