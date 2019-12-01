package net.woodpixel.adventskalender.storage;

import net.woodpixel.adventskalender.Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class MoneyDatabase {

    private Connection connection = MyDataBase.getDataBase().getConnection();
    private static MoneyDatabase database;
    private final String tableUsed = "used";

    public MoneyDatabase() {
        database = this;
    }

    public static MoneyDatabase getDatabase() {
        return database;
    }

    public double getMoney(UUID uuid) {
        MyDataBase.getDataBase().openConnection();
        String sql = "SELECT * FROM " + Data.TABLE + " WHERE player_uuid = '" + uuid + "';";
        Statement statement;
        ResultSet resultSet;
        double money = 0;
        try {
            statement = this.connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                money = resultSet.getDouble("money");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return money;
    }

    public void addMoney(UUID uuid, double money) {
        MyDataBase.getDataBase().openConnection();
        double newMoney = getMoney(uuid) + money;
        String sql = "UPDATE " + Data.TABLE + " SET money = '" + newMoney + "' WHERE player_uuid = '" + uuid + "';";
        Statement statement;
        try {
            statement = this.connection.createStatement();
            statement.execute(sql);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isAlreadyUsed(UUID uuid, int door) {
        MyDataBase.getDataBase().openConnection();
        String sql = "SELECT * FROM " + tableUsed + " WHERE uuid = '" + uuid + "' AND door = '" + door + "';";
        Statement statement;
        ResultSet resultSet;
        Boolean b = null;
        try {
            statement = this.connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                b = true;
            }
            if (b == null) {
                b = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }

    public void setUsed(UUID uuid, int door) {
        MyDataBase.getDataBase().openConnection();
        String sql = "INSERT INTO " + tableUsed + " (uuid, door) VALUES ('" + uuid + "', '" + door + "');";
        Statement statement;
        try {
            statement = this.connection.createStatement();
            statement.execute(sql);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
