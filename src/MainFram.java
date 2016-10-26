import java.awt.EventQueue;

import javax.swing.JFrame;

import jaco.mp3.player.MP3Player;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class MainFram {

	private JFrame frmMyMusicPlayer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFram window = new MainFram();
					window.frmMyMusicPlayer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyMusicPlayer = new JFrame();
		frmMyMusicPlayer.getContentPane().setBackground(SystemColor.desktop);
		frmMyMusicPlayer.setTitle("My Music Player");
		frmMyMusicPlayer.setBounds(100, 100, 450, 300);
		frmMyMusicPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("play");
		btnNewButton.setBounds(117, 181, 87, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MP3Player(new File("//home//mandana//Downloads//Crazy Frog - Axel F.mp3")).play();
			}
		});
		frmMyMusicPlayer.getContentPane().setLayout(null);
		frmMyMusicPlayer.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("pause");
		btnNewButton_1.setBounds(223, 181, 87, 25);
		frmMyMusicPlayer.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("stop");
		btnNewButton_2.setBounds(321, 181, 96, 25);
		frmMyMusicPlayer.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("play List");
		btnNewButton_3.setBounds(9, 181, 96, 25);
		frmMyMusicPlayer.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Music:  ");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(22, 38, 70, 15);
		frmMyMusicPlayer.getContentPane().add(lblNewLabel);
	}
}
