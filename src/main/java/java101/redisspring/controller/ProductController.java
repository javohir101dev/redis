package java101.redisspring.controller;

import java101.redisspring.entity.Product;
import java101.redisspring.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductDao dao;

    @PostMapping
    public Product save(@RequestBody Product product){
        return dao.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProduct(){
        return dao.getAllProduct();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id){
        return dao.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return dao.deleteProduct(id);
    }


}
