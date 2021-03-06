/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rimazivkovic
 */
public class AddNewStudentFrame extends javax.swing.JFrame {

    String query = null;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    /**
     * Creates new form StudentUpdateFrame
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public AddNewStudentFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        con = MyConnection.getConnection(); 
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pwField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uNameField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        match1ACheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        match2bCheckBox = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTextArea = new javax.swing.JTextArea();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Kurser: ");

        pwField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        mailField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        fNameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        lNameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel7.setText("Lösenord:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Email: ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Efternamn:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Förnamn:");

        uNameField.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        uNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel8.setText("Användarnamn:");

        match1ACheckBox1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        match1ACheckBox1.setText("Matematik 1A");
        match1ACheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                match1ACheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jCheckBox2.setText("Matematik 3C");

        match2bCheckBox.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        match2bCheckBox.setText("Matematik 2B");
        match2bCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                match2bCheckBoxActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jCheckBox4.setText("Engelska 1A");

        subjectTextArea.setColumns(20);
        subjectTextArea.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        subjectTextArea.setRows(5);
        jScrollPane1.setViewportView(subjectTextArea);

        jCheckBox5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jCheckBox5.setText("Engelska 2A");

        jCheckBox6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jCheckBox6.setText("Svenska 1");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jCheckBox7.setText("Svenska 2");

        jCheckBox8.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jCheckBox8.setText("Svenska 3");

        jCheckBox9.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jCheckBox9.setText("Samhäll 2B");

        jCheckBox10.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jCheckBox10.setText("Ekonomi AA");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Valda kurser:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Student uppgifter:");

        addButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        addButton.setText("Lägg till");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        closeButton.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        closeButton.setText("Stäng");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton1.setText("Uppdatera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lNameField)
                                    .addComponent(fNameField)
                                    .addComponent(mailField)
                                    .addComponent(pwField)
                                    .addComponent(uNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(match2bCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(match1ACheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fNameField, jLabel3, jLabel4, jLabel5, jLabel7, jLabel8, lNameField, mailField, pwField, uNameField});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, closeButton, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(match1ACheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(match2bCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(90, 90, 90))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel4)
                                                    .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3))
                                                .addGap(48, 48, 48)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(uNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8))
                                                .addGap(7, 7, 7)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7))))
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(46, Short.MAX_VALUE))))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {fNameField, jLabel3, jLabel4, jLabel5, jLabel7, jLabel8, lNameField, mailField, pwField, uNameField});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, closeButton, jButton1});

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Student hantering");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameFieldActionPerformed

    private void match1ACheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_match1ACheckBox1ActionPerformed

    }//GEN-LAST:event_match1ACheckBox1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String firstname = fNameField.getText();
        String lastname = lNameField.getText();
        String username = uNameField.getText();
        String email = mailField.getText();
        String password = pwField.getText();
        insert(firstname, lastname, username, email, password);
    }//GEN-LAST:event_addButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void match2bCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_match2bCheckBoxActionPerformed
       
    }//GEN-LAST:event_match2bCheckBoxActionPerformed

    
     public int insert(String firstname, String lastname, String username, String email, String password) {
        
        int idStudent = 0;
      
         if (firstname.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in förnamn!");
         } else if (lastname.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in efternamn!");
         } else if (username.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in användarnamn!");
         } else if (email.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in email!");
         } else if (password.equals("")) {
             JOptionPane.showMessageDialog(null, "Skriv in lösenord!");
         } else {
             query = "INSERT INTO `Student`(`Firstname`, `Lastname`, `Username`, `Email`, `Password`) VALUES (?,?,?,?,?)";
         }
        
        try {
            ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, username);
            ps.setString(4, email);
            ps.setString(5, password);
            
            int update = ps.executeUpdate();
            if (update == 1) {
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    idStudent = rs.getInt(1);
                    JOptionPane.showMessageDialog(null, firstname + " " + lastname + " har registrerats! I väntan på godkännande!");
                }
            }
     
        } catch (SQLException ex) {
            Logger.getLogger(RegisterFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                    fNameField.setText("");
                    lNameField.setText("");
                    uNameField.setText("");
                    mailField.setText("");
                    pwField.setText("");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return idStudent;
     }
     
    
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
            java.util.logging.Logger.getLogger(AddNewStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddNewStudentFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton closeButton;
    public javax.swing.JTextField fNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField lNameField;
    public javax.swing.JTextField mailField;
    private javax.swing.JCheckBox match1ACheckBox1;
    private javax.swing.JCheckBox match2bCheckBox;
    public javax.swing.JTextField pwField;
    private javax.swing.JTextArea subjectTextArea;
    public javax.swing.JTextField uNameField;
    // End of variables declaration//GEN-END:variables
}
