import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Assignment {
    Assignment(){
    JLabel l= new JLabel("User name");
    JTextField tf= new JTextField();
    JButton b=new JButton("ok");
    JTextArea area=new JTextArea();
    l.setBounds(0,0,80,20);
    tf.setBounds(0,30,80,20);
    b.setBounds(0,60,80,20);


    JLabel l2= new JLabel("password");
    JTextField jtf= new JTextField();
    JButton jb=new JButton("cancel");
    JTextArea jarea=new JTextArea();
    l2.setBounds(100,0,80,20);
    jtf.setBounds(100,30,80,20);
    jb.setBounds(100,60,80,20);
    //declare JFrame
    JFrame f=new JFrame();
    f.add(l);
    f.add(l2);
    f.add(jtf);
    f.add(tf);
    f.add(b);
    f.add(jb);
    f.setLayout(null);
    f.setSize(500,450);
    f.setVisible(true);
}

    public static void main(String[] args) {
        new Assignment();
    }
}

