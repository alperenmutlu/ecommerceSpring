package ecommerce.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ecommerce.northwind.entities.concretes.Product;
import ecommerce.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product,Integer> {
	Product getByProductName(String productName);
	
	//select * from products where product_name = abc and category_id =1 gibi
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	//select * from products where product_name = abc or category_id =1 gibi
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	//select * from products where category_id in(1,2,3,4)  category id 1,2,3,4 olanları getirir
	List<Product> getByCategoryIn(List<Integer> categories);
	
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);
	
	@Query("Select new ecommerce.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner Join c.products p ")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
	//her zaman ana tablodan git
	//select p.productId,p.productName, c.categoryName from Category c inner join Product p
	//on c.categoryId = p.categoryId
}
