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
        JPanel titlePanel = new JPanel();
        add(mainPanel);

        //Layouts
        BorderLayout borderLayout = new BorderLayout();
        BoxLayout buttonBox = new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS);
        BoxLayout textBox = new BoxLayout(titlePanel, BoxLayout.PAGE_AXIS);

        buttonPanel.setLayout(buttonBox);
        titlePanel.setLayout(textBox);
        mainPanel.setLayout(borderLayout);
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        //Labels
        JLabel title = new JLabel("Trabajo Práctico Swing");
        JLabel subtitle = new JLabel("por Matías Boracchia y Franco Palumbo");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        titlePanel.add(title);
        titlePanel.add(subtitle);

        //Buttons
        JButton start = new JButton("Start");
        JButton settings = new JButton("Settings");
        JButton exit = new JButton("Exit");
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        settings.setAlignmentX(Component.CENTER_ALIGNMENT);
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonPanel.add(start);
        buttonPanel.add(settings);
        buttonPanel.add(exit);

    }

}