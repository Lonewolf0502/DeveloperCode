import java.util.Random;
public class Dice {
    private final int numFaces=2; //maximum face value
    private int faceValue; //current value showing on the dice
    // Rolls the dice
    public Dice(){
        this.roll();
    }
    public void roll() {
        Random rand= new Random();
        int curr_faceValue = 1 + rand.nextInt(numFaces);
        setFaceValue(curr_faceValue);
    }

    // Face value setter/mutator.
    private void setFaceValue(int value) {
        if (value <= numFaces)
            this.faceValue = value;
    }

    // Face value getter/setter.
    public int getFaceValue() {
        return faceValue;
    }



}


