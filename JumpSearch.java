package geeks.algo.search;

public class JumpSearch extends Search {

	@Override
	boolean search() {
		boolean found = false;
		
		int n = this.inputArr.length;
		int m = ((Double)Math.sqrt(n)).intValue();
		for(int i=m;i<n;i=i+m){
			
			if(this.inputArr[i]>this.key){
				int left = i-m;
				int right = i;
				while(left<=right){
					int mid = left + (right-left)/2;
					if(this.inputArr[mid]==key){
						found=true;
						break;
					}
					if(this.inputArr[mid]<key){
						left =mid+1;
					}else{
						right= mid-1;
					}
					
				}
			}
			if(found){
				break;
			}
		}
		
		return found;
	}

	@Override
	void setComplexities() {
		this.timeComplexity ="O(sqrt(n))";
		this.spaceComplexity="O(1)";
		this.type="Jump Search";
	}

}
