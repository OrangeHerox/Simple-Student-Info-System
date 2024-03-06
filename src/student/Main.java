package student;

import java.awt.Color;
import java.awt.Event;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Jiro Mendador
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    Color red = new Color(255, 0, 0);
    Color gray = new Color(33, 33, 33);
    ArrayList<JButton> arrButton = new ArrayList<>();
    ArrayList<JTextField> fields = new ArrayList<>();
    ArrayList<JComboBox> comboBoxes = new ArrayList<>();
    ArrayList<JComponent> componentList = new ArrayList<>();
    boolean action = false;

    public Main() {
        initComponents();
        componentsToArray(new JComponent[]{searchBtn, addNewBtn, editBtn, deleteBtn, cancelBtn,
            studentNumTf, firstNameTf, middleNameTf, lastNameTf, homeAddressTf,
            permanentAddressTf, birthDateTf, nationalityTf, religionTf,
            contactNumTf, genderCombo, statusCombo, courseCombo,
            yearCombo, sectionCombo
        });
        homeAddressTf.setTransferHandler(null);
        permanentAddressTf.setTransferHandler(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        studentNumTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        firstNameTf = new javax.swing.JTextField();
        middleNameTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastNameTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        homeAddressTf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        birthDateTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        nationalityTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        religionTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        contactNumTf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        courseCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        yearCombo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        sectionCombo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        permanentAddressTf = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        addNewBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT INFORMATION SYSTEM");
        setBackground(new java.awt.Color(0, 153, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT INFORMATION SYSTEM");

        jLabel1.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student No");

        studentNumTf.setBackground(new java.awt.Color(255, 255, 255));
        studentNumTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        studentNumTf.setForeground(new java.awt.Color(33, 33, 33));
        studentNumTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        studentNumTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                studentNumTfKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");

        firstNameTf.setBackground(new java.awt.Color(255, 255, 255));
        firstNameTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        firstNameTf.setForeground(new java.awt.Color(33, 33, 33));
        firstNameTf.setToolTipText("First Name");
        firstNameTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        firstNameTf.setEnabled(false);
        firstNameTf.setName("First Name"); // NOI18N

        middleNameTf.setBackground(new java.awt.Color(255, 255, 255));
        middleNameTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        middleNameTf.setForeground(new java.awt.Color(33, 33, 33));
        middleNameTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        middleNameTf.setEnabled(false);
        middleNameTf.setName("Middle Name"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Middle Name");

        lastNameTf.setBackground(new java.awt.Color(255, 255, 255));
        lastNameTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lastNameTf.setForeground(new java.awt.Color(33, 33, 33));
        lastNameTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        lastNameTf.setEnabled(false);
        lastNameTf.setName("Last Name"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");

        jLabel6.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Home Address");

        homeAddressTf.setBackground(new java.awt.Color(255, 255, 255));
        homeAddressTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        homeAddressTf.setForeground(new java.awt.Color(33, 33, 33));
        homeAddressTf.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        homeAddressTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        homeAddressTf.setEnabled(false);
        homeAddressTf.setName("Home Address"); // NOI18N
        homeAddressTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                homeAddressTfKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BirthDate (YYYY-MM-DD)");

        birthDateTf.setBackground(new java.awt.Color(255, 255, 255));
        birthDateTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        birthDateTf.setForeground(new java.awt.Color(33, 33, 33));
        birthDateTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        birthDateTf.setEnabled(false);
        birthDateTf.setName("Birthdate"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");

        genderCombo.setBackground(new java.awt.Color(255, 255, 255));
        genderCombo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        genderCombo.setForeground(new java.awt.Color(33, 33, 33));
        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        genderCombo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        genderCombo.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");

        statusCombo.setBackground(new java.awt.Color(255, 255, 255));
        statusCombo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        statusCombo.setForeground(new java.awt.Color(33, 33, 33));
        statusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "Divorced", "Separated" }));
        statusCombo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        statusCombo.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nationality");

        nationalityTf.setBackground(new java.awt.Color(255, 255, 255));
        nationalityTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nationalityTf.setForeground(new java.awt.Color(33, 33, 33));
        nationalityTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        nationalityTf.setEnabled(false);
        nationalityTf.setName("Nationality"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Religion");

        religionTf.setBackground(new java.awt.Color(255, 255, 255));
        religionTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        religionTf.setForeground(new java.awt.Color(33, 33, 33));
        religionTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        religionTf.setEnabled(false);
        religionTf.setName("Religion"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contact No");

        contactNumTf.setBackground(new java.awt.Color(255, 255, 255));
        contactNumTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        contactNumTf.setForeground(new java.awt.Color(33, 33, 33));
        contactNumTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        contactNumTf.setEnabled(false);
        contactNumTf.setName("Contact Number"); // NOI18N
        contactNumTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactNumTfKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Course");

        courseCombo.setBackground(new java.awt.Color(255, 255, 255));
        courseCombo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        courseCombo.setForeground(new java.awt.Color(33, 33, 33));
        courseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSCS", "BSA", "BS PSYCHOLOGY", "BSIT", "BS MATH", "BSED", "BSIS", "BSEMC" }));
        courseCombo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        courseCombo.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Year");

        yearCombo.setBackground(new java.awt.Color(255, 255, 255));
        yearCombo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        yearCombo.setForeground(new java.awt.Color(33, 33, 33));
        yearCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIRST YEAR", "SECOND YEAR", "THIRD YEAR", "FOURTH YEAR" }));
        yearCombo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        yearCombo.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Section");

        sectionCombo.setBackground(new java.awt.Color(255, 255, 255));
        sectionCombo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sectionCombo.setForeground(new java.awt.Color(33, 33, 33));
        sectionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));
        sectionCombo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        sectionCombo.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Permanent Address");

        permanentAddressTf.setBackground(new java.awt.Color(255, 255, 255));
        permanentAddressTf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        permanentAddressTf.setForeground(new java.awt.Color(33, 33, 33));
        permanentAddressTf.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 110, 110)), javax.swing.BorderFactory.createEmptyBorder(2, 6, 2, 6)));
        permanentAddressTf.setEnabled(false);
        permanentAddressTf.setName("Permanent Address"); // NOI18N
        permanentAddressTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                permanentAddressTfKeyTyped(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(33, 33, 33));
        searchBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        addNewBtn.setBackground(new java.awt.Color(33, 33, 33));
        addNewBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addNewBtn.setForeground(new java.awt.Color(255, 255, 255));
        addNewBtn.setText("ADD NEW");
        addNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(33, 33, 33));
        editBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("EDIT");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(33, 33, 33));
        deleteBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("DELETE");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(33, 33, 33));
        cancelBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("CANCEL");
        cancelBtn.setEnabled(false);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(nationalityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11)
                                    .addComponent(religionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addComponent(contactNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel13)
                                        .addGap(177, 177, 177))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel14))
                                    .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel15))
                                    .addComponent(sectionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(permanentAddressTf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(firstNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(middleNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(lastNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(studentNumTf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(homeAddressTf, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(birthDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(middleNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permanentAddressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthDateTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nationalityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(religionTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sectionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(39, 39, 39)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        firstNameTf.getAccessibleContext().setAccessibleName("");
        firstNameTf.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if (!studentNumTf.getText().isBlank()) {
            Student s = new Student();
            s.setStudentNum(Integer.valueOf(studentNumTf.getText()));
            if (s.isPresent()) {
                s.setStudent();
                firstNameTf.setText(s.getFirstName());
                middleNameTf.setText(s.getMiddleName());
                lastNameTf.setText(s.getLastName());
                homeAddressTf.setText(s.getHomeAddress());
                permanentAddressTf.setText(s.getPermanentAddress());
                birthDateTf.setText(String.valueOf(s.getBirthdate()));
                genderCombo.setSelectedItem(s.getGender());
                statusCombo.setSelectedItem(s.getStatus());
                nationalityTf.setText(s.getNationality());
                religionTf.setText(s.getReligion());
                contactNumTf.setText(s.getContactNumber());
                courseCombo.setSelectedItem(s.getCourse());
                yearCombo.setSelectedItem(s.getYear());
                sectionCombo.setSelectedItem(s.getSection());
                buttonsEnableAndDisable(new JButton[]{searchBtn, editBtn, deleteBtn, cancelBtn}, new JButton[]{addNewBtn});
            } else {
                setToBlank();
                buttonsEnableAndDisable(new JButton[]{searchBtn, addNewBtn}, new JButton[]{editBtn, deleteBtn, cancelBtn});
                JOptionPane.showMessageDialog(rootPane, "Record Not Found", "Record", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please Enter A Student Number...");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if (evt.getActionCommand().equals("EDIT")) {
            action = true;
            editBtn.setText("UPDATE");
            buttonsEnableAndDisable(new JButton[]{editBtn, cancelBtn}, new JButton[]{searchBtn, addNewBtn, deleteBtn});
        } else if (evt.getActionCommand().equals("UPDATE")) {
            if(checkForEmptyFields() == false) {
            if(validDate(birthDateTf.getText())) {
            Student s = new Student();
            s.setStudentNum(Integer.valueOf(studentNumTf.getText()));
            s.setFirstName(firstNameTf.getText());
            s.setMiddleName(middleNameTf.getText());
            s.setLastName(lastNameTf.getText());
            s.setHomeAddress(homeAddressTf.getText());
            s.setPermanentAddress(permanentAddressTf.getText());
            s.setBirthdate(birthDateTf.getText());
            s.setGender(genderCombo.getSelectedItem().toString());
            s.setStatus(statusCombo.getSelectedItem().toString());
            s.setNationality(nationalityTf.getText());
            s.setReligion(religionTf.getText());
            s.setContactNumber(contactNumTf.getText());
            s.setCourse(courseCombo.getSelectedItem().toString());
            s.setYear(yearCombo.getSelectedItem().toString());
            s.setSection(sectionCombo.getSelectedItem().toString());
            s.updateStudent();
            action = false;

            JOptionPane.showMessageDialog(rootPane, "Record Updated");
            editBtn.setText("EDIT");
            buttonsEnableAndDisable(new JButton[]{searchBtn, addNewBtn}, new JButton[]{editBtn, deleteBtn, cancelBtn});
            setToBlank();
            } else {
                 JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid Date (yyyy-MM-dd)", "VALID DATE", JOptionPane.ERROR_MESSAGE);
            }
            } 
        }
        enableAndDisableComponents(action);
        studentNumTf.setEnabled(!action);
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete this record?", "Deleting Record...", JOptionPane.YES_NO_OPTION) == 0) {
            Student s = new Student();
            s.setStudentNum(Integer.valueOf(studentNumTf.getText()));
            s.deleteStudent();
            JOptionPane.showMessageDialog(rootPane, "Record Deleted!");
            buttonsEnableAndDisable(new JButton[]{searchBtn, addNewBtn}, new JButton[]{editBtn, deleteBtn, cancelBtn});
            setToBlank();
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void addNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewBtnActionPerformed
        Student s = new Student();
        if (evt.getActionCommand().equals("ADD NEW")) {
            studentNumTf.setText(String.valueOf(s.getLastStudentNo()));
            enableAndDisableComponents(true);
            buttonsEnableAndDisable(new JButton[]{addNewBtn, cancelBtn}, new JButton[]{searchBtn, deleteBtn, editBtn});
            studentNumTf.setEnabled(false);
            addNewBtn.setText("SAVE");
        } else if (evt.getActionCommand().equals("SAVE")) {
            if (checkForEmptyFields() == false) {
                if(validDate(birthDateTf.getText())) {
                s.setStudentNum(Integer.valueOf(studentNumTf.getText()));
                s.setStudentNum(Integer.valueOf(studentNumTf.getText()));
                s.setFirstName(firstNameTf.getText());
                s.setMiddleName(middleNameTf.getText());
                s.setLastName(lastNameTf.getText());
                s.setHomeAddress(homeAddressTf.getText());
                s.setPermanentAddress(permanentAddressTf.getText());
                s.setBirthdate(birthDateTf.getText());
                s.setGender(genderCombo.getSelectedItem().toString());
                s.setStatus(statusCombo.getSelectedItem().toString());
                s.setNationality(nationalityTf.getText());
                s.setReligion(religionTf.getText());
                s.setContactNumber(contactNumTf.getText());
                s.setCourse(courseCombo.getSelectedItem().toString());
                s.setYear(yearCombo.getSelectedItem().toString());
                s.setSection(sectionCombo.getSelectedItem().toString());
                s.addStudent();

                JOptionPane.showMessageDialog(rootPane, "New Record Added");
                setToBlank();
                studentNumTf.setText(String.valueOf(s.getLastStudentNo()));
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please Enter A Valid Date (yyyy-MM-dd)", "VALID DATE", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_addNewBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Do you really want to cancel this transaction?", "Cancel Transaction...", 0) == 0) {
            editBtn.setText("EDIT");
            addNewBtn.setText("ADD NEW");
            buttonsEnableAndDisable(new JButton[]{searchBtn, addNewBtn}, new JButton[]{editBtn, deleteBtn, cancelBtn});
            enableAndDisableComponents(false);
            setToBlank();
            studentNumTf.setEnabled(true);
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void studentNumTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentNumTfKeyTyped
        if (!(Character.isDigit(evt.getKeyChar()))) {
            evt.consume();
        } 
    }//GEN-LAST:event_studentNumTfKeyTyped

    private void contactNumTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNumTfKeyTyped
        if (!(Character.isDigit(evt.getKeyChar()))) {
            evt.consume();
        } else if (contactNumTf.getText().trim().length() == 11 || evt.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_contactNumTfKeyTyped

    private void homeAddressTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homeAddressTfKeyTyped
        if (homeAddressTf.getText().length() == 60 || evt.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_homeAddressTfKeyTyped

    private void permanentAddressTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_permanentAddressTfKeyTyped
        if (permanentAddressTf.getText().length() == 60 || evt.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_permanentAddressTfKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewBtn;
    private javax.swing.JTextField birthDateTf;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField contactNumTf;
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField firstNameTf;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JTextField homeAddressTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTf;
    private javax.swing.JTextField middleNameTf;
    private javax.swing.JTextField nationalityTf;
    private javax.swing.JTextField permanentAddressTf;
    private javax.swing.JTextField religionTf;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> sectionCombo;
    private javax.swing.JComboBox<String> statusCombo;
    private javax.swing.JTextField studentNumTf;
    private javax.swing.JComboBox<String> yearCombo;
    // End of variables declaration//GEN-END:variables

    //UTILITY METHODS
    private boolean checkForEmptyFields() {
        for (JTextField iterator : fields) {
            if (iterator.getText().isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "Cannot Proceed If " + iterator.getName() + " is Blank", "ADDING DATA", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        return false;
    }

    private class CustomMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            for (int i = 0; i < arrButton.size(); i++) {
                if (e.getSource() == arrButton.get(i)) {
                    arrButton.get(i).setBackground(red);
                }
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            for (int i = 0; i < arrButton.size(); i++) {
                if (e.getSource() == arrButton.get(i)) {
                    arrButton.get(i).setBackground(gray);
                }
            }
        }

    }
    
    public static boolean validDate(String strDate) {
        if (strDate.trim().equals("")) {
            return true;
        } else {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd");
            sdfrmt.setLenient(false);
            try { 
                java.util.Date javaDate = sdfrmt.parse(strDate);
            } catch (ParseException e) {
                return false;
            }
            return true;
        }
    }
    
    private void buttonsEnableAndDisable(JButton[] btnToEnable, JButton[] btnToDisable) {
        for (JButton iterator : btnToEnable) {
            iterator.setEnabled(true);
        }
        for (JButton iterator : btnToDisable) {
            iterator.setEnabled(false);
        }
    }

    private void componentsToArray(JComponent[] component) {

        for (JComponent iterator : component) {
            if (iterator instanceof JTextField jTextField) {
                fields.add(jTextField);
            } else if (iterator instanceof JComboBox jComboBox) {
                comboBoxes.add(jComboBox);
            } else if (iterator instanceof JButton jButton) {
                jButton.addMouseListener(new CustomMouseListener());
                arrButton.add(jButton);
            }
            componentList.add(iterator);
        }
    }

    private void setToBlank() {
        for (JTextField iterator : fields) {
            iterator.setText("");
        }
        for (JComboBox iterator : comboBoxes) {
            iterator.setSelectedIndex(0);
        }
    }

    private void enableAndDisableComponents(boolean action) {
        for (int i = 0; i < fields.size(); i++) {
            fields.get(i).setEnabled(action);
        }
        for (int i = 0; i < comboBoxes.size(); i++) {
            comboBoxes.get(i).setEnabled(action);
        }
    }
}
