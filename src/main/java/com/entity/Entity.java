package com.entity;

import net.fabricmc.api.ModInitializer;
// import net.minecraft.server.commands.
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.entity.items.dsItems;

public class Entity implements ModInitializer {
	public static final String MOD_ID = "entity";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			dispatcher.register(Commands.literal("heal")
					.requires(source -> source.hasPermission(0)) // Только OP (уровень 2+)
					.executes(context -> executeHeal(context.getSource())));
		});

		dsItems.init();
	}

	private int executeHeal(CommandSourceStack source) {
		source.getPlayer().setHealth(20);
		source.sendSuccess(() -> net.minecraft.network.chat.Component.literal("§aВы исцелены!"), false);
		return 1;
	}
}