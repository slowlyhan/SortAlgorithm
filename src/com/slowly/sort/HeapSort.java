package com.slowly.sort;

public class HeapSort {

	/**
	 * 维护最大堆的性质
	 * @param arr
	 * @param i 比较的开始位置
	 * @param limitSize 比较的结束位置(不包括)
	 */
	public void Max_Heapify(int[] arr,int i,int limitSize){
		int left = i*2+1;
		int right = i*2+2;
		int largest = i;
		if(left<limitSize&&arr[left]>arr[i]){
			largest = left;
		}
		if(right<limitSize&&arr[right]>arr[largest]){
			largest = right;
		}
		
		if(largest!=i){
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			Max_Heapify(arr,largest,limitSize);
		}
	}
	
	/**
	 * 建立最大堆
	 * @param arr
	 */
	public void Build_Max_Heap(int[] arr){
		int size = arr.length;
		for(int i=size/2;i>=0;i--){
			Max_Heapify(arr,i,arr.length);
		}
	}
	
	/**
	 * 堆排序，按照从小到大
	 * @param arr
	 */
	
	public void doHeapSort(int[] arr){
		Build_Max_Heap(arr);
		for(int i=arr.length-1;i>=0;i--){
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			Max_Heapify(arr,0,i);
		}
		
	}
	
	public static void main(String[] args){
		int[] a = {1,2,9,5,12,3,4};
		new HeapSort().doHeapSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
