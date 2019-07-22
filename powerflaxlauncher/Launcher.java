package fr.powerflax.powerflaxlauncher;

import java.io.File;

import fr.theshark34.openlauncherlib.launcher.GameInfos;
import fr.theshark34.openlauncherlib.launcher.GameTweak;
import fr.theshark34.openlauncherlib.launcher.GameType;
import fr.theshark34.openlauncherlib.launcher.GameVersion;

public class Launcher {
	public static DiscordManager discord;
	public static final GameVersion PF_VERSION = new GameVersion("1.7.10", GameType.V1_7_10);
	public static final GameInfos PF_INFOS = new GameInfos("PowerFlax", PF_VERSION, true, new GameTweak[] {GameTweak.FORGE});
	public static final File PF_DIR = PF_INFOS.getGameDir();

}

