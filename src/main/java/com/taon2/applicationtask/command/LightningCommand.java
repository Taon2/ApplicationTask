package com.taon2.applicationtask.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class LightningCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (args.length <= 0) {
            commandSender.sendMessage(ChatColor.RED + "Please enter a player name.");
            return false;
        }

        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(args[0]);
        if (!offlinePlayer.isOnline()) {
            commandSender.sendMessage(ChatColor.RED + "Please not found.");
            return false;
        }

        Player player = offlinePlayer.getPlayer();

        if (player == null) {
            commandSender.sendMessage(ChatColor.RED + "Please not found.");
            return false;
        }

        player.getWorld().spawnEntity(player.getLocation(), EntityType.LIGHTNING);

        return true;
    }
}
