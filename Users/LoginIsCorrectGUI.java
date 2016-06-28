package Users;

import javax.swing.*;
import java.awt.*;

public class LoginIsCorrectGUI extends JFrame{

    private JButton button;

    public LoginIsCorrectGUI() throws HeadlessException {
        JFrame f = new JFrame("All OK");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setMinimumSize(new Dimension(300,200));
        f.setLocation(300,300);

        button = new JButton("Информация");

        f.getContentPane().add(button);
        f.pack();
        f.setVisible(true);
    }
}
