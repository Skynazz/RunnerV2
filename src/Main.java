import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Runner");
        Group root = new Group();
        Pane new_pane = new Pane(root);
        GameScene theGameScene = new GameScene(new_pane,600,400);
        primaryStage.setScene(theGameScene);
        root.getChildren().add(theGameScene.getimgright().getImg());
        root.getChildren().add(theGameScene.getimgleft().getImg());
        root.getChildren().add(theGameScene.getHero().getImageHero());
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);

        // write your code here
    }
}