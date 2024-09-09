package com.example.lab12_1;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class Controller implements Initializable
{

    @FXML
    private TextField num1Field;
    @FXML
    private TextField num2Field;
    @FXML
    private Button addButton;
    @FXML
    private Label resultLabel;
    @FXML
    private Button clearButton;

    private void addButtonAction()
    {
        addButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent t) {
                if(num1Field.getText().equals("") || num2Field.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please enter 2 numbers in the fields!");
                    return;
                }
                int a = Integer.parseInt(num1Field.getText().trim());
                int b = Integer.parseInt(num2Field.getText().trim());
                resultLabel.setText("Result: " + (a + b));
            }
        });
    }

    private void clearButtonAction()
    {
        clearButton.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent t)
            {
                num1Field.setText("");
                num2Field.setText("");
                resultLabel.setText("Result:");
            }
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        addButtonAction();
        clearButtonAction();
    }
}