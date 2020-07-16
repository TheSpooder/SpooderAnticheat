package me.spooder.check.api;

import cc.funkemunky.api.events.impl.PacketReceiveEvent;
import lombok.Getter;
import lombok.Setter;
import me.spooder.data.User;
import me.spooder.utils.ColourUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

@Getter
public class Check {

    private String name, type;
    @Setter
    private boolean enabled;

    public Check(String name, String type, boolean enabled) {
        this.name = name;
        this.type = type;
        this.enabled = enabled;
    }

    protected void flag(User user){
        user.addVerbose(this);
        String flagMessage = "&4&lS &8// &c%player% &7failed &c%name% &8(&7Type&8: &c%type%&8) &c(%verbose%)";
        String replaced = flagMessage.replace("%player%", user.getPlayer().getName())
                .replace("%name%", getName()).replace("%type%", getType())
                .replace("%verbose%", String.valueOf(user.getVerbose(this)));
        for(Player player : Bukkit.getOnlinePlayers()){
            if(player.isOp() || player.hasPermission("spooder.alerts")){
                player.sendMessage(ColourUtils.colour(replaced));
            }
        }
    }

    protected void handle(PacketReceiveEvent event, User user){}

}
