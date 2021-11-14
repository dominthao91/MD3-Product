package service.product;

import config.ConnectionSingletion;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {
    @Override
    public List<Product> selectAllProduct() {
        List<Product> productList = new ArrayList<>();
        Connection connection = ConnectionSingletion.getConnection();
        try {


            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String note = resultSet.getString("note");
                productList.add(new Product(id, name, price, note));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> showAll() {
        List<Product> productList = new ArrayList<>();
        Connection connection = ConnectionSingletion.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String note = resultSet.getString("note");
                productList.add(new Product(id, name, price, note));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public void add(Product product) {
        Connection connection = ConnectionSingletion.getConnection();
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into product (name,price,note) value (?,?,?)");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getNote());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        Connection connection = ConnectionSingletion.getConnection();
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("select id,name,price,note from product where id=?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String note = resultSet.getString("note");
                product = new Product(id, name, price, note);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean update(Product product) throws SQLException {
        boolean rowUpdate = false;
        Connection connection = ConnectionSingletion.getConnection();
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("update product set name =?, price =?, note = ? where  id =?");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getNote());
            preparedStatement.setInt(4, product.getId());
            rowUpdate = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdate;
    }


    @Override
    public boolean remove(int id) throws SQLException {
        boolean rowDelete = false;
        Connection connection = ConnectionSingletion.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete  from product where id =?");
            preparedStatement.setInt(1, id);
            rowDelete = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDelete;
    }
}
