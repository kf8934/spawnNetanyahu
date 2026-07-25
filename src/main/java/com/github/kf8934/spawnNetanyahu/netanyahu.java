package com.github.kf8934.spawnNetanyahu;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class netanyahu implements BasicCommand {

    @Override
    public void execute(CommandSourceStack commandSourceStack, String[] args) {
        if (!(commandSourceStack.getExecutor() instanceof Player player)) {
            commandSourceStack.getSender().sendMessage("Fuck you! YOU CANT RUN THIS IF YOU ARE NOT A PLAYER! FUCKING BITCH!");
            return;
        }
        World world = player.getWorld();
        Location location = player.getLocation();

        Entity entity = world.spawnEntity(location, EntityType.VILLAGER);
        Villager villager = (Villager) entity;

        villager.setProfession(Villager.Profession.NITWIT);
        villager.customName(Component.text("Benjamin Netanyahu"));
    }
}
