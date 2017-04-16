package geeks.algo.search;

import java.util.Scanner;

public class Searching {
	
	static enum SearchingType {
		LINEAR_SEARCH, BINARY_SEARCH, JUMP_SEARCH, INTERPOLATION_SEARCH, EXPONENTIAL_SEARCH
	}

	Search search;
	SearchingType type;
	
	public Searching() {
		super();
		this.type=SearchingType.BINARY_SEARCH;
	}

	public Search getSearch() {
		return search;
	}

	public void setSearch(Search search) {
		this.search = search;
	}

	void performSearch() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Searching Types: ");
		for(int i=0;i<SearchingType.values().length; i++){
			System.out.println((i+1)+". "+SearchingType.values()[i]);
		}
		System.out.println("Enter our choice");
		int temp = in.nextInt();
		type = SearchingType.values()[temp-1];
		
		switch(type){
		case LINEAR_SEARCH:
			this.setSearch(new LinearSearch());
			break;
		case BINARY_SEARCH:
			this.setSearch(new BinarySearch());
			break;
		case JUMP_SEARCH:
			this.setSearch(new JumpSearch());
			break;
		case INTERPOLATION_SEARCH:
			this.setSearch(new InterpolationSearch());
			break;
		case EXPONENTIAL_SEARCH:
			this.setSearch(new ExponentialSearch());
			break;
		default:
			this.setSearch(new BinarySearch());
		}
		this.search.performSearchTask();
	}

	public static void main(String[] args) {
		Searching searching = new Searching();
		searching.performSearch();
	}

}
