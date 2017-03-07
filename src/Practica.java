import javax.swing.*;
import java.awt.*;

/**
 * Created by Usuario on 02-Mar-17.
 */
public class Practica extends JFrame {

    public Practica(){
        super("Main Menu");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel label = new JLabel("Hola Masu");
        cp.add(label);

    }



//    private static void Window(){
//        JFrame frame = new JFrame("HowToHeroes");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel();
//        frame.add(panel);
//        JLabel label = new JLabel("Heroes of the dorm");
//        panel.add(label);
//
//        frame.pack();
//        frame.setVisible(true);
//        frame.setSize(400,400);
//        frame.setLocationRelativeTo(null);
//
//        JButton button1 = new JButton("Load Game");
//        panel.add(button1);
//
//    }

    //public static void main(String[] args){Window();

}