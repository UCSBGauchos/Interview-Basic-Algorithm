package Heap;

public class Test {
	public static int [] heapArray = new int[8];
	int lastIndex = 1;
	int parentIndex = 0;
	
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
	
	public static void main(String [] args){
		Test t = new Test();
		t.build(1);
		t.build(2);
		t.build(3);
		t.build(4);
		t.build(5);
		t.build(6);
		t.build(7);
		
		for(int num: heapArray){
			System.out.println(num);
		}
	}
}
