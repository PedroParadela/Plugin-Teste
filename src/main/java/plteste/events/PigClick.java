package plteste.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import plteste.core.ExplodirPorco;

public class PigClick implements Listener {

    ExplodirPorco plugin;

    public PigClick(ExplodirPorco plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void pigClickEvent(PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();
        Entity entidade = event.getRightClicked();
        if (entidade.getType().equals(EntityType.PIG)) {
            Location local = entidade.getLocation();
            local.getWorld().createExplosion(local, 5);
        }
    }
}
