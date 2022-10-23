import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name and hit enter");
        String name=sc.next();
        Player p= new Player(name);

        System.out.println("The game setup is ready");

            int diceVal;


            do {
                System.out.print("Hit enter to roll the dice ");
                String s=sc.nextLine();
                System.out.println(s);
                //String k=sc.next();

                Dice dice = new Dice();
                diceVal=dice.getFaceValue();
                if (diceVal == 1) {
                    System.out.println("Dice gave "+ diceVal);
                    Game _game = new Game(p);


                } else {
                    System.out.println("Dice gave "+ diceVal);
                    System.out.println("Game cannot start until you get 1");
                }
            } while(diceVal!=1);




    }
}
