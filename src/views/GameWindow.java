package views;

import controllers.Controller;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Usuario on 06-Mar-17.
 */

public class GameWindow extends JFrame {

    public JButton back;

    public GameWindow(Controller controller) {

        //JFrame
        this.setTitle("The Legend of Zelda");
        this.setSize(250, 350);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //JPanel
        JPanel thePanel = new JPanel();
        this.add(thePanel);

        //Layout
        BoxLayout boxLayout = new BoxLayout(thePanel, BoxLayout.Y_AXIS);
        thePanel.setLayout(boxLayout);

        JPanel imagePanel = new JPanel();
        thePanel.add(imagePanel);

        ImageIcon zelda = new ImageIcon(getClass().getResource("../assets/zelda2.jpg"));

        JLabel label = new JLabel(zelda);
        imagePanel.add(label);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(200, 40));
        thePanel.add(buttonPanel);
        back = new JButton("Back");
        back.setPreferredSize(new Dimension(200, 40));
        buttonPanel.add(back);

        back.addActionListener(controller);

    }

}
