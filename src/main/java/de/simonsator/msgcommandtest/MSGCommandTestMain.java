package de.simonsator.msgcommandtest;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;

public final class MSGCommandTestMain extends Plugin implements Listener {

	@Override
	public void onEnable() {
		ProxyServer.getInstance().getPluginManager().registerCommand(this, new MSGCommand());
	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}
}
