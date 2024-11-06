
public class Car {
    
  private String description;
  public Car(String description)
  {
    this.description = description;
  }

  public void startEngine()
  {
    System.out.println("Car -> startEngine");
  }
  public void drive()
  {
    System.out.println("Car -> driving, type is " + getClass().getSimpleName());
    runEngine();
  }
  protected void runEngine()
  {
    System.out.println("Car -> runEngine");

  }

  }

  class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders =6;

    public GasPoweredCar(String description){
      super(description);
    }
    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders)
    {
      super(description);
      this.avgKmPerLiter = avgKmPerLiter;
      this.cylinders = cylinders;
    }

    @Override
    public void startEngine()
    {
      System.out.printf("Gas -> All %d Cylinder are fired up, ready!%n",cylinders);
    }

    @Override
    protected void runEngine()
    {
      System.out.printf("Gas -> usage exceed the average: %.2f %n", avgKmPerLiter);
    }


  }
  
  //Electric car class
  class Electric extends Car {
    private double avgKmPerCharge;
    private int batterySize =6;

    public Electric(String description){
      super(description);
    }
    public Electric(String description, double avgKmPerCharge, int batterySize)
    {
      super(description);
      this.avgKmPerCharge = avgKmPerCharge;
      this.batterySize = batterySize;
    }

    @Override
    public void startEngine()
    {
      System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }
    @Override
    protected void runEngine()
    {
      System.out.printf("BEV -> usage under the  average: %.2f %n", avgKmPerCharge);
    }

  }
  
  //Hybrid Car
  class Hybrid extends Car {
    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize =6;

    public Hybrid(String description){
      super(description);
    }
    public Hybrid(String description, double avgKmPerLiter, int cylinders, int batterySize)
    {
      super(description);
      this.avgKmPerLiter = avgKmPerLiter;
      this.cylinders = cylinders;
      this.batterySize = batterySize;
    }

    @Override
    public void startEngine()
    {
      System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
      System.out.printf("Hybrid -> switch %d kWh battery on, Ready!%n", batterySize);
    }
    @Override
    protected void runEngine()
    {
      System.out.printf("BEV -> usage below the  average: %.2f %n", avgKmPerLiter);
    }

  }