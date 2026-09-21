// Program to find LCM using GCD
public class GCMBasedLCM
{
    // Method to calculate GCD (Greatest Common Divisor)
    public static int gcd(int a, int b)
    {
        // Repeat until b becomes 0
        while(b != 0)
        {
            // Store the value of b temporarily
            int temp = b;

            // Find the remainder of a divided by b
            b = a % b;

            // Assign old value of b to a
            a = temp;
        }

        // Return the GCD
        return a;
    }

    // Method to calculate LCM (Least Common Multiple)
    public static int lcm(int a, int b)
    {
        // Formula: LCM = (a * b) / GCD(a, b)
        return (a * b) / gcd(a, b);
    }

    // Main method - program execution starts here
    public static void main(String[] args)
    {
        // Declare two numbers
        int a = 12, b = 18;

        // Calculate and display the LCM
        System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
    }
}