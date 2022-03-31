package plteste.core;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;
import plteste.events.PigClick;

public final class ExplodirPorco extends JavaPlugin {

    ExplodirPorco plugin = this;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin.getServer().getConsoleSender().sendMessage("§aPlugin 'Explodir Porcos' Iniciado");
        launch(plugin);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        plugin.getServer().getConsoleSender().sendMessage("§cPlugin 'Explodir Porcos' Finalizado");
        HandlerList.unregisterAll();
    }

    private void launch(ExplodirPorco plugin) {
        new PigClick(plugin);
    }
}
