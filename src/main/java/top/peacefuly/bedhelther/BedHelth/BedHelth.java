package top.peacefuly.bedhelther.BedHelth;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class BedHelth implements Listener {
    @EventHandler
    void onEntryBed(PlayerBedEnterEvent e) {
        if (e.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
            e.getPlayer().setHealth(e.getPlayer().getMaxHealth());
        }
    }
}
