public class SortOand1Array {

    public void functionSort(int arr[]){
        int c0=0,c1=0,c2=0,index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            {
                c0++;
            }
            else if(arr[i]==1)
            {
                c1++;
            }
            else
            {
                c2++;
            }
        }
          while(c0 > 0)
            {
                arr[index++] = 0;
                c0--;
            }
            while(c1 > 0)
            {
                arr[index++] = 1;
                c1--;
            }
            while(c2 > 0)
            {
                arr[index++] =2;
                c2--;
            }
        for(int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,0,2,1,0,2,1};
        var szo = new SortOand1Array();
        szo.functionSort(arr);

    }
}