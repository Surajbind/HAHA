public class NegativewithPositive
{
    public static void main(String[] args)
    {
       int negCounter=0;
       int arr[] = {-13,0,5,4,-35,-4,-78};
       int[] newArr = new int[arr.length];

       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]<0)
        {
            negCounter++;
        }
       }

       int negIndex = 0;
       int index = negCounter;

       for(int i=0;i<arr.length;i++)
       {
            if(arr[i] < 0)
            {   
                newArr[negIndex++] = arr[i];
            }
            else if(arr[i]>=0)
            {
                newArr[index++] = arr[i];
            }
       }

       for(int i=0;i<newArr.length;i++)
       {
            System.out.println(newArr[i]);
       }
    }
}