package controllers;

import views.GameWindow;
import views.MenuWindow;
import views.SettingsWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Usuario on 07-Mar-17.
 */

public class Controller implements ActionListener {

    private MenuWindow window;
    private SettingsWindow settings;
    private GameWindow startGame;

    public Controller() {
        window = new MenuWindow(this);
        settings = new SettingsWindow(this);
        startGame = new GameWindow(this);
        window.setVisible(true);
        startGame.setVisible(false);
        settings.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {

        Object button = e.getSource();
        if (button.equals(startGame.back) || (button.equals(settings.back))) {
            window.setVisible(true);
            window.setLocationRelativeTo(null);
            startGame.setVisible(false);
            settings.setVisible(false);
        }
        if (button.equals(window.exit)) {
            System.exit(0);
        }
        if (button.equals(window.settings)) {
            settings.setVisible(true);
            settings.setLocationRelativeTo(null);
            window.setVisible(false);
        }
        if (button.equals(window.start)) {
            startGame.setVisible(true);
            startGame.setLocationRelativeTo(null);
            window.setVisible(false);
        }

    }

}
