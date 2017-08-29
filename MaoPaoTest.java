package com.bowen.util;
public class MaoPaoTest {

	public static void main(String[] args) {
		int a[]=new int[]{3,15,27,2,26,5,4,24,19,36};
	    int b[]=maopao(a);
	    System.out.println("冒泡的结果：");
	    for(int c:b){
	    	System.out.print(c+"   ");
	    }
	    int d[]=paixu(a);
	    System.out.println();
	    System.out.println("排序的结果：");
	    for(int c:d){
	    	System.out.print(c+"   ");
	    } 
	    System.out.println();
	    System.out.println("折半的结果：");
	    int[] k=zheban(a);
	    for(int c:k){
	    	System.out.print(c+"   ");
	    } 
	    System.out.println();
	    System.out.println("折半的结果1：");
	    int[] m=halfSort(a);
	    for(int c:m){
	    	System.out.print(c+"   ");
	    } 
	}
	//冒泡算法
	public static int[] maopao(int[] a){
		 
		 for(int i=0;i<a.length;i++){
			 for(int j=0;j<a.length-i-1;j++){
				 int t=0;
				 if(a[j]>a[j+1]){
					 t=a[j];
					 a[j]=a[j+1];
					 a[j+1]=t;
				 }
			 }
			
		 }
		 
		return a;
		
	}
	//排序算法
	public static int[] paixu(int[] a){
		for(int i=0;i<a.length;i++){
			 for(int j=i;j<a.length-1;j++){
				 int t=0;
				 if(a[j]>a[j+1]){
					 t=a[j];
					 a[j]=a[j+1];
					 a[j+1]=t;
				 } 
			 }
			
		}
		return  a;
		
	}
	//折半查找算法
	public static int[] zheban(int[] arr){
		 int len = arr.length;
		    int preIndex, current;
		    for (int i = 1; i < len; i++) {
		        preIndex = i - 1;
		        current = arr[i];
		        while(preIndex >= 0 && arr[preIndex] > current) {
		            arr[preIndex+1] = arr[preIndex];
		            preIndex--;
		        }
		        arr[preIndex+1] = current;
		    }
		return  arr;
		
	}
	//折半查找算法1
	public static int [] halfSort(int[] array) {
	    int low, high, mid;
	    int tmp, j;
	    for (int i = 1; i < array.length; i++) {
	      tmp = array[i];
	      low = 0;
	      high = i - 1;
	      while (low <= high) {
	        mid = low + (high - low) / 2;
	        if (array[mid] > tmp)
	          high = mid - 1;
	        else
	          low = mid + 1;
	      }
	      for (j = i - 1; j > high; j--) {
	        array[j + 1] = array[j];
	      }
	      array[high + 1] = tmp;
	    }
	    return array;
	  }

}
