package de.simonsator.msgcommandtest;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class MSGCommand extends Command {
	public MSGCommand() {
		super("msg");
	}

	@Override
	public void execute(CommandSender commandSender, String[] strings) {
		commandSender.sendMessage(TextComponent.fromLegacyText("Hello World!"));
	}
}
