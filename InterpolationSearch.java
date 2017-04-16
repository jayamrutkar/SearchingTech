package geeks.algo.search;

import java.util.Arrays;

public class InterpolationSearch extends Search {

	@Override
	boolean search() {
		boolean found =false;
		
		int[] arr= this.inputArr;
		int n = arr.length;
		
		Arrays.sort(arr);
		
		int low =0;
		int high = n-1;
		
		while(low<=high
				&& (key>=arr[low] && key<=arr[high])){
			
			int pos = low + (((key-arr[low]) * (high-low)))/(arr[high]-arr[low]);
			
			if(arr[pos]==key){
				found=true;
				break;
			}
			if(arr[pos]<key){
				low =pos+1;
			}else{
				high = pos-1;
			}
		}
		
		return found;
	}

	@Override
	void setComplexities() {
		this.type = "Interpolation Search";
		this.timeComplexity="O(log(log(n))";
		this.spaceComplexity="{N/A}";
	}

}
