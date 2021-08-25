import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Components {
    Components() {

    JLabel l = new JLabel("USER NAME:");// done
    JLabel l = new JLabel("PASS WORD:");
    JTextField tf = new JTextField();
    JButton b = new JButton("OK");
    JTextArea area = new JTextArea();
    //set bounderies
    l.setBounds(10,20,80,20);
    tf.setBounds(170,60,200,20);//password column
    area.setBounds(10,60,80,20);//user name column
    b.setBounds(150,175,100,40);// setting the OK button


    //declairing the frame
    JFrame f = new JFrame();

    f.add(l);
    f.add(tf);
    f.add(b);
    f.add(area);
    f.setSize(420,400);
    f.setLayout(null);
    ImageIcon image = new ImageIcon("MOENGA.jpg");
    //f.setIconImages(image.getImage()); // chage icon image of the frame
    l.setIcon(image);
    f.setVisible(true);
}

    public static void main(String[] args) {
        new Components();
    }
}

