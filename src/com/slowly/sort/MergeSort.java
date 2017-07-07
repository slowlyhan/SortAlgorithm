package com.slowly.sort;

public class MergeSort {

		public void doMergeSort(int[] a,int p,int r){
			if(p<r){
				int q = (p+r)/2;
				doMergeSort(a,p,q);
				doMergeSort(a,q+1,r);
				Merge(a,p,q,r);
			}
			
		}

		private void Merge(int[] a, int p, int q, int r) {
			int[] arrL = new int[q-p+1];
			int[] arrR = new int[r-q];
			for(int i=p;i<=q;i++){
				arrL[i-p] = a[i];
			}
			for(int j=q+1;j<=r;j++){
				arrR[j-q-1] = a[j];
			}
			int indexA = p;
			int indexB = q+1;
			int j = p;
			while(indexA<=q&&indexB<=r){
				if(arrL[indexA-p]>arrR[indexB-q-1]){
					a[j++] = arrR[indexB-q-1];
					indexB++;
				}else{
					a[j++] = arrL[indexA-p];
					indexA++;
				}
			}
			while(indexA<=q){
				a[j++] = arrL[indexA-p];
				indexA++;
			}
			while(indexB<=r){
			
				a[j++] = arrR[indexB-q-1];
				indexB++;
			
			}
			
		}
		public static void main(String[] args){
			int[] a = {1,2,9,5,3,4};
			new MergeSort().doMergeSort(a, 0, a.length-1);
			for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
		}
}
