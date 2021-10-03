
public class firstRepeated {

	public static void main(String[] args) {
		int arr[]= {1,7,8,9,5,3,9,5, 4};
		int ans=solution(arr);
		System.out.println(ans);
}
	static int solution(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					return i+1;
					
			}
		}
		return -1;
	
	}
}