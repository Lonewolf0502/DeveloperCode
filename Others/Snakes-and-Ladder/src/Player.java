public class Player {
    protected String name;
    private int points;
    public Player(String n){
        this.name=n;
    }
    public void displayPoints(int p){
        this.points=p;
        System.out.println(name+" accumulated "+ points+" points");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; }
}
