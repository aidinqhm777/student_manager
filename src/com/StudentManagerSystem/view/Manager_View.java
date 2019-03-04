package com.StudentManagerSystem.view;

import com.StudentManagerSystem.Searcher;
import com.StudentManagerSystem.Student;
import com.StudentManagerSystem.SystemManage;

import java.io.IOException;
import java.lang.invoke.WrongMethodTypeException;
import java.util.LinkedList;
import javax.swing.*;

/**
 * @author Amir
 */
public class Manager_View extends javax.swing.JFrame {

    private Student studentTemp = new Student();
    private LinkedList<Student> searchResult = new LinkedList<>();

    public Manager_View() {

        try {
            SystemManage.loadProgram();
        } catch (IOException | ClassNotFoundException e) {
            showErrorMassage("Problem in load the files, restart the program");
        }

        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        birthdateField = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        search_btn = new javax.swing.JToggleButton();
        jLabel32 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        uniId_searchField = new javax.swing.JTextField();
        name_searchField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        id_searchField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        lastName_searchField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        JtextId = new javax.swing.JTextField();
        nameFiled_signUp = new javax.swing.JTextField();
        lastNameFiled_signUp = new javax.swing.JTextField();
        signUp = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        birthdateYearCB_signUp = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        copyTextBut = new javax.swing.JToggleButton();
        idFiled_signUp = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        phoneNumberFiled_signUp = new javax.swing.JTextField();
        birthdateMonthCB_signUp = new javax.swing.JComboBox<>();
        birthdateDayCB_signUp = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jTextField3 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jCheck = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        addLesson_btn = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jTextField9 = new javax.swing.JTextField();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jTextField11 = new javax.swing.JTextField();
        searchLesson_btn = new javax.swing.JToggleButton();
        jLabel18 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        editLesson_btn = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("name:");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Last Name:");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("ID:");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("نیم سال:");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Phone Number:");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Birthdate:");

        idField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        idField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        nameField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lastNameField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        phoneNumberField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        phoneNumberField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        birthdateField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jToggleButton6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jToggleButton6.setText("Edit Information");
        jToggleButton6.setEnabled(false);
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jToggleButton7.setForeground(new java.awt.Color(255, 0, 0));
        jToggleButton7.setText("Delete Student");
        jToggleButton7.setEnabled(false);
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        search_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel32.setText("University ID:");

        uniId_searchField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        uniId_searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        uniId_searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniId_searchFieldActionPerformed(evt);
            }
        });

        name_searchField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        name_searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name_searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_searchFieldActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel40.setText("ID:");

        id_searchField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        id_searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        id_searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_searchFieldActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel41.setText("Lastname:");

        lastName_searchField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lastName_searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastName_searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastName_searchFieldActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel42.setText("Name:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addGap(104, 104, 104))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(22, 22, 22)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(uniId_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_searchField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastName_searchField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthdateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton6))))))
            .addComponent(jSeparator2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(uniId_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jToggleButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton6)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student Info", jPanel6);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student sign up", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Name:");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Last name:");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("شماره ی دانشجویی:");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("نیم سال:");

        jLabel37.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("رشته:");

        jLabel38.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Birtdate:");

        JtextId.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JtextId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JtextId.setEnabled(false);

        nameFiled_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nameFiled_signUp.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lastNameFiled_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lastNameFiled_signUp.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        signUp.setText("Sigh Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "مهندسی کامپیوتر", "علوم کامپیوتر", "مهندسی برق" }));
        jComboBox1.setToolTipText("");

        birthdateYearCB_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateYearCB_signUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1370", "1371", "1372", "1373", "1374", "1375", "1376", "1377", "1378", "1379", "1380", "1381", "1382", "1383", "1384", "1385", "1386", "1387", "1388", "1389", "1390", "1391", "1392", "1393", "1394", "1395", "1396", "1397", "1398", "1399", "1400" }));
        birthdateYearCB_signUp.setToolTipText("");

        jComboBox3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "نیم سال اول", "نیم سال دوم" }));
        jComboBox3.setToolTipText("");

        copyTextBut.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        copyTextBut.setText("Copy");
        copyTextBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextButActionPerformed(evt);
            }
        });

        idFiled_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        idFiled_signUp.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel43.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("ID:");

        jLabel44.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Phone Number:");

        phoneNumberFiled_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        phoneNumberFiled_signUp.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        birthdateMonthCB_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateMonthCB_signUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        birthdateMonthCB_signUp.setToolTipText("");
        birthdateMonthCB_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdateMonthCB_signUpActionPerformed(evt);
            }
        });

        birthdateDayCB_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateDayCB_signUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        birthdateDayCB_signUp.setToolTipText("");
        birthdateDayCB_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdateDayCB_signUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(copyTextBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idFiled_signUp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameFiled_signUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(nameFiled_signUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(jLabel37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(birthdateYearCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdateMonthCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdateDayCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(JtextId, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(phoneNumberFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signUp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdateYearCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(birthdateMonthCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdateDayCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(signUp))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(JtextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyTextBut))
                .addContainerGap())
        );

        ((JLabel)jComboBox1.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);
        ((JLabel)jComboBox1.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sign Up", jPanel8);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "حذف و اضافه ی اختصاصی", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTextField2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("B Nazanin", 1, 24)); // NOI18N
        jLabel2.setText("شماره دانشجویی:");

        jToggleButton1.setFont(new java.awt.Font("B Nazanin", 1, 24)); // NOI18N
        jToggleButton1.setText("اضافه");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("B Nazanin", 1, 24)); // NOI18N
        jLabel3.setText("کد درس:");

        jToggleButton2.setFont(new java.awt.Font("B Nazanin", 1, 24)); // NOI18N
        jToggleButton2.setText("حذف");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "وضعیت حذف و اضاقه", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jCheck.setFont(new java.awt.Font("B Nazanin", 1, 24)); // NOI18N
        jCheck.setText("حذف و اضافه به صورت عمومی فعال است");
        jCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(637, Short.MAX_VALUE)
                .addComponent(jCheck)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheck)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit subjects ", jPanel9);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "add lesson", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jCheckBox3.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setEnabled(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("class scheduler:");

        jTextField4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saturday", "sunday", "monday", "tuesday", "wendsday", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "every week", "even week", "odd week" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        addLesson_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        addLesson_btn.setText("Add");
        addLesson_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLesson_btnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("Lesson name:");

        jComboBox9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saturday", "sunday", "monday", "tuesday", "wendsday", " " }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jComboBox10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "every week", "even week", "odd week" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setText("Test date:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setText("Lesson code:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(63, 63, 63)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                    .addComponent(jCheckBox4))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox3)))
                            .addComponent(addLesson_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(addLesson_btn)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "edite lesson", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jCheckBox5.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jComboBox15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saturday", "sunday", "monday", "tuesday", "wendsday", " " }));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });

        jComboBox16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "every week", "even week", "odd week" }));
        jComboBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox16ActionPerformed(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        searchLesson_btn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        searchLesson_btn.setText("get info");
        searchLesson_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLesson_btnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setText("Lesson name:");

        jComboBox17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saturday", "sunday", "monday", "tuesday", "wendsday", " " }));
        jComboBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox17ActionPerformed(evt);
            }
        });

        jComboBox18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "every week", "even week", "odd week" }));
        jComboBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox18ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setText("Test date:");

        jTextField12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel22.setText("Lesson code");

        editLesson_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        editLesson_btn.setText("Edit");
        editLesson_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLesson_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(searchLesson_btn)
                        .addGap(52, 52, 52)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel22))
                    .addComponent(editLesson_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(searchLesson_btn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jCheckBox6)))
                .addGap(18, 18, 18)
                .addComponent(editLesson_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Semester Lessons", jPanel7);

        jMenu1.setText("File");

        jMenuItem1.setText("close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void showErrorMassage(String ErrorMassage) {
        JOptionPane.showMessageDialog(this, ErrorMassage, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    private void showSuccessMassage(String SuccessMassage) {
        JOptionPane.showMessageDialog(this, SuccessMassage, "Successful", JOptionPane.INFORMATION_MESSAGE);
    }

    private void setFormInfo() {
        nameField.setText(studentTemp.getName());
        lastNameField.setText(studentTemp.getLastname());
        idField.setText("" + studentTemp.getId());
        birthdateField.setText(studentTemp.getBirthDate());
        phoneNumberField.setText(studentTemp.getPhoneNum());
    }

    private boolean getFormInfo() {
        boolean state;
        state = setNameField();
        state = state && setLastNameField();
        state = state && setIDField();
        state = state && setPhoneNumberField();
        studentTemp.setBirthDate(
                (String) birthdateYearCB_signUp.getSelectedItem() + "/" +
                        (String) birthdateMonthCB_signUp.getSelectedItem() + "/" +
                        (String) birthdateDayCB_signUp.getSelectedItem()
        );
        return state;
    }

    private boolean setNameField() {
        try {
            if (nameFiled_signUp.getText().length() <= 3) throw new WrongMethodTypeException();
            if (nameFiled_signUp.getText().equals("")) throw new InterruptedException();
            studentTemp.setName(nameFiled_signUp.getText().toLowerCase().replaceAll(" ", ""));
            return true;
        } catch (WrongMethodTypeException e) {
            showErrorMassage("Name can't have less than 3 character");
        } catch (InterruptedException e) {
            showErrorMassage("Name can't be empty");
        }
        return false;
    }

    private boolean setLastNameField() {
        try {
            if (lastNameFiled_signUp.getText().length() <= 3) throw new WrongMethodTypeException();
            if (lastNameFiled_signUp.getText().equals("")) throw new InterruptedException();
            studentTemp.setLastname(lastNameFiled_signUp.getText().toLowerCase().replaceAll(" ", ""));
            return true;
        } catch (WrongMethodTypeException e) {
            showErrorMassage("last name can't have less than 3 character");
        } catch (InterruptedException e) {
            showErrorMassage("Last name can't be empty");
        }
        return false;
    }

    private boolean setPhoneNumberField() {
        try {
            if (!(phoneNumberFiled_signUp.getText().length() == 10 || phoneNumberFiled_signUp.getText().length() == 11))
                throw new WrongMethodTypeException();
            Long.parseLong(phoneNumberFiled_signUp.getText().replaceAll(" ", ""));
            studentTemp.setPhoneNum(phoneNumberFiled_signUp.getText());
            return true;
        } catch (WrongMethodTypeException e) {
            showErrorMassage("Phone number is in wrong type");
        }
//        catch (NumberFormatException e){
//            showErrorMassage("Phone number hasn't characters");
//        }
        return false;
    }

    private boolean setIDField() {
        try {
            if (idFiled_signUp.getText().length() != 10) throw new WrongMethodTypeException();
            else if (idFiled_signUp.getText().equals("")) throw new InterruptedException();
            else studentTemp.setId(Integer.parseInt(idFiled_signUp.getText().replaceAll(" ", "")));
            return true;
        } catch (NumberFormatException e) {
            showErrorMassage("Wrong input type in ID");
        } catch (WrongMethodTypeException e) {
            showErrorMassage("ID has 10 Digits");
        } catch (InterruptedException e) {
            showErrorMassage("ID can't be empty");
        }
        return false;
    }

    //***********************************************************

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            SystemManage.saveProgram();
        } catch (IOException e) {
            showErrorMassage("Problem in save the files");
        }
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckActionPerformed

    }//GEN-LAST:event_jCheckActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void addLesson_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLesson_btnActionPerformed

    }//GEN-LAST:event_addLesson_btnActionPerformed

    //TODO ID duplicated problem
    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        try {
            if (getFormInfo()) {
                SystemManage.setStudentTmp(studentTemp);
                SystemManage.signupStudent();
                showSuccessMassage("sign up successful");
            }
        } catch (IOException e) {
            showErrorMassage("Some problem in reading file: " + e.getCause());
        }
    }//GEN-LAST:event_signUpActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        Searcher searcher = new Searcher();
        if (!name_searchField.getText().equals("")) {
            searcher.setName(name_searchField.getText());
            searcher.setSearchByName(true);
        }

        if (!lastName_searchField.getText().equals("")) {
            searcher.setLastname(lastName_searchField.getText());
            searcher.setSearchByLastname(true);
        }

        if (!uniId_searchField.getText().equals("")) {
            searcher.setUniID(Integer.parseInt(uniId_searchField.getText()));
            searcher.setSearchByUniID(true);
        }

        if (!id_searchField.getText().equals("")) {
            searcher.setId(Integer.parseInt(id_searchField.getText()));
            searcher.setSearchByID(true);
        }

        try {
            searchResult = SystemManage.searchStudent(searcher);
            studentTemp = searchResult.get(0);
            SystemManage.setStudentTmp(studentTemp);
            setFormInfo();
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            showErrorMassage("not found: " + e.getCause());
        }

    }//GEN-LAST:event_search_btnActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed

    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jComboBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox18ActionPerformed

    private void jComboBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox17ActionPerformed

    private void searchLesson_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLesson_btnActionPerformed

    }//GEN-LAST:event_searchLesson_btnActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jComboBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox16ActionPerformed

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void editLesson_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLesson_btnActionPerformed


    }//GEN-LAST:event_editLesson_btnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            SystemManage.saveProgram();
        } catch (IOException e) {
            showErrorMassage("error in save file");
        }
    }//GEN-LAST:event_formWindowClosing

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed


    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void copyTextButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextButActionPerformed

    }//GEN-LAST:event_copyTextButActionPerformed

    private void uniId_searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniId_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uniId_searchFieldActionPerformed

    private void name_searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_searchFieldActionPerformed

    private void id_searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_searchFieldActionPerformed

    private void lastName_searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastName_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastName_searchFieldActionPerformed

    private void birthdateMonthCB_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdateMonthCB_signUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdateMonthCB_signUpActionPerformed

    private void birthdateDayCB_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdateDayCB_signUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdateDayCB_signUpActionPerformed

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
            java.util.logging.Logger.getLogger(Manager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtextId;
    private javax.swing.JToggleButton addLesson_btn;
    private javax.swing.JComboBox<String> birthdateDayCB_signUp;
    private javax.swing.JTextField birthdateField;
    private javax.swing.JComboBox<String> birthdateMonthCB_signUp;
    private javax.swing.JComboBox<String> birthdateYearCB_signUp;
    private javax.swing.JToggleButton copyTextBut;
    private javax.swing.JToggleButton editLesson_btn;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idFiled_signUp;
    private javax.swing.JTextField id_searchField;
    private javax.swing.JCheckBox jCheck;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField lastNameFiled_signUp;
    private javax.swing.JTextField lastName_searchField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameFiled_signUp;
    private javax.swing.JTextField name_searchField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField phoneNumberFiled_signUp;
    private javax.swing.JToggleButton searchLesson_btn;
    private javax.swing.JToggleButton search_btn;
    private javax.swing.JToggleButton signUp;
    private javax.swing.JTextField uniId_searchField;
    // End of variables declaration//GEN-END:variables
}
