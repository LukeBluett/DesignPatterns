//package ui_handler;

import java.awt.*;
import javax.swing.*;

/*
	This class is a singleton, that holds the code for the
	JComponents of the login Gui
*/

public class GUILogInComponents {
	private static JFrame frameLogIn;
	private static JPanel panelInfo, panelMain, panelUsername, panelPassword, panelButtons;
	private static JLabel labelInfo, labelUsername, labelPassword;
	private static JTextField textFieldUsername, textFieldPassword;
	private static JButton buttonLogIn, buttonCancel;

	private FlowLayout flow = new FlowLayout();
	private static GUILogInComponents gui = new GUILogInComponents();

	private GUILogInComponents() {
		createComponents();
		addComponents();
	}

	public static GUILogInComponents getInstance() {
		return gui;
	}

	private void createComponents() {
		frameLogIn 		= new JFrame("Log In");
		panelMain 		= new JPanel();
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

		panelInfo		= new JPanel(flow);
		panelUsername 		= new JPanel(flow);
		panelPassword 		= new JPanel(flow);
		panelButtons 		= new JPanel(flow);
		labelInfo		= new JLabel("Please enter a valid username and password");
		labelUsername 		= new JLabel("Username: ");
		labelPassword		= new JLabel("Password: ");
		textFieldUsername 	= new JTextField(15);
		textFieldPassword 	= new JTextField(15);
		buttonLogIn		= new JButton("log in");
		buttonCancel		= new JButton("cancel");
	}

	private void addComponents() {
		panelInfo	.add(labelInfo);
		panelUsername	.add(labelUsername);
		panelUsername	.add(textFieldUsername);
		panelPassword	.add(labelPassword);
		panelPassword	.add(textFieldPassword);
		panelButtons	.add(buttonLogIn);
		panelButtons	.add(buttonCancel);
		panelMain	.add(panelInfo);
		panelMain	.add(panelUsername);
		panelMain	.add(panelPassword);
		panelMain	.add(panelButtons);
		frameLogIn	.add(panelMain);
	}

	public static void setFrameVisible() {
		frameLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogIn.setSize(350,200);
		frameLogIn.setVisible(true);
	}

	public static void closeFrame() {
		frameLogIn.setVisible(false);
		frameLogIn.dispose();
	}
}
