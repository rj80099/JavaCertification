public class Fish extends Animal {
    private int fins;

    private int gills;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscle() {
        System.out.print("muscle moving ");
    }

    private void moveBackFin() {
        System.out.print("backfin moving");

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscle();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills= '" + gills + '\'' +
                ", fins='" + fins + '\'' +
                "} " + super.toString();
    }

}
