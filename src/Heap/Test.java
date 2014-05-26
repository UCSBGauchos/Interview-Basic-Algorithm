package Heap;

import java.util.ArrayList;

public class Test {
	public static int [] heapArray = new int[8];
	public static ArrayList<Integer> sortedList = new ArrayList<Integer>();
	int lastIndex = 1;
	int parentIndex = 0;
	int currentLength = 7;
	
	int lastIndex2 = 1;
	int leftChildIndex = 0;
	int rightChildIndex = 0;
	int biggerChildIndex = 0;
	
	//bigTop-heap
	public void build(int num){
		heapArray[lastIndex] = num;
		int index = lastIndex;
		int parentIndex = index/2;
		while(parentIndex>=1&&heapArray[parentIndex]<heapArray[index]){
			//swap them
			int tmp = heapArray[parentIndex];
			heapArray[parentIndex] = heapArray[index];
			heapArray[index] = tmp;
			index = parentIndex;
			parentIndex = parentIndex/2;
		}
		lastIndex++;
	}
	
	public void getMax(){
		int max = heapArray[1];
		System.out.println("The max num of this heap is "+max);
	}
	
	public void sort(){
		//for each biggest element in the heap, store in a sorted list ,it is a heap sort
		while(currentLength>=1){
			sortedList.add(heapArray[1]);
			heapArray[1] = heapArray[currentLength];
			currentLength--;
			int index = 1;
			leftChildIndex =  index*2;
			rightChildIndex = index*2+1;
			if(heapArray[leftChildIndex]>=heapArray[rightChildIndex]){
				biggerChildIndex = leftChildIndex;
			}else if(heapArray[leftChildIndex]<heapArray[rightChildIndex]){
				biggerChildIndex = rightChildIndex;
			}
			while(biggerChildIndex<=currentLength&&heapArray[biggerChildIndex]>heapArray[index]){
				//swap them
				int tmp = heapArray[biggerChildIndex];
				heapArray[biggerChildIndex] = heapArray[index];
				heapArray[index] = tmp;
				index = biggerChildIndex;
				leftChildIndex =  index*2;
				rightChildIndex = index*2+1;
				if(heapArray[leftChildIndex]>=heapArray[rightChildIndex]){
					biggerChildIndex = leftChildIndex;
				}else if(heapArray[leftChildIndex]<heapArray[rightChildIndex]){
					biggerChildIndex = rightChildIndex;
				}
			}
		}
	}
	
	public static void main(String [] args){
		Test t = new Test();
		t.build(1);
		t.build(2);
		t.build(3);
		t.build(4);
		t.build(5);
		t.build(6);
		t.build(7);
		t.sort();
		for(int i: sortedList){
			System.out.println(i);
		}
	}
}
