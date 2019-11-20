package net.woodpixel.adventskalender;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Adventskalender extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getServer().getConsoleSender().sendMessage(Data.PREFIX + "§aDas Adventskalender Plugin wurde gestartet.");

    }

    @Override
    public void onDisable() {

        Bukkit.getServer().getConsoleSender().sendMessage(Data.PREFIX + "§cDas Adventskalender Plugin wurde gestoppt.");

    }
}

