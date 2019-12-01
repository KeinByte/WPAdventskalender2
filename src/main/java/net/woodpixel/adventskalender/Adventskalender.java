package net.woodpixel.adventskalender;

import net.woodpixel.adventskalender.commands.CreateCommand;
import net.woodpixel.adventskalender.listener.InventoryClickListener;
import net.woodpixel.adventskalender.listener.PlayerInteractEntityListener;
import net.woodpixel.adventskalender.storage.MyDataBase;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Adventskalender extends JavaPlugin {

    private static Adventskalender adventskalender;

    @Override
    public void onEnable() {

        adventskalender = this;
        Bukkit.getServer().getConsoleSender().sendMessage(Data.PREFIX + "§aDas Adventskalender Plugin wurde gestartet.");
        Data.addAndSet();
        new MyDataBase();

        getCommand("setwpadvent").setExecutor(new CreateCommand());

        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerInteractEntityListener(), this);

    }

    @Override
    public void onDisable() {

        Bukkit.getServer().getConsoleSender().sendMessage(Data.PREFIX + "§cDas Adventskalender Plugin wurde gestoppt.");

    }

    public static Adventskalender getAdventskalender() {
        return adventskalender;
    }
}

