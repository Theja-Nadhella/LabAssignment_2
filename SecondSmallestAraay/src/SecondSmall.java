/**Author: Theja N
Date: 23-10-2020
Desc: SecondSmallestNumber**/

import java.util.Scanner;

public class SecondSmall {
	public static void main(String[] args) {		
				Scanner sc=new Scanner(System.in);
				System.out.println("ENter size of array: ");
			int n=sc.nextInt();
			
			int arr[]=new int[n];
			System.out.println("ENter elements of array: ");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int min=arr[0];
			int max=arr[n-1];
			for(int j=0;j<=n-1 ;j++) {
				if(arr[j]<min) {
					max=min;
					min=arr[j];				
				}
				if(arr[j]>min && arr[j]<max) {
					max=arr[j];
				}
		}	
			System.out.println("The sec smallest is: "+max);
	}

}
