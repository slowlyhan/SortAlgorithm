package com.slowly.sort;

public class QuickSort {

	public void doQuickSort(int[] arr,int p,int r){
		if(p<r){
			int q = PARTITION(arr,p,r);
			doQuickSort(arr,p,q-1);
			doQuickSort(arr,q+1,r);
		}
	}

	private int PARTITION(int[] arr, int p, int r) {
		int x = arr[r];
		int i = p-1;
		int temp;
		for(int j=p;j<r;j++){
			if(arr[j]<=x){
				i=i+1;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		return i+1;
	}
	public static void main(String[] args){
		int[] a = {1,2,9,5,3,4};
		new QuickSort().doQuickSort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
