package ecommerce.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecommerce.northwind.business.abstracts.ProductService;
import ecommerce.northwind.core.utilities.results.DataResult;
import ecommerce.northwind.core.utilities.results.Result;
import ecommerce.northwind.core.utilities.results.SuccessDataResult;
import ecommerce.northwind.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
	 
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

}
