package com.slowly.sort;

public class BubbleSort {

	public void doBubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>=arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
	}
	
	public static void main(String[] args){
		int[] a = {1,2,9,5,12,3,4};
		new BubbleSort().doBubbleSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
