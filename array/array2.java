package array;
import java.util.Scanner;

class solution{
    public static int slargest(int arr[]){
        int largest = arr[0];
        int slargest=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest&&arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }

    public static int ssmallest(int arr[]){
        int smallest = arr[0];
        int ssmallest = 12345678;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest&&arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }
}

public class array2 {
    public static void main(String[] args){
        System.out.println("enter the size of the array");
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[obj.nextInt()];
        System.out.println("enter the array elements");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = obj.nextInt();
        }
        int slargest =solution.slargest(arr);
        int ssmallest=solution.ssmallest(arr);
        System.out.println("the second largest element from the array is"+":"+slargest);
        System.out.println("the second smallest element from the array is"+":"+ssmallest);
        obj.close();

    }
}
