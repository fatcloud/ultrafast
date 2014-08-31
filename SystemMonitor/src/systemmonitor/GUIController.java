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

/**
 *
 * @author fatcloud
 */
public class GUIController implements Initializable {
    
    // motor panel
    @FXML private ChoiceBox MotorIDChoice;
    @FXML private ChoiceBox MotorFeedbackCameraChoice;
    
    @FXML private void handleButtonAction(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String btnText = btn.getText();
        
        byte stepToGo = 0;
        if( btnText.equals("+10") ) {
            stepToGo = 10;
        } else if( btnText.equals("+1") ) {
            stepToGo = 1;
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
    }    
}
