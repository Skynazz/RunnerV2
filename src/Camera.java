public class Camera {
    private double x;
    private double y;

    public Camera (double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public String toString(){
        String coord =getX()+", " + getY();
        return coord;
    }
}