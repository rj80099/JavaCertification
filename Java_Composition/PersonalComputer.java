public class PersonalComputer extends Product {
    
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PersonalComputer(String model, String manufacturer, 
                            ComputerCase computerCase, Monitor monitor,
                            MotherBoard motherboard){
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;


    }
    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }


    // public ComputerCase getComputerCase(){
    //     return computerCase;
    // }

    // public Monitor geMonitor()
    // {
    //     return monitor;
    // }
    // public MotherBoard getMotherBoard()
    // {
    //     return motherboard;
    // }


}
