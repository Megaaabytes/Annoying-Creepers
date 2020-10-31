package com.megaaabytes.annoyingcreepers;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class listener implements Listener
{
    int power = 6;
    boolean invisible = true;

    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event)
    {
        if(event.getEntityType() == EntityType.CREEPER){
            Creeper creeper = (Creeper) event.getEntity();
            creeper.setInvulnerable(true);
            creeper.setAware(true);
            creeper.setPowered(true);
            creeper.setExplosionRadius(power);
            creeper.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,999999999, 2));
            power = power + power;
            if(invisible){
                creeper.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,999999999, 1));
            }
        }
    }
}
