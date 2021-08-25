import javax.swing.*;
import java.awt.Color;

    class Demo1 extends JFrame{

        JButton bn=new JButton("USER");
        JTextField txt=new JTextField("Name Here:");

        Demo1(){
            setTitle("ASS"); //JFrame Title:
            setSize(500,500); //JFrame size or dimentionals
            setLocation(250,350);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            getContentPane().setBackground(Color.GREEN);
            setLayout(null);
            bn.setBounds(20,20,120,30);
            txt.setBounds(10,75,150,30);


            add(bn);
            add(txt);
            ImageIcon image = new ImageIcon("MOENGA.jpg");

            setVisible(true);

        }
        public static void main(String args[]){
            new Demo1();
        }
    }


