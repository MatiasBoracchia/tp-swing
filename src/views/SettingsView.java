package views;

import controllers.NavigationController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Matias on 05-Mar-17.
 */
public class SettingsView extends JFrame {

    public JButton back;

    public SettingsView(NavigationController navigationController) {

        // ----- Main Frame -----
        this.setTitle("Settings");
        this.setSize(250, 350);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // ----- Main Panel -----
        JPanel thePanel = new JPanel();
        this.add(thePanel);
        BoxLayout boxLayout = new BoxLayout(thePanel, BoxLayout.PAGE_AXIS);
        thePanel.setLayout(boxLayout);

        // ----- Title Panel Content -----
        JLabel settings = new JLabel("Settings");

        // ----- Title Panel -----
        JPanel settingsPanel = new JPanel();
        thePanel.add(settingsPanel);
        settingsPanel.add(settings);

        // ----- Sound Panel Content -----
        JLabel sound = new JLabel("Sound:");
        JRadioButton soundRadioButtons1 = new JRadioButton("On");
        final JRadioButton soundRadioButtons2 = new JRadioButton("Off");

        // ----- Sound Panel Button Group -----
        ButtonGroup soundGroup = new ButtonGroup();
        soundGroup.add(soundRadioButtons1);
        soundGroup.add(soundRadioButtons2);

        // ----- Sound Panel -----
        JPanel soundPanel = new JPanel();
        soundPanel.add(sound);
        soundPanel.add(soundRadioButtons1);
        soundPanel.add(soundRadioButtons2);
        soundRadioButtons1.setSelected(true);

        // ----- Music Panel Content -----
        JLabel music = new JLabel("Music:");
        final JRadioButton musicRadioButtons1 = new JRadioButton("On");
        final JRadioButton musicRadioButtons2 = new JRadioButton("Off");

        // ----- Music Panel Button Group -----
        ButtonGroup musicGroup = new ButtonGroup();
        musicGroup.add(musicRadioButtons1);
        musicGroup.add(musicRadioButtons2);

        // ----- Music Panel -----
        JPanel musicPanel = new JPanel();
        musicPanel.add(music);
        musicPanel.add(musicRadioButtons1);
        musicPanel.add(musicRadioButtons2);
        musicRadioButtons2.setSelected(true);

        // ----- Graphic Panel Content -----
        JLabel graphics = new JLabel("Graphics:");
        final JCheckBox graphicsCheckBox1 = new JCheckBox("Shadows");
        final JCheckBox graphicsCheckBox2 = new JCheckBox("Anti-aliasing");

        // ----- Graphics Title Panel -----
        JPanel graphicPanel = new JPanel();
        graphicPanel.add(graphics);
        graphicPanel.setPreferredSize(new Dimension(250, 30));
        graphicPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        graphicPanel.add(Box.createHorizontalStrut(130));

        // ----- Graphics Check Box Panel -----
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(graphicsCheckBox1);
        checkBoxPanel.add(graphicsCheckBox2);
        graphicsCheckBox1.setSelected(true);

        // ----- Back Button Panel Content -----
        back = new JButton("Back");
        back.setSize(100, 40);

        // ----- Back Button Panel -----
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(back);
        buttonPanel.setPreferredSize(new Dimension(250, 50));
        back.setPreferredSize(new Dimension(200, 40));

        // ----- Main Panel Content -----
        thePanel.add(soundPanel);
        thePanel.add(musicPanel);
        thePanel.add(graphicPanel);
        thePanel.add(checkBoxPanel);
        thePanel.add(buttonPanel);

        /**
         * Listener that prints all the settings once one of them is changed
         */
        ActionListener printConfiguration = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<AbstractButton> array = new ArrayList<AbstractButton>();
                ArrayList<AbstractButton> array2 = new ArrayList<AbstractButton>();
                ArrayList<String> array3 = new ArrayList<String>();
                array.add(soundRadioButtons1);
                array.add(soundRadioButtons2);
                array.add(musicRadioButtons1);
                array.add(musicRadioButtons2);
                array.add(graphicsCheckBox1);
                array.add(graphicsCheckBox2);
                for (int i = 0; i < 4; i++) {
                    if (array.get(i).isSelected()) {
                        array2.add(array.get(i));
                    }
                }
                for (int i = 4; i < array.size(); i++) {
                    if (array.get(i).isSelected()) {
                        array3.add("On");
                    } else {
                        array3.add("Off");
                    }
                }
                System.out.println("Sound:" + array2.get(0).getText() + ", " + "Music:" + array2.get(1).getText() + ", " + "Shadows:" + array3.get(0) + ", " + "Anti-aliasing:" + array3.get(1));
            }
        };

        // ----- Listeners -----
        soundRadioButtons1.addActionListener(printConfiguration);
        soundRadioButtons2.addActionListener(printConfiguration);
        musicRadioButtons1.addActionListener(printConfiguration);
        musicRadioButtons2.addActionListener(printConfiguration);
        graphicsCheckBox1.addActionListener(printConfiguration);
        graphicsCheckBox2.addActionListener(printConfiguration);

        back.addActionListener(navigationController);

    }

}
