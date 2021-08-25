package com.Britechcompany;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Register extends JFrame /*implements ActionListener*/ {
    //de claration components
    JLabel lbluser,lblpass;
    JTextField txtuser;
    JPasswordField pass;
    JButton btnlogin,btncancel;
    GridLayout gl = new GridLayout(3,2,10,10);

    //String credentials[][]= {{"moenga","1234"},{"moenga","5678"}};

    public Register(){
        lbluser = new JLabel("USER");
        lblpass = new JLabel("PASSWORD");

        txtuser = new JTextField();
        pass = new JPasswordField();

        btnlogin = new JButton("Login");
       // btnlogin.addActionListener(this);
        btncancel = new JButton("Cancel");
      //  btncancel.addActionListener(this);


        add(lbluser);  add(lblpass);
        add(txtuser);  add(pass);
        add(btnlogin); add(btncancel);



        setTitle("Register");
        setLayout(gl);
        setDefaultCloseOperation(3);
        setSize(300,250);
        setVisible(true);
        setLocationRelativeTo(null);





    }

    public static void main(String[] args) {

        new Register();
    }
}
