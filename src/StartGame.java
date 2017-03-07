import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Usuario on 06-Mar-17.
 */
public class StartGame extends JFrame {
    public StartGame(){
        //JFrame
        this.setTitle("The Legend of Zelda Breath of the wild");
        this.setSize(250,350);
        //this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //JPanel
        JPanel thePanel = new JPanel();
        this.add(thePanel);

        //Layout
        BoxLayout boxLayout = new BoxLayout(thePanel,BoxLayout.Y_AXIS);
        thePanel.setLayout(boxLayout);

        JPanel imagePanel = new JPanel();
        thePanel.add(imagePanel);
        ImageIcon zelda = new ImageIcon(getClass().getResource("zelda2.jpg"));

        JLabel label = new JLabel(zelda);
        imagePanel.add(label);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(200,40));
        thePanel.add(buttonPanel);
        JButton back = new JButton("Back");
        back.setPreferredSize(new Dimension(200,40));
        buttonPanel.add(back);

        ActionListener goBack = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window window = new Window();
                window.setVisible(true);
                hide();
            }
        };
        back.addActionListener(goBack);

    }
}
