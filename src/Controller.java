import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Usuario on 07-Mar-17.
 */
public class Controller implements ActionListener{

    private Window window;
    private SettingWindow settingWindow;
    private StartGame startGame;

    public Controller(){
        window = new Window(this);
        settingWindow = new SettingWindow(this);
        startGame = new StartGame(this);
        window.setVisible(true);
        startGame.setVisible(false);
        settingWindow.setVisible(false);


    }
    public void actionPerformed(ActionEvent e) {
        Object button = e.getSource();
        if(button.equals(startGame.back) ||(button.equals(settingWindow.back)) ){
            window.setVisible(true);
            window.setLocationRelativeTo(null);
            startGame.setVisible(false);
            settingWindow.setVisible(false);
        }
        if(button.equals(window.exit)){
            System.exit(0);
        }
        if(button.equals(window.settings)){
            settingWindow.setVisible(true);
            settingWindow.setLocationRelativeTo(null);
            window.setVisible(false);
        }
        if(button.equals(window.start)){
            startGame.setVisible(true);
            startGame.setLocationRelativeTo(null);
            window.setVisible(false);
        }

    }


}
