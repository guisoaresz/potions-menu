package com.pocoes.inv;
      
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import com.gsoares.pocoes.Main;      
      
public class Inventario {

	Plugin plugin = (Plugin)Main.getPlugin(Main.class);
        
	int p_fn = this.plugin.getConfig().getInt("Precos.Fundo_do_Nether");
	int p_pb = this.plugin.getConfig().getInt("Precos.Po_De_Blaze");
	int p_ac = this.plugin.getConfig().getInt("Precos.Acucar");
	int p_c = this.plugin.getConfig().getInt("Precos.Creme_De_Magma");
	int p_mr = this.plugin.getConfig().getInt("Precos.Melancia_Reluzente");
	int p_lg = this.plugin.getConfig().getInt("Precos.Lagrima_De_Ghast");
	int p_pc = this.plugin.getConfig().getInt("Precos.Pe_De_Coelho");
	int p_cd = this.plugin.getConfig().getInt("Precos.Cenoura_Dourada");
	
	String seta = "➝";
        
	public Inventory criarInventario() {
		Inventory inv = Bukkit.createInventory(null, 45, "Fábrica de Poções");
          
		ItemStack forca = new ItemStack(Material.POTION, 1, (short)8201);
		ItemMeta forcaMeta = forca.getItemMeta();
		forcaMeta.setDisplayName(ChatColor.GREEN + "Poção de Força");
		forcaMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
          
		ArrayList<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Ingredientes necessários: ");
		lore.add(" ");
		lore.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Fungos do Nether (1x)");
		lore.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Pó de Blaze (1x)");
		lore.add(" ");
		lore.add(ChatColor.GRAY + "Clique para concluir a fabricação.");
		forcaMeta.setLore(lore);
          
		forca.setItemMeta(forcaMeta);
      
      
          
		ItemStack agilidade = new ItemStack(Material.POTION, 1, (short)8194);
		ItemMeta agilidadeMeta = agilidade.getItemMeta();
		agilidadeMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
          
		agilidadeMeta.setDisplayName(ChatColor.GREEN + "Poção de Agilidade");
          
		ArrayList<String> lore1 = new ArrayList<>();
		lore1.add(ChatColor.GRAY + "Ingredientes necessários: ");
		lore1.add(" ");
		lore1.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Fungos do Nether (1x)");
		lore1.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Açúcar (1x)");
		lore1.add(" ");
		lore1.add(ChatColor.GRAY + "Clique para concluir a fabricação.");
		agilidadeMeta.setLore(lore1);
          
		agilidade.setItemMeta(agilidadeMeta);
      
      
          
		ItemStack resistencia = new ItemStack(Material.POTION, 1, (short)8227);
		ItemMeta resistenciaMeta = resistencia.getItemMeta();
		resistenciaMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
          
		resistenciaMeta.setDisplayName(ChatColor.GREEN + "Poção de Resistência ao Fogo");
          
		ArrayList<String> lore2 = new ArrayList<>();
		lore2.add(ChatColor.GRAY + "Ingredientes necessários: ");
		lore2.add(" ");
		lore2.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Fungos do Nether (1x)");
		lore2.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Creme de Magma (1x)");
		lore2.add(" ");
		lore2.add(ChatColor.GRAY + "Clique para concluir a fabricação.");
		resistenciaMeta.setLore(lore2);
          
		resistencia.setItemMeta(resistenciaMeta);
      
      
          
		ItemStack cura = new ItemStack(Material.POTION, 1, (short)8261);
		ItemMeta curaMeta = cura.getItemMeta();
		curaMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
          
		curaMeta.setDisplayName(ChatColor.GREEN + "Poção de Cura");
          
		ArrayList<String> lore3 = new ArrayList<>();
		lore3.add(ChatColor.GRAY + "Ingredientes necessários: ");
		lore3.add(" ");
		lore3.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Fungos do Nether (1x)");
		lore3.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Melância Reluzente (1x)");
		lore3.add(" ");
		lore3.add(ChatColor.GRAY + "Clique para concluir a fabricação.");
		curaMeta.setLore(lore3);
          
		cura.setItemMeta(curaMeta);
      
      
          
		ItemStack reg = new ItemStack(Material.POTION, 1, (short)8193);
		ItemMeta regMeta = reg.getItemMeta();
		regMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
          
		regMeta.setDisplayName(ChatColor.GREEN + "Poção de Regeneração");
          
		ArrayList<String> lore4 = new ArrayList<>();
		lore4.add(ChatColor.GRAY + "Ingredientes necessários: ");
		lore4.add(" ");
		lore4.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Fungos do Nether (1x)");
		lore4.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Lágrima de Ghast (1x)");
		lore4.add(" ");
		lore4.add(ChatColor.GRAY + "Clique para concluir a fabricação.");
		regMeta.setLore(lore4);
          
		reg.setItemMeta(regMeta);
      
      
          
		ItemStack superpulo = new ItemStack(Material.POTION, 1, (short)8203);
		ItemMeta superpuloMeta = superpulo.getItemMeta();
		superpuloMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
          
		superpuloMeta.setDisplayName(ChatColor.GREEN + "Poção de Super Pulo");
          
		ArrayList<String> lore5 = new ArrayList<>();
		lore5.add(ChatColor.GRAY + "Ingredientes necessários: ");
		lore5.add(" ");
		lore5.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Fungos do Nether (1x)");
		lore5.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Pé de Coelho (1x)");
		lore5.add(" ");
		lore5.add(ChatColor.GRAY + "Clique para concluir a fabricação.");
		superpuloMeta.setLore(lore5);
          
		superpulo.setItemMeta(superpuloMeta);
      
      
          
		ItemStack visaonoturna = new ItemStack(Material.POTION, 1, (short)8230);
		ItemMeta visaonoturnaMeta = visaonoturna.getItemMeta();
		visaonoturnaMeta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_POTION_EFFECTS });
          
		visaonoturnaMeta.setDisplayName(ChatColor.GREEN + "Poção de Visão Noturna");
          
		ArrayList<String> lore6 = new ArrayList<>();
		lore6.add(ChatColor.GRAY + "Ingredientes necessários: ");
		lore6.add(" ");
		lore6.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Fungos do Nether (1x)");
		lore6.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Cenoura Dourada (1x)");
		lore6.add(" ");
		lore6.add(ChatColor.GRAY + "Clique para concluir a fabricação.");
		visaonoturnaMeta.setLore(lore6);
          
		visaonoturna.setItemMeta(visaonoturnaMeta);
      
		ItemStack fn = new ItemStack(Material.NETHER_STALK);
		ItemMeta fnMeta = fn.getItemMeta();
          
		fnMeta.setDisplayName(ChatColor.GREEN + "Fungo do Nether");
          
		ArrayList<String> l0 = new ArrayList<>();
		l0.add(" ");
		l0.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Valor: $" + this.p_pb + ".");
		l0.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Quantidade: 3x");
		l0.add(" ");
		l0.add(ChatColor.GRAY + "Clique para concluir a compra.");
		fnMeta.setLore(l0);
		fn.setItemMeta(fnMeta);
		
		ItemStack pb = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta pbMeta = pb.getItemMeta();
          
		pbMeta.setDisplayName(ChatColor.GREEN + "Pó de Blaze");
          
		ArrayList<String> l1 = new ArrayList<>();
		l1.add(" ");
		l1.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Valor: $" + this.p_pb + ".");
		l1.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Quantidade: 3x");
		l1.add(" ");
		l1.add(ChatColor.GRAY + "Clique para concluir a compra.");
		pbMeta.setLore(l1);
		pb.setItemMeta(pbMeta);
      
      
          
		ItemStack ac = new ItemStack(Material.SUGAR);
		ItemMeta acMeta = ac.getItemMeta();
          
		acMeta.setDisplayName(ChatColor.GREEN + "Açúcar");
          
		ArrayList<String> l2 = new ArrayList<>();
		l2.add(" ");
		l2.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Valor: $" + this.p_ac + ".");
		l2.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Quantidade: 3x");
		l2.add(" ");
		l2.add(ChatColor.GRAY + "Clique para concluir a compra.");
		acMeta.setLore(l2);
		ac.setItemMeta(acMeta);
      
      
          
		ItemStack c = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta cMeta = c.getItemMeta();
          
		cMeta.setDisplayName(ChatColor.GREEN + "Creme de Magma");
          
		ArrayList<String> l4 = new ArrayList<>();
		l4.add(" ");
		l4.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Valor: $" + this.p_c + ".");
		l4.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Quantidade: 3x");
		l4.add(" ");
		l4.add(ChatColor.GRAY + "Clique para concluir a compra.");
		cMeta.setLore(l4);
		c.setItemMeta(cMeta);
      
      
          
		ItemStack mr = new ItemStack(Material.SPECKLED_MELON);
		ItemMeta mrMeta = mr.getItemMeta();
          
		mrMeta.setDisplayName(ChatColor.GREEN + "Melância Reluzente");
          
		ArrayList<String> l5 = new ArrayList<>();
		l5.add(" ");
		l5.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Valor: $" + this.p_mr + ".");
		l5.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Quantidade: 3x");
		l5.add(" ");
		l5.add(ChatColor.GRAY + "Clique para concluir a compra.");
		mrMeta.setLore(l5);
		mr.setItemMeta(mrMeta);
      
      
          
		ItemStack lg = new ItemStack(Material.GHAST_TEAR);
		ItemMeta lgMeta = lg.getItemMeta();
          
		lgMeta.setDisplayName(ChatColor.GREEN + "Lágrima de Ghast");
          
		ArrayList<String> l6 = new ArrayList<>();
		l6.add(" ");
		l6.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Valor: $" + this.p_lg + ".");
		l6.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Quantidade: 3x");
		l6.add(" ");
		l6.add(ChatColor.GRAY + "Clique para concluir a compra.");
		lgMeta.setLore(l6);
		lg.setItemMeta(lgMeta);
      
      
          
		ItemStack pc = new ItemStack(Material.RABBIT_FOOT);
		ItemMeta pcMeta = pc.getItemMeta();
          
		pcMeta.setDisplayName(ChatColor.GREEN + "Pé de Coelho");
          
		ArrayList<String> l7 = new ArrayList<>();
		l7.add(" ");
		l7.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Valor: $" + this.p_pc + ".");
		l7.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Quantidade: 3x");
		l7.add(" ");
		l7.add(ChatColor.GRAY + "Clique para concluir a compra.");
		pcMeta.setLore(l7);
		pc.setItemMeta(pcMeta);
      
      
          
		ItemStack cd = new ItemStack(Material.GOLDEN_CARROT);
		ItemMeta cdMeta = cd.getItemMeta();
          
		cdMeta.setDisplayName(ChatColor.GREEN + "Cenoura Dourada");
          
		ArrayList<String> l8 = new ArrayList<>();
		l8.add(" ");
		l8.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Valor: $" + this.p_cd + ".");
		l8.add(ChatColor.GREEN + this.seta + ChatColor.WHITE + " Quantidade: 3x");
		l8.add(" ");
		l8.add(ChatColor.GRAY + "Clique para concluir a compra.");
		cdMeta.setLore(l8);
		cd.setItemMeta(cdMeta);
      
      
		inv.setItem(10, forca);
		inv.setItem(11, agilidade);
		inv.setItem(12, resistencia);
		inv.setItem(13, cura);
		inv.setItem(14, reg);
		inv.setItem(15, superpulo);
		inv.setItem(16, visaonoturna);
        
		inv.setItem(22, fn);
		inv.setItem(28, pb);
		inv.setItem(29, ac);
		inv.setItem(30, c);
		inv.setItem(31, mr);
		inv.setItem(32, lg);
		inv.setItem(33, pc);
		inv.setItem(34, cd);
          
		return inv;
	}
}