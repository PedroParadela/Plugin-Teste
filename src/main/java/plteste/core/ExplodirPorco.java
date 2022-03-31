package plteste.core;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;
import plteste.events.PigClick;

public final class ExplodirPorco extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        launch(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        HandlerList.unregisterAll();
    }

    private void launch(ExplodirPorco plugin) {
        new PigClick(plugin);
    }
}
