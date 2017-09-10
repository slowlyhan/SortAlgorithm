package com.slowly.sort;

public class InsertSort {

	public void doInsertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int j = i;
			while(arr[j]<arr[j-1]&&j-1>=0){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
			
		}
		
	}
	
	public static void main(String[] args){
		int[] a = {1,2,9,5,12,3,4};
		new InsertSort().doInsertSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
