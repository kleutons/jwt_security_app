package com.kleuton.jwt_security_app.services;

import com.kleuton.jwt_security_app.entity.Product;
import com.kleuton.jwt_security_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product getById(Integer id){
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product){
        return  productRepository.save(product);
    }

    public Product updateProduct(Integer id, Product product){
        Product existingProduct = this.getById(id);
       if(existingProduct != null){
           existingProduct.setName(product.getName());
           existingProduct.setPrice(product.getPrice());
           return productRepository.save(existingProduct);
       } else{
           return null;
       }
    }

    public Boolean deleteProduct(Integer id){
        Product existingProduct = this.getById(id);
        if(existingProduct != null){
            productRepository.delete(existingProduct);
            return  true;
        } else {
            return false;
        }
    }
}
