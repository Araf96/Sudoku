/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudo;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import static javax.management.Query.value;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PlayController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Sudo main;
    int flag;
    @FXML
    private AnchorPane secPage;
    private Button one;
    @FXML
    private Button r0c0;
    @FXML
    private Button r0c1;
    @FXML
    private Button r0c2;
    @FXML
    private Button r0c3;
    @FXML
    private Button r0c4;
    @FXML
    private Button r0c5;
    @FXML
    private Button r0c6;
    @FXML
    private Button r0c8;
    @FXML
    private Button r0c7;
    @FXML
    private Button r1c0;
    @FXML
    private Button r1c1;
    @FXML
    private Button r1c2;
    @FXML
    private Button r1c3;
    @FXML
    private Button r1c4;
    @FXML
    private Button r1c5;
    @FXML
    private Button r1c6;
    @FXML
    private Button r1c7;
    @FXML
    private Button r1c8;
    @FXML
    private Button r2c0;
    @FXML
    private Button r2c1;
    @FXML
    private Button r2c2;
    @FXML
    private Button r2c3;
    @FXML
    private Button r2c4;
    @FXML
    private Button r2c5;
    @FXML
    private Button r2c6;
    @FXML
    private Button r2c7;
    @FXML
    private Button r2c8;
    @FXML
    private Button r3c0;
    @FXML
    private Button r3c1;
    @FXML
    private Button r3c2;
    @FXML
    private Button r3c3;
    @FXML
    private Button r3c4;
    @FXML
    private Button r3c5;
    @FXML
    private Button r3c6;
    @FXML
    private Button r3c7;
    @FXML
    private Button r3c8;
    @FXML
    private Button r4c0;
    @FXML
    private Button r4c1;
    @FXML
    private Button r4c2;
    @FXML
    private Button r4c3;
    @FXML
    private Button r4c4;
    @FXML
    private Button r4c5;
    @FXML
    private Button r4c6;
    @FXML
    private Button r4c7;
    @FXML
    private Button r4c8;
    @FXML
    private Button r5c0;
    @FXML
    private Button r5c1;
    @FXML
    private Button r5c2;
    @FXML
    private Button r5c3;
    @FXML
    private Button r5c4;
    @FXML
    private Button r5c5;
    @FXML
    private Button r5c6;
    @FXML
    private Button r5c7;
    @FXML
    private Button r5c8;
    @FXML
    private Button r6c0;
    @FXML
    private Button r6c1;
    @FXML
    private Button r6c2;
    @FXML
    private Button r6c3;
    @FXML
    private Button r6c4;
    @FXML
    private Button r6c5;
    @FXML
    private Button r6c6;
    @FXML
    private Button r6c7;
    @FXML
    private Button r6c8;
    @FXML
    private Button r7c0;
    @FXML
    private Button r7c1;
    @FXML
    private Button r7c2;
    @FXML
    private Button r7c3;
    @FXML
    private Button r7c4;
    @FXML
    private Button r7c5;
    @FXML
    private Button r7c6;
    @FXML
    private Button r7c7;
    @FXML
    private Button r7c8;
    @FXML
    private Button r8c0;
    @FXML
    private Button r8c1;
    @FXML
    private Button r8c2;
    @FXML
    private Button r8c3;
    @FXML
    private Button r8c4;
    @FXML
    private Button r8c5;
    @FXML
    private Button r8c6;
    @FXML
    private Button r8c7;
    @FXML
    private Button r8c8;
    
    //Scanner ob=new Scanner(System.in);
    @FXML
    private AnchorPane split;
    @FXML
    private Button gSudo;
    @FXML
    private AnchorPane upRight;
    @FXML
    private Label label;
    @FXML
    private AnchorPane downRight;
    @FXML
    private Button mainMenu;
    @FXML
    private Color x2;
    @FXML
    private Font x1;
    @FXML
    private Button pQuit;
    @FXML
    private Button solution;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
        
    }

    public void setMain(Sudo scene) throws IOException{
        main=scene;
        label.setText("Hello "+main.name);
    } 
    
    int flagMatrix[][]=new int[9][9];
    int copyMatrix[][]=new int [9][9];
    
    @FXML
    public void playQuit(ActionEvent event) throws IOException
    {
        main.Quit();
    }
   
    @FXML
    public void solve(ActionEvent event)throws IOException
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(copyMatrix[i][j]!=0){
                    if(i==0 && j==0)r0c0.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==0 && j==1)r0c1.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==0 && j==2)r0c2.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==0 && j==3)r0c3.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==0 && j==4)r0c4.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==0 && j==5)r0c5.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==0 && j==6)r0c6.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==0 && j==7)r0c7.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==0 && j==8)r0c8.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==1 && j==0)r1c0.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==1 && j==1)r1c1.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==1 && j==2)r1c2.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==1 && j==3)r1c3.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==1 && j==4)r1c4.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==1 && j==5)r1c5.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==1 && j==6)r1c6.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==1 && j==7)r1c7.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==1 && j==8)r1c8.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==2 && j==0)r2c0.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==2 && j==1)r2c1.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==2 && j==2)r2c2.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==2 && j==3)r2c3.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==2 && j==4)r2c4.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==2 && j==5)r2c5.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==2 && j==6)r2c6.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==2 && j==7)r2c7.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==2 && j==8)r2c8.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==3 && j==0)r3c0.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==3 && j==1)r3c1.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==3 && j==2)r3c2.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==3 && j==3)r3c3.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==3 && j==4)r3c4.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==3 && j==5)r3c5.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==3 && j==6)r3c6.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==3 && j==7)r3c7.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==3 && j==8)r3c8.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==4 && j==0)r4c0.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==4 && j==1)r4c1.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==4 && j==2)r4c2.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==4 && j==3)r4c3.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==4 && j==4)r4c4.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==4 && j==5)r4c5.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==4 && j==6)r4c6.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==4 && j==7)r4c7.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==4 && j==8)r4c8.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==5 && j==0)r5c0.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==5 && j==1)r5c1.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==5 && j==2)r5c2.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==5 && j==3)r5c3.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==5 && j==4)r5c4.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==5 && j==5)r5c5.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==5 && j==6)r5c6.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==5 && j==7)r5c7.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==5 && j==8)r5c8.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==6 && j==0)r6c0.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==6 && j==1)r6c1.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==6 && j==2)r6c2.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==6 && j==3)r6c3.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==6 && j==4)r6c4.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==6 && j==5)r6c5.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==6 && j==6)r6c6.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==6 && j==7)r6c7.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==6 && j==8)r6c8.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==7 && j==0)r7c0.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==7 && j==1)r7c1.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==7 && j==2)r7c2.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==7 && j==3)r7c3.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==7 && j==4)r7c4.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==7 && j==5)r7c5.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==7 && j==6)r7c6.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==7 && j==7)r7c7.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==7 && j==8)r7c8.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==8 && j==0)r8c0.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==8 && j==1)r8c1.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==8 && j==2)r8c2.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==8 && j==3)r8c3.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==8 && j==4)r8c4.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==8 && j==5)r8c5.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==8 && j==6)r8c6.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==8 && j==7)r8c7.setText(Integer.toString(copyMatrix[i][j]));
                }
                if(copyMatrix[i][j]!=0){
                    if(i==8 && j==8)r8c8.setText(Integer.toString(copyMatrix[i][j]));
                }
            }
        }
    }
    
    
    @FXML
    public void arafat(KeyEvent event)throws IOException
    {
        String str=event.getText();
        String id=((Button)event.getSource()).getId();
       int i=Integer.parseInt(id.substring(1,2));
       int j=Integer.parseInt(id.substring(3));
       if(flagMatrix[i][j]==0)
       {
           try{
           if(Integer.parseInt(str)>=1 && Integer.parseInt(str)<=9)
      
                ((Button)event.getSource()).setText(str);
           }catch(Exception e){};
             
       }
    }
    
//    @FXML
//    public void playQuit(ActionEvent event)throws IOException
//    {
//        main.Quit();
//    }
    
    @FXML
    public void backMenu(ActionEvent mainMenu)throws IOException
    {
        main.backPage();
    }
    


    @FXML
    private void getDigit(ActionEvent event) throws IOException{
       //String n=(setevent.getSource()).getText();
       //main.timeSet();
       int i,j,p=0,q=0,n,m,l=0,temp,flag=0;
       //int Matrix[][]=new int [9][9];
       
        
        int inputMatrix[][]=new int [9][9];
        //StringBuilder str[]=new StringBuilder[9];
        //StringBuilder str2=new StringBuilder();
        r0c0.setText(null);
        r0c1.setText(null);
        r0c2.setText(null);
        r0c3.setText(null);
        r0c4.setText(null);
        r0c5.setText(null);
        r0c6.setText(null);
        r0c7.setText(null);
        r0c8.setText(null);
        r1c0.setText(null);
        r1c1.setText(null);
        r1c2.setText(null);
        r1c3.setText(null);
        r1c4.setText(null);
        r1c5.setText(null);
        r1c6.setText(null);
        r1c7.setText(null);
        r1c8.setText(null);
        r2c0.setText(null);
        r2c1.setText(null);
        r2c2.setText(null);
        r2c3.setText(null);
        r2c4.setText(null);
        r2c5.setText(null);
        r2c6.setText(null);
        r2c7.setText(null);
        r2c8.setText(null);
        r3c0.setText(null);
        r3c1.setText(null);
        r3c2.setText(null);
        r3c3.setText(null);
        r3c4.setText(null);
        r3c5.setText(null);
        r3c6.setText(null);
        r3c7.setText(null);
        r3c8.setText(null);
        r4c0.setText(null);
        r4c1.setText(null);
        r4c2.setText(null);
        r4c3.setText(null);
        r4c4.setText(null);
        r4c5.setText(null);
        r4c6.setText(null);
        r4c7.setText(null);
        r4c8.setText(null);
        r5c0.setText(null);
        r5c1.setText(null);
        r5c2.setText(null);
        r5c3.setText(null);
        r5c4.setText(null);
        r5c5.setText(null);
        r5c6.setText(null);
        r5c7.setText(null);
        r5c8.setText(null);
        r6c0.setText(null);
        r6c1.setText(null);
        r6c2.setText(null);
        r6c3.setText(null);
        r6c4.setText(null);
        r6c5.setText(null);
        r6c6.setText(null);
        r6c7.setText(null);
        r6c8.setText(null);
        r7c0.setText(null);
        r7c1.setText(null);
        r7c2.setText(null);
        r7c3.setText(null);
        r7c4.setText(null);
        r7c5.setText(null);
        r7c6.setText(null);
        r7c7.setText(null);
        r7c8.setText(null);
        r8c0.setText(null);
        r8c1.setText(null);
        r8c2.setText(null);
        r8c3.setText(null);
        r8c4.setText(null);
        r8c5.setText(null);
        r8c6.setText(null);
        r8c7.setText(null);
        r8c8.setText(null);
        String str=new String();
        String str1=new String();
        Random rand=new Random();
        //rand.setSeed(System.currentTimeMillis());
        int Matrix[][]={{1,7,5,8,3,9,4,2,6},
                        {6,3,8,2,7,4,9,1,5},
                        {4,2,9,6,5,1,3,7,8},
                        {8,1,6,3,9,5,7,4,2},
                        {5,4,7,1,6,2,8,3,9},
                        {2,9,3,4,8,7,6,5,1},
                        {7,5,4,9,2,6,1,8,3},
                        {9,8,1,5,4,3,2,6,7},
                        {3,6,2,7,1,8,5,9,4}};
        
        
        int che=30+rand.nextInt(40);
        for(i=0;i<che;i++)
        {
            int r1=rand.nextInt(3);
            int r2=rand.nextInt(3);
            for(l=0;l<9;l++)
            {
                temp=Matrix[r1][l];
                Matrix[r1][l]=Matrix[r2][l];
                Matrix[r2][l]=temp;
            }
        }
        
        for(i=0;i<che;i++)
        {
            int c1=rand.nextInt(3);
            int c2=rand.nextInt(3);
          
            //else if(c2==2)
            for(l=0;l<9;l++)
            {
                temp=Matrix[l][c1];
                Matrix[l][c1]=Matrix[l][c2];
                Matrix[l][c2]=temp;
            }
        }
        for(i=0;i<che;i++)
        {
            int r1=3+rand.nextInt(3);
            int r2=3+rand.nextInt(3);
            for(l=0;l<9;l++)
            {
                temp=Matrix[r1][l];
                Matrix[r1][l]=Matrix[r2][l];
                Matrix[r2][l]=temp;
            }
        }
        
        for(i=0;i<che;i++)
        {
            int c1=3+rand.nextInt(3);
            int c2=3+rand.nextInt(3);
          
            //else if(c2==2)
            for(l=0;l<9;l++)
            {
                temp=Matrix[l][c1];
                Matrix[l][c1]=Matrix[l][c2];
                Matrix[l][c2]=temp;
            }
        }
        for(i=0;i<che;i++)
        {
            int r1=6+rand.nextInt(3);
            int r2=6+rand.nextInt(3);
            for(l=0;l<9;l++)
            {
                temp=Matrix[r1][l];
                Matrix[r1][l]=Matrix[r2][l];
                Matrix[r2][l]=temp;
            }
        }
        
        for(i=0;i<che;i++)
        {
            int c1=6+rand.nextInt(3);
            int c2=6+rand.nextInt(3);
            for(l=0;l<9;l++)
            {
                temp=Matrix[l][c1];
                Matrix[l][c1]=Matrix[l][c2];
                Matrix[l][c2]=temp;
            }
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                copyMatrix[i][j]=Matrix[i][j];
            }
        }
        
        for(i=0;i<40;i++)
        {
                n=rand.nextInt(9);
                m=rand.nextInt(9);
                Matrix[n][m]=0;
        }
        
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++){
                if(Matrix[i][j]==0)
                {
                    flagMatrix[i][j]=0;
                }
                else{
                    flagMatrix[i][j]=1;
                }
            }
        }
        
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                if(Matrix[i][j]!=0){
                    if(i==0 && j==0)r0c0.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==0 && j==1)r0c1.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==0 && j==2)r0c2.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==0 && j==3)r0c3.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==0 && j==4)r0c4.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==0 && j==5)r0c5.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==0 && j==6)r0c6.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==0 && j==7)r0c7.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==0 && j==8)r0c8.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==1 && j==0)r1c0.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==1 && j==1)r1c1.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==1 && j==2)r1c2.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==1 && j==3)r1c3.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==1 && j==4)r1c4.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==1 && j==5)r1c5.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==1 && j==6)r1c6.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==1 && j==7)r1c7.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==1 && j==8)r1c8.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==2 && j==0)r2c0.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==2 && j==1)r2c1.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==2 && j==2)r2c2.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==2 && j==3)r2c3.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==2 && j==4)r2c4.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==2 && j==5)r2c5.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==2 && j==6)r2c6.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==2 && j==7)r2c7.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==2 && j==8)r2c8.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==3 && j==0)r3c0.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==3 && j==1)r3c1.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==3 && j==2)r3c2.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==3 && j==3)r3c3.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==3 && j==4)r3c4.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==3 && j==5)r3c5.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==3 && j==6)r3c6.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==3 && j==7)r3c7.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==3 && j==8)r3c8.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==4 && j==0)r4c0.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==4 && j==1)r4c1.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==4 && j==2)r4c2.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==4 && j==3)r4c3.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==4 && j==4)r4c4.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==4 && j==5)r4c5.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==4 && j==6)r4c6.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==4 && j==7)r4c7.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==4 && j==8)r4c8.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==5 && j==0)r5c0.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==5 && j==1)r5c1.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==5 && j==2)r5c2.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==5 && j==3)r5c3.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==5 && j==4)r5c4.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==5 && j==5)r5c5.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==5 && j==6)r5c6.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==5 && j==7)r5c7.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==5 && j==8)r5c8.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==6 && j==0)r6c0.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==6 && j==1)r6c1.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==6 && j==2)r6c2.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==6 && j==3)r6c3.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==6 && j==4)r6c4.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==6 && j==5)r6c5.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==6 && j==6)r6c6.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==6 && j==7)r6c7.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==6 && j==8)r6c8.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==7 && j==0)r7c0.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==7 && j==1)r7c1.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==7 && j==2)r7c2.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==7 && j==3)r7c3.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==7 && j==4)r7c4.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==7 && j==5)r7c5.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==7 && j==6)r7c6.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==7 && j==7)r7c7.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==7 && j==8)r7c8.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==8 && j==0)r8c0.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==8 && j==1)r8c1.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==8 && j==2)r8c2.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==8 && j==3)r8c3.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==8 && j==4)r8c4.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==8 && j==5)r8c5.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==8 && j==6)r8c6.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==8 && j==7)r8c7.setText(Integer.toString(Matrix[i][j]));
                }
                if(Matrix[i][j]!=0){
                    if(i==8 && j==8)r8c8.setText(Integer.toString(Matrix[i][j]));
                }
                
            }
        }
        
    }

}
