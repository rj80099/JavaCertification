public class Drink {
    private String drinkType;
    private String drinkSize;
    private double basePrice;

    public Drink(String drinkType, String drinkSize, double basePrice)
    {
        this.drinkType = drinkType;
        this.drinkSize = drinkSize;
        this.basePrice = basePrice;
    }
    public void changeSize (String newSize)
    {
        this.drinkSize = newSize;
        switch (drinkSize.toLowerCase()) {
            case "small" -> basePrice =1.5;
            case "medium" -> basePrice = 2.0;
            case "big" -> basePrice = 2.5;
            default -> System.out.println("Invalid size");
        }
    }

    public double getPrice()
    {
        return basePrice;
    }

    public void printDetails()
    {
        System.out.println("Drink: "+drinkType+ " (" +drinkSize+ ") -$"+basePrice );
    }
    
}
