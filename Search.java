package geeks.algo.search;

import java.util.Scanner;

public abstract class Search{
	
	int[] inputArr;
	int key;
	String type;
	String timeComplexity;
	String spaceComplexity;
	
	void getInput(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many items: ");
		int n= in.nextInt();
		System.out.println("Enter Array");
		this.inputArr = new int[n];
		for(int i=0;i<n;i++){
			this.inputArr[i]=in.nextInt();
		}
		
		System.out.println("Enter Key ");
		this.key = in.nextInt();
				
		in.close();
	}
	
	abstract boolean search();
	abstract void setComplexities();
	
	void performSearchTask(){
		
		System.out.println("Inputs:");
		getInput();
		
		long startTime = System.nanoTime();
		
		boolean found= search();
		if(found){
			System.out.println("Found Item.");
		}else{
			System.out.println("Didn't found the item.");
		}

		long endTime = System.nanoTime();
		
		long diff = endTime - startTime;
		System.out.println("Total time taken to search (in milliseconds): "+diff);
		setComplexities();
		System.out.println("Time Complexity  : "+timeComplexity);
		System.out.println("Space Complexity : "+spaceComplexity);
	}
}


