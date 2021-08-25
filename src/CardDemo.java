// package LayoutsDemo;
// Java program to show Example of CardLayout. 
// in java. Importing different Package. 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// class extends JFrame 
public class CardDemo extends JFrame {

    // Initialization the value of 
    // current card is 1 . 
    private int currentCard = 1;

    // Declaration of objects  
    // of CardLayout class. 
    private CardLayout cl;
    FlowLayout flow;

    public CardDemo()
    {

        // Function to set visibility of JFrame 
        setTitle("Card Layout Example");

        // Function to set visibility of JFrame 
        setSize(400, 500);

        // Creating Object of "Jpanel" class 
        JPanel cardPanel = new JPanel();


        // Initialization of object "c1" 
        // of CardLayout class. 
        cl = new CardLayout();

        // set the layout 
        cardPanel.setLayout(cl);

        // Initialization of object  
        // "jp1" of JPanel class.
        flow = new FlowLayout();
        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.YELLOW);
        jp1.setSize(100,300);
        jp1.setLayout(flow);
        jp1.add(new JLabel("Enter"));
        jp1.add(new JTextField(20));
        jp1.add(new JButton("Button"));
        // Initialization of object  
        // "jp2" of CardLayout class.


        JPanel jp2 = new JPanel();
        FlowLayout fl;
        JPasswordField pass;

        fl = new FlowLayout();
        pass = new JPasswordField(20);
        jp2.setBackground(Color.RED);

        jp2.setLayout(fl);
        jp2.add(new JLabel("User"));
        jp2.add(new JTextField(20));
        jp2.add(new JLabel("password"));
        jp2.add(pass);
        jp2.add(new JButton("Login"));

        // Initialization of object  
        // "jp3" of CardLayout class. 
        JPanel jp3 = new JPanel();
        jp3.setBackground(Color.BLUE);
        // Initialization of object 
        // "jp4" of CardLayout class. 
        JPanel jp4 = new JPanel();
        jp4.setBackground(Color.GREEN);

        // Initialization of object 
        // "jl1" of JLabel class. 
        JLabel jl1 = new JLabel("Card1");

        // Initialization of object  
        // "jl2" of JLabel class. 
        JLabel jl2 = new JLabel("Card2");

        // Initialization of object  
        // "jl3" of JLabel class. 
        JLabel jl3 = new JLabel("Card3");

        // Initialization of object  
        // "jl4" of JLabel class. 
        JLabel jl4 = new JLabel("Card4");

        // Adding JPanel "jp1" on JFrame. 
        jp1.add(jl1);


        // Adding JPanel "jp2" on JFrame. 
        jp2.add(jl2);

        // Adding JPanel "jp3" on JFrame. 
        jp3.add(jl3);

        // Adding JPanel "jp4" on JFrame. 
        jp4.add(jl4);

        // Adding the cardPanel on "jp1" 
        cardPanel.add(jp1, "1");

        // Adding the cardPanel on "jp2" 
        cardPanel.add(jp2, "2");

        // Adding the cardPanel on "jp3" 
        cardPanel.add(jp3, "3");

        // Adding the cardPanel on "jp4" 
        cardPanel.add(jp4, "4");

        // Creating Object of "JPanel" class 
        JPanel buttonPanel = new JPanel();

        // Initialization of object  
        // "firstbtn" of JButton class. 
        JButton firstBtn = new JButton("First");

        // Initialization of object 
        // "nextbtn" of JButton class. 
        JButton nextBtn = new JButton("Next");

        // Initialization of object 
        // "previousbtn" of JButton class. 
        JButton previousBtn = new JButton("Previous");

        // Initialization of object  
        // "lastbtn" of JButton class. 
        JButton lastBtn = new JButton("Last");

        // Adding JButton "firstbtn" on JFrame. 
        buttonPanel.add(firstBtn);

        // Adding JButton "nextbtn" on JFrame. 
        buttonPanel.add(nextBtn);

        // Adding JButton "previousbtn" on JFrame. 
        buttonPanel.add(previousBtn);

        // Adding JButton "lastbtn" on JFrame. 
        buttonPanel.add(lastBtn);

        // add firstbtn in ActionListener 
        firstBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {

                // used first c1 CardLayout 
                cl.first(cardPanel);

                // value of currentcard is 1 
                currentCard = 1;
            }
        });

        // add lastbtn in ActionListener 
        lastBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {

                // used last c1 CardLayout 
                cl.last(cardPanel);

                // value of currentcard is 4 
                currentCard = 4;
            }
        });

        // add nextbtn in ActionListener 
        nextBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.next(cardPanel);

            }
        });

        // add previousbtn in ActionListener 
        previousBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                cl.previous(cardPanel);
            }
        });

        // used to get content pane 
        add(cardPanel);

        // used to get content pane 
        add(buttonPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Main Method 
    public static void main(String[] args)
    {

        // Creating Object of CardLayoutDemo class. 
        new CardDemo();

    }
} 