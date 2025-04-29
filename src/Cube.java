public class Cube {
    private int side;
    public Cube() { //constructor (same name as the class)
        side = 1;
    }
    public Cube(int sideLength) {
        if (sideLength<1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        } //create a new instance of the illegal... class and pass a message as a parameter
        side = sideLength;
    }
    public int getSide() { //methods
        return side;
    }
    public void setSide(int side) { //setter method
        if (side<1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = side; //this. means use the variables within this class (e.g. side)
    }
    public int getSurfaceArea() {
        return side*side*6;
    }
    public int getVolume() {
        return side*side*side;
    }
    public String toString() {
        return "side=" + side;
    }
}