package array;
import java.util.Scanner;
class Solution {
    public  static void reverse(int arr[],int start, int end) {
        while(start<=end){
          int temp = arr[end];
          arr[end] = arr[start];
          arr[start] = temp;
          start++;
          end--;
        }
    }
}

public class array5{
    public static void main(String[] args){
        System.out.println("enter the size of the array");
        Scanner obj = new Scanner(System.in);
        int arr[] = new int[obj.nextInt()];
        System.out.println("enter the elements of the array");
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("enter the place by the array is to be rotated");
        int k = obj.nextInt();
         Solution.reverse(arr,0,k-1);
         Solution.reverse(arr,k,arr.length-1);
         Solution.reverse(arr,0,arr.length-1);
         for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+"");
        }
        obj.close();
    
    }
}

