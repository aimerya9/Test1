
package tutorial13;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Tutorial13 extends Application{
    @Override
    public void start (Stage primaryStage){
        Pane pane = new Pane();
        ImageView imageview = new ImageView("image/1.gif");
        pane.getChildren().add(imageview);
        imageview.setX(40);
        imageview.setY(400);
        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setTitle("123");
        primaryStage.setScene(scene);
        primaryStage.show();
        new Thread(() ->{
            try {
                while(true){
                    Platform.runLater(()->imageview.setY(imageview.getY()-1));
                    Thread.sleep(15);
                }
            }
        catch (InterruptedException ex){
    }
        }).start();
}


     public static void main(String[] args) {
        launch(args);
    }}