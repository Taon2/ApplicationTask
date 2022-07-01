package com.taon2.applicationtask;

import com.taon2.applicationtask.command.ExplodeCommand;
import com.taon2.applicationtask.command.FireCommand;
import com.taon2.applicationtask.command.LightningCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class ApplicationTask extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("fire").setExecutor(new FireCommand());
        this.getCommand("lightning").setExecutor(new LightningCommand());
        this.getCommand("explode").setExecutor(new ExplodeCommand());
    }

    @Override
    public void onDisable() {

    }
}
