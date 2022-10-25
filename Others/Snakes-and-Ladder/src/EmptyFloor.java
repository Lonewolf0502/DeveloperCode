public class EmptyFloor extends Floor{
    private String name;
    public EmptyFloor(int f, int p,String n){
        this.floor=f;
        this.points=p+1;
        this.name=n;
        this.display();
        this.playerPosition();
        this.totalPoints();
    }
    public void display(){
        System.out.println(name+" has reached an Empty Floor");
    }



}
