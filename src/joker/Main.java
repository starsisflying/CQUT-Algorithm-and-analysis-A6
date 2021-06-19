package joker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("MainScence.fxml"));
            Parent root=fxmlLoader.load();
            MainController mainController=fxmlLoader.getController();
            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("A6");
            primaryStage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        launch(args);
    }
}
