package com.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	static int frameWidth = 500;
	static int frameHeight = 500;

	public static void main(String[] args) {
        // Creating the Frame
        JFrame frame = new JFrame("My Profile");
        JPanel panel = new JPanel();
        JMenuBar menuBar = createMenu();
        
        // Set to null
        panel.setLayout(null);
        
        // App Label
        JLabel appHello = createLabel("Hello! My name is", Font.ITALIC, 16, 30);
        JLabel appTitle = createLabel("Muhammad Arif Faizin", Font.BOLD, 24, 50);
        JLabel appDesc = createLabel("Follow me on social media :", Font.PLAIN, 16, 75);
        
        // App Links
        JButton btnFacebook = createButton("Facebook", Font.PLAIN, 16, 150, "https://facebook.com/muhammad.arif.faizin.19");        
        JButton btnGithub = createButton("Github", Font.PLAIN, 16, 210, "https://github.com/MuhammadArifFaizin");
        JButton btnTwitter = createButton("Twitter", Font.PLAIN, 16, 270, "https://twitter.com/m_ariffaizin");
        JButton btnInstagram = createButton("Instagram", Font.PLAIN, 16, 330, "https://www.instagram.com/m.arif.faizin");
        
        panel.add(appHello);
        panel.add(appTitle);
        panel.add(appDesc);
        
        panel.add(btnFacebook);
        panel.add(btnGithub);
        panel.add(btnTwitter);
        panel.add(btnInstagram);
        
        frame.add(panel);
        frame.setSize(frameWidth, frameHeight);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
	}

	private static JLabel createLabel(String Title, int Style, int Size, int Top) {
		JLabel label = new JLabel();
        Font labelFont = new Font("Arial", Style, Size);
        
        label.setText(Title);
        label.setFont(labelFont);
        int labelWidth = label.getFontMetrics(labelFont).stringWidth(Title);
        label.setBounds((frameWidth-labelWidth)/2, Top, labelWidth, 50);
        
		return label;
	}
	
	private static JButton createButton(String Title, int Style, int Size, int Top, final String url) {
		JButton button = new JButton();
		Font btnFont = new Font("Arial", Style, Size);
		
        button.setText(Title);
        button.setFont(btnFont);
        int buttonWidth = button.getFontMetrics(btnFont).stringWidth(Title) + 50;
        System.out.println(buttonWidth);
        
        button.setBounds((frameWidth-buttonWidth)/2, Top, buttonWidth, 50);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	try {         
            	     java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            	} catch (java.io.IOException er) {
            	       System.out.println(er.getMessage());
            	}
            }
           });
        
        return button;
	}
	
	private static JMenuBar createMenu() {
		// Creating the MenuBar and adding components
        JMenuBar menubar = new JMenuBar();
        JMenu m_about = new JMenu("About me");
        menubar.add(m_about);
        JMenuItem m_about_facebook = new JMenuItem("Facebook");
        JMenuItem m_about_github = new JMenuItem("Github");
        JMenuItem m_about_twitter = new JMenuItem("Twitter");
        JMenuItem m_about_instagram = new JMenuItem("Instagram");
        m_about.add(m_about_facebook);
        m_about.add(m_about_github);
        m_about.add(m_about_twitter);
        m_about.add(m_about_instagram);
        
        return menubar;
	}
}
