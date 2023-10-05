
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class AdminAccessPage1 extends JFrame {
    private JTabbedPane adminPane;
    private JPanel homePanel;
    private JPanel itemPanel, purchasePanel;
    private JPanel equipmentPanel;
    private JSplitPane memberPane;
    private JPanel memberPanel, menuPanel, memberContentPanel, registrationPanel, deregistrationPanel, memberStatusPanel, regButtonPanel;
    private JLabel welcomeMsg, maringoLabel;
    private JMenuBar memberMenu;
    private JMenuItem memberRegistration, memberDeregistration, memberStatus;
    
    //components in the memberRegistration panel
    private JTextField ageField, contactField, dobField, genderField, heightField, nameField, gameField;
    private JTextField nokField, specialField, subcountyField, weightField;
    private JLabel ageLabel, contactLabel, dobLabel, gameLabel, genderLabel, heightLabel, nameLabel;
    private JLabel nokLabel, specialLabel, subcountyLabel, weightLabel;
    private JButton clearButton, submitButton;

    public AdminAccessPage1() {
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
        registrationPanel = new JPanel();
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
        
       regButtonPanel = new JPanel();
       regButtonPanel.setBackground(Color.WHITE);
        //memberPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, menuPanel, memberContentPanel);
        //memberPane.setEnabled(true);
        //providing the minimum sizes of the two panels in the splitpane
        menuPanel.setMinimumSize(new Dimension(100,700));
        memberContentPanel.setMinimumSize(new Dimension(1050, 400));
        
        itemPanel = new JPanel(new FlowLayout());
        itemPanel.setBackground(Color.WHITE);
        equipmentPanel = new JPanel();
        equipmentPanel.setBackground(Color.WHITE);
        
        
        
        registrationPanel.setBackground(Color.WHITE);
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
        ageLabel.setText("Age");
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
        
        //I've created a panel that will have member registration details and the required buttons
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(regButtonPanel);
        regButtonPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(clearButton)
                .addGap(75, 75, 75)
                .addComponent(submitButton)
                .addGap(0, 336, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(submitButton))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        javax.swing.GroupLayout registrationPanelLayout = new javax.swing.GroupLayout(registrationPanel);
        registrationPanel.setLayout(registrationPanelLayout);
        registrationPanelLayout.setHorizontalGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addComponent(subcountyLabel, GroupLayout.DEFAULT_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subcountyField, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))

                    .addGroup(registrationPanelLayout.createSequentialGroup()
                        .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nokLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(genderLabel, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ageLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(dobLabel)
                            .addComponent(contactLabel))
                        .addGap(18, 18, 18)
                        .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(dobField, GroupLayout.PREFERRED_SIZE, 100,javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGroup(registrationPanelLayout.createSequentialGroup()
                                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nokField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(gameLabel)
                                    .addComponent(weightLabel)
                                    .addComponent(heightLabel)
                                    .addComponent(specialLabel))
                                .addGap(37, 37, 37)
                                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(specialField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heightField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weightField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gameField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(regButtonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registrationPanelLayout.setVerticalGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameLabel)
                    .addComponent(gameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightLabel)
                    .addComponent(weightField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightLabel)
                    .addComponent(heightField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nokLabel)
                    .addComponent(nokField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(specialLabel)
                    .addComponent(specialField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(dobField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrationPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(contactField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subcountyLabel)
                    .addComponent(subcountyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regButtonPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
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
