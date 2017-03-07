import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Usuario on 06-Mar-17.
 */
public class GoBack implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Window window = new Window();
        window.setVisible(true);

    }
}
