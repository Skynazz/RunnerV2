import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class GameScene extends Scene{

    private Camera camera;
    private StaticThings left;
    private StaticThings right;
    private Hero hero;
    private Foe foe;
    private double temps=80000000;

    public GameScene(Pane pane,double x, double y){
        super(pane,x,y);
        this.camera = new Camera(x,y);
        this.left = new StaticThings(0,0,"desert.png");
        this.right = new StaticThings(800,0,"desert.png");
        this.hero = new Hero();
        this.foe= new Foe(800,250,"Bouftou2.png");
        timer.start();

        this.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode()== KeyCode.SPACE){
                    System.out.println("Jump");
                    hero.jump();
                }
            }
        });

    }

    AnimationTimer timer =new AnimationTimer() {
        long t =0;
        @Override
        public void handle(long time) {
            if(time-t>temps) {
                hero.update();
                left.updateLeft();
                right.updateRight();
                //camera.update(deltaT);
                t=time;
            }
        }
    };

    public StaticThings getimgright(){
        return right;
    }

    public StaticThings getimgleft(){
        return left;
    }

    public Hero getHero(){
        return hero;
    }

    public Foe getFoe(){
        return foe;
    }


}
