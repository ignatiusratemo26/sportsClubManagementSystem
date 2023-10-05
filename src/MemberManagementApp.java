import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemberManagementApp {
    private JFrame frame;
    private JPanel menuPanel;
    private JPanel contentPanel;

    public MemberManagementApp() {
        frame = new JFrame("Member Management App");
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(3, 1));
        JButton registerButton = new JButton("1. Member Registration");
        JButton deregisterButton = new JButton("2. Member Deregistration");
        JButton statusButton = new JButton("3. Member Status");

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayPanel("Member Registration Panel");
            }
        });

        deregisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayPanel("Member Deregistration Panel");
            }
        });

        statusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayPanel("Member Status Panel");
            }
        });

        menuPanel.add(registerButton);
        menuPanel.add(deregisterButton);
        menuPanel.add(statusButton);

        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to Member Management App");
        contentPanel.add(welcomeLabel, BorderLayout.CENTER);

        frame.add(menuPanel, BorderLayout.WEST);
        frame.add(contentPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void displayPanel(String panelName) {
        contentPanel.removeAll();
        JLabel panelLabel = new JLabel(panelName);
        contentPanel.add(panelLabel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MemberManagementApp();
            }
        });
    }
}
