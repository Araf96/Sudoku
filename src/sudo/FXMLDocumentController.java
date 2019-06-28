/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudo;

import static java.awt.SystemColor.text;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import java.lang.String;
import java.awt.SystemColor;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author user
 */
public class FXMLDocumentController extends TextField implements Initializable {
    
    //JAVAFXmultiplescene main;
    
    Sudo main;
    Stage stage;
    int flag=0;
    //@FXML
    String n="";
    @FXML
    private Label label;
    @FXML
    private Button Ply;
    @FXML
    private Color x2;
    @FXML
    private Font x1;
    @FXML
    private MenuItem easy;
    @FXML
    private MenuItem medium;
    @FXML
    private MenuItem hard;
    @FXML
    private Button Qit;
    @FXML
    private TextField nam;
    @FXML
    private Button gname;

    
    
    @FXML
    private void handleButtonAction(ActionEvent Ply) throws IOException {
        if(flag==1)
            main.showHomePage();
            
    }
    
    @FXML
    private void handlebuttonAction(ActionEvent event) throws IOException{
       //main.showPage();
       //main.mainStage.close();
        main.Quit();
    }
    //na.setOnKeyPressed(new EventHandler<keyEvent>())
   
   
    @FXML
    private void namme(ActionEvent event)
    {
        //TextField nam=new TextField();
        n=nam.getText();
        if(n.equals(""))
        {
            flag=0;
        }
        else{
            flag=1;
        }
        main.sPage(n);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setMain(Sudo scene){
        main=scene;        
    }     
}
