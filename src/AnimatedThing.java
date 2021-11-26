import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;



public class AnimatedThing {
    private double x;
    private double y;
    private ImageView imageHero;
    private ImageView imageFoe;
    private int attitude=0;
    private long time;
    private int index;
    private Integer Jump=0;
    private int gravity = 20;
    private int speedJump = 40;
    private int highJump=100;


    public AnimatedThing(double x, double y, String fileName){
        this.x=x;
        this.y=y;
        Image hero =new Image(fileName);
        this.imageHero=new ImageView(hero);
        this.imageHero.setViewport(new Rectangle2D(20,0,65,100));
        this.imageHero.setX(this.x);
        this.imageHero.setY(this.y);

        // le probleme vient surement d'ici, car il y a une différence entre Hero et Foe, mais dans l'héritage y a t-il la diff ?
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ImageView getImageHero(){
        return imageHero;
    }

    void update(){
        if ((this.getImageHero().getY()>=250)&&(attitude == 0)) {
            attitude=attitude+1;
        }

        if((this.getImageHero().getY()>=250)&&(attitude==1)){
            imageHero.setViewport(new Rectangle2D(20,0,65,100));
        }

        if((this.getImageHero().getY()>=250)&&(attitude==2)){
            imageHero.setViewport(new Rectangle2D(95,0,70,100));
        }

        if((this.getImageHero().getY()>=250)&&(attitude==3)){
            imageHero.setViewport(new Rectangle2D(170,0,80,100));
        }

        if((this.getImageHero().getY()>=250)&&(attitude==4)){
            imageHero.setViewport(new Rectangle2D(270,0,65,100));
        }

        if((this.getImageHero().getY()>=250)&&(attitude==5)){
            imageHero.setViewport(new Rectangle2D(345,0,70,100));
        }

        if((this.getImageHero().getY()>=250)&&(attitude==6)){
            imageHero.setViewport(new Rectangle2D(425,0,80,100));
        }
        attitude=(attitude+1)%7;

        //Gravity
        if((Jump==0)&&(this.getImageHero().getY()<250)){
            imageHero.setViewport(new Rectangle2D(95,160,65,100));
            this.getImageHero().setY(this.getImageHero().getY()+gravity);
        }

        //Jump
        if((Jump==1)&&(this.getImageHero().getY()>highJump)){
            imageHero.setViewport(new Rectangle2D(20,160,65,100));
            this.getImageHero().setY(this.getImageHero().getY()-speedJump);
        }

        if((Jump==1)&&(this.getImageHero().getY()<=highJump)){
            Jump=0;
        }
    }

    public void jump(){
        this.Jump=1;
        System.out.println("Jump="+Jump);
    }


}
