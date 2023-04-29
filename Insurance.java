import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.util.ArrayList;
import javax.swing.*;

/*
    <applet code = "Insurance" height = "1080" width = "1920">
    </applet>
 */

public class Insurance extends Applet implements ActionListener, ItemListener {

    Button loginButton, registerButton, loginBack, displayBack, registerButton2;
    JButton searchAndBuyButton, buyButton, renewButton, displayButton, logoutButton, searchBackButton, renewBackButton,
            renewPayButton;
    Checkbox c1, c2, c3;
    CheckboxGroup cbg;
    TextField nameField, panField, usernameField, usernameField1, renewField;
    JPasswordField passwordField, passwordField1;
    Panel homeScreenPanel, loginScreenPanel, registerScreenPanel, firstScreenPanel,
            optionScreenPanel, searchScreenPanel, renewScreenPanel;
    CardLayout co;
    ArrayList<String> al;
    String options[] = { "Yes", "No" };

    public void init() {
        setBackground(Color.pink);
        co = new CardLayout();
        setLayout(co);
        al = new ArrayList<>(5);
        initRegisterScreen();
        initLoginScreen();
        initOptionScreen();
        initSearchScreen();
        InitRenewScreen();
    }

    public void initRegisterScreen() {
        // Register Screen
        registerScreenPanel = new Panel(null);

        Label loginTitle = new Label("HEALTH-CARE INSURANCE REGISTRATION FORM");
        loginTitle.setBounds(360, 70, 1250, 50);
        loginTitle.setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 50));
        registerScreenPanel.add(loginTitle);

        Label name = new Label("Full Name");
        name.setFont(new java.awt.Font("Bell MT", java.awt.Font.PLAIN, 30));
        name.setBounds(450, 200, 300, 50);
        registerScreenPanel.add(name);

        Label pan = new Label("Phone");
        pan.setFont(new java.awt.Font("Bell MT", java.awt.Font.PLAIN, 30));
        pan.setBounds(450, 300, 300, 50);
        registerScreenPanel.add(pan);

        Label username = new Label("Create User Name");
        username.setFont(new java.awt.Font("Bell MT", java.awt.Font.PLAIN, 30));
        username.setBounds(450, 400, 300, 50);
        registerScreenPanel.add(username);

        Label pswd = new Label("Create Password");
        pswd.setFont(new java.awt.Font("Bell MT", java.awt.Font.PLAIN, 30));
        pswd.setBounds(450, 500, 300, 50);
        registerScreenPanel.add(pswd);

        nameField = new TextField(30);
        nameField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 25));
        nameField.setBounds(800, 200, 300, 50);
        registerScreenPanel.add(nameField);

        panField = new TextField(30);
        panField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 25));
        panField.setBounds(800, 300, 300, 50);
        registerScreenPanel.add(panField);

        usernameField = new TextField(30);
        usernameField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 25));
        usernameField.setBounds(800, 400, 300, 50);
        registerScreenPanel.add(usernameField);

        passwordField = new JPasswordField(30);
        passwordField.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 25));
        passwordField.setBounds(800, 500, 300, 50);
        passwordField.setEchoChar('*');
        registerScreenPanel.add(passwordField);

        Label lb = new Label("(Password should be of 6 characters)");
        lb.setFont(new java.awt.Font("Bell MT", java.awt.Font.BOLD, 15));
        lb.setBounds(800, 545, 300, 50);
        registerScreenPanel.add(lb);

        registerButton2 = new Button("Register");
        registerButton2.setBackground(Color.BLACK);
        registerButton2.setForeground(Color.WHITE);
        registerButton2.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        registerButton2.setBounds(700, 650, 200, 60);
        registerButton2.addActionListener(this);
        registerScreenPanel.add(registerButton2);

        add(registerScreenPanel, "register-screen");
    }

    public void initLoginScreen() {
        // Login Screen
        loginScreenPanel = new Panel(null);

        Label loginTitle = new Label("HEALTH-CARE INSURANCE LOGIN");
        loginTitle.setBounds(450, 30, 900, 50);
        loginTitle.setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 50));
        loginScreenPanel.add(loginTitle);

        Label note = new Label("* (Kindly enter your registered username and password)");
        note.setFont(new java.awt.Font("Bell MT", java.awt.Font.BOLD, 25));
        note.setBounds(520, 100, 750, 40);
        loginScreenPanel.add(note);

        Label username = new Label("User Name");
        username.setFont(new java.awt.Font("Bell MT", java.awt.Font.PLAIN, 30));
        username.setBounds(500, 200, 300, 50);
        loginScreenPanel.add(username);

        Label pswd = new Label("Password");
        pswd.setFont(new java.awt.Font("Bell MT", java.awt.Font.PLAIN, 30));
        pswd.setBounds(500, 300, 300, 50);
        loginScreenPanel.add(pswd);

        usernameField1 = new TextField(30);
        usernameField1.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 25));
        usernameField1.setBounds(800, 200, 300, 50);
        loginScreenPanel.add(usernameField1);

        passwordField1 = new JPasswordField(30);
        passwordField1.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 25));
        passwordField1.setBounds(800, 300, 300, 50);
        passwordField1.setEchoChar('*');
        loginScreenPanel.add(passwordField1);

        loginButton = new Button("Login");
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        loginButton.setBounds(550, 400, 200, 60);
        loginButton.addActionListener(this);
        loginScreenPanel.add(loginButton, "login-button");

        loginBack = new Button("Back");
        loginBack.setBackground(Color.BLACK);
        loginBack.setForeground(Color.WHITE);
        loginBack.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        loginBack.setBounds(800, 400, 200, 60);
        loginBack.addActionListener(this);
        loginScreenPanel.add(loginBack);

        add(loginScreenPanel, "login-screen");
    }

    public void initOptionScreen() {
        // option screen
        optionScreenPanel = new Panel(null);

        Label loginTitle = new Label("HEALTH-CARE INSURANCE");
        loginTitle.setBounds(520, 30, 900, 50);
        loginTitle.setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 45));
        optionScreenPanel.add(loginTitle);

        JLabel about = new JLabel();
        about.setText(
                "<html><pre>Health Insurance is an essential requirement in these times. It<br>provides coverage against the cost of medical treatment and other<br>associated spends. Some of the common items covered under this<br>insurance are hospitalisation expenses, pre and post hospitalisation<br>expenses, ambulance charges, room rent, doctor's consultation<br>expenses, day-care procedure charges, evacuation charges, critical<br>illness-related expenses, etc.</pre></html>");
        about.setBounds(180, 100, 1800, 400);
        about.setFont(new java.awt.Font("Garamond", java.awt.Font.BOLD, 40));
        optionScreenPanel.add(about);

        searchAndBuyButton = new JButton("<html><pre>SEARCH AND BUY<br>   A PLAN</pre></html>");
        searchAndBuyButton.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        searchAndBuyButton.setBounds(500, 530, 250, 100);
        searchAndBuyButton.addActionListener(this);
        optionScreenPanel.add(searchAndBuyButton);

        renewButton = new JButton("<html><pre>RENEW<br>PLAN</pre></html>");
        renewButton.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        renewButton.setBounds(800, 530, 250, 100);
        renewButton.addActionListener(this);
        optionScreenPanel.add(renewButton);

        displayButton = new JButton("<html><pre> DISPLAY<br>INFORMATION</pre></html>");
        displayButton.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        displayButton.setBounds(500, 680, 250, 100);
        displayButton.addActionListener(this);
        optionScreenPanel.add(displayButton);

        logoutButton = new JButton("<html><pre>LOGOUT</pre></html>");
        logoutButton.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        logoutButton.setBounds(800, 680, 250, 100);
        logoutButton.addActionListener(this);
        optionScreenPanel.add(logoutButton);

        add(optionScreenPanel, "option-screen");
    }

    public void initSearchScreen() {
        // search screen
        searchScreenPanel = new Panel(null);
        cbg = new CheckboxGroup();

        Label loginTitle = new Label("HEALTH-CARE INSURANCE");
        loginTitle.setBounds(520, 30, 900, 50);
        loginTitle.setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 50));
        searchScreenPanel.add(loginTitle);

        Label l1 = new Label("3 months plan : Only for insured");
        l1.setBounds(300, 150, 900, 40);
        l1.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 30));
        searchScreenPanel.add(l1);

        c1 = new Checkbox("Rs.800 per month(For 3 months) -> Total amount : Rs.2400", cbg, false);
        c1.setBounds(330, 220, 900, 40);
        c1.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        searchScreenPanel.add(c1);

        Label l2 = new Label("6 months plan : For insured and 1 more person");
        l2.setBounds(300, 400, 900, 40);
        l2.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 30));
        searchScreenPanel.add(l2);

        c2 = new Checkbox("Rs.1200 per month(For 6 months) -> Total amount : Rs.7200", cbg, false);
        c2.setBounds(330, 470, 900, 40);
        c2.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        searchScreenPanel.add(c2);

        Label l3 = new Label("6 months plan : For insured and his/her family");
        l3.setBounds(300, 650, 900, 40);
        l3.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 30));
        searchScreenPanel.add(l3);

        c3 = new Checkbox("Rs.3000 for 2 months(For 12 months) -> Total amount : Rs.18000", cbg, false);
        c3.setBounds(330, 720, 900, 40);
        c3.setFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 25));
        searchScreenPanel.add(c3);

        buyButton = new JButton("BUY NOW");
        buyButton.setBounds(1250, 850, 200, 60);
        buyButton.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        buyButton.addActionListener(this);
        searchScreenPanel.add(buyButton);

        searchBackButton = new JButton("BACK");
        searchBackButton.setBounds(1500, 850, 200, 60);
        searchBackButton.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        searchBackButton.addActionListener(this);
        searchScreenPanel.add(searchBackButton);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        add(searchScreenPanel, "search-screen");
    }

    public void InitRenewScreen() {
        // renew screen
        renewScreenPanel = new Panel(null);

        Label loginTitle = new Label("HEALTH-CARE INSURANCE");
        loginTitle.setBounds(520, 30, 900, 50);
        loginTitle.setFont(new java.awt.Font("Consolas", java.awt.Font.BOLD, 45));
        renewScreenPanel.add(loginTitle);

        Label renewTitle = new Label("RENEW INSTALLMENT");
        renewTitle.setBounds(420, 150, 500, 50);
        renewTitle.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 35));
        renewScreenPanel.add(renewTitle);

        renewField = new TextField(30);
        renewField.setFont(new java.awt.Font("Garamond", java.awt.Font.BOLD, 25));
        renewField.setBounds(420, 250, 300, 75);
        renewScreenPanel.add(renewField);

        renewPayButton = new JButton("RENEW PLAN");
        renewPayButton.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        renewPayButton.setBounds(500, 600, 250, 60);
        renewPayButton.addActionListener(this);
        renewScreenPanel.add(renewPayButton);

        renewBackButton = new JButton("BACK");
        renewBackButton.setBounds(1200, 600, 200, 60);
        renewBackButton.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 25));
        renewBackButton.addActionListener(this);
        renewScreenPanel.add(renewBackButton);

        add(renewScreenPanel, "renew-screen");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            if (usernameField1.getText().equals(al.get(2)) && passwordField1.getText().equals(al.get(3))) {
                JOptionPane.showMessageDialog(this, "Logged In As : " + nameField.getText(), "HEALTH-CARE INSURANCE",
                        JOptionPane.INFORMATION_MESSAGE);
                ((CardLayout) getLayout()).show(Insurance.this, "option-screen");
            } else {
                JOptionPane.showMessageDialog(this, "INVALID LOGIN CREDENTIALS : " + nameField.getText(),
                        "HEALTH-CARE INSURANCE",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (e.getSource() == loginBack) {
            ((CardLayout) getLayout()).show(Insurance.this, "register-screen");
        }

        if (e.getSource() == registerButton2) {
            int found = 0;
            int len = passwordField.getPassword().length;
            int panlen = panField.getText().length();
            char ch[] = panField.getText().toCharArray();
            for (int i = 0; i < panlen; i++) {
                int k = ch[i] - '0';
                if (k >= 0 && k <= 9) {
                    continue;
                } else {
                    found = 1;
                    break;
                }
            }
            if (found == 1) {
                JOptionPane.showMessageDialog(this, "Only digits are allowed", "HEALTH-CARE INSURANCE",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (nameField.getText().equals("") || panField.getText().equals("")
                    || usernameField.getText().equals("") || passwordField.getPassword().equals("")) {
                JOptionPane.showMessageDialog(this, "Incomplete Details", "HEALTH-CARE INSURANCE",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (len < 6 || len > 6) {
                JOptionPane.showMessageDialog(this, "Password should be of 6-character only", "HEALTH-CARE INSURANCE",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (panlen > 10 || panlen < 10) {
                JOptionPane.showMessageDialog(this, "Phone Number should be of only 10 digits", "HEALTH-CARE INSURANCE",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                al.add(nameField.getText());
                al.add(panField.getText());
                al.add(usernameField.getText());
                al.add(passwordField.getText());
                al.add("0");
                JOptionPane.showMessageDialog(this, "Registered Successfully As : " + nameField.getText(),
                        "HEALTH-CARE INSURANCE",
                        JOptionPane.INFORMATION_MESSAGE);
                ((CardLayout) getLayout()).show(Insurance.this, "login-screen");
            }
        }
        if (e.getSource() == searchAndBuyButton) {
            ((CardLayout) getLayout()).show(Insurance.this, "search-screen");
        }

        if (e.getSource() == displayButton) {
            JOptionPane.showMessageDialog(this,
                    "Name : " + al.get(0) + "\nPhone No : " + al.get(1) + "\nUsername : " + al.get(2)
                            + "\nTotal Installment Paid : " + al.get(4),
                    "HEALTH-CARE INSURANCE",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        if (e.getSource() == searchBackButton) {
            ((CardLayout) getLayout()).show(Insurance.this, "option-screen");
        }

        if (e.getSource() == buyButton) {
            if (cbg.getSelectedCheckbox() == c1) {
                int x = JOptionPane.showOptionDialog(null,
                        "Buy Now ?\n(You will not be able to buy other policies until you pay all your installment)",
                        "HEALTH-CARE INSURANCE",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (x == 0) {
                    int j = Integer.parseInt(al.get(4));
                    j += 800;
                    al.set(4, String.valueOf(j));
                    JOptionPane.showMessageDialog(this, "Policy Purchased\nRenew the Policy", "HEALTH-CARE INSURANCE",
                            JOptionPane.INFORMATION_MESSAGE);
                    if ((Integer.parseInt(al.get(4)) < 2400)) {
                        c1.setEnabled(false);
                        c2.setEnabled(false);
                        c3.setEnabled(false);
                        renewField.setText("800");
                        renewField.setEnabled(false);
                    } else {
                        c1.setEnabled(true);
                        c2.setEnabled(true);
                        c3.setEnabled(true);
                    }
                }
            }

            if (cbg.getSelectedCheckbox() == c2) {
                int x = JOptionPane.showOptionDialog(null,
                        "Buy Now ?\n(You will not be able to buy other policies until you pay all your installment) ",
                        "HEALTH-CARE INSURANCE",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (x == 0) {
                    int j = Integer.parseInt(al.get(4));
                    j += 1200;
                    al.set(4, String.valueOf(j));
                    JOptionPane.showMessageDialog(this, "Policy Purchased\nRenew the Policy", "HEALTH-CARE INSURANCE",
                            JOptionPane.INFORMATION_MESSAGE);
                    if ((Integer.parseInt(al.get(4)) < 7200)) {
                        c1.setEnabled(false);
                        c2.setEnabled(false);
                        c3.setEnabled(false);
                        renewField.setText("1200");
                        renewField.setEnabled(false);
                    } else {
                        c1.setEnabled(true);
                        c2.setEnabled(true);
                        c3.setEnabled(true);
                    }
                }
            }

            if (cbg.getSelectedCheckbox() == c3) {
                int x = JOptionPane.showOptionDialog(null,
                        "Buy Now ?\n(You will not be able to buy other policies until you pay all your installment) ",
                        "HEALTH-CARE INSURANCE",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (x == 0) {
                    int j = Integer.parseInt(al.get(4));
                    j += 3000;
                    al.set(4, String.valueOf(j));
                    JOptionPane.showMessageDialog(this, "Policy Purchased\nRenew the Policy", "HEALTH-CARE INSURANCE",
                            JOptionPane.INFORMATION_MESSAGE);
                    if ((Integer.parseInt(al.get(4)) < 18000)) {
                        c1.setEnabled(false);
                        c2.setEnabled(false);
                        c3.setEnabled(false);
                        renewField.setText("3000");
                        renewField.setEnabled(false);
                    } else {
                        c1.setEnabled(true);
                        c2.setEnabled(true);
                        c3.setEnabled(true);
                    }
                }
            }

        }

        if (e.getSource() == renewButton) {
            ((CardLayout) getLayout()).show(Insurance.this, "renew-screen");
        }

        if (e.getSource() == renewPayButton) {
            if (cbg.getSelectedCheckbox() == c1) {
                int x = JOptionPane.showOptionDialog(null, "Do you want to Renew ?", "HEALTH-CARE INSURANCE",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (x == 0) {
                    int j = Integer.parseInt(al.get(4));
                    j += 800;
                    al.set(4, String.valueOf(j));
                    if ((Integer.parseInt(al.get(4)) < 2400)) {
                        JOptionPane.showMessageDialog(this, "Policy Renewed", "HEALTH-CARE INSURANCE",
                                JOptionPane.INFORMATION_MESSAGE);
                        c1.setEnabled(false);
                        c2.setEnabled(false);
                        c3.setEnabled(false);
                        renewField.setText("800");
                        renewField.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "All Installment Paid", "HEALTH-CARE INSURANCE",
                                JOptionPane.INFORMATION_MESSAGE);
                        j = 0;
                        al.set(4, String.valueOf(j));
                        c1.setEnabled(true);
                        c2.setEnabled(true);
                        c3.setEnabled(true);
                    }
                }
            }

            if (cbg.getSelectedCheckbox() == c2) {
                int x = JOptionPane.showOptionDialog(null, "Do you want to Renew ?", "HEALTH-CARE INSURANCE",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (x == 0) {
                    int j = Integer.parseInt(al.get(4));
                    j += 1200;
                    al.set(4, String.valueOf(j));
                    if ((Integer.parseInt(al.get(4)) < 7200)) {
                        JOptionPane.showMessageDialog(this, "Policy Renewed", "HEALTH-CARE INSURANCE",
                                JOptionPane.INFORMATION_MESSAGE);
                        c1.setEnabled(false);
                        c2.setEnabled(false);
                        c3.setEnabled(false);
                        renewField.setText("1200");
                        renewField.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "All Installment Paid", "HEALTH-CARE INSURANCE",
                                JOptionPane.INFORMATION_MESSAGE);
                        j = 0;
                        al.set(4, String.valueOf(j));
                        c1.setEnabled(true);
                        c2.setEnabled(true);
                        c3.setEnabled(true);
                    }
                }
            }

            if (cbg.getSelectedCheckbox() == c3) {
                int x = JOptionPane.showOptionDialog(null, "Do you want to Renew ?", al.get(0),
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if (x == 0) {
                    int j = Integer.parseInt(al.get(4));
                    j += 3000;
                    al.set(4, String.valueOf(j));
                    if ((Integer.parseInt(al.get(4)) < 18000)) {
                        JOptionPane.showMessageDialog(this, "Policy Renewed", "HEALTH-CARE INSURANCE",
                                JOptionPane.INFORMATION_MESSAGE);
                        c1.setEnabled(false);
                        c2.setEnabled(false);
                        c3.setEnabled(false);
                        renewField.setText("3000");
                        renewField.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "All Installment Paid", "HEALTH-CARE INSURANCE",
                                JOptionPane.INFORMATION_MESSAGE);
                        j = 0;
                        al.set(4, String.valueOf(j));
                        c1.setEnabled(true);
                        c2.setEnabled(true);
                        c3.setEnabled(true);
                    }
                }
            }
        }

        if (e.getSource() == renewBackButton) {
            ((CardLayout) getLayout()).show(Insurance.this, "option-screen");
        }

        if (e.getSource() == logoutButton) {
            ((CardLayout) getLayout()).show(Insurance.this, "register-screen");
        }
    }

    public void itemStateChanged(ItemEvent e) {

    }
}