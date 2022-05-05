import java.util.ArrayList;
import java.util.Scanner;

public class MathStuff
{
    //attributes
    private double totalPrice;
    private double UT = 1.0685;
    private double NV = 1.08;
    private double TX = 1.0625;
    private double AL = 1.04;
    private double CA = 1.625;
    Shopageddon shopageddon = new Shopageddon();

    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    public void stateTax()
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
                shopageddon.getAccumulativePrice() * UT;
                break;

            case 2:
                shopageddon.getAccumulativePrice() * NV;
                break;

            case 3:
                shopageddon.getAccumulativePrice() * TX;
                break;

            case 4:
                shopageddon.getAccumulativePrice() * AL;
                break;

            case 5:
                shopageddon.getAccumulativePrice() * CA;
                break;

        }

    public void calcDiscount()
    {
        if (totalPrice > 1000 && totalPrice < 4999)
        {
            totalPrice = totalPrice * 0.97;
            System.out.println("this is your price with discout" + totalPrice);
        }
        else if (totalPrice > 5000 && totalPrice < 7000)
        {
            totalPrice = totalPrice * 0.95;
            System.out.println("this is your price with discout" + totalPrice);
        }
        else if (totalPrice > 7000 && totalPrice < 10000)
        {
            totalPrice = totalPrice * 0.93;
            System.out.println("this is your price with discout" + totalPrice);
        }
        else if (totalPrice > 50000)
        {
            totalPrice = totalPrice * 0.85;
            System.out.println("this is your price with discout" + totalPrice);
        }
        else
        {
            totalPrice = totalPrice * 1;
        }
    }

    }

public void checkout()
{
    totalPrice * ;

}

}
