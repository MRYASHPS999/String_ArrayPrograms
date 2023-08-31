import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		
		//int a[]= {10,45,587,78,93,7,1,58};
		
		
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print("Enter the int values: ");
			 a[i] =sc.nextInt();
			
		}
		sc.close();
		
		   selectionSort(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		
		

	}

}
