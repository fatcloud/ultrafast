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
    HelloThread t1;
    @FXML private ChoiceBox MotorIDChoice;
    
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String btnText = btn.getText();
        if( btnText.equals("+10") )
            t1.terminate();
        else if( btnText.equals("+1") ) {
            t1 = new HelloThread();
            t1.setName("Oh hahahaha I am a thread");
            t1.start();
        } else if( btnText.equals("-1") )
            MotorIDChoice.setItems(FXCollections.observableArrayList("Energy Tuner","autocorelator"));
            
        
        
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        System.out.println("maomao");
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("haha");
    }    
    
}
