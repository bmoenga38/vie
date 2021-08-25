/**
 *
 */

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author #Kinyanjui Macharia
 * @version 2.0 Designed to be better than the first
 * @since 29th March 2019
 *
 */
public class Login_2DArray extends JFrame implements ActionListener {

    /**
     *
     */

    JLabel lblUser, lblPass;
    JTextField txtUser;
    JPasswordField txtPass;
    JButton butLogin, butCancel;
    GridLayout gl=new GridLayout(3,2,10,10);
    String credentials[][]={{"Brian", "123"},
            {"Carson", "456"},
            {"David", "789"},
            {"Gidie", "0102"},
            {"Patri","0304"}
    };


    public Login_2DArray() {

        lblUser=new JLabel("Username");
        lblPass=new JLabel("Password");

        txtUser=new JTextField();
        txtPass=new JPasswordField();

        butLogin=new JButton("Login");
        butLogin.addActionListener(this);
        butCancel=new JButton("Cancel");
        butCancel.addActionListener(this);

        add(lblUser); add(txtUser);
        add(lblPass); add(txtPass);
        add(butLogin); add(butCancel);

        setTitle("Login");
        setLayout(gl);
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    /*
     * @param
     * Method name: authenticate
     * Purpose: as the name suggests, it checks whether the username and password supplied are
     * what is in the array
     */

    boolean authenticate(){

        String user=txtUser.getText();
        String pass=String.valueOf(txtPass.getPassword());
        int j;

        if(user.equals("") && pass.equals("")){
            JOptionPane.showMessageDialog(null, "Username and password fields cannot be empty."
                    + " Please insert correct information!");
        }

        else

            for(j=0; j<5; j++){
                if(credentials[j][0].equals(user) && credentials[j][1].equals(pass)){
                    JOptionPane.showMessageDialog(null, "user located at  row "+(j+1)+
                            " \n\n Login Succeful!" );

                    break;
                }//if

                /*
                 * Loops all the way to the last row
                 * if the value in username field or password field is not found, it will display
                 * the "cannot connect" dialog
                 */
                if(j==4)
                    JOptionPane.showMessageDialog(null, "cannot connect\n"+"wrong credentials\n" );

            }//for

        return true;
    }

    public static void main(String[] args) {
        new Login_2DArray();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();

        if(source==butLogin){

            authenticate();

        }else{
            dispose();
        }

    }

}
