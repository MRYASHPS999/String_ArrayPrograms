public class InsertionSort {
	
	public static void insertionSort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int current=a[i];
			int j=i-1;
			
			
			
			while(j>=0 && current<a[j]) {
				
				a[j+1]=a[j];
				j--;
				
			}a[j]=current;
		}
	}

	public static void main(String[] args) {
		
		int a[]= {4,28,58,64,14,50,57};
		
		 insertionSort(a);
		

	}

}
