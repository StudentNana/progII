/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auf3progii;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author nana
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane pane;
    @FXML
    private ImageView bg;
    @FXML
    private Button noteCstart;
    @FXML
    private Button noteD;
    @FXML
    private Button noteE;
    @FXML
    private Button noteF;
    @FXML
    private Button noteG;
    @FXML
    private Button noteA;
    @FXML
    private Button noteB;
    @FXML
    private Button noteCend;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        Sinusgenerator.play(Sinusgenerator.NOTE_C);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
