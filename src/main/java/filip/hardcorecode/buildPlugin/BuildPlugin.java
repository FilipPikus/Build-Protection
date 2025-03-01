package filip.hardcorecode.buildPlugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.UUID;

public final class BuildPlugin extends JavaPlugin {
        public static HashSet<UUID> buildMode = new HashSet<>();
        public static BuildPlugin instance;
    @Override
    public void onEnable() {
        instance = this;
        getCommand("build").setExecutor(new BuildCommand());
        Bukkit.getPluginManager().registerEvents(new Buildlistener(),this);
        Config config = ConfigUtil.getConfig("config");
        config.setDefault("buildmode-disable-message",BuildCommand.buildmodedisabled);
        BuildCommand.buildmodedisabled = config.getString("buildmode-disable-message");
        config.setDefault("buildmode-enable-message",BuildCommand.buildmodeenabled);
        BuildCommand.buildmodeenabled = config.getString("buildmode-enable-message");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
