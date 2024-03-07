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
      
public class Fabricar implements Listener {
	ItemStack forca = new ItemStack(Material.POTION, 1, (short)8233);
	ItemStack agilidade = new ItemStack(Material.POTION, 1, (short)8226);
	ItemStack resistencia = new ItemStack(Material.POTION, 1, (short)8259);
	ItemStack cura = new ItemStack(Material.POTION, 1, (short)8229);
	ItemStack reg = new ItemStack(Material.POTION, 1, (short)8225);
	ItemStack superpulo = new ItemStack(Material.POTION, 1, (short)8235);
	ItemStack visaonoturna = new ItemStack(Material.POTION, 1, (short)8262);
        
	ItemStack fungo = new ItemStack(Material.NETHER_STALK);
	ItemStack bp = new ItemStack(Material.BLAZE_POWDER);
	ItemStack ac = new ItemStack(Material.SUGAR);
	ItemStack cm = new ItemStack(Material.MAGMA_CREAM);
	ItemStack mr = new ItemStack(Material.SPECKLED_MELON);
	ItemStack lg = new ItemStack(Material.GHAST_TEAR);
	ItemStack pc = new ItemStack(Material.RABBIT_FOOT);
	ItemStack cd = new ItemStack(Material.GOLDEN_CARROT);
	
	@SuppressWarnings("deprecation")
	@EventHandler
    public void aoClicar(InventoryClickEvent e) {
		ItemStack i = e.getCurrentItem();
		Inventory inv = e.getInventory();
		
		HumanEntity p = e.getWhoClicked();
		PlayerInventory playerInventory = p.getInventory();
  
		if (inv.getName().equalsIgnoreCase("Fábrica de Poções")) {
			if (i.getType().getId() != Material.POTION.getId())
				return; 
			if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Poção de Força")) {
				if (playerInventory.containsAtLeast(this.fungo, 1)) {
					if (playerInventory.containsAtLeast(this.bp, 1)) {
						if (p.getInventory().firstEmpty() != -1) {
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.NETHER_STALK, 1) });
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.BLAZE_POWDER, 1) });
							p.sendMessage(ChatColor.GREEN + "Você fabricou uma Poção de Força.");
							playerInventory.addItem(new ItemStack[] { this.forca });
						} else {
							p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
							p.closeInventory();
						} 
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Pó de Blaze.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Fungo do Nether.");
					p.closeInventory();
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Poção de Agilidade")) {
				if (playerInventory.containsAtLeast(this.fungo, 1)) {
					if (playerInventory.containsAtLeast(this.ac, 1)) {
						if (p.getInventory().firstEmpty() != -1) {
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.NETHER_STALK, 1) });
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.SUGAR, 1) });
							p.sendMessage(ChatColor.GREEN + "Você fabricou uma Poção de Agilidade.");
							playerInventory.addItem(new ItemStack[] { this.agilidade });
						} else {
							p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
							p.closeInventory();
						} 
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Açúcar.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Fungo do Nether.");
					p.closeInventory();
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Poção de Resistência ao Fogo")) {
				if (playerInventory.containsAtLeast(this.fungo, 1)) {
					if (playerInventory.containsAtLeast(this.cm, 1)) {
						if (p.getInventory().firstEmpty() != -1) {
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.NETHER_STALK, 1) });
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.MAGMA_CREAM, 1) });
							p.sendMessage(ChatColor.GREEN + "Você fabricou uma Poção de Resistência ao Fogo.");
							playerInventory.addItem(new ItemStack[] { this.resistencia });
						} else {
							p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
							p.closeInventory();
						} 
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Creme de Magma.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Fungo do Nether.");
					p.closeInventory();
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Poção de Cura")) {
				if (playerInventory.containsAtLeast(this.fungo, 1)) {
					if (playerInventory.containsAtLeast(this.mr, 1)) {
						if (p.getInventory().firstEmpty() != -1) {
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.NETHER_STALK, 1) });
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.SPECKLED_MELON, 1) });
							p.sendMessage(ChatColor.GREEN + "Você fabricou uma Poção de Cura.");
							playerInventory.addItem(new ItemStack[] { this.cura });
						} else {
							p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
							p.closeInventory();
						} 
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Melância Reluzente.");
						p.closeInventory();
					}
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Fungo do Nether.");
					p.closeInventory();
				} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Poção de Regeneração")) {
				if (playerInventory.containsAtLeast(this.fungo, 1)) {
					if (playerInventory.containsAtLeast(this.lg, 1)) {
						if (p.getInventory().firstEmpty() != -1) {
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.NETHER_STALK, 1) });
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.GHAST_TEAR, 1) });
							p.sendMessage(ChatColor.GREEN + "Você fabricou uma Poção de Regeneração.");
							playerInventory.addItem(new ItemStack[] { this.reg });
						} else {
							p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
							p.closeInventory();
						} 
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Lágrima de Ghast.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Fungo do Nether.");
					p.closeInventory();
				} 
			}else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Poção de Super Pulo")) {
					if (playerInventory.containsAtLeast(this.fungo, 1)) {
						if (playerInventory.containsAtLeast(this.pc, 1)) {
							if (p.getInventory().firstEmpty() != -1) {
								playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.NETHER_STALK, 1) });
								playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.RABBIT_FOOT, 1) });
								p.sendMessage(ChatColor.GREEN + "Você fabricou uma Poção de Super Pulo.");
								playerInventory.addItem(new ItemStack[] { this.superpulo });
							} else {
								p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
								p.closeInventory();
							} 
						} else {
							p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Pé de Coelho.");
							p.closeInventory();
						} 
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Fungo do Nether.");
						p.closeInventory();
					} 
			} else if (i.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Poção de Visão Noturna")) {
				if (playerInventory.containsAtLeast(this.fungo, 1)) {
					if (playerInventory.containsAtLeast(this.cd, 1)) {
						if (p.getInventory().firstEmpty() != -1) {
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.NETHER_STALK, 1) });
							playerInventory.removeItem(new ItemStack[] { new ItemStack(Material.GOLDEN_CARROT, 1) });
							p.sendMessage(ChatColor.GREEN + "Você fabricou uma Poção de Visão Noturna.");
							playerInventory.addItem(new ItemStack[] { this.visaonoturna });
						} else {
							p.sendMessage("\n" + ChatColor.RED + "Não existe espaço em seu inventário.");
							p.closeInventory();
						} 
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Cenoura Dourada.");
						p.closeInventory();
					} 
				} else {
					p.sendMessage("\n" + ChatColor.RED + "Seu inventário não contém Fungo do Nether.");
					p.closeInventory();
				} 
			} 
		} 
	}
}