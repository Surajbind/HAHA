public class Arrayand{
    public static void main(String[] args)
    {
        int[] number = new int[2];
        number[0] = 45;
        number[1] = 50;

        int[] numbers = new int[2];
        numbers[0] = 48;
        numbers[1] = 53;



        System.out.print("Details "+number[0]);

        for(int i=0;i<number.length;i++)
        {
            System.out.print("For"+number[i]+"Loop");
        }

        System.out.print("While and For ");
        int y = numbers.length;
        System.out.print("Y is : "+y);

        while(y>0)
        {
           System.out.println("Its not working"+y);
            y--;
        }

    }
}