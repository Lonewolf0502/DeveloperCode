public class KingCobraFloor extends SnakeFloor{

    private String name;

    public KingCobraFloor(int f, int p, String n){
        this.floor=f;
        this.points=p-4;
        this.name=n;
        this.display();
        this.playerPosition();
        this.totalPoints();
    }

    public void display(){
        System.out.println(name+" has reached an King Cobra Floor");
    }
    public int finalFloor() {
        return this.floor = 3;
    }

}


