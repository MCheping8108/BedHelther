package top.peacefuly.bedhelther;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import top.peacefuly.bedhelther.BedHelth.BedHelth;

public final class BedHelther extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aBedHelther has loaded!");
        getServer().getPluginManager().registerEvents(new BedHelth(), this);;
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§cBedHelther has disabled!");
    }
}
