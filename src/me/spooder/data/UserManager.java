package me.spooder.data;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class UserManager {

    public ArrayList<User> users;

    public UserManager(){
        users = new ArrayList<>();
    }

    public void addUser(Player player){
        users.add(new User(player));
    }

    public User getUser(Player player){
        for(User user : users){
            if(user.getPlayer().getUniqueId() == player.getUniqueId()){
                return user;
            }
        }
        return null;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
