package me.spooder;

import lombok.Getter;
import me.spooder.data.UserManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Anticheat extends JavaPlugin {

    private static Anticheat instance;
    private UserManager userManager;

    @Override
    public void onEnable() {
       instance = this;
       userManager = new UserManager();
    }

    @Override
    public void onDisable() {

    }

    public static Anticheat getInstance() {
        return instance;
    }

    public UserManager getUserManager() {
        return userManager;
    }
}
