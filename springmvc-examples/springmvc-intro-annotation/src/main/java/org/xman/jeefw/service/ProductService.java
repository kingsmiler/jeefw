package org.xman.jeefw.service;

import org.xman.jeefw.domain.Product;

public interface ProductService {
    Product add(Product product);

    Product get(long id);
}
