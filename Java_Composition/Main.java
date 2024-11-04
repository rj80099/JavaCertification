public class Main extends Object {

    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v4.44");
        
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase,theMonitor,theMotherBoard);
        // thePC.geMonitor().drawPixelAt(10, 10, "red"); //getter is used to get the reference
        // thePC.getMotherBoard().loadProgram("Windows OS");  //getter is used to get the reference 
        // thePC.getComputerCase().pressPowerButton();
        thePC.powerUp();
        //composition is like creating object inside object like master object
    }   
}

