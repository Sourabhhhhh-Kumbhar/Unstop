import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number: " );
        String binary = sc.nextLine();
        int decimal = 0;

        for(int i = 0; i < binary.length(); i++)
        {
            char bit = binary.charAt(binary.length() - 1 - i);
            if(bit == '1')
            {
                decimal += Math.pow(2, i);
            }
        }

        System.out.println("Decimal equivalent to: " + decimal);
        sc.close();
    }
}
