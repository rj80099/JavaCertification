public class Main extends Object {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        //setting the work individually
        // kitchen.getDishWasher().setHasWorkToDo(true);
        // kitchen.getIceBox().setHasWorkToDo(true);
        // kitchen.getCoffemaker().setHasWorkToDo(true);
        
        // kitchen.getDishWasher().doDishes();
        // kitchen.getIceBox().orderFood();
        // kitchen.getCoffemaker().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }   
}

