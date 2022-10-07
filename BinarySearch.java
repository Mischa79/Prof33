package Algorithms.lesson2;

public class BinarySearch {
    public static void main(String[] args) {
      int arr[] = {3,5,7,9,14,64,98,105,204,345};
        System.out.println(binSearch(arr,345));

    }
    public static int binSearch(int arr[], int key){
        int mid = arr.length / 2;
        if (key == arr[mid]){
            return mid;
        }
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
           mid = (end-start) / 2 + start;
           if (key<arr[mid]){
               end = mid -1;
           }else if (key>arr[mid]){
              start = mid +1;
           }else{
               return mid;
           }
        }
        return -1;
    }
}
