package ecommerce.northwind.business.abstracts;

import ecommerce.northwind.core.entities.User;
import ecommerce.northwind.core.utilities.results.DataResult;
import ecommerce.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	
	DataResult<User> findByEmail(String email);
}
