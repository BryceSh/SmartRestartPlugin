package ubiniti.smartrestart;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import ubiniti.smartrestart.commands.smartRestartCommand;
import ubiniti.smartrestart.listeners.restartOverride;

public final class Smartrestart extends JavaPlugin {

    public static final String PluginPrefix = ChatColor.GRAY + "[" + ChatColor.BOLD + ChatColor.AQUA + "Smart Restart" +
            ChatColor.RESET + ChatColor.GRAY + "] " + ChatColor.RESET;

    @Override
    public void onEnable() {

        System.out.println("Smart-Restart plugin is loading");

        loadConfig();

        getCommand("srestart").setExecutor(new smartRestartCommand());

        getServer().getPluginManager().registerEvents(new restartOverride(), this);

        System.out.println("Smart-Restart plugin as been loaded successfully!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void loadConfig() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
