import java.util.ArrayList;
import java.util.Scanner;

public class Shopageddon
{
    Scanner scanner = new Scanner(System.in);

    //attributes
    private ArrayList<String> item = new ArrayList<String>();
    private double accumulativePrice;

    //methods
    public void shopping()
    {

        System.out.println("what do you want to buy? ");
        String itemName = scanner.nextLine();
        //scanner.nextLine(); //scannerbug
        System.out.println("what is the price of this item?");
        double price = scanner.nextInt();
        System.out.println("how many would you like of this item?");
        int totalAmount = scanner.nextInt();
        double totalPrice = totalAmount * price;
        System.out.println("total price for this item is:" + totalPrice);
        for (int i = 0; i < totalAmount; i++)
        {
            item.add(itemName);
        }
        System.out.println("would you like to add more items to your cart?");
        System.out.println("""
                1) for yes
                2) to see your current total
                3) return to previous menu
                """);
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input)
        {
            case 1:
                shopping();
                break;

            case 2:
                System.out.println("this is your accumulative ");
                accumulativePrice = accumulativePrice + totalPrice;
                System.out.println(accumulativePrice);
                System.out.println("""
                        would you like to add more items to your cart?
                        press 1) for yes
                        press 2) for no
                        """);
                input = scanner.nextInt();
                scanner.nextLine(); //scannerbug
                if (input == 1)
                {
                    shopping();
                }
                else if (input == 2)
                {
                    ShoppingWindow shoppingWindow = new ShoppingWindow();
                    shoppingWindow.menu();
                }
                //todo insert while loop to prevent wrong input

            case 3:
                ShoppingWindow shoppingWindow = new ShoppingWindow();
                shoppingWindow.menu();
                break;
        }
    }

    //getters and setters
    public ArrayList<String> getItem()
    {
        return item;
    }

    public void setItem(ArrayList<String> item)
    {
        this.item = item;
    }
    public double getAccumulativePrice()
    {
        return accumulativePrice;
    }

    public void setAccumulativePrice(double accumulativePrice)
    {
        this.accumulativePrice = accumulativePrice;
    }



}