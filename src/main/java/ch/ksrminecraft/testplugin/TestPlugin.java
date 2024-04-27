package ch.ksrminecraft.testplugin;

import ch.ksrminecraft.testplugin.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("test").setExecutor(new TestCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
