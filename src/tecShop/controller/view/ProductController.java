package tecShop.controller.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import tecShop.controller.Main;
import tecShop.controller.model.Product;

/**
* @author  Richard Connolly
* @version 1.0
* @since   2018-11
* Notes in Notes document in src folder of this project.
*/


public class ProductController { 
	
	/*********************************FXML Tags for the the items on the main screen*********************************************************/
	@FXML
    private TableView<Product> productTable;
    @FXML
    private TableColumn<Product, String> productNameColumn;
    @FXML
    private TableColumn<Product, String> priceColumn;

    @FXML
    private Label productNameLabel;
    @FXML
    private Label priceLabel;
    @FXML
    private Label categoryLabel;
    @FXML
    private Label qtyInStockLabel;
    @FXML
    private Label specialOfferLabel;
    @FXML
    private Label restockDateLabel;

    // Reference to the main application.
    private Main main;

	/*********************************Constructor*********************************************************/
    public ProductController() {
    }

    /*********************************Initializes the controller class automatically called when fxml file loads*********************************************************/
    @FXML
    private void initialize() {
    	/*********************************Initialize the person table with the two columns*********************************************************/
        
        productNameColumn.setCellValueFactory(cellData -> cellData.getValue().productNameProperty());
        priceColumn.setCellValueFactory(cellData -> cellData.getValue().priceProperty());
    }

    public void setMain(Main main) {
        this.main = main;

        /*********************************Add observable list data to the table*********************************************************/
        
        productTable.setItems(main.getProductData());
    }
}