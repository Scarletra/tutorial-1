package id.ac.ui.cs.advprog.eshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import id.ac.ui.cs.advprog.eshop.model.Product;
import id.ac.ui.cs.advprog.eshop.repository.ProductRepository;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {

    @InjectMocks
    ProductServiceImpl productServiceImpl;

    @Mock
    ProductRepository productRepository;

    @BeforeEach
    void setup() {}


    @Test
    void testCreateProduct() {
        Product product = new Product();
        product.setProductId("6f1238f8-d13a-4e5b-936f-e55156158104");
        product.setProductName("Sampo Cap Bambang");
        product.setProductQuantity(100);

        when(productRepository.create(product)).thenReturn(product);

        Product savedProduct = productServiceImpl.create(product);
        assertEquals(product.getProductId(), savedProduct.getProductId());
        verify(productRepository, times(1)).create(product);
    }

//    @Test
//    void testFindAllProduct() {
//        List<Product> productList = new ArrayList<>();
//
//        Product product1 = new Product();
//        product1.setProductId("6f1238f8-d13a-4e5b-936f-e55156158104");
//        product1.setProductName("Sampo Cap Bambang");
//        product1.setProductQuantity(100);
//        productList.add(product1);
//
//        Product product2 = new Product();
//        product2.setProductId("6fh123f8-d13a-4e5b-936f-hg192391132");
//        product2.setProductName("Sampo Cap Xian Yun");
//        product2.setProductQuantity(100);
//        productList.add(product2);
//
//        Iterator<Product> iterator = productList.iterator();
//        when(productRepository.findAll()).thenReturn(iterator);
//
//        List<Product> result = productServiceImpl.findAll();
//
//        assertEquals(productList.size(), result.size());
//        for (int i = 0; i < productList.size(); i++) {
//            assertEquals(productList.get(i), result.get(i));
//        }
//        verify(productRepository, times(1)).findAll();
//    }


//    @Test
//    public void testFindById() {
//        String productId = "6f1238f8-d13a-4e5b-936f-e55156158104";
//        Product product = new Product();
//        product.setProductId("6f1238f8-d13a-4e5b-936f-e55156158104");
//        product.setProductName("Sampo Cap Bambang");
//        product.setProductQuantity(100);
//
//        when(productRepository.findById(productId)).thenReturn(product);
//        Product result = productServiceImpl.findById(productId);
//        assertEquals(product, result);
//        verify(productRepository, times(1)).findById(productId);
//    }
//
//
//    @Test
//    void testEditProduct() {
//        Product product = new Product();
//        product.setProductId("6f1238f8-d13a-4e5b-936f-e55156158104");
//        product.setProductName("Sampo Cap Bambang");
//        product.setProductQuantity(100);
//
//        when(productRepository.edit(product)).thenReturn(product);
//
//        Product editedProduct = productServiceImpl.edit(product);
//
//        assertEquals(product, editedProduct);
//        verify(productRepository, times(1)).edit(product);
//    }
//
//    @Test
//    void testDeleteProduct() {
//        Product product = new Product();
//        product.setProductId("6f1238f8-d13a-4e5b-936f-e55156158104");
//        product.setProductName("Sampo Cap Bambang");
//        product.setProductQuantity(100);
//
//        when(productRepository.delete(product.getProductId())).thenReturn(0);
//
//        productServiceImpl.delete(product.getProductId());
//
//        assertNull(productRepository.findById(product.getProductId()));
//        verify(productRepository, times(1)).delete(product.getProductId());
//    }
}