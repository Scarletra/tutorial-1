package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product findById(String productId) {
        for (Product product: productData) {
            if (product.getProductId().equals(productId)) return product;
        }
        return null;
    }

    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public Product edit(String productId, Product product) {
        for (Product chosenProduct: productData) {
            if (chosenProduct.getProductId().equals(productId)) {
                chosenProduct = product;
                return product;
            }
        }
        return null;
    }

    public int delete(String productId) {
        productData.remove(findById(productId));
        return 0;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }

    public List<Product> getData() {
        return this.productData;
    }
}
