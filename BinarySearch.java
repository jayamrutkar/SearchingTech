package geeks.algo.search;

import java.util.Arrays;

public class BinarySearch extends Search implements Sortable{

	@Override
	boolean search() {
		boolean found =false;

		Arrays.sort(this.inputArr);
		int left = 0;
		int right = this.inputArr.length-1;
		
		while(left<=right){
		
			int mid = (left)+(right-left)/2;
			
			if(this.inputArr[mid] == this.key){
				found =true;
				break;
			}
			
			if(this.inputArr[mid] < this.key){
				left = mid +1;
			}else{
				right = mid -1;
			}
		}
		
		return found;
	}

	@Override
	void setComplexities() {
		this.type = "Binary Search";
		this.timeComplexity="O(Log(n))";
		this.spaceComplexity="{N/A}";
	}

	@Override
	public void sortArray(int[] arr) {
		Arrays.sort(arr);
	}
	
}