package service.product;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    List<Product> showAll();
    void add(Product product);
    Product findById(int id);
    List<Product> selectAllProduct();
    boolean update(Product product) throws SQLException;
    boolean remove(int id) throws SQLException;

}
