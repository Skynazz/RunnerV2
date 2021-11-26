public class Foe extends AnimatedThing{

    private double posX;
    private double posY;
    private String fileName;

    public Foe(double posX, double posY, String fileName){
        super(posX,posY,fileName);
        this.posX=posX;
        this.posY=posY;
        this.fileName=fileName;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

}
