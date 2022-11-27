package ubiniti.smartrestart.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ubiniti.smartrestart.Smartrestart;

public class smartRestartCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.isOp()) {
                // We need to handle a few things. We need to check if the player submits a number, confirm
                // or nothing at all.

                if (args.length == 1 && args[0].equalsIgnoreCase("confirm")) {

                    // Checking if the player has submitted confirm
                    player.sendMessage(Smartrestart.PluginPrefix + "Confirm selected!");
                } else if (args.length == 1 && args[0].equalsIgnoreCase("cancel")) {

                    // Checking if the player has submitted cancel
                    player.sendMessage(Smartrestart.PluginPrefix + "Cancel called!");
                } else if (args.length < 2 ) {

                    // If the player submits an invalid request.
                    player.sendMessage(Smartrestart.PluginPrefix + "Invalid Usage: /srestart "+ ChatColor.GREEN +"{timer} {reason}");
                } else {
                    player.sendMessage(Smartrestart.PluginPrefix + "All fields are successfully!");
                }
            } else {
                player.sendMessage(Smartrestart.PluginPrefix + ChatColor.RED + "Invalid permissions!");
            }
        }
        return true;
    }
}
