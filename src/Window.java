import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Usuario on 03-Mar-17.
 */
public class Window extends JFrame {
    public Window(){
        this.setTitle("Main Menu");
        this.pack();
        this.setSize(400,400);
        this.setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Panel
        JPanel panel = new JPanel();
        this.add(panel);
        //BoxLayout
         BoxLayout boxLayout = new BoxLayout(panel,BoxLayout.PAGE_AXIS);
        panel.setLayout(boxLayout);

        //Box theBox = Box.createVerticalBox();


        //Buttons
        JButton start = new JButton("Start");
        start.setSize(new Dimension(40,40));


        JButton setting = new JButton("Setting");

        JButton exit = new JButton("Exit");

        panel.add(start);
        panel.add(Box.createVerticalStrut(40));
        start.setPreferredSize(new Dimension(40,40));

        panel.add(setting);
        panel.add(Box.createVerticalStrut(40));

        panel.add(exit);
        //theBox.add(Box.createHorizontalStrut(100));


        this.add(panel);


        //Label
        /*JLabel titulo = new JLabel("Titulo");
        panel.add(titulo);

        panel.add(start);
        panel.add(setting);
        panel.add(exit);
*/
        ActionListener goToSettings = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SettingWindow settings = new SettingWindow();
                settings.setVisible(true);
                hide();
            }
        };
        setting.addActionListener(goToSettings);
    }
}
