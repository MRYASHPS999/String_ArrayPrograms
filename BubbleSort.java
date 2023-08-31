

public class BubbleSort {

	public static void bubbleSort(int a[]) {
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		
		int a[]= {10,45,587,78,93,7,1,58};
		
		bubbleSort(a);
		
		for(int i=0;i<a.length;i++) {
			
			
			System.out.println(a[i]+" ");
		}

	}

}
