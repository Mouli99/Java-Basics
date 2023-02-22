package javalearning;

public class B {
public void function() {
	int[] arr = {1,4,6,8,33,11,64,78,99,100};
	int len=0;
	
	len = arr.length;
	
	System.out.println(".......Bubble Sort......");
	for(int i=0;i<len;i++){
		for(int j=i;j<len-i;j++) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
	}
	
	for(int i=0;i<len;i++) {
		System.out.println(arr[i]+" ");
	}
	
	int[] arr1 = {1,4,6,8,33,11,64,78,99,100};
	
	quicksort(0,9,arr1);
	
	System.out.println("==========Quick Sort========");
	for(int i=0;i<10;i++) {
		System.out.println(arr1[i]+" ");
	}
	
	}

	int partiotion(int l, int h, int[] arr1) {
		int i=l;
		int j=h;
		int pivot = arr1[l];
		
		while(i<j) {
		do {
			i++;
		}while(arr1[i] <= pivot);
		do {
			j--;
		}while(arr1[j]> pivot);
		
		
		if(i<j) {
			int temp=arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
		}
		}
		int temp1 = arr1[l];
		arr1[l] = arr1[j];
		arr1[j]= temp1;
		
		
		return j;
	}
	void quicksort(int l, int h, int[] arr1) {
		
		int j=0;
		if(l<h) {
			j= partiotion(l,h,arr1);
			
			quicksort(l,j,arr1);
			quicksort(j+1,h,arr1);
		}
	}


}
