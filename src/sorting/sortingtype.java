/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author asus
 */
public class sortingtype {
    
        public void print(int[] a){
            for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
        }
                
	public void bubbleSort(int[] a){
		int n=a.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					swap(a,j,j+1);
				}
			}
		}
                print(a);
	}

	public void swap(int[] a, int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

        public void insertionSort(int[] a){
		if(a==null || a.length<2)return;
		int n=a.length;
		for(int i=1;i<n;i++){//i point to the value we would like to insert
			int target=a[i];
			int j=i-1;
			while(j>=0 && a[j]>target){// two conditions
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=target;
		}
                print(a);
	}
        
	public void selectionSort(int[] a){
		if(a==null || a.length<2)return;
		int n=a.length;
		for(int i=n-1;i>0;i--){//find the max, swap to i
			int k=i;//k refer to the index of max value
			for(int j=0;j<i;j++){
				if(a[j]>a[k]){
					k=j;
				}
			}
			swap(a,k,i);
		}
                print(a);
	}

	public void mergeSort(int[] a){
		mergeSort(a,0,a.length-1);
                print(a);
	}

	public void mergeSort(int[] a, int low, int high){
		if(low>=high){
			return;
		}
		int mid=(low+high)/2;
		mergeSort(a,low,mid);
		mergeSort(a,mid+1,high);
		merge(a,low,mid,high);
	}

	public void merge(int[] a,int low, int mid,int high){
		int[] b=new int[high-low+1];
		int i=low,j=mid+1,k=0;
		while(i<=mid && j<=high){
			if(a[i]<a[j]){
				b[k++]=a[i++];
			}else{//a[j]>=a[i]
				b[k++]=a[j++];
			}
		}
		while(i<=mid){
			b[k++]=a[i++];
		}

		while(j<=high){
			b[k++]=a[j++];
		}

		for(int p=0;p<b.length;p++){
			a[low+p]=b[p];
		}
	}

	public void quickSort(int[] a){
		if(a==null || a.length<2){
			return;
		}
		quickSort(a,0,a.length-1);
                print(a);
	}



	public static void quickSort(int[] a,int i,int j){
		if(i>=j){
			return;
		}
		int pivotPos=partition(a,i,j);//i pointer kiri, j pointer kanan
		quickSort(a,i,pivotPos-1);//pivotPos di posisi kanan
		quickSort(a,pivotPos+1,j);
	}

	public static int partition(int[] a, int i,int j){
		int pivot=a[i];
		while(i<j){
			while(i<j && a[j]>=pivot){
				j--;
			}
			a[i]=a[j];// value kecil ditaruh disebelah kiri
			while(i<j && a[i]<=pivot){
				i++;
			}
			a[j]=a[i];// value besar ditaruh disebelah kanan
		}
		a[i]=pivot;
		return i;
	}
}