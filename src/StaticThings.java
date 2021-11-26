import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class StaticThings {
    private double x;
    private double y;
    private ImageView img;
    private int vitesse=25;


    public StaticThings(double x, double y,String fileName){
        this.x=x;
        this.y=y;
        Image background = new Image(fileName);
        this.img = new ImageView(background);
        this.img.setViewport(new Rectangle2D(0,0,1600,800));
        this.img.setX(this.x);
        this.img.setY(this.y);
    }

    public ImageView getImg(){
        return img;
    }

    public void updateLeft(){
        if(this.getImg().getX()>-800){
            this.getImg().setX(this.getImg().getX() - vitesse);
        }
        else{
            this.getImg().setX(0);
        }
    }

    public void updateRight(){
        if(this.getImg().getX()>0){
            this.getImg().setX(this.getImg().getX() - vitesse);
        }
        else{
            this.getImg().setX(800);
        }
    }

}

