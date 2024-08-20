package top.peacefuly.bedhelther.BedHelth;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.potion.PotionEffect;

public class BedHelth implements Listener {
    @EventHandler
    void onEntryBed(PlayerBedEnterEvent e) {
        Player player = e.getPlayer();
        if (e.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
            e.getPlayer().setHealth(e.getPlayer().getMaxHealth());
//            清空玩家身上所有效果
            for (PotionEffect effect : player.getActivePotionEffects()){
                player.removePotionEffect(effect.getType());
            }
        }
    }
}
