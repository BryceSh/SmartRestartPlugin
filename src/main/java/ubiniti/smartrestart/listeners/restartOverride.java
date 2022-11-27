package ubiniti.smartrestart.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import ubiniti.smartrestart.Smartrestart;

public class restartOverride implements Listener {

    @EventHandler
    public void onCommandProcess(PlayerCommandPreprocessEvent e) {

        if (e.getMessage().equalsIgnoreCase("/restart")) {
            if (e.getPlayer().isOp()) {
                e.getPlayer().sendMessage(Smartrestart.PluginPrefix + "Command not supported with smartrestart! Please use /srestart");
            }
            e.setCancelled(true);
        }
    }

}
