public class ElevatorFloor extends LadderFloor {
    public ElevatorFloor(int f, int p, String s){
        this.floor=f;
        this.points=p+4;
        this.name=s;
        this.display();
        this.playerPosition();
        this.totalPoints();

    }

    public void display(){
        System.out.println(name+" has reached an Elevator Floor");
    }


    public int finalFloor() {
        return this.floor = 10;

    }



}


