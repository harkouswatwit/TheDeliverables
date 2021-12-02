/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_design;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author gilmorer2
 */
public class Admin_Form extends javax.swing.JFrame {

    /**
     * Creates new form Checking_Form
     */
    public Admin_Form() {
        initComponents();
       // DisplayTable();
        setLocationRelativeTo(null);
        
      
        
        Border jpanel_title_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.blue);
       // set the border to the jPanel_title
        jPanel_title_checkings.setBorder(jpanel_title_border);
        
        Border glob_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanel_checking.setBorder(glob_panel_border);
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize_checking.setBorder(label_border);
        jLabel_close_checking.setBorder(label_border);
        
    }
    
    //display amount in checking
   /* private void DisplayTable()
            
            
            {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_app", "root", "");
            String sql = "select * from banking";
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            jTable_savings.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        /*    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel_checking = new javax.swing.JPanel();
        jLabel_close_checking = new javax.swing.JLabel();
        jLabel_minimize_checking = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_title_checkings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton_username = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel_Add = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_checking.setBackground(new java.awt.Color(51, 204, 255));

        jLabel_close_checking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_close_checking.setText(" X");
        jLabel_close_checking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close_checking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_close_checkingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_close_checkingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_close_checkingMouseExited(evt);
            }
        });

        jLabel_minimize_checking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_minimize_checking.setText(" -");
        jLabel_minimize_checking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize_checking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimize_checkingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimize_checkingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimize_checkingMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel_title_checkings.setBackground(new java.awt.Color(192, 192, 192));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("  Admin");

        javax.swing.GroupLayout jPanel_title_checkingsLayout = new javax.swing.GroupLayout(jPanel_title_checkings);
        jPanel_title_checkings.setLayout(jPanel_title_checkingsLayout);
        jPanel_title_checkingsLayout.setHorizontalGroup(
            jPanel_title_checkingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_title_checkingsLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel_title_checkingsLayout.setVerticalGroup(
            jPanel_title_checkingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_title_checkingsLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jPanel_title_checkings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_title_checkings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText(" Home");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jButton_username.setText("Retrieve Data");
        jButton_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_usernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_usernameMouseExited(evt);
            }
        });
        jButton_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_usernameActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Package ID", "Username", "SenderAdr", "ReceiverAdr", "PackageTyp", "Weight", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel_Add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Add.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_Add.setText("Add");
        jLabel_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_AddMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel_Add)
                                .addGap(238, 238, 238))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(230, 230, 230))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jButton_username)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton_username)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel_Add)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_checkingLayout = new javax.swing.GroupLayout(jPanel_checking);
        jPanel_checking.setLayout(jPanel_checkingLayout);
        jPanel_checkingLayout.setHorizontalGroup(
            jPanel_checkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_checkingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_checkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_checkingLayout.createSequentialGroup()
                        .addGap(0, 557, Short.MAX_VALUE)
                        .addComponent(jLabel_minimize_checking, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close_checking, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 616, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_checkingLayout.setVerticalGroup(
            jPanel_checkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_checkingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_checkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_close_checking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_minimize_checking, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_checking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_checking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_close_checkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_checkingMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_close_checkingMouseClicked

   
    
    
    private void jLabel_close_checkingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_checkingMouseEntered

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close_checking.setBorder(label_border);
        jLabel_close_checking.setForeground(Color.white);

    }//GEN-LAST:event_jLabel_close_checkingMouseEntered

    private void jLabel_close_checkingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_checkingMouseExited

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close_checking.setBorder(label_border);
        jLabel_close_checking.setForeground(Color.black);

    }//GEN-LAST:event_jLabel_close_checkingMouseExited

    private void jLabel_minimize_checkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimize_checkingMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabel_minimize_checkingMouseClicked

    private void jLabel_minimize_checkingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimize_checkingMouseEntered

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize_checking.setBorder(label_border);
        jLabel_minimize_checking.setForeground(Color.white);

    }//GEN-LAST:event_jLabel_minimize_checkingMouseEntered

    private void jLabel_minimize_checkingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimize_checkingMouseExited

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize_checking.setBorder(label_border);
        jLabel_minimize_checking.setForeground(Color.black);

    }//GEN-LAST:event_jLabel_minimize_checkingMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //go to the menu form
        Menu_Form mf = new Menu_Form();
        mf.setVisible(true);
        mf.pack();
        mf.setDefaultCloseOperation(Menu_Form.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0,0,255));
        jLabel3.setBorder(label_border);
        
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        
        Border label_create_account_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel3.setBorder(label_create_account_border);
        
    }//GEN-LAST:event_jLabel3MouseExited

    
//    public boolean verifyFields()
//    {
//        String tracking = jTextField_Username.getText();
//        /*
//        String fname = jTextField_Fullname.getText();
//        String uname = jTextField_Username.getText();
//        String phone = jTextField_Phone.getText();
//        String pass1 = String.valueOf(jPasswordField_1.getPassword());
//        String pass2 = String.valueOf(jPasswordField_2.getPassword());
//        */
//        // check empty fields
//        if(tracking.trim().equals("") )
//        {
//            JOptionPane.showMessageDialog(null, "Tracking field is empty","Empty Fields",2);
//            return false;
//        }
//       
//        
//        // if everything is okay
//        else{
//            return true;
//        }
//        
//    }
    
    public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `banking` WHERE `tracking` = ?";
        
        try {
            
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                username_exist = false;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
     
        } catch (SQLException ex) {
            Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
    }
    
    private void jButton_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_usernameActionPerformed
        // TODO add your handling code here:
      
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/the_deliverables?useSSL=false","root","");  //mysql@123
            
            Statement st = con.createStatement();
            String sql = "select * from package";
            ResultSet rs = st.executeQuery(sql);
            
            
            while(rs.next()) {
                String PackageID = String.valueOf(rs.getString("PackageID"));
                
                String Username = rs.getString("Username");
                String SenderAddress = rs.getString("SenderAddress");
                String ReceiverAddress = rs.getString("ReceiverAddress");
                String PackageType = rs.getString("PackageType");
                String Weight = rs.getString("Weight");
                String Status = rs.getString("Status");
                
                String tbData[] = {PackageID, Username, SenderAddress, ReceiverAddress, PackageType, Weight, Status};
                DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();
                
                tblModel.addRow(tbData);
                
            }
            
            con.close();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
//        String tracking = jTextField_Username.getText();
//        //String username = jTextField_Username.getText();
//        
//        if(verifyFields())
//        {
//            if (!checkUsername(tracking))
//            {
//                PreparedStatement ps;
//                ResultSet rs;
//                
//               String registerUserQuery = "INSERT INTO ``(`tracking`) VALUES (?)";
//                
//                try {
//                    ps = My_CNX.getConnection().prepareStatement(registerUserQuery);
//                    ps.setString(1, tracking);
//                    //ps.setString(2, username);
//                    
//                   
//                    
////                    try {
////                        // save the image as blob in the database
//////                        if(image_path != null){
//////                           
//////                            InputStream image = new FileInputStream(new File(image_path));
//////                            ps.setBlob(6, image);
//////                            
//////                        }
////                        
////                        //ps.setNull(7, java.sql.Types.NULL);
////                        ps.setString(7, tracking);
////                        
//                        if(ps.executeUpdate() != 0){
//                            JOptionPane.showMessageDialog(null, "Your Tracking Number has been added");
//                        }else{
//                            JOptionPane.showMessageDialog(null, "Error: Check Your Information");
//                        }
////                        
////                    } catch (FileNotFoundException ex) {
////                        Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
////                    }
//                    
//                } catch (SQLException ex) {
//                    Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              
//            }    
//        }
//        
    }//GEN-LAST:event_jButton_usernameActionPerformed

    private void jButton_usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_usernameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_usernameMouseEntered

    private void jButton_usernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_usernameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_usernameMouseExited

    
    
    
    
    
    private void jLabel_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddMouseClicked
        // TODO add your handling code here:
        
        Add_Form mf = new Add_Form();
        mf.setVisible(true);
        mf.pack();
        mf.setDefaultCloseOperation(Add_Form.EXIT_ON_CLOSE);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_jLabel_AddMouseClicked

    private void jLabel_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0,0,255));
        jLabel3.setBorder(label_border);
    }//GEN-LAST:event_jLabel_AddMouseEntered

    private void jLabel_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddMouseExited
        // TODO add your handling code here:
        Border label_create_account_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel3.setBorder(label_create_account_border);
    }//GEN-LAST:event_jLabel_AddMouseExited

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
            java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Add;
    private javax.swing.JLabel jLabel_close_checking;
    private javax.swing.JLabel jLabel_minimize_checking;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_checking;
    private javax.swing.JPanel jPanel_title_checkings;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
