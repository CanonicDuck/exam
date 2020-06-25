import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;

public class exam extends Application {



    /* экзаменационный коммит */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(new Scene(initInterface(), 640, 800));
        primaryStage.show();
    }


    private VBox initInterface() {
        VBox window = new VBox();
        HBox h1 = new HBox();

        ImageView iv1 = new ImageView();
        ImageView iv2 = new ImageView();
        ImageView iv3 = new ImageView();

        WritableImage im1 = new WritableImage(120, 100);
        for (int i = 0; i < 120; i++) {
            for (int j = 0; j < 100; j++) {
                im1.getPixelWriter().setColor(i,j, Color.GREEN);
            }
        }
        iv1.setImage(im1);

        WritableImage im2 = new WritableImage(256, 256);
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                im2.getPixelWriter().setColor(i,j, Color.rgb(0, i, j));
            }
        }
        iv2.setImage(im2);

        WritableImage im3 = new WritableImage(256, 256);
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                im3.getPixelWriter().setColor(i,j, Color.rgb(i, i, j));
            }
        }
        iv3.setImage(im3);

        h1.getChildren().addAll(iv1, iv2, iv3);
        window.getChildren().addAll(h1);
        return window;
    }

}


