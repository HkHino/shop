public class Item
{
    //Attributes
    private double price;
    private String name;


    //Constructor
    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;

    }
    //gettere and setters
    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Item{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
