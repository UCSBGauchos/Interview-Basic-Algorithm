package SortSearch;

public class QuickSort {
	public void quickSort(int [] array, int left, int right){
		int index = partition(array, left, right);
		if(left<index-1){
			quickSort(array, left, index-1);
		}
		if(index < right){
			quickSort(array, index, right);
		}
	}
	
	public int partition(int [] array, int left, int right){
		int pickIndex = (left+right)/2;
		int pickPoint = array[pickIndex];
		while(left<right){
			while(array[left]<pickPoint){
				left++;
			}
			while(array[right]>pickPoint){
				right--;
			}
			if(left <= right){
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	public void swap(int [] array, int left, int right){
		int tmp;
		tmp = array[left];
		array[left] = array[right];
		array[right] = tmp;
	}
	
	public static void main(String [] args){
		int [] originalArray = new int [5];
		int number = 5;
		for(int i=0; i< originalArray.length;i++){
			originalArray[i] = number;
			number--;
		}
		
		QuickSort instance = new QuickSort();
		instance.quickSort(originalArray, 0, originalArray.length-1);
		
		for(int i=0; i< originalArray.length;i++){
			System.out.println(originalArray[i]);
		}
	}
}


