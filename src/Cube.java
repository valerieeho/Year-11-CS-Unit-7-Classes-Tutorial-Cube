public class Cube {
    private int side;
    public Cube(){
        this.side = 1;
    }
    public Cube(int n){
        if (n<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        side = n;
    }
    public int getSide(){
        return side;
    }
    public void SetSide(int n){
        if (n>1){
            throw new IllegalArgumentException("A cube's side length cannot be more than 1!");
        }
        else {
            side = n;
        }
    }
    public int calculateSurfaceArea(){
        return side*side*6;
    }
    public int calculateVolume(){
        return side*side*side;
    }
    public String toString(){
        return "Cube{side = " + side + "}";
    }

}