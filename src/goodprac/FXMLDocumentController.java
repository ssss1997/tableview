/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodprac;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author TS
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private AnchorPane ap;
    @FXML
    private TableView<personinfo> mytable;
    @FXML
    private TableColumn<personinfo, String> name;
    @FXML
    private TableColumn<personinfo, Integer> id;
    @FXML
    private TableColumn<personinfo, Integer> age;
     ObservableList<personinfo>list=FXCollections.observableArrayList(
    
            new personinfo("Abul",1,50000),
            new personinfo("Baooobul",2,50000),
            new personinfo("Ratul",3,50000),
            new personinfo("Butul",4,50000),
            new personinfo("Putul",5,50000),
            new personinfo("ttButul",4,5660000),
            new personinfo("ttButrrul",4,50000),
            new personinfo("Bueetul",44,50000)
    
    );
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          name.setCellValueFactory(new PropertyValueFactory<personinfo,String>("name"));
        id.setCellValueFactory(new PropertyValueFactory<personinfo,Integer>("id"));
        age.setCellValueFactory(new PropertyValueFactory<personinfo,Integer>("age"));
        
        mytable.setItems(list);
    }    
    
}
