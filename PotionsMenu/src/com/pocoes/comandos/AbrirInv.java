package com.pocoes.comandos;
     
import com.pocoes.inv.Inventario;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
     
public class AbrirInv implements CommandExecutor {
	Inventario cInv = new Inventario();
	Inventory inv = this.cInv.criarInventario();
     
       
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("pocoes")) {
			if (sender instanceof Player) {
				Player p = (Player)sender;
				if (p.hasPermission("pocoes.usar")) {
					if (p.getGameMode().equals(GameMode.SURVIVAL)) {
						p.openInventory(this.inv);
					} else {
						p.sendMessage("\n" + ChatColor.RED + "Execute este comando no modo sobrevivência.");
					} 
				} else {
					p.sendMessage(ChatColor.RED + "Você não tem permissão.");
				} 
			} else {
				sender.sendMessage("Somente jogadores podem usar isso.");
			} 
		}
		return false;
	}
}