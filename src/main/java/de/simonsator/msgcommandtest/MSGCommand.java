package de.simonsator.msgcommandtest;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;

import java.util.ArrayList;
import java.util.List;

public class MSGCommand extends Command implements TabExecutor {
	public MSGCommand() {
		super("msg");
	}

	@Override
	public void execute(CommandSender commandSender, String[] strings) {
		commandSender.sendMessage(TextComponent.fromLegacyText("Hello World!"));
	}

	@Override
	public Iterable<String> onTabComplete(CommandSender commandSender, String[] strings) {
		return 		new ArrayList<String>(List.of(new String[]{"Hello World!"}));
	}
}
