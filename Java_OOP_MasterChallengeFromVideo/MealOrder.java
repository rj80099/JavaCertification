// MealOrder Class
// -Burger object
// -Drink object
// -SideItem Object
// -Method to calculate total price, add topping to the burger, change drink size and print the itemized list

public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item sideItem;

    public MealOrder() {
        this("reglar","coke","fires");
    }
    public MealOrder(String burgerType, String drinkType, String sideType )
    {
        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new DeluxeBurger(burgerType, 8.50);
        }else {
            this.burger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.sideItem = new Item("side",sideType,1.50);

    }


    public void printItemizedList()
    {
        burger.printItem();
        if(burger instanceof DeluxeBurger)
        {
            Item.printItem(drink.getName(),0);
            Item.printItem(sideItem.getName(), 0);
            System.out.println("-".repeat(30));
            Item.printItem("TOTAL PRICE",getTotalPrice());
        }
        else{
            drink.printItem();
            sideItem.printItem();
            System.out.println("-".repeat(30));
            Item.printItem("TOTAL PRICE",getTotalPrice());
        }
    }

    public double getTotalPrice()
    {
        if(burger instanceof DeluxeBurger)
        {
            return burger.getAdjustedPrice();
        }
        return sideItem.getAdjustedPrice()+drink.getAdjustedPrice()+
                burger.getAdjustedPrice();
    }

    public void addBurgerTopping(String extra1, String extra2, String extra3)
    {
     burger.addTopping(extra1, extra2, extra3);   
    }

    public void addBurgerTopping(String extra1, String extra2, String extra3, String extra4, String extra5)
    {
     if(burger instanceof DeluxeBurger db)
     {
        db.addBurgerTopping(extra1, extra2, extra3, extra4, extra5);
     }  
     else{
        burger.addTopping(extra1, extra2, extra3);
     }
    }

    public void setDrinkSize(String size)
    {
        drink.setSize(size);
    }
}
