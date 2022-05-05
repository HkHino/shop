import java.util.Scanner;

public class ShoppingWindow
{
    Scanner scanner = new Scanner(System.in);
    Shopageddon shopageddon = new Shopageddon();
    //attributes
    boolean isRunning = true;


    public void menu()
    {
        System.out.println("hello and welcome! what would you like to do today?");
        System.out.println("""
                press 1) to shop
                press 2) to view cart
                press 3) to view state tax chart
                press 4) to view discounts
                """);
        while (isRunning == true)
        {
            int input = scanner.nextInt();
            switch (input)
            {
                case 1:
                    System.out.println("welcome to the shopping what would you like to add to your cart?");
                    shopageddon.shopping();
                    isRunning = true;
                    break;

                case 2:
                    System.out.println("this is your cart");
                    System.out.println(shopageddon.getItem());
                    isRunning = true;
                    break;

                case 3:
                    System.out.println("this is  the discountrates");
                    System.out.println("""
                            Discout:
                            Order value        Dsicount Rate
                            $1000              3%
                            $5000              5%
                            $7000              7%
                            $1000              10%
                            $50000             15%
                            """);
                    isRunning = true;
                    break;

                case 4:
                    System.out.println("this is the statetax in various states");
                    System.out.println("""
                            State           Tax Rate
                            UT              6,85%
                            NV              8,00%
                            TX              6,25%
                            AL              4,00%
                            CA              6,25%
                                                    
                            """);
                    isRunning = true;
                    break;
                case 5:
                    System.out.println("thank you for shopping with us today!");
                    MathStuff mathStuff = new MathStuff();
                    mathStuff.checkout();

                    isRunning = false;
                case 6:
                    System.out.println("thank you for shopping with us today goodbye");
                    isRunning = false;
                    break;
                default:

            }
        }
    }
}
