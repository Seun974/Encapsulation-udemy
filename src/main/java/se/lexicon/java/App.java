package se.lexicon.java;


public class App 
{
    public static void main( String[] args )
    {
    EnhancedPlayer player = new EnhancedPlayer("Sam", 200, "Sword");
        System.out.println("initial health is " + player.getHealth());


    }
}


//code below

//    Player player = new Player();
//        player.name = "Sam";
//                player.health = 20;
//                player.weapon = "sword";
//
//                int damage = 10;
//                player.loseHealth(10);
//                System.out.println("remaining health = " + player.healthRemaining());
//
//                damage = 11;
//                player.health = 200;
//                player.loseHealth(10);
//                System.out.println("remaining health = " + player.healthRemaining());

