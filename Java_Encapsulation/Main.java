public class Main extends Object {

    public static void main(String[] args) {

        //NO EMCAPSULATION WAY
        Player player = new Player();
        player.name = "Rohit";
        player.health = 20;
        player.weapon = "Sword";

        //1.Allowing direct access to date on an object can potentially bypass checks and additional processing your class has in place to manage the data.
        //2.Allowing direct access to field means calling code would need to change when you edit any of the fields.
        //3.Omiting a construtor that would accept initilization data means the calling code is responsible for setting up this data on the new object.

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Reamaining health = "+player.healthRemaining());
        player.health = 200; //direct access to class field
        player.loseHealth(11);
        System.out.println("Reamaining health = "+player.healthRemaining());

        EnhancedPlayer rohit = new EnhancedPlayer("Rohit",200,"Sword");
        System.out.println("initial health is "+rohit.healthRemaining());

    }   
}

