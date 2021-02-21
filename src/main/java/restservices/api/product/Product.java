package restservices.api.product;

public class Product {

    private Long ProductID;
    private String productName;
    private Integer productPrice;

    public Product(){
        super();
    }

    public Product(Long productID, String productName, Integer productPrice) {
        ProductID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Long getProductID() {
        return ProductID;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductID(Long productID) {
        ProductID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }


}
