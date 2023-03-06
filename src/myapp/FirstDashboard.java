package myapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import userpages.CakeInventory;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import userpages.*;
/**
 *
 * @author SCC Comlab
 */
public class FirstDashboard extends javax.swing.JFrame {

    /**
     * Creates new form FirstDashboard
     */
    
    //102,102,102   255,153,153
    public FirstDashboard() {
        initComponents();
       
    }
  Color navcolor = new Color(255,204,255);
   Color headcolor = new Color(255,102,102);
  Color bodycolor = new Color(255,153,153);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        account = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        customize = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cname = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 510));
        setPreferredSize(new java.awt.Dimension(910, 511));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(255, 204, 255));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setBackground(new java.awt.Color(255, 204, 255));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DASHBOARD");
        dashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 160, -1));

        navbar.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 160, 50));

        account.setBackground(new java.awt.Color(255, 204, 255));
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INVENTORY");
        account.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, 20));

        navbar.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 160, 80));

        customize.setBackground(new java.awt.Color(255, 204, 255));
        customize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customizeMouseExited(evt);
            }
        });
        customize.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CUSTOMIZE CAKE");
        customize.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, 20));

        navbar.add(customize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 160, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/icons8-name-64.png"))); // NOI18N
        navbar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, -1));

        cname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cname.setToolTipText("");
        cname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        navbar.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 160, 480);

        header.setBackground(new java.awt.Color(255, 204, 204));
        header.setPreferredSize(new java.awt.Dimension(40, 40));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("SWEETSPOT INVENTORY");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 490, 30));

        minimize.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        header.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 30, -1));

        close.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 30, -1));

        jPanel1.add(header);
        header.setBounds(160, 0, 790, 50);

        maindesktop.setBackground(new java.awt.Color(255, 153, 153));
        maindesktop.setPreferredSize(new java.awt.Dimension(1100, 700));
        maindesktop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maindesktopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maindesktopMouseExited(evt);
            }
        });

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel1.add(maindesktop);
        maindesktop.setBounds(160, 50, 790, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maindesktopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maindesktopMouseEntered
       
    }//GEN-LAST:event_maindesktopMouseEntered

    private void maindesktopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maindesktopMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_maindesktopMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked

        int a = JOptionPane.showConfirmDialog(null,"Do Your want to Exit");
        if(a==JOptionPane.YES_OPTION ){
            System.exit(0);
        }

    }//GEN-LAST:event_closeMouseClicked

    private void customizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customizeMouseExited
        customize.setBackground(navcolor);
    }//GEN-LAST:event_customizeMouseExited

    private void customizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customizeMouseEntered
        customize.setBackground(bodycolor);
    }//GEN-LAST:event_customizeMouseEntered

    private void customizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customizeMouseClicked
        Dashboard up = new Dashboard();
        maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_customizeMouseClicked

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
        account.setBackground(navcolor);
    }//GEN-LAST:event_accountMouseExited

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        account.setBackground(bodycolor);

    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        CakeInventory a= new CakeInventory ();
        a.setVisible(true);
        a.setDefaultCloseOperation(CakeInventory .DISPOSE_ON_CLOSE); 

    }//GEN-LAST:event_accountMouseClicked

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setBackground(navcolor);
    }//GEN-LAST:event_dashboardMouseExited

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setBackground(bodycolor);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked

        settingpage dashh = new settingpage ();
        maindesktop.add(dashh).setVisible(true);

    }//GEN-LAST:event_dashboardMouseClicked

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
            java.util.logging.Logger.getLogger(FirstDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account;
    private javax.swing.JLabel close;
    public static javax.swing.JLabel cname;
    private javax.swing.JPanel customize;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel navbar;
    // End of variables declaration//GEN-END:variables
}
