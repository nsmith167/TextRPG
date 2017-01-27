/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Nathan
 */
public class RPG extends Application {
    
    @Override
    public void start(Stage primaryStage) 
    {
        TextField txt = new TextField();
        txt.setText("Do something");
        txt.setOnAction(new EventHandler<ActionEvent>() 
        {
            
            @Override
            public void handle(ActionEvent event) 
            {
                System.out.println(txt.getText());
                txt.setText("");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(txt);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("RPG");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
