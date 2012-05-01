package de.javakara.manf.betterchat;

import de.javakara.manf.betterchat.listeners.BetterChatPlayerListener;

import org.bukkit.plugin.java.JavaPlugin;

public class BetterChatPlugin extends JavaPlugin{
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new BetterChatPlayerListener(), this);
    }
}
