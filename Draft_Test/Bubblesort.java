package Draft_Test;
public class Bubblesort 
{
    static void bubblsSort(int[]arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                if(arr[j-1] > arr[i]){

                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 75, 35, 2, 45, 320, 5};
        System.out.println("Array Before Bubble sort");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    bubblsSort(arr);
    System.out.println("Array After bubble Sort");
    for(int i = 0; i < arr.length; i++)
    {
        System.out.println(arr[i] + " ");
        
    }
    }
}
