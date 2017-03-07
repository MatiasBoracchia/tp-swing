import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Usuario on 03-Mar-17.
 */
public class Window extends JFrame {
    JButton start;
    JButton settings;
    JButton exit;
    public Window(Controller controller){
        setTitle("Main Menu");
        pack();
        setSize(300,250);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panels
        JPanel mainPanel = new JPanel();

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(Box.createVerticalStrut(35));
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
        title.setFont(new Font("Helvetica",Font.BOLD,24));
        JLabel subtitle = new JLabel("por Matías Boracchia y Franco Palumbo");
        subtitle.setFont(new Font("Helvetica",Font.BOLD,12));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        titlePanel.add(title);
        titlePanel.add(subtitle);

        //Buttons
        start = new JButton("Start");
        settings = new JButton("Settings");
        exit = new JButton("Exit");
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        start.setPreferredSize(new Dimension(200,30));
        start.setMaximumSize(new Dimension(200,30));
        start.setMinimumSize(new Dimension(200,30));
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

        start.addActionListener(controller);
        settings.addActionListener(controller);
        exit.addActionListener(controller);

    }
}
