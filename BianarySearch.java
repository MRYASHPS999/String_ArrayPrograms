
public class BianarySearch {
	
	
	public static void binarySearch(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(arr[mid]==key) {
				System.out.println("value present at "+ mid );
				break;
			}
			else if(arr[mid]>key) {
				high=mid-1;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			
			//System.out.println("element not found  ");
			
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,34,56,78,90,234,456,780,900};
		binarySearch(arr,900);
		
		

	}

}
