package com.slowly.sort;

public class ShellSort {

	public void doShellSort(int[] arr){
		int n = arr.length;
		int h=1;
		while(h<n/3){
			h=3*h+1;
		}
		while(h>=1){
			for(int i=h;i<n;i=i+h){
				int j = i;
				int temp = arr[j];
				while(j>=h&&arr[j]<arr[j-h]){
					arr[j] = arr[j-h];
					arr[j-h] = temp;
					j-=h;
				}
				
			}
			h = h/3;
		}
	}
		
	public static void main(String[] args){
		int[] a = {1,2,9,5,12,3,4};
		new ShellSort().doShellSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
