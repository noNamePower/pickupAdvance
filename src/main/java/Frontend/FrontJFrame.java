package Frontend;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Front extends JFrame{

        public Front()
        {
            super("PickupAdvance");
            setDefaultCloseOperation(EXIT_ON_CLOSE);

//Create a panel and add components to it.
            JPanel contentPane = new JPanel();
            JTextField test = new JTextField("käsebrot");

       /*     test.setName("salz");
            test.setSize(100,100);
            test.setVisible(true);*/
/*
            contentPane.add(test);
            setContentPane(contentPane);
*/
            setSize(600, 600);
            setVisible(true);
        }
    }



