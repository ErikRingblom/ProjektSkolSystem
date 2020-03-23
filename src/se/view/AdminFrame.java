
package se.view;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;


public class AdminFrame extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    private String query;
    private String direction;
    private final String date;
    private final String student = "student";
    private final String admin = "admin";
    private final String staff = "staff";
    private final String teacher = "teacher";

    AddNewStudentFrame asf = new AddNewStudentFrame();
    AddNewTeacherFrame atf = new AddNewTeacherFrame();
    AddNewAdminFrame aaf = new AddNewAdminFrame();
    AddNewStaffFrame astf = new AddNewStaffFrame();
    TheDate dt = new TheDate();
    /**
     * Creates new form AdminFrame
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public AdminFrame() {
        this.direction = null;
        this.query = null;
        initComponents();
        this.setLocationRelativeTo(null);
        con = MyConnection.getConnection();
        this.date = dt.showDate();
        dateLabel.setText(date);
    }
    
    private void getInfo(String person) {

        if (student.equals(person)) {

            query = "Select * from Student";

        } else if (admin.equals(person)) {

            query = "Select * from Admin";

        } else if (teacher.equals(person)) {

            query = "Select * from Teacher";

        } else if (staff.equals(person)) {

            query = "Select * from Staff";

        }
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        newStudentButton = new javax.swing.JButton();
        addnewTeacherButton = new javax.swing.JButton();
        addNewAdminButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        teacherInfoButton = new javax.swing.JButton();
        stuffInfoButton = new javax.swing.JButton();
        adminInfoButton = new javax.swing.JButton();
        studentInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin");

        dateLabel.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(317, 317, 317)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Förnamn", "Efternamn", "Användarnamn", "Email", "Lösenord"
            }
        ));
        jTable1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTable1MouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTable1MouseDragged(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 63, 65));
        jLabel8.setText("Klicka på person information för att hantera ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        newStudentButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        newStudentButton.setText("Lägg till ny student");
        newStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentButtonActionPerformed(evt);
            }
        });

        addnewTeacherButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        addnewTeacherButton.setText("Lägg till ny lärare");
        addnewTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewTeacherButtonActionPerformed(evt);
            }
        });

        addNewAdminButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        addNewAdminButton.setText("Lägg till ny admin");
        addNewAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewAdminButtonActionPerformed(evt);
            }
        });

        staffButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        staffButton.setText("Lägg till ny personal");
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addnewTeacherButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addNewAdminButton, addnewTeacherButton, newStudentButton, staffButton});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(newStudentButton)
                .addGap(18, 18, 18)
                .addComponent(addnewTeacherButton)
                .addGap(18, 18, 18)
                .addComponent(addNewAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(staffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addNewAdminButton, addnewTeacherButton, newStudentButton, staffButton});

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        deleteButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        deleteButton.setText("Radera");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        exitButton.setText("Avsluta");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        updateButton.setText("Uppdatera");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        teacherInfoButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        teacherInfoButton.setText("Lärar info");
        teacherInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherInfoButtonActionPerformed(evt);
            }
        });

        stuffInfoButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        stuffInfoButton.setText("Personal info");
        stuffInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuffInfoButtonActionPerformed(evt);
            }
        });

        adminInfoButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        adminInfoButton.setText("Admin info");
        adminInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminInfoButtonActionPerformed(evt);
            }
        });

        studentInfoButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        studentInfoButton.setText("Student info");
        studentInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teacherInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stuffInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adminInfoButton, studentInfoButton, stuffInfoButton, teacherInfoButton});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stuffInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentInfoButton)
                    .addComponent(adminInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adminInfoButton, studentInfoButton, stuffInfoButton, teacherInfoButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        con = MyConnection.getConnection();
        int selection = jTable1.getSelectedRow();

        String click = jTable1.getModel().getValueAt(selection, 0).toString();

        if (student.equals(direction)) {
            query = "select * from Student where idStudent = " + click;

            try {
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();

                if (rs.next()) {
                    asf.setVisible(true);

                    String firstname = rs.getString("Firstname");
                    asf.fNameField.setText(firstname);

                    String lastname = rs.getString("Lastname");
                    asf.lNameField.setText(lastname);

                    String username = rs.getNString("Username");
                    asf.uNameField.setText(username);

                    String email = rs.getString("Email");
                    asf.mailField.setText(email);

                    String password = rs.getNString("password");
                    asf.pwField.setText(password);
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else if (teacher.equals(direction)) {
            query = "select * from Teacher where idTeacher = " + click;

            try {
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();

                if (rs.next()) {
                    atf.setVisible(true);

                    String firstname = rs.getString("Firstname");
                    atf.fNameField.setText(firstname);

                    String lastname = rs.getString("Lastname");
                    atf.lNameField.setText(lastname);

                    String username = rs.getNString("Username");
                    atf.uNameField.setText(username);

                    String email = rs.getString("Email");
                    atf.mailField.setText(email);

                    String password = rs.getNString("password");
                    atf.pwField.setText(password);
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);

            }
        } else if (admin.equals(direction)) {
            query = "select * from Admin where idAdmin = " + click;

            try {
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();

                if (rs.next()) {
                    aaf.setVisible(true);

                    String firstname = rs.getString("Firstname");
                    aaf.fNameField.setText(firstname);

                    String lastname = rs.getString("Lastname");
                    aaf.lNameField.setText(lastname);

                    String username = rs.getNString("Username");
                    aaf.uNameField.setText(username);

                    String email = rs.getString("Email");
                    aaf.mailField.setText(email);

                    String password = rs.getNString("password");
                    aaf.pwField.setText(password);

                    String entry = rs.getNString("Entry");
                    aaf.EntryField.setText(entry);
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);

            }
        } else if (staff.equals(direction)) {
            query = "select * from Staff where idStaff = " + click;
            
            try {
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();

                if (rs.next()) {
                    astf.setVisible(true);
                    
                    String profession = rs.getNString("Profession");
                    astf.professionField.setText(profession);

                    String firstname = rs.getString("Firstname");
                    astf.fNameField.setText(firstname);

                    String lastname = rs.getString("Lastname");
                    astf.lNameField.setText(lastname);

                    String username = rs.getNString("Username");
                    astf.uNameField.setText(username);

                    String email = rs.getString("Email");
                    astf.mailField.setText(email);

                    String password = rs.getNString("password");
                    astf.pwField.setText(password);
                    rs.close();
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminFrame.class.getName()).log(Level.SEVERE, null, ex);

            }
            
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void newStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentButtonActionPerformed
        asf.setVisible(true);
    }//GEN-LAST:event_newStudentButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        jTable1.removeAll();
        
        if (null != direction) switch (direction) {
            case student:
                getInfo(student);
                break;
            case teacher:
                getInfo(teacher);
                break;
            case admin:
                getInfo(admin);
                break;
            case staff:
                getInfo(staff);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void studentInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentInfoButtonActionPerformed
        direction = student;
        getInfo(student);
    }//GEN-LAST:event_studentInfoButtonActionPerformed

    private void adminInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminInfoButtonActionPerformed
        direction = admin;
        getInfo(admin);
    }//GEN-LAST:event_adminInfoButtonActionPerformed

    private void teacherInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherInfoButtonActionPerformed
        direction = teacher;
        getInfo(teacher);
    }//GEN-LAST:event_teacherInfoButtonActionPerformed

    private void stuffInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuffInfoButtonActionPerformed
        direction = staff;
        getInfo(staff);
    }//GEN-LAST:event_stuffInfoButtonActionPerformed

    private void addnewTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewTeacherButtonActionPerformed
        AddNewTeacherFrame ant = new AddNewTeacherFrame();
        ant.setVisible(true);
    }//GEN-LAST:event_addnewTeacherButtonActionPerformed

    private void addNewAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewAdminButtonActionPerformed
        AddNewAdminFrame ana = new AddNewAdminFrame();
        ana.setVisible(true);
    }//GEN-LAST:event_addNewAdminButtonActionPerformed

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
        AddNewStaffFrame ans = new AddNewStaffFrame();
        ans.setVisible(true);
    }//GEN-LAST:event_staffButtonActionPerformed

    private void jTable1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseDragged
        
    }//GEN-LAST:event_jTable1MouseDragged

    private void jTable1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseMoved

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewAdminButton;
    private javax.swing.JButton addnewTeacherButton;
    private javax.swing.JButton adminInfoButton;
    public javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton newStudentButton;
    private javax.swing.JButton staffButton;
    private javax.swing.JButton studentInfoButton;
    private javax.swing.JButton stuffInfoButton;
    private javax.swing.JButton teacherInfoButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
