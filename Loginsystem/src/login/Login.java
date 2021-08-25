package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton btnLogin,btnCancel;
    JLabel labelUsername, labelPassword;
    JTextField fduser;
    JPasswordField pass;
    String [][] names = {
            {"Brian","patric"},
            {"1234","5678"}
    };
    public Login(){
        setTitle("login System");
        setSize(500,200);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3,2));
        labelUsername = new JLabel("User Name");
        add(labelUsername);
        fduser = new JTextField();
        add(fduser);
        labelPassword = new JLabel("Password");
        add(labelPassword);
        pass = new JPasswordField();
        add(pass);
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        add(btnLogin);
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(this);
        add(btnCancel);




        setVisible(true);

    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnLogin){
            for(int i=0; i<names.length;i++){
                for (int j = 0;j<names[i].length; j++)
                    if (fduser.getText().toString().equals(names[i][j])){
                        JOptionPane.showMessageDialog(null,"Welcome");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Wrong cridentials");


                }

            }

        }

    }

