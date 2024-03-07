package com.gsoares.pocoes;
import java.util.logging.Logger;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import com.pocoes.bloqueios.MoverItem;
import com.pocoes.comandos.AbrirInv;
import com.pocoes.menu.Comprar;
import com.pocoes.menu.Fabricar;
    
public class Main extends JavaPlugin {
private static final Logger log = Logger.getLogger("Minecraft");
private static Economy econ = null;    
      
public void onEnable() {
	Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[PotionsMenu] Plugin foi habilitado com sucesso.");
	Bukkit.getPluginManager().registerEvents((Listener)new MoverItem(), (Plugin)this);
	Bukkit.getPluginManager().registerEvents((Listener)new Fabricar(), (Plugin)this);
	Bukkit.getPluginManager().registerEvents((Listener)new Comprar(), (Plugin)this);
	Bukkit.getPluginCommand("pocoes").setExecutor((CommandExecutor)new AbrirInv());
	if (!setupEconomy()) {
		log.severe(String.format("[%s] - Este plugin depende do Vault para funcionar.", new Object[] { getDescription().getName() }));
		getServer().getPluginManager().disablePlugin((Plugin)this);
		return;
	} 
	loadConfig();
	}
      
	public void loadConfig() {
		saveDefaultConfig();
		FileConfiguration config = getConfig();
		config.options().copyDefaults(true);
		saveConfig();
	}
    
      
	private boolean setupEconomy() {
		if (getServer().getPluginManager().getPlugin("Vault") == null) {
			return false;
		}
		RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
		if (rsp == null) {
			return false;
		}
		econ = (Economy)rsp.getProvider();
		return (econ != null);
	}

	public static Economy getEconomy() {
		return econ;
	}
}