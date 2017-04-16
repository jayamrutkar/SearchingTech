package geeks.algo.search;

public class LinearSearch extends Search{

	@Override
	boolean search() {
		boolean found= false;

		int[] arr= this.inputArr;
		int n = arr.length;
		for(int i=0;i<n;i++){
			if(arr[i]==key){
				found=true;
				break;
			}
		}
		
		return found;
	}

	@Override
	void setComplexities() {
		this.type = "Linear Search";
		this.timeComplexity="O(n)";
		this.spaceComplexity="{N/A}";
	}
	
}