package restservices.api.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("")
    public List<Product> getProducts(){
        return productService.getProduct();
    }

    @GetMapping("/{id}")
    public Product getProductByID(@PathVariable("id") Long id){

    return productService.getProduct(id);
    }
    
    @PostMapping("")
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }
    
    @PutMapping(value = "")
    public Product updateProductUsingJson(@RequestBody Product product){
        productService.updateProduct(product);
        return product;
    }

    @DeleteMapping("/{id}")
    public Map<String,Object> deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
        Map<String,Object> map = new HashMap<>();
        map.put("Status","Product deleted!");
        return map;
    }
}
