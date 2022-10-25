public class NormalLadderFloor extends LadderFloor {
    public NormalLadderFloor(int f, int p, String s) {
        this.floor = f;
        this.points = p+2;
        this.name = s;
        this.display();
        this.playerPosition();
        this.totalPoints();


    }
    public void display() {
        System.out.println(name + " has reached an Ladder Floor");
    }
    public int finalFloor() {
        return this.floor = 10;

    }
}



