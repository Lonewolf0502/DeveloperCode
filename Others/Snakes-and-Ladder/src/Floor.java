public class Floor  {
    protected int floor;
    protected int points;
    public String name;
    public void playerPosition(){
        int _f= floor;
        System.out.println("Player position Floor "+_f);

    }


    public int points(){
        return points;
    }
    public void totalPoints(){
        System.out.println("Total Points "+ points);
    }
}
