package SortSearch;

public class MergeSort {
	public void mergeSort(int [] array){
		int arrayLength = array.length;
		int [] helper = new int [arrayLength];
		mergeSort(array, helper, 0, arrayLength-1);
	}
	
	public void mergeSort(int [] array, int [] helper, int begin, int end){
		if (begin < end){
			int middle = (begin + end)/2;
			mergeSort(array, helper, begin, middle);
			mergeSort(array, helper, middle+1, end);
			merge(array, helper, begin, middle, end);
		}
	}
	
	public void merge(int [] array, int [] helper, int begin, int middle, int end){
		for (int i=begin; i<=end; i++){
			helper[i] = array[i];
		}
		
		int helperLeft = begin;
		int helperRight = middle+1;
		int current = begin;
		
		while(helperLeft<=middle && helperRight<=end){
			if(helper[helperLeft]<=helper[helperRight]){
				array[current] = helper[helperLeft];
				helperLeft++;
			}else{
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		int remain = middle - helperLeft;
		for(int i = 0; i<=remain; i++){
			array[current+i] = helper[helperLeft+i];
		}
	}
	
	public static void main(String [] args){
		int [] originalArray = new int [5];
		int number = 5;
		for(int i=0; i< originalArray.length;i++){
			originalArray[i] = number;
			number--;
		}
		
		MergeSort instance = new MergeSort();
		instance.mergeSort(originalArray);
		
		for(int i=0; i< originalArray.length;i++){
			System.out.println(originalArray[i]);
		}
	}
	
}
