
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class AdminAccessPage extends JFrame {
    private JTabbedPane adminPane;
    private JPanel homePanel;
    private JPanel itemPanel, purchasePanel;
    private JPanel equipmentPanel;
    private JSplitPane memberPane;
    private JPanel memberPanel, menuPanel, memberContentPanel, registrationPanel, deregistrationPanel, memberStatusPanel;
    private JLabel welcomeMsg, maringoLabel;
    private JMenuBar memberMenu;
    private JMenuItem memberRegistration, memberDeregistration, memberStatus;
    
    //components in the memberRegistration panel
    private JTextField ageField, contactField, dobField, genderField, heightField, nameField, gameField;
    private JTextField nokField, specialField, subcountyField, weightField;
    private JLabel ageLabel, contactLabel, dobLabel, gameLabel, genderLabel, heightLabel, nameLabel;
    private JLabel nokLabel, specialLabel, subcountyLabel, weightLabel;
    private JButton clearButton, submitButton;

    public AdminAccessPage() {
        setSize(1200, 700);
        setBackground(Color.WHITE);
        getContentPane();
        
        adminPane = new JTabbedPane();
        adminPane.setBackground(Color.WHITE);
        homePanel = new JPanel();
        //homePanel.setBackground();
        memberPanel = new JPanel(new BorderLayout());
        memberPanel.setBackground(Color.WHITE);
        //the memberContentPanel will hold multiple panels using CardLayout
        memberContentPanel = new JPanel(new CardLayout());
        registrationPanel = new JPanel(new GridLayout(0,2));
        deregistrationPanel = new JPanel();
        memberStatusPanel = new JPanel();
        
        menuPanel = new JPanel();
        menuPanel.setPreferredSize(new Dimension(150,700));
        menuPanel.setBackground(new Color(60, 155, 230));
        memberMenu = new JMenuBar();
        memberRegistration = new JMenuItem();
        memberRegistration.setBackground(new Color(60, 155, 230));
        memberDeregistration = new JMenuItem();
        memberDeregistration.setBackground(new Color(60, 155, 230));
        memberStatus = new JMenuItem();
        memberStatus.setBackground(new Color(60, 155, 230));
        
        //memberPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menuPanel, memberContentPanel);
        //memberPane.setEnabled(true);
        //providing the minimum sizes of the two panels in the splitpane
        menuPanel.setMinimumSize(new Dimension(100,700));
        memberContentPanel.setMinimumSize(new Dimension(1050, 400));
        
        itemPanel = new JPanel(new FlowLayout());
        itemPanel.setBackground(Color.WHITE);
        equipmentPanel = new JPanel();
        equipmentPanel.setBackground(Color.WHITE);
        
        
        
        registrationPanel.setBackground(Color.LIGHT_GRAY);
        registrationPanel.setPreferredSize(new Dimension(1000,700));
        //Components in the member panel
        nameLabel = new JLabel();
        ageLabel = new JLabel();
        genderLabel = new JLabel();
        nokLabel = new JLabel();
        dobLabel = new JLabel();
        contactLabel = new JLabel();
        subcountyLabel = new JLabel();
        gameLabel = new JLabel();
        nameField = new JTextField(20);
        ageField = new JTextField(20);
        genderField = new JTextField(20);
        nokField = new javax.swing.JTextField(20);
        dobField = new JTextField(20);
        gameField = new JTextField(20);
        contactField = new JTextField(20);
        subcountyField = new JTextField(20);
        weightLabel = new JLabel();
        heightLabel = new JLabel();
        specialLabel = new JLabel();
        weightField = new JTextField(20);
        heightField = new JTextField(20);
        specialField = new JTextField(20);
        clearButton = new JButton();
        submitButton = new JButton();
        nameLabel.setText("Name");
        nameLabel.setToolTipText("Enter your full name");
        ageLabel.setText("age");
        genderLabel.setText("Gender");
        nokLabel.setText("Next of Kin");
        dobLabel.setText("DOB");
        contactLabel.setText("Contact");
        subcountyLabel.setText("Sub County");
        gameLabel.setText("Game of interest");
        weightLabel.setText("weight");
        heightLabel.setText("height");
        specialLabel.setText("special needs");
        clearButton.setText("Clear");
        submitButton.setText("Submit");
        
        //registrationPanel.setLayout(null);
        //nameLabel.setBounds(100, 100, 20, 5);
        
        registrationPanel.add(nameLabel);
        registrationPanel.add(nameField);
        registrationPanel.add(ageLabel);
        registrationPanel.add(ageField);
        registrationPanel.add(genderLabel);
        registrationPanel.add(genderField);
        registrationPanel.add(nokLabel);registrationPanel.add(nokField);
        registrationPanel.add(dobLabel);
        registrationPanel.add(dobField);
        registrationPanel.add(contactLabel);
        registrationPanel.add(contactField);
        registrationPanel.add(subcountyLabel);
        registrationPanel.add(subcountyField);
        registrationPanel.add(gameLabel);
        registrationPanel.add(gameField);
        registrationPanel.add(weightLabel);
        registrationPanel.add(weightField);
        registrationPanel.add(heightLabel);
        registrationPanel.add(heightField);
        registrationPanel.add(specialLabel);
        registrationPanel.add(specialField);
        
        
        
        
        //adding the various panels in the memberContentPanel
        memberContentPanel.add(registrationPanel);
        memberContentPanel.add(deregistrationPanel);
        memberContentPanel.add(memberStatusPanel);
        //when memberRegistration is clicked, then the member registration form appears
        memberRegistration.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout memberContentCards = (CardLayout)(memberContentPanel.getLayout());
                memberContentCards.next(registrationPanel);
               }
        });
        
        // when the user wants to deregister
        memberDeregistration.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout memberContentCards = (CardLayout)(memberContentPanel.getLayout());
                memberContentCards.next(deregistrationPanel);
               }
        });
        
        maringoLabel = new JLabel("MARINGO SPORTS CLUB");
        welcomeMsg = new JLabel();
        welcomeMsg.setIcon(new ImageIcon(getClass().getResource("/imagesPackage/homepageImage.png")));
        
        //I've created a menu bar to appear in the member panel.
        
        
        
        
        
        
        
        //I've created a panel that will have member registration details
        
        
        memberRegistration.setText("Registration");
        memberDeregistration.setText("Deregistration");
        memberStatus.setText("Membership status");
        memberMenu.add(memberRegistration);
        memberMenu.add(memberDeregistration);
        memberMenu.add(memberStatus);
        memberMenu.setLayout(new GridLayout(0,1));
        
        menuPanel.setSize(100,700);
        menuPanel.add(memberMenu);
        memberPanel.add(menuPanel, BorderLayout.WEST);
        memberPanel.add(registrationPanel, BorderLayout.EAST);
        
        
        
        adminPane.add("Homepage", homePanel);
        adminPane.add("Member details", memberPanel);
        adminPane.add("Items details", itemPanel);
        adminPane.add("Equipment details", equipmentPanel);
        
        
        
        
        
        //add( maringoLabel);
        homePanel.add(welcomeMsg);
        add(adminPane);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
