import java.util.Arrays;
import java.util.List;

import java.util.Scanner;
public class Game{
    Scanner sc= new Scanner(System.in);
    public int floor;
    private int points;
    private String n;
    Player P;
    public Game(Player p){
        this.P=p;
        this.n= P.getName();

        this.gameStarted();

    }

    public void gameStarted(){

        if (floor == 0) {
            EmptyFloor e = new EmptyFloor(floor, points,n);
            points =  e.points();
        }

        List<Integer> emptyFloor=Arrays.asList(0,1,3,4,6,7,9,10,12);

        do {
            System.out.print("Hit enter to roll the dice ");
            String s=sc.nextLine();

            Dice d =new Dice();
            int diceVal=d.getFaceValue();
            System.out.println("Dice gave "+ diceVal);
            floor= floor + diceVal;
            boolean flag;
            do {
                flag= emptyFloor.contains(floor);
                if (flag) {
                    EmptyFloor e = new EmptyFloor(floor, points,n);
                    points = e.points();
                }

                if (floor == 2) {
                    ElevatorFloor el = new ElevatorFloor(floor, points, n);
                    points = el.points();
                    floor = el.finalFloor();
                }
                if (floor == 5) {
                    NormalSnakeFloor sn = new NormalSnakeFloor(floor, points, n);
                    points = sn.points();
                    floor=sn.finalFloor();
                }
                if (floor == 8) {
                    NormalLadderFloor lf = new NormalLadderFloor(floor, points, n);
                    points = lf.points();
                    floor=lf.finalFloor();
                }

                if (floor == 11) {
                    KingCobraFloor k = new KingCobraFloor(floor, points, n);
                    points = k.points();
                    floor=k.finalFloor();

                }

            }
            while(!flag);

        } while(floor!=12);


        int diceVal;
        do {
            System.out.print("Hit enter to roll the dice ");
            String s = sc.nextLine();
            Dice d = new Dice();
            diceVal = d.getFaceValue();
            System.out.println("Dice gave "+ diceVal);
            if (diceVal == 1) {
                floor = floor + diceVal;
                EmptyFloor e = new EmptyFloor(floor, points,n);
                points = e.points();

            } else {
                System.out.println("Player cannot move");
            }
        }while(diceVal!=1);
        Player p=new Player(P.getName());
        System.out.println("Game Over");
        p.displayPoints(points);



    }

}