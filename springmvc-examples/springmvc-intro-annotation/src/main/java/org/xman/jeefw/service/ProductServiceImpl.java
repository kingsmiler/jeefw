package org.xman.jeefw.service;

import org.springframework.stereotype.Service;
import org.xman.jeefw.domain.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


@Service
public class ProductServiceImpl implements ProductService {

    private Map<Long, Product> products = new HashMap<>();
    private AtomicLong generator = new AtomicLong();

    public ProductServiceImpl() {
        Product product = new Product();
        product.setName("JX1 Power Drill");
        product.setDescription("Powerful hand drill, made to perfection");
        product.setPrice(new BigDecimal(129.99));
        add(product);
    }

    @Override
    public Product add(Product product) {
        long newId = generator.incrementAndGet();
        product.setId(newId);
        products.put(newId, product);
        return product;
    }

    @Override
    public Product get(long id) {
        return products.get(id);
    }
}
