import java.util.Arrays;

public class MinMaxKth
{
    public void functional(int arr[], int k)
    {
        Arrays.sort(arr);
        System.out.println("Maximum Number "+arr[arr.length-1]);
        System.out.println("Minimum Number "+arr[0]);
        System.out.println("Maximum "+k+"th Element"+arr[arr.length-k]);
        System.out.println("Minimum "+k+"th Element"+arr[k-1]);

    }
    public static void main(String[] args)
    {
        int k = 3;
        int arr[] = {10,20,40,15,85,19,34};
        MinMaxKth mm = new MinMaxKth();
        if(k < arr.length){
            mm.functional(arr, k);
        }
        else
        {
            System.out.println(k+" Exceeded Array Length");
        }
    }
}