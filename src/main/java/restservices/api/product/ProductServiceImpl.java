package restservices.api.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {



    public ProductServiceImpl(){
        products.add(new Product(1l,"Iphone",1999));
        products.add(new Product(2l,"speaker",599));
        products.add(new Product(3l,"camera",91));
        products.add(new Product(4l,"shirt",100));
    }

   public  List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getProduct() {
        return products;
    }

    @Override
    public Product getProduct(Long id) {
        for(Product product:products){

            if(product.getProductID()==id){

                return product;
            }
        }
        return null;
    }

    @Override
    public void createProduct(Product product) {
        products.add(product);

    }

    @Override
    public void updateProduct(Product product) {
        getProduct(product.getProductID()).setProductPrice(product.getProductPrice());
        getProduct(product.getProductID()).setProductName(product.getProductName());
    }

    @Override
    public void deleteProduct(Long id) {
        System.out.println("Status.."+products.remove(getProduct(id)));
    }


}
