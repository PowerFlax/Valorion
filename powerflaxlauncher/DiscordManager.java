 package fr.powerflax.powerflaxlauncher;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;

public class DiscordManager {

	private DiscordRPC lib;
	private DiscordEventHandlers handlers;
	private DiscordRichPresence rpc;
	
	public DiscordManager(){
		lib = DiscordRPC.INSTANCE;
		handlers = new DiscordEventHandlers();
		lib.Discord_Initialize("602990530225504256", handlers, true, "");
		rpc = new DiscordRichPresence();
		rpc.startTimestamp = System.currentTimeMillis() / 100;
		rpc.largeImageKey = "logo";
		rpc.largeImageText = "";
		rpc.smallImageKey = "";
		rpc.smallImageText = "logo";
		rpc.state = "test";
		lib.Discord_UpdatePresence(rpc);
		
	}
	public void run() {
		new Thread("RPC-Callback-handler") {
			@Override
			public void run() {
				while (!Thread.currentThread().isInterrupted()) {
					lib.Discord_UpdatePresence(rpc);
					lib.Discord_RunCallbacks();
					try {
						Thread.sleep(2000);
					}catch(InterruptedException e) {}
				}
			}
		}.start();
	}

	public void updateTime() {
		rpc.startTimestamp = System.currentTimeMillis() / 1000;
	}
	
}
