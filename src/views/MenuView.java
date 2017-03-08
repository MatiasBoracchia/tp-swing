package views;

import controllers.NavigationController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Matias on 03-Mar-17.
 */
public class MenuView extends JFrame {

    public JButton start;
    public JButton settings;
    public JButton exit;

    public MenuView(NavigationController navigationController) {

        // ----- Main Frame -----
        setTitle("Main Menu");
        pack();
        setSize(300, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ----- Main Panel -----
        JPanel mainPanel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        mainPanel.setLayout(borderLayout);

        // ----- Title Panel -----
        JPanel titlePanel = new JPanel();
        BoxLayout textBox = new BoxLayout(titlePanel, BoxLayout.PAGE_AXIS);
        titlePanel.setLayout(textBox);

        // ----- Title Panel Content -----
        JLabel title = new JLabel("Trabajo Práctico Swing");
        title.setFont(new Font("Helvetica", Font.BOLD, 24));
        JLabel subtitle = new JLabel("por Matías Boracchia y Franco Palumbo");
        subtitle.setFont(new Font("Helvetica", Font.BOLD, 12));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        titlePanel.add(title);
        titlePanel.add(subtitle);

        // ----- Button Panel -----
        JPanel buttonPanel = new JPanel();
        BoxLayout buttonBox = new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS);
        buttonPanel.add(Box.createVerticalStrut(35));
        buttonPanel.setLayout(buttonBox);

        // ----- Button Panel Content -----
        start = new JButton("Start Game");
        settings = new JButton("Settings");
        exit = new JButton("Exit");
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        start.setPreferredSize(new Dimension(200, 30));
        start.setMaximumSize(new Dimension(200, 30));
        start.setMinimumSize(new Dimension(200, 30));
        settings.setAlignmentX(Component.CENTER_ALIGNMENT);
        settings.setMaximumSize(start.getMinimumSize());
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
        exit.setMaximumSize(start.getMinimumSize());

        buttonPanel.add(start);
        buttonPanel.add(Box.createVerticalStrut(20));
        buttonPanel.add(settings);
        buttonPanel.add(Box.createVerticalStrut(20));
        buttonPanel.add(exit);
        buttonPanel.add(Box.createVerticalStrut(20));

        // ----- Main Panel Content -----
        add(mainPanel);
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // ----- Listeners -----
        start.addActionListener(navigationController);
        settings.addActionListener(navigationController);
        exit.addActionListener(navigationController);

    }

}
