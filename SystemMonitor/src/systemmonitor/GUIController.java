/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemmonitor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import Serialcommunicator.Serialcommunicator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fatcloud
 */
public class GUIController implements Initializable {
    
    // motor panel
    @FXML private ChoiceBox MotorIDChoice;
    @FXML private ChoiceBox MotorFeedbackCameraChoice;
    
    Serialcommunicator myserial = new Serialcommunicator();
    
    
    
    @FXML private void handleButtonAction(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String btnText = btn.getText();
        
        //HelloThread t1;
        //t1 = new HelloThread();
        
        byte stepToGo = 0;
        if( btnText.equals("+10") ) {            
            //stepToGo = 10;
            //t1.start();
            
            myserial.writeData('a'); // Why can it not know myserial?
            
            
        } else if( btnText.equals("+1") ) {
            stepToGo = 1;
            //t1.terminate();
        } else if( btnText.equals("-1") ){
            stepToGo = -1;
        } else if( btnText.equals("-10") ){
            stepToGo = -10;
        }
        
        int id = (int)MotorIDChoice.getValue();
        
    }
    
    /*
    HelloThread t1;
    t1 = new HelloThread();
    t1.start();
    t1.terminate();
    */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("haha");
        MotorIDChoice.setItems(FXCollections.observableArrayList(0,1,2,3));
        MotorIDChoice.setValue( MotorIDChoice.getItems().get(0) );
        
        HelloThread t1;
        t1 = new HelloThread();
        
        
        
        myserial.initialize();
        System.out.println("Started");

        try {        
            Thread.sleep(10000); System.out.println("main thread"); //to be improved.
        } catch (InterruptedException ex) {
            Logger.getLogger(GUIController.class.getName()).log(Level.SEVERE, null, ex);
        }        
            
        
    }    
}
