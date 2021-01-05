package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class StartScreen extends Application {
	
    @Override
    public void start(Stage primaryStage) throws Exception{
    	
        primaryStage.setTitle( "StartPage" );
    	Parent startroot = FXMLLoader.load(getClass().getResource("startScreen.fxml"));
    	Scene startscene = new Scene(startroot, 800, 600);
        
        primaryStage.setScene(startscene);

        primaryStage.show();
    }
    
  

    
    
    public static void main(String[] args) {
        launch(args);
    }
}
