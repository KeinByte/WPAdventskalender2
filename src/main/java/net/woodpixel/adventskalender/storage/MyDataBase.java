package net.woodpixel.adventskalender.storage;

import net.woodpixel.adventskalender.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDataBase {

    private static MyDataBase dataBase;
    private Connection connection = null;

    public MyDataBase() {
        dataBase = this;
        openConnection();
        createTables();
        new MoneyDatabase();
    }

    public void openConnection() {
        try {
            if (this.connection != null && !this.connection.isClosed()) return;
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://" + Data.HOST + ":" + Data.PORT + "/" + Data.DATABASE, Data.USER, Data.PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static MyDataBase getDataBase() {
        return dataBase;
    }

    public boolean isClosed() throws SQLException {
        return this.connection == null | this.connection.isClosed() | this.connection.isValid(0);
    }

    public void createTables() {
        String sql = "CREATE TABLE IF NOT EXISTS used (id int NOT NULL AUTO_INCREMENT, uuid VARCHAR(36), door int, PRIMARY KEY(id));";
        try {
            Statement statement = this.connection.createStatement();
            statement.execute(sql);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
