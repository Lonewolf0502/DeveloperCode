public class NormalSnakeFloor extends SnakeFloor {
    public NormalSnakeFloor(int f, int p, String n){
        this.floor=f;
        this.points=p-2;
        this.name=n;
        this.display();
        this.playerPosition();
        this.totalPoints();
    }


    public void display(){
        System.out.println(name+" has reached Snake Floor");
    }

    public int finalFloor() {
        return this.floor = 1;
    }

}
