public class SmartKitchen {
    
  private Coffemaker brewMaster;
  private DishWasher dishWasher;
  private Refrigerator iceBox;

  public SmartKitchen(){
    brewMaster = new Coffemaker();
    iceBox = new Refrigerator();
    dishWasher = new DishWasher();
  }


  public Coffemaker getCoffemaker()
  {
    return brewMaster;
  }

  public DishWasher getDishWasher()
  {
    return dishWasher;
  }

  public Refrigerator getIceBox()
  {
    return iceBox;
  }

  public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishFlag)
  {
    brewMaster.setHasWorkToDo(coffeeFlag);
    iceBox.setHasWorkToDo(fridgeFlag);
    dishWasher.setHasWorkToDo(dishFlag);
  }

  public void doKitchenWork(){
    brewMaster.brewCoffee();
    iceBox.orderFood();
    dishWasher.doDishes();
  }

}

class Coffemaker{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo)
    {
        this.hasWorkToDo=hasWorkToDo;
    }
    public void brewCoffee()
    {
        if(hasWorkToDo)
        {
        System.out.println("Brewing coffee");
        hasWorkToDo = false;
        }
    }


}

class Refrigerator{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo)
    {
        this.hasWorkToDo=hasWorkToDo;
    }
    public void orderFood()
    {
        if(hasWorkToDo)
        {
        System.out.println("Ordering Food");
        hasWorkToDo = false;
        }
    }


}

class DishWasher{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo)
    {
        this.hasWorkToDo=hasWorkToDo;
    }
    public void doDishes()
    {
        if(hasWorkToDo)
        {
        System.out.println("Washing Dishes");
        hasWorkToDo = false;
        }
    }


}
