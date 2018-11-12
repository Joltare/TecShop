package tecShop.controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import tecShop.controller.model.Product;
import tecShop.controller.view.ProductController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	
	/**
	* @author  Richard Connolly
	* @version 1.0
	* @since   2018-11
	* Notes in Notes document in src folder of this project.
	*/
	
	
	
	 private Stage primaryStage;
	    private BorderPane frame;
/*********************************This code controls the login and sets its dimensions***************************/
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/tecShop/controller/view/Login.fxml"));
			Scene scene = new Scene(root, 600, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
/*****************************************************************************************************************/


	
	
	
	
	


    
    }
    
	/*********************************This code controls the main.fxml and sets its dimensions***************************/

    public void showMain() {
        try {
            // Load product.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/Main.fxml"));
            AnchorPane main = (AnchorPane) loader.load();
            
            // Set main into the center of root layout.
            frame.setCenter(main);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
  
    
    /*********************************This code should make any changes register with the main screen not working***************************/
    private ObservableList<Product> productData = FXCollections.observableArrayList();

    /**
     * Constructor
     */
    public Main() {
        // Add some sample data
        productData.add(new Product("Hans", "Muster"));
        productData.add(new Product("Ruth", "Mueller"));
        productData.add(new Product("Heinz", "Kurz"));
        productData.add(new Product("Cornelia", "Meier"));
        productData.add(new Product("Werner", "Meyer"));
        productData.add(new Product("Lydia", "Kunz"));
        productData.add(new Product("Anna", "Best"));
        productData.add(new Product("Stefan", "Meier"));
        productData.add(new Product("Martin", "Mueller"));
    }
  
    /*********************************This code should return any changes made in the product list not working***************************/
    public ObservableList<Product> getProductData() {
        return productData;
    }


   
    
}