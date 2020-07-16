package me.spooder.data;

import lombok.Getter;
import me.spooder.check.api.Check;
import org.bukkit.entity.Player;

import java.util.HashMap;

@Getter
public class User {

    private final Player player;
    private HashMap<Check, Integer> verbose;

    public User(Player player){
        this.player = player;
        this.verbose = new HashMap<>();
    }

    public int getVerbose(Check check){
        if(verbose.containsKey(check)){
            return verbose.get(check);
        }
        return 0;
    }

    public void addVerbose(Check check){
        verbose.put(check, getVerbose(check) + 1);
    }

}
