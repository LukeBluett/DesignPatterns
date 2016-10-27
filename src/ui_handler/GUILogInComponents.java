//package ui_handler;

import java.awt.*;
import javax.swing.*;

/*
	This class is a singleton, that holds the code for the
	JComponents of the login Gui
*/

public class GUILogInComponents {
	private JFrame frameLogIn;
	private JPanel panelMain, panelUsername, panelPassword, panelButtons;
	private JLabel labelUsername, labelPassword;
	private JTextField textFieldUsername, textFieldPassword;
	private JButton buttonLogIn, buttonCancel;

	private LogInController logInController = new LogInController();
	private FlowLayout flow = new FlowLayout();
	private static GUILogInComponents gui = new GUILogInComponents();

	private GUILogInComponents() {
		createComponents();
		addComponents();
		logInController.addListeners();
		setFrameVisible();
	}

	public static GUILogInComponents getInstance() {
		return gui;
	}

	private void createComponents() {
		frameLogIn 		= new JFrame("Log In");
		panelMain 		= new JPanel();
		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

		panelUsername 		= new JPanel(flow);
		panelPassword 		= new JPanel(flow);
		panelButtons 		= new JPanel(flow);
		labelUsername 		= new JLabel("Username: ");
		labelPassword		= new JLabel("Password: ");
		textFieldUsername 	= new JTextField(15);
		textFieldPassword 	= new JTextField(15);
		buttonLogIn		= new JButton("log in");
		buttonCancel		= new JButton("cancel");
	}

	private void addComponents() {
		panelUsername.add(labelUsername);
		panelUsername.add(textFieldUsername);
		panelPassword.add(labelPassword);
		panelPassword.add(textFieldPassword);
		panelButtons.add(buttonLogIn);
		panelButtons.add(buttonCancel);
		panelMain.add(panelUsername);
		panelMain.add(panelPassword);
		panelMain.add(panelButtons);
		frameLogIn.add(panelMain);
	}

	private void setFrameVisible() {
		frameLogIn.setSize(300,200);
		frameLogIn.setVisible(true);
	}
}
