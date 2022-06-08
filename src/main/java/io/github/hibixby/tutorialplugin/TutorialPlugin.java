package io.github.hibixby.tutorialplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TutorialPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("튜토리얼 플러그인 활성화");
        getCommand("test").setExecutor(new TestCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("튜토리얼 플러그인 비활성화");
    }
}
