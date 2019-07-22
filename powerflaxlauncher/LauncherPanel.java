package fr.powerflax.powerflaxlauncher;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.theshark34.openlauncherlib.launcher.util.UsernameSaver;
import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;

@SuppressWarnings("serial")
public class LauncherPanel extends JPanel implements SwingerEventListener{
	
	private Image background = Swinger.getResource("LauncherLogin.png");
	
	private UsernameSaver server = new UsernameSaver (Launcher.PF_INFOS);
	
	private JTextField usernameField = new JTextField(server.getUsername(""));
	
	public LauncherPanel() {
		this.setLayout(null);
		this.setBackground(Swinger.TRANSPARENT);
		usernameField.setBorder(null);
		usernameField.setOpaque(false);
		
		usernameField.setBounds(200, 300, 150, 25);
		this.add(usernameField);
		}
	
	@Override
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
		
	}

	@Override
	public void onEvent(SwingerEvent e) {
		
		
	}
	

}
