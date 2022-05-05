import java.util.ArrayList;
import java.util.Scanner;

public class MathStuff
{
    //attributes

    private double UT = 1.0685;
    private double NV = 1.08;
    private double TX = 1.0625;
    private double AL = 1.04;
    private double CA = 1.625;
    Shopageddon shopageddon = new Shopageddon();


    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();


    //methods
    public double calcDiscount()
    {
        double totalPrice = 0;
        if (totalPrice > 1000 && totalPrice < 4999)
        {
            totalPrice = totalPrice * 0.97;
            System.out.println("this is your price with discount" + totalPrice);
        }
        else if (totalPrice > 5000 && totalPrice < 7000)
        {
            totalPrice = totalPrice * 0.95;
            System.out.println("this is your price with discount" + totalPrice);
        }
        else if (totalPrice > 7000 && totalPrice < 10000)
        {
            totalPrice = totalPrice * 0.93;
            System.out.println("this is your price with discount" + totalPrice);
        }
        else if (totalPrice > 50000)
        {
            totalPrice = totalPrice * 0.85;
            System.out.println("this is your price with discount" + totalPrice);
        }
        else
        {
            totalPrice = totalPrice * 1;
        }
        return totalPrice;
    }

    public double stateTax()
    {
        System.out.println("please choose your state from the following list:");
        System.out.println("""
                  State           Tax Rate
                1) UT              6,85%
                2) NV              8,00%
                3) TX              6,25%
                4) AL              4,00%
                5) CA              6,25%
                 """);
        int input = scanner.nextInt();

        switch (input)
        {
            case 1:
                return UT;

            case 2:
                return NV;

            case 3:
               return TX;

            case 4:
                return AL;

            case 5:
                return CA;

            default:
                return -1;
        }

    }

    public void checkout()
    {
        double due = shopageddon.getAccumulativePrice() * calcDiscount() * stateTax();
        System.out.println("total due " + due);

    }

}
