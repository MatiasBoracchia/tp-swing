package controllers;

import views.GameView;
import views.MenuView;
import views.SettingsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Franco on 07-Mar-17.
 */
public class NavigationController implements ActionListener {

    private MenuView menu;
    private SettingsView settings;
    private GameView startGame;

    public NavigationController() {
        menu = new MenuView(this);
        settings = new SettingsView(this);
        startGame = new GameView(this);
        menu.setVisible(true);
        startGame.setVisible(false);
        settings.setVisible(false);
    }

    /**
     * Listener that handles the visibility of the different views when a button is pressed inside the settings, menu or game views
     */
    public void actionPerformed(ActionEvent e) {

        Object button = e.getSource();
        if (button.equals(startGame.back) || (button.equals(settings.back))) {
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            startGame.setVisible(false);
            settings.setVisible(false);
        }
        if (button.equals(menu.exit)) {
            System.exit(0);
        }
        if (button.equals(menu.settings)) {
            settings.setVisible(true);
            settings.setLocationRelativeTo(null);
            menu.setVisible(false);
        }
        if (button.equals(menu.start)) {
            startGame.setVisible(true);
            startGame.setLocationRelativeTo(null);
            menu.setVisible(false);
        }

    }

}
