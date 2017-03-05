package views;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Franco on 03-Mar-17.
 */

public class Window extends JFrame {

    public Window(){

        setTitle("Main Menu");
        pack();
        setSize(400,400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panels
        JPanel mainPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        add(mainPanel);

        //Layouts
        BorderLayout borderLayout = new BorderLayout(50, 50);
        BoxLayout boxLayout = new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS);

        buttonPanel.setLayout(boxLayout);
        mainPanel.setLayout(borderLayout);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);


        //Box theBox = Box.createVerticalBox();


        //Buttons
        JButton start = new JButton("Start");
        start.setSize(new Dimension(40,40));


        JButton setting = new JButton("Settings");

        JButton exit = new JButton("Exit");

        buttonPanel.add(start);
        mainPanel.add(Box.createVerticalStrut(40));
        start.setPreferredSize(new Dimension(40,40));

        buttonPanel.add(setting);
        mainPanel.add(Box.createVerticalStrut(40));

        buttonPanel.add(exit);
        //theBox.add(Box.createHorizontalStrut(100));


        this.add(buttonPanel);


        //Label
        /*JLabel titulo = new JLabel("Titulo");
        mainPanel.add(titulo);

        mainPanel.add(start);
        mainPanel.add(setting);
        mainPanel.add(exit);
*/
    }

}