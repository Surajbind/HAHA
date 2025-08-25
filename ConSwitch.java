import java.util.*;

public class ConSwitch{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        var age = sc.nextLine();

        switch(age){
            case "A":
                System.out.print("It is A ");
            break;

            case "B":
                System.out.print("It is B ");
            break;

            default:
                System.out.print("It is C ");
            break;
            
        }
    }
}