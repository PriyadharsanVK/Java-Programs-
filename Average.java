import java.util.Scanner;
class Average
{
    public static void main (String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter First Subject Mark : ");
        int Mark1 = S.nextInt();
        System.out.print("Enter Second Subject Mark : ");
        int Mark2 = S.nextInt();
        System.out.print("Enter Third Subject Mark : ");
        int Mark3 = S.nextInt();
        System.out.print("Enter Fourth Subject Mark : ");
        int Mark4 = S.nextInt();
        System.out.print("Enter Fifth Subject Mark : ");
        int Mark5 = S.nextInt();
        int Sum=(Mark1+Mark2+Mark3+Mark4+Mark5);
        int avg=Sum/5;
        System.out.println("Your Average is "+avg);
    }
}