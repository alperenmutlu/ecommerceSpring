package ecommerce.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecommerce.northwind.business.abstracts.ProductService;
import ecommerce.northwind.dataAccess.abstracts.ProductDao;
import ecommerce.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired 
	public ProductManager(ProductDao prodductDao) {
		super();
		this.productDao = prodductDao;
	}

	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll();
	}

}
