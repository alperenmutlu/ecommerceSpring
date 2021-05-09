package ecommerce.northwind.business.abstracts;

import java.util.List;

import ecommerce.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
