//import Car.Car;
import Bank.Bank;

public class Main{
    public static void main(String[] args) {

         Bank rohit = new Bank();
         rohit.withdraw(100.0);
         rohit.depositFunds(250);
         rohit.withdraw(100.0);
         rohit.withdraw(200.0);
         rohit.depositFunds(250);

    }
}


// public class Main{
//     public static void main(String[] args) {

//         Car car = new Car();
//         car.setMake("Maserati");
//         car.setModel("Carrera");
//         car.setDoors(2);
//         car.setConvertible(true);
//         car.setColor("black");
//         //car.describeCar();
//         System.out.println("make= "+car.getMake());
//         System.out.println("model= "+car.getModel());
//         System.out.println("color= "+car.getColor());
//         car.describeCar();

//     }
// }
