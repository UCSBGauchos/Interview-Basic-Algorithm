package SortSearch;

public class BinarySearch {
	public int binarySearch(int [] array, int x){
		int begin = 0;
		int end = array.length-1;
		int middle;
		
		while(begin<=end){
			middle = (begin+end)/2;
			if(x == array[middle]){
				return middle;
			}else if(x<array[middle]){
				end = middle-1;
			}else if(x>array[middle]){
				begin = middle+1;
			}
		}
		return -1;
	}
	
	public static void main(String [] args){
		int [] array = {1,2,3,4,5,6,7};
		BinarySearch binary = new BinarySearch();
		int result = binary.binarySearch(array, 9);
		if(result == -1){
			System.out.println("Cannot find the result");
		}else{
			System.out.println("the result's location is");
			System.out.println(result+1);
		}
		
	}
}
