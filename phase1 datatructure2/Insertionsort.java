package DataStructure;

public class Insertionsort {
public static void main(String[] args) {
	int arr[]= { 12, 11, 13, 5, 6 };
	int n=arr.length;
	sort(arr,n);
}

public static void sort(int[] arr, int n){
	for(int i=1;i<n;i++) {
		int temp=arr[i];
		int j=i-1;
		while(j>=0&&arr[j]>temp) {
			arr[j+1]=arr[j];
			j--;			
		}
		arr[j+1]=temp;
	}
	for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");

    System.out.println();

}
}
