public class ReverseArr{
    public void reverse(int arr[]){
        for(int i=arr.length-1;i>-1;i--){
            System.out.println(+arr[i]);
        }
    }

    public static void main(String[] args){
        int num[] = {10,20,30,40,50,60,70,80,90,100};
        ReverseArr rv = new ReverseArr(); 
        rv.reverse(num); 
    }
}