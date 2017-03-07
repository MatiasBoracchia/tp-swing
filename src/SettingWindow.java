import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Usuario on 05-Mar-17.
 */

public class SettingWindow extends JFrame {
    public SettingWindow(){

        //JFrame
        this.setTitle("Settings");
        this.setSize(250,250);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //JPanel
        JPanel thePanel = new JPanel();
        this.add(thePanel);


        //Layout
        BoxLayout boxLayout = new BoxLayout(thePanel,BoxLayout.PAGE_AXIS);
        thePanel.setLayout(boxLayout);

        //Buttons & Labels
        JLabel settings = new JLabel("Settings");
        JLabel sound = new JLabel("Sound:");
        JRadioButton soundRadioButtons1 = new JRadioButton("On");
        JRadioButton soundRadioButtons2 = new JRadioButton("Off");
        JLabel music = new JLabel("Music:");
        JRadioButton musicRadioButtons1 = new JRadioButton("On");
        JRadioButton musicRadioButtons2 = new JRadioButton("Off");
        JLabel graphics = new JLabel("Graphics:");
        JCheckBox graphicsCheckBox1 = new JCheckBox("Shadows");
        JCheckBox graphicsCheckBox2 = new JCheckBox("Anti-aliasing");
        JButton back = new JButton("Back");
        back.setSize(100,40);

        //Sub Panels and ButtonGroups(For not having both buttons activated)
        JPanel settingsPanel = new JPanel();
        thePanel.add(settingsPanel);
        settingsPanel.add(settings);
        ButtonGroup soundGroup = new ButtonGroup();
        soundGroup.add(soundRadioButtons1);
        soundGroup.add(soundRadioButtons2);

        ButtonGroup musicGroup = new ButtonGroup();
        musicGroup.add(musicRadioButtons1);
        musicGroup.add(musicRadioButtons2);

        JPanel soundPanel = new JPanel();
        soundPanel.add(sound);
        soundPanel.add(soundRadioButtons1);
        soundPanel.add(soundRadioButtons2);
        soundRadioButtons1.setSelected(true);


        JPanel musicPanel = new JPanel();
        musicPanel.add(music);
        musicPanel.add(musicRadioButtons1);
        musicPanel.add(musicRadioButtons2);
        musicRadioButtons2.setSelected(true);

        JPanel graphicPanel = new JPanel();

        graphicPanel.add(graphics);
        graphicPanel.setPreferredSize(new Dimension(250, 30));
        graphicPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        graphicPanel.add(Box.createHorizontalStrut(130));

        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(graphicsCheckBox1);
        checkBoxPanel.add(graphicsCheckBox2);



        graphicsCheckBox1.setSelected(true);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(back);
        buttonPanel.setPreferredSize(new Dimension(250,50));
        back.setPreferredSize(new Dimension(200,40));


        thePanel.add(soundPanel);
        thePanel.add(musicPanel);
        thePanel.add(graphicPanel);
        thePanel.add(checkBoxPanel);
        thePanel.add(buttonPanel);

        //ActionListener
        ActionListener printConfiguration = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<AbstractButton> array = new ArrayList<>();
                ArrayList<AbstractButton> array2 = new ArrayList<>();
                ArrayList<String> array3 = new ArrayList<>();
                array.add(soundRadioButtons1);
                array.add(soundRadioButtons2);
                array.add(musicRadioButtons1);
                array.add(musicRadioButtons2);
                array.add(graphicsCheckBox1);
                array.add(graphicsCheckBox2);

                for(int i=0;i<4;i++){
                    if(array.get(i).isSelected()){
                        array2.add(array.get(i));
                    }

                }
                for(int i=4;i<array.size();i++){
                    if(array.get(i).isSelected()){
                        array3.add("On");
                    }else{
                        array3.add("Off");
                    }

                }
                    System.out.println("Sound:"+array2.get(0).getText()+", "+"Music:"+array2.get(1).getText()+
                            ", "+"Shadows:"+array3.get(0)+ ", "+"Anti-aliasing:"+array3.get(1));

            }
        };

        soundRadioButtons1.addActionListener(printConfiguration);
        soundRadioButtons2.addActionListener(printConfiguration);
        musicRadioButtons1.addActionListener(printConfiguration);
        musicRadioButtons2.addActionListener(printConfiguration);
        graphicsCheckBox1.addActionListener(printConfiguration);
        graphicsCheckBox2.addActionListener(printConfiguration);

        ActionListener goBack = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Window window = new Window();
                window.setVisible(true);
                hide();

            }
        };
        back.addActionListener(goBack);
        //back.addActionListener(new GoBack());
    }
}
