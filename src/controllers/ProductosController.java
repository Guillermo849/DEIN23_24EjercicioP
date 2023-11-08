package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ProductosController implements Initializable{

    @FXML
    private ImageView imagenProductoImageView;

    @FXML
    private Label nombreProductoLabel;

    @FXML
    private Label stockProductoLabel;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
