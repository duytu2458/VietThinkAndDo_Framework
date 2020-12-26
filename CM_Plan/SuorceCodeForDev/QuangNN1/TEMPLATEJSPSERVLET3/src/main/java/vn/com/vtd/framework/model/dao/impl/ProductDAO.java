package vn.com.vtd.framework.model.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ResourceBundle;

import vn.com.vtd.framework.model.bean.Product;

public class ProductDAO{
    
    public Long save(Product product) {
        StringBuilder sql = new StringBuilder("INSERT INTO PRODUCT (product_name, basal_area, available_area, buildings_number)");
        sql.append(" VALUES (?, ?, ?, ?)");
        return insert(sql.toString(),product);
    }
    
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        Product product = new Product();
        product.setProductName("ten product");
        product.setBasalArea(1);
        product.setBuildingArea(2); 
        product.setBuildingsNumber(3);
        Long id = productDAO.save(product);
        System.out.println(id);
    }
    
    public Long insert(String sql, Product product) {
        PreparedStatement statement = null;
        Connection connection = null;
        ResultSet resultSet = null;

        try {
            Long id = null;
            connection = this.getConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, product.getProductName());
            statement.setDouble(2, product.getBasalArea());
            statement.setDouble(3, product.getAvailableArea());
            statement.setDouble(4, product.getBuildingsNumber());
            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                id = resultSet.getLong(1);
            }
            connection.commit();
            return id;
        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    public void insertWithBatch(int batchSize, List<Product> listProduct) throws ClassNotFoundException, SQLException {
        Connection connection = this.getConnection();
        long startTime = System.currentTimeMillis();
        String sql = "INSERT INTO PRODUCT (product_name, basal_area, available_area, buildings_number) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        connection.setAutoCommit(false);

        System.out.println("Batch - Inserting... ");
        int count = 1;
        for (Product product : listProduct) {
            pstmt.setString(1, product.getProductName());
            pstmt.setDouble(2, product.getBasalArea());
            pstmt.setDouble(3, product.getAvailableArea());
            pstmt.setDouble(4, product.getBuildingsNumber());
            
            pstmt.addBatch();
            if (count % batchSize == 0) {
                pstmt.executeBatch();
                connection.commit();
            }
            count++;
        }
        pstmt.executeBatch();
        connection.commit();
        long endTime = System.currentTimeMillis();
        System.out.println("Done.");
        System.out.println("Total time: " + (endTime - startTime));
        connection.close();
    }
    
    ResourceBundle resourceBundle = ResourceBundle.getBundle("db");

    public Connection getConnection() {
        String url = resourceBundle.getString("db.url");
        String userName = resourceBundle.getString("db.user");
        String password = resourceBundle.getString("db.password");
        String driverName = resourceBundle.getString("db.driverName");
        try {
            Class.forName(driverName);
            return DriverManager.getConnection(url, userName, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
