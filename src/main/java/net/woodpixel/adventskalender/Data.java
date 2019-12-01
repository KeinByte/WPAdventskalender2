package net.woodpixel.adventskalender;

import org.bukkit.Bukkit;
import org.bukkit.configuration.Configuration;

public class Data {

    public static String PREFIX = "§cAdventskalender §8» ";

    public static String HOST, DATABASE, TABLE, USER, PASSWORD;
    public static int PORT;

    public static void addAndSet() {
        Configuration configuration = Adventskalender.getAdventskalender().getConfig();
        configuration.addDefault("mysql.host", "127.0.0.1");
        configuration.addDefault("mysql.database", "database");
        configuration.addDefault("mysql.table", "table");
        configuration.addDefault("mysql.user", "user");
        configuration.addDefault("mysql.password", "secretpassword");
        configuration.addDefault("mysql.port", 3306);
        configuration.options().copyDefaults(true);
        Adventskalender.getAdventskalender().saveConfig();

        HOST = configuration.getString("mysql.host");
        DATABASE = configuration.getString("mysql.database");
        TABLE = configuration.getString("mysql.table");
        USER = configuration.getString("mysql.user");
        PASSWORD = configuration.getString("mysql.password");
        PORT = configuration.getInt("mysql.port");
    }

}
