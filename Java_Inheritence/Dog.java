
public class Dog extends Animal {

    private String earShape;

    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50.0);

    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    } // Above Dog constructor will call the below constructor as the process of
      // chaining using this keyword

    public Dog(String type, double weight, String earShape,
            String tailShape) {
        // super(); //will always call default construtor
        // super("Mutt", "Big", 50.0); // way to call constructor of parent class or
        // subclass just like this() in
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"), weight); // way to call constructor of
                                                                                         // parent class or subclass
                                                                                         // just like this() in
        // constuctor call for chaining
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape= '" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.println("Ow Woooo!");
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() { // we will call from move method. Note we have not made the method public

        System.out.print("Woof!");
    }

    private void run() {
        System.out.print("Dog Running ");
    }

    private void walk() {
        System.out.print("Dog Walking ");
    }

    private void wagTail() {
        System.out.print("Dog wag their tail ");
    }
}
