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
        Iterator<Product> productIterator = this.findAll();
        while (productIterator.hasNext()) {
            Product dataProduct = productIterator.next();
            if (dataProduct.getProductId().equals(productId)) {
                return dataProduct;
            }
        }
        return null;
    }

    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public Product edit(Product product) {
        String productId = product.getProductId();
        int productQuantity = product.getProductQuantity();

        if (productQuantity <= 0) product.setProductQuantity(0);

        Product productInRepository = this.findById(productId);
        int indexProduct = productData.indexOf(productInRepository);
        productData.set(indexProduct, product);
        return product;
    }

    public int delete(String productId) {
        productData.remove(findById(productId));
        return 0;
    }

    public Iterator<Product> findAll() {
        return productData.iterator();
    }
}