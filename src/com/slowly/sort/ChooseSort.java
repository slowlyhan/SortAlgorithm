package com.slowly.sort;

public class ChooseSort {
	
	public void doChooseSort(int[] arr){
		int temp,temp1;  
	     for(int i=0;i<arr.length-1;i++){  
	         temp=i;  
	         for(int j=i+1;j<arr.length;j++){  
	             if(arr[j]<arr[i]){  
	                 temp=j;  
	             }  

	         }  
	         temp1=arr[temp];  
	         arr[temp]=arr[i];  
	         arr[i]=temp1;  

	     }
	}
	 
}
