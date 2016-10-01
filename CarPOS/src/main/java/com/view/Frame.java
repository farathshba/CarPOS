package com.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame 
{
	//	Components
	private JPanel contentPane;
	private JMenuBar Menu;
	private JMenu mnNewMenu;
	private JMenuItem mntmCarStatus;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnNewMenu_2;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmUpdate;
	private JMenuItem mntmReturn;
	private JMenu mnAdd;
	private JMenuItem mntmBlacklistedHirer;
	private JMenu mnHelp;
	private JMenuItem mntmVersion;
	private JMenuItem mntmHelp;
	private JMenu mnNewMenu_1;
	private JButton btnView;
	private JButton btnAgreement;
	private JButton btnBlacklistedHirer;
	private JLabel lblPleaseChooseYour;
	private JLabel lblBeta;
	
	//	Panels
	private JPanel parentPanel;
	private JPanel panelVuCust;
	
	private void init()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Menu = new JMenuBar();
		Menu.setBounds(0, 0, 844, 21);
		contentPane.add(Menu);
		
		mnNewMenu = new JMenu("Home");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Menu.add(mnNewMenu);
		
		mnNewMenu_1 = new JMenu("View");
		Menu.add(mnNewMenu_1);
		
		mntmNewMenuItem = new JMenuItem("Customers");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vuCustBut();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Cars");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mntmCarStatus = new JMenuItem("Car Status");
		mnNewMenu_1.add(mntmCarStatus);
		
		mnNewMenu_2 = new JMenu("Agreement");
		Menu.add(mnNewMenu_2);
		
		mntmNewMenuItem_2 = new JMenuItem("New");
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		mntmUpdate = new JMenuItem("Update");
		mnNewMenu_2.add(mntmUpdate);
		
		mntmReturn = new JMenuItem("Return");
		mnNewMenu_2.add(mntmReturn);
		
		mnAdd = new JMenu("Add");
		Menu.add(mnAdd);
		
		mntmBlacklistedHirer = new JMenuItem("Blacklisted Hirer");
		mnAdd.add(mntmBlacklistedHirer);
		
		mnHelp = new JMenu("Help");
		Menu.add(mnHelp);
		
		mntmVersion = new JMenuItem("Version");
		mnHelp.add(mntmVersion);
		
		mntmHelp = new JMenuItem("FAQ");
		mnHelp.add(mntmHelp);
		
		parentPanel = new JPanel();
		parentPanel.setBounds(10, 31, 824, 433);
		contentPane.add(parentPanel);
		parentPanel.setLayout(null);
		
		btnView = new JButton("View");
		btnView.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnView.setBounds(38, 164, 182, 44);
		parentPanel.add(btnView);
		
		btnAgreement = new JButton("Agreement");
		btnAgreement.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAgreement.setBounds(325, 164, 182, 44);
		parentPanel.add(btnAgreement);
		
		btnBlacklistedHirer = new JButton("Blacklisted Hirer");
		btnBlacklistedHirer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBlacklistedHirer.setBounds(609, 164, 182, 44);
		parentPanel.add(btnBlacklistedHirer);
		
		lblPleaseChooseYour = new JLabel("Please choose your options and indicate your choice to move.");
		lblPleaseChooseYour.setBounds(10, 11, 360, 14);
		parentPanel.add(lblPleaseChooseYour);
		
		lblBeta = new JLabel("Beta");
		lblBeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBeta.setBounds(768, 408, 46, 14);
		parentPanel.add(lblBeta);
		
		panelVuCust = new JPanel();
		panelVuCust.setBounds(10, 31, 824, 433);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	//	Actions
	public void vuCustBut()
	{		
		JLabel label = new JLabel("Please ");
		panelVuCust.add(label);
		
		parentPanel.removeAll();
		parentPanel.add(panelVuCust);
		parentPanel.revalidate();
		parentPanel.repaint();
	}
	//test
	//	Panels
	
	
	/**
	 * Create the frame.
	 */
	public Frame() 
	{
		init();
	}
}
