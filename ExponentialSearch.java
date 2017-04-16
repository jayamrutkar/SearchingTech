package geeks.algo.search;

import java.util.Arrays;

public class ExponentialSearch extends Search {

	@Override
	boolean search() {
		boolean found= false;
		
		int[] arr = this.inputArr;
		int n = arr.length;
		
		Arrays.sort(arr);
		
		if(arr[0]==key){
			found =true;
			return found;
		}
		
		int i =1;
		while(i<n && arr[i]<=key){
			i = i*2;
		}
		
		int left =i/2;
		int right = i;
		if(i>n){
			right= n;
		}
		
		while(left<=right){
			
			int mid = left + (right-left)/2;
			if(arr[mid]==key){
				found= true;
				break;
			}else if(arr[mid]<key){
				left = mid+1;
			}else{
				right = mid-1;
			}
			
		}
		
		return found;
	}

	@Override
	void setComplexities() {
		this.type = "Exponential Search";
		this.timeComplexity="O(log(n))";
		this.spaceComplexity="{N/A}";

	}

}
