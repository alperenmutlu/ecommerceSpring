package ecommerce.northwind.business.abstracts;

import java.util.List;

import ecommerce.northwind.core.utilities.results.DataResult;
import ecommerce.northwind.core.utilities.results.Result;
import ecommerce.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
