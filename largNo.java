// write a tprogram to find the largest number among three numbers using system.in

public class largNo {
    
    public static void main(String args[])
 {
        int a, b, c;
        try
        {
            System.out.println("Enter the first number");
            a = Integer.parseInt(System.console().readLine());
            System.out.println("Enter the second number");
            b = Integer.parseInt(System.console().readLine());
            System.out.println("Enter the third number");
            c = Integer.parseInt(System.console().readLine());
            if(a > b && a > c)
            {
                System.out.println("The largest number is "+a);
            }
            else if(b > a && b > c)
            {
                System.out.println("The largest number is "+b);
            }
            else
            {
                System.out.println("The largest number is "+c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
