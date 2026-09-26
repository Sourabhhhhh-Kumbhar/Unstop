public class HexadecimalToDecimal
{
    public static void main(String[]args)
    {
        String hex = "A3F";
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);
    }
}
