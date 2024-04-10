package assignment2;

public class Arraysorting {

	public static void main(String[] args) {
		int arr[] = {1, 90, 34, 7, 89, 9},temp;
		for(int i=0; i<6; i++) {
			for(int j=i+1; j<6; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
			}
			System.out.println(" ");
		}
		for(int i=0; i<3; i++) {
			System.out.println(""+arr[i]);
		}
		for(int i=0; i<6; i++) {
			for(int j=i+1; j<6; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(" ");
		}
		for(int i=0; i<3; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" ");
	}

}
