package Users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutorizationGUI extends JFrame{

    private JFrame autor;
    private JPasswordField passwordField1;
    private JTextField textField1;

    public AutorizationGUI() throws HeadlessException {
        autor = new JFrame();

        autor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        autor.setMinimumSize(new Dimension(300,150));
        autor.setLocation(300,300);

        autor.getContentPane().add(addJPanelAutorization());
        autor.pack();
        autor.setVisible(true);
    }

    private JPanel addJPanelAutorization(){

        JPanel autorizaton = new JPanel();
        autorizaton.setLayout(new GridBagLayout());

        JLabel lLogin = new JLabel("Login: ");
        JTextField tfLogin = new JTextField(20);

        JLabel lPassword = new JLabel("Password: ");
        JPasswordField tfPassword = new JPasswordField(20);

        JButton jbLogin = new JButton("Login");
        jbLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" RUN LOGIN ");
            }
        });

        JButton jbRegistration = new JButton("Registration");
        jbRegistration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" Run Registration ");
            }
        });

        autorizaton.add(lLogin, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));
        autorizaton.add(tfLogin, new GridBagConstraints(1, 1, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));

        autorizaton.add(lPassword, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));
        autorizaton.add(tfPassword, new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));

        autorizaton.add(jbLogin, new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));
        autorizaton.add(jbRegistration, new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 120, 0, 0), 0, 0));

        return autorizaton;
    }
}
