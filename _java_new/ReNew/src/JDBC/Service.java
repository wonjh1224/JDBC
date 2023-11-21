package JDBC;

import java.util.List;

public interface Service {

	int register(Product p);

	List<Product> list();

	Product detail(int pno);

	int modify(Product p);

	int remove(int pno);




}
