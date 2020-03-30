
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("please provide numbers");

        String number = input.nextLine();
        try {
            Calculator.add(number);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}