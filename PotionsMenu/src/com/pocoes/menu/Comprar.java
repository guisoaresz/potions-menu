package com.pocoes.menu;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.Plugin;

import com.gsoares.pocoes.Main;

public class Comprar implements Listener {
	
	Plugin plugin = (Plugin)Main.getPlugin(Main.class);
	        
	int p_fn = this.plugin.getConfig().getInt("Precos.Fungo_do_Nether");
	int p_pb = this.plugin.getConfig().getInt("Precos.Po_De_Blaze");
	int p_ac = this.plugin.getConfig().getInt("Precos.Acucar");
	int p_c = this.plugin.getConfig().getInt("Precos.Creme_De_Magma");
	int p_mr = this.plugin.getConfig().getInt("Precos.Melancia_Reluzente");
	int p_lg = this.plugin.getConfig().getInt("Precos.Lagrima_De_Ghast");
	int p_pc = this.plugin.getConfig().getInt("Precos.Pe_De_Coelho");
	int p_cd = this.plugin.getConfig().getInt("Precos.Cenoura_Dourada");
	        
	ItemStack fn = new ItemStack(Material.NETHER_STALK, 3);
	ItemStack pb = new ItemStack(Material.BLAZE_POWDER, 3);
	ItemStack ac = new ItemStack(Material.SUGAR, 3);
	ItemStack c = new ItemStack(Material.MAGMA_CREAM, 3);
	ItemStack mr = new ItemStack(Material.SPECKLED_MELON, 3);
	ItemStack lg = new ItemStack(Material.GHAST_TEAR, 3);
	ItemStack pc = new ItemStack(Material.RABBIT_FOOT, 3);
	ItemStack cd = new ItemStack(Material.GOLDEN_CARROT, 3);
	        
	@SuppressWarnings("deprecation")
	@EventHandler
	public void aoClicar(InventoryClickEvent e) {
	ItemStack i = e.getCurrentItem();
	Inventory inv = e.getInventory();
	          
	HumanEntity p = e.getWhoClicked();
	String n = p.getName();
	PlayerInventory playerInventory = p.getInventory();
	          
		if (inv.getName().equalsIgnoreCase("Fábrica de Poções")) {
			if (i.getAmount() <= 0)
				return; 
			if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Pó de Blaze")) {
				if (p.getInventory().firstEmpty() != -1) {
					if (Main.getEconomy().getBalance(n) >= this.p_pb) {
						p.sendMessage("\n" + ChatColor.GREEN + "Você comprou (3x) Pó de Blaze por $" + this.p_pb + ".");
						playerInventory.addItem(new ItemStack[] { this.pb });
						Main.getEconomy().withdrawPlayer(n, this.p_pb);
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Você não tem saldo o suficiente.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
					p.closeInventory();
				} 
			
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Fungo do Nether")) {
				if (p.getInventory().firstEmpty() != -1) {
					if (Main.getEconomy().getBalance(n) >= this.p_fn) {
						p.sendMessage("\n" + ChatColor.GREEN + "Você comprou (3x) Fungo do Nether por $" + this.p_ac + ".");
						playerInventory.addItem(new ItemStack[] { this.fn });
						Main.getEconomy().withdrawPlayer(n, this.p_fn);
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Você não tem saldo o suficiente.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
					p.closeInventory();
				
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Açúcar")) {
				if (p.getInventory().firstEmpty() != -1) {
					if (Main.getEconomy().getBalance(n) >= this.p_ac) {
						p.sendMessage("\n" + ChatColor.GREEN + "Você comprou (3x) Açúcar por $" + this.p_ac + ".");
						playerInventory.addItem(new ItemStack[] { this.ac });
						Main.getEconomy().withdrawPlayer(n, this.p_ac);
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Você não tem saldo o suficiente.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
					p.closeInventory();
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Creme de Magma")) {
				if (p.getInventory().firstEmpty() != -1) {
					if (Main.getEconomy().getBalance(n) >= this.p_c) {
						p.sendMessage("\n" + ChatColor.GREEN + "Você comprou (3x) Creme de Magma por $" + this.p_c + ".");
						playerInventory.addItem(new ItemStack[] { this.c });
						Main.getEconomy().withdrawPlayer(n, this.p_c);
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Você não tem saldo o suficiente.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
					p.closeInventory();
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Melância Reluzente")) {
				if (p.getInventory().firstEmpty() != -1) {
					if (Main.getEconomy().getBalance(n) >= this.p_mr) {
						p.sendMessage("\n" + ChatColor.GREEN + "Você comprou (3x) Melância Reluzente por $" + this.p_mr + ".");
						playerInventory.addItem(new ItemStack[] { this.mr });
						Main.getEconomy().withdrawPlayer(n, this.p_mr);
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Você não tem saldo o suficiente.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
					p.closeInventory();
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Lágrima de Ghast")) {
				if (p.getInventory().firstEmpty() != -1) {
					if (Main.getEconomy().getBalance(n) >= this.p_lg) {
						p.sendMessage("\n" + ChatColor.GREEN + "Você comprou (3x) Lágrima de Ghast por $" + this.p_lg + ".");
						playerInventory.addItem(new ItemStack[] { this.lg });
						Main.getEconomy().withdrawPlayer(n, this.p_lg);
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Você não tem saldo o suficiente.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
					p.closeInventory();
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Pé de Coelho")) {
				if (p.getInventory().firstEmpty() != -1) {
					if (Main.getEconomy().getBalance(n) >= this.p_pc) {
						p.sendMessage("\n" + ChatColor.GREEN + "Você comprou (3x) Pé de Coelho por $" + this.p_pc + ".");
						playerInventory.addItem(new ItemStack[] { this.pc });
						Main.getEconomy().withdrawPlayer(n, this.p_pc);
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Você não tem saldo o suficiente.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
					p.closeInventory();
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Cenoura Dourada")) {
				if (p.getInventory().firstEmpty() != -1) {
					if (Main.getEconomy().getBalance(n) >= this.p_cd) {
						p.sendMessage("\n" + ChatColor.GREEN + "Você comprou (3x) Cenoura Dourada por $" + this.p_cd + ".");
						playerInventory.addItem(new ItemStack[] { this.cd });
						Main.getEconomy().withdrawPlayer(n, this.p_cd);
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Você não tem saldo o suficiente.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
					p.closeInventory();
				} 
			} 
		} 
	}
}
	 