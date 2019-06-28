/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudo;

import java.awt.event.KeyEvent;
import java.io.IOException;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author user
 */
public class Sudo extends Application {
    
    Stage mainStage;
    Scene scene1,scene2,scene3;
    String name="";
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        
        FXMLDocumentController controller=loader.getController();
        controller.setMain(this);
        mainStage=stage;
        
        
        scene1 = new Scene(root);
        
        stage.setScene(scene1);
        stage.show();
        
    }
    
    public String names()
    {
        return name;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
     public void showHomePage() throws IOException{
        
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Play.fxml"));
        Parent root = loader.load();
        
        PlayController controller=loader.getController();
        controller.setMain(this);
        
        mainStage.setTitle("Hello "+name);
        scene2 = new Scene(root);
        scene2.getStylesheets().add(getClass().getResource("/sudo/CSSfile.css").toExternalForm());
        mainStage.setScene(scene2);
        mainStage.show();
   
    } 
    
    public void backPage()throws IOException
    {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        
        FXMLDocumentController controller=loader.getController();
        controller.setMain(this);
        //mainStage=stage;
        
        
        scene1 = new Scene(root);
        
        
        mainStage.setScene(scene1);
        mainStage.show();
    }
    

    public void sPage(String nam)
    {
        name=nam;
        //System.out.println(name);
    }
     
    public void Quit() throws IOException
    {        
        mainStage.close();
    }
}
