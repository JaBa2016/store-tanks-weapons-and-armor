package Users;

import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 777 on 28.06.2016.
 */
public class View extends JPanel {
    private Buffer buffer;
    public final int kx = 100, ky = 100; //scale factors, not used yet


    public View(Buffer buffer){
        this.buffer = buffer;

        JFrame frame = new JFrame("STORE Name");
        minmumFrameDimension(frame);
        setCenterPosition(frame, Toolkit.getDefaultToolkit().getScreenSize());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(frame.getWidth()-16,frame.getHeight()-39);
        this.setLayout(null);
        JButton jb = new JButton("Test");
        jb.setSize(100, 50);
        jb.setLocation(0, 50);
        JPanel jp = addJPanelAutorization(this.buffer);
        setCenterPosition(jp, new Dimension(frame.getWidth(), frame.getHeight()));
        this.add(jp);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }

    private static void setCenterPosition(Container frame, Dimension dimension) {
        Dimension screenSize = dimension;
        Dimension frameSize = frame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        frame.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
    }
    private static void minmumFrameDimension(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setMinimumSize(new Dimension((int)(screenSize.getWidth()*0.7), (int)(screenSize.getHeight()*0.8)));
    }

    public static JPanel addJPanelAutorization(Buffer buffer){

        JPanel autorizaton = new JPanel();
        autorizaton.setLocation(0,0);
        autorizaton.setSize(300,200);
        autorizaton.setBackground(Color.PINK);
        autorizaton.setLayout(new GridBagLayout());
        autorizaton.setBorder(new BorderUIResource.LineBorderUIResource(Color.BLACK));
        JLabel lLogin = new JLabel("Enter login: ");
        JTextField tfLogin = new JTextField(20);

        JLabel lPassword = new JLabel("Enter password: ");
        JPasswordField jpPassword = new JPasswordField(20);

        JButton jbLogin = new JButton("Login");
        jbLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = tfLogin.getText();
                String password = jpPassword.getText();
                Authorization autor = new Authorization(login, password, buffer);



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
        autorizaton.add(tfLogin, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));

        autorizaton.add(lPassword, new GridBagConstraints(0, 3, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));
        autorizaton.add(jpPassword, new GridBagConstraints(0, 4, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));

        autorizaton.add(jbLogin, new GridBagConstraints(0, 5, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 0, 0, 0), 0, 0));
        autorizaton.add(jbRegistration, new GridBagConstraints(0, 5, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(5, 120, 0, 0), 0, 0));

        return autorizaton;
    }


}
