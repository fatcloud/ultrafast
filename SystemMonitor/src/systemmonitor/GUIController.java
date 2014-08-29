/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemmonitor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author fatcloud
 */
public class GUIController implements Initializable {
    HelloThread t1;
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        t1.terminate();
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        t1 = new HelloThread();
        t1.setName("Oh hahahaha I am a thread");
        t1.start();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("haha");
    }    
    
}
