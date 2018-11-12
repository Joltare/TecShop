package tecShop.controller.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


/**
* @author  Richard Connolly
* @version 1.0
* @since   2018-11
* Notes in Notes document in src folder of this project.
*/


public class Product {
	
	private final StringProperty productName;
    private final StringProperty price;
    private final StringProperty category;
    private final IntegerProperty qtyInStock;
    private final StringProperty specialOffer;
    private final ObjectProperty<LocalDate> restockDate;

    /**
     * Default constructor.
     */
    public Product() {
        this(null, null);
    }
    
    /**
     * Constructor with some initial data.
     * 
     * @param productName
     * @param price
     */
    public Product(String productName, String price) {
        this.productName = new SimpleStringProperty(productName);
        this.price = new SimpleStringProperty(price);
        
/********************************* Some Dummy Data That Should of populated the main product screen***************************/
  
        this.category = new SimpleStringProperty("Memory");
        this.qtyInStock = new SimpleIntegerProperty(1234);
        this.specialOffer = new SimpleStringProperty("Na");
        this.restockDate = new SimpleObjectProperty<LocalDate>(LocalDate.of(2018, 11, 28));
    }
    
    
    
    
/*********************************Getters and Setters for all The products*********************************************************/

    public String getProductName() {
        return productName.get();
    }

    public void setProductName(String productName) {
        this.productName.set(productName);
    }
    
    public StringProperty productNameProperty() {
        return productName;
    }

    public String getPrice() {
        return price.get();
    }

    public void setLastName(String price) {
        this.price.set(price);
    }
    
    public StringProperty priceProperty() {
        return price;
    }

    public String getCategory() {
        return category.get();
    }

    public void setStreet(String category) {
        this.category.set(category);
    }
    
    public StringProperty streetProperty() {
        return category;
    }

    public int getQtyInStock() {
        return qtyInStock.get();
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock.set(qtyInStock);
    }
    
    public IntegerProperty qtyInStockProperty() {
        return qtyInStock;
    }

    public String getSpecialOffer() {
        return specialOffer.get();
    }

    public void setSpecialOffer(String specialOffer) {
        this.specialOffer.set(specialOffer);
    }
    
    public StringProperty specialOfferProperty() {
        return specialOffer;
    }

    public LocalDate getRestockDate() {
        return restockDate.get();
    }

    public void setRestockDate(LocalDate restockDate) {
        this.restockDate.set(restockDate);
    }
    
    public ObjectProperty<LocalDate> restockDateProperty() {
        return restockDate;
    }
}


