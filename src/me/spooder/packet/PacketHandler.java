package me.spooder.packet;

import cc.funkemunky.api.events.AtlasListener;
import cc.funkemunky.api.events.Listen;
import cc.funkemunky.api.events.impl.PacketReceiveEvent;
import cc.funkemunky.api.utils.Init;
import me.spooder.Anticheat;
import me.spooder.data.User;

@Init
public class PacketHandler implements AtlasListener {

    @Listen
    public void onPacket(PacketReceiveEvent event){
        User user = Anticheat.getInstance().getUserManager().getUser(event.getPlayer());
        if(user == null){
            Anticheat.getInstance().getUserManager().addUser(event.getPlayer());
            return;
        }



    }

}
