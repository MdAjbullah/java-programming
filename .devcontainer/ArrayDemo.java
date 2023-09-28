import java.util.*;
class ArrayDemo
{
	public static void main(String[] args) {
		int arr[]={12,3,4,5,6,120,44,55,11,7};
		int num[]=new int[10];
		int i;
		Arrays.sort(arr);
		for(i=0;i<10;i=i+1)
		{
			System.out.println(arr[i]);
		}
		int id;
		id=Arrays.binarySearch(arr,12);
		System.out.println(id);
		Arrays.fill(num,0);
		for(i=0;i<10;i=i+1)
		{
			System.out.println(num[i]);
		}
	}
}