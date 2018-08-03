package me.iceconchy.MobPlacer;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Placer extends JavaPlugin implements Listener {

	@Override
	public void onEnable()  {
		getServer().getPluginManager().registerEvents(this, this);

	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		if (event.getItem() != null && event.getItem().getType() == Material.STICK) {
			final Entity entity = event.getPlayer().getWorld().spawnEntity(event.getPlayer().getEyeLocation(), EntityType.COW);
			entity.setVelocity(event.getPlayer().getEyeLocation().getDirection().multiply(3));






		}
	}
}

