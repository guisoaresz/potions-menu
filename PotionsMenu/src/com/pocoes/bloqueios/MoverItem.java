package com.pocoes.bloqueios;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
     
public class MoverItem implements Listener {

	@EventHandler
	public void onMove(InventoryClickEvent e) {
		Inventory i = e.getInventory();
		if (i.getName().equalsIgnoreCase("Fábrica de Poções")) {
			e.setCancelled(true);
		}
	}
}