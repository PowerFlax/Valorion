package fr.powerflax.powerflaxlauncher;

import javax.swing.JFrame;

import fr.theshark34.openlauncherlib.launcher.util.WindowMover;
import fr.theshark34.swinger.Swinger;

@SuppressWarnings("serial")
public class LauncherFrame extends JFrame{
	public static LauncherFrame instance;
	public LauncherPanel LauncherPanel;
	
	public LauncherFrame() {
		this.setTitle("PowerFlax Launcher");
		this.setSize(740, 484);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setIconImage(Swinger.getResource("download.jpg"));
		this.setContentPane(LauncherPanel = new LauncherPanel());
		
		
		WindowMover mover = new WindowMover(this);
		
		this.addMouseListener(mover);
		this.addMouseMotionListener(mover);
		
		
		this.setVisible(true);
		}


	public static void main(String[] args) {
		Swinger.setSystemLookNFeel();
		Swinger.setResourcePath("/fr/powerflax/powerflaxlauncher/ressources/");
		
		instance = new LauncherFrame();
	}
	public static LauncherFrame getInstance() {
		return instance;
	}
		
	public LauncherPanel LauncherPanel(){
		return this.LauncherPanel;
	}

}
