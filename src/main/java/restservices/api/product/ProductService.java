package restservices.api.product;

import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    public List<Product> getProduct();
    public Product getProduct(Long id);
    public void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Long id);
}
