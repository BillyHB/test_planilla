
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HD14Z
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        mbrMain.setVisible(false);
        pnlEmployee.setVisible(false);
        lblEmpInd.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlToolBar = new javax.swing.JPanel();
        tbnEmployee = new javax.swing.JToggleButton();
        tbtBanks = new javax.swing.JToggleButton();
        tbtAfps = new javax.swing.JToggleButton();
        lblEmpInd = new javax.swing.JLabel();
        lblAfpInd = new javax.swing.JLabel();
        lblBnkInd = new javax.swing.JLabel();
        pnlEmployee = new javax.swing.JPanel();
        spnEmpTbl = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        mbrMain = new javax.swing.JMenuBar();
        mnlFile = new javax.swing.JMenu();
        mnlCatalogues = new javax.swing.JMenu();
        mnlReports = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlToolBar.setBackground(new java.awt.Color(233, 233, 233));
        pnlToolBar.setInheritsPopupMenu(true);
        pnlToolBar.setMinimumSize(new java.awt.Dimension(210, 57));

        tbnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Empleados.png"))); // NOI18N
        tbnEmployee.setBorderPainted(false);
        tbnEmployee.setContentAreaFilled(false);
        tbnEmployee.setFocusable(false);
        tbnEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbnEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnEmployeeActionPerformed(evt);
            }
        });

        tbtBanks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bancos.png"))); // NOI18N
        tbtBanks.setBorderPainted(false);
        tbtBanks.setContentAreaFilled(false);
        tbtBanks.setFocusable(false);
        tbtBanks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtBanks.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tbtAfps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/AFPs.png"))); // NOI18N
        tbtAfps.setBorderPainted(false);
        tbtAfps.setContentAreaFilled(false);
        tbtAfps.setFocusable(false);
        tbtAfps.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtAfps.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtAfps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtAfpsActionPerformed(evt);
            }
        });

        lblEmpInd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/indicator 3.png"))); // NOI18N
        lblEmpInd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEmpInd.setDoubleBuffered(true);
        lblEmpInd.setFocusable(false);

        lblAfpInd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/indicator 3.png"))); // NOI18N
        lblAfpInd.setFocusable(false);

        lblBnkInd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/indicator 3.png"))); // NOI18N
        lblBnkInd.setFocusable(false);

        javax.swing.GroupLayout pnlToolBarLayout = new javax.swing.GroupLayout(pnlToolBar);
        pnlToolBar.setLayout(pnlToolBarLayout);
        pnlToolBarLayout.setHorizontalGroup(
            pnlToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolBarLayout.createSequentialGroup()
                .addGroup(pnlToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlToolBarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblEmpInd)
                        .addGap(20, 20, 20)
                        .addComponent(lblAfpInd)
                        .addGap(20, 20, 20)
                        .addComponent(lblBnkInd))
                    .addGroup(pnlToolBarLayout.createSequentialGroup()
                        .addComponent(tbnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tbtAfps, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tbtBanks, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 561, Short.MAX_VALUE))
        );
        pnlToolBarLayout.setVerticalGroup(
            pnlToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlToolBarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtBanks, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbtAfps, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(pnlToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAfpInd)
                    .addComponent(lblEmpInd)
                    .addComponent(lblBnkInd))
                .addGap(0, 0, 0))
        );

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
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
        spnEmpTbl.setViewportView(tblEmployee);

        javax.swing.GroupLayout pnlEmployeeLayout = new javax.swing.GroupLayout(pnlEmployee);
        pnlEmployee.setLayout(pnlEmployeeLayout);
        pnlEmployeeLayout.setHorizontalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spnEmpTbl, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        pnlEmployeeLayout.setVerticalGroup(
            pnlEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmployeeLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(spnEmpTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnlFile.setText("Archivo");
        mbrMain.add(mnlFile);

        mnlCatalogues.setText("Catalogos");
        mbrMain.add(mnlCatalogues);

        mnlReports.setText("Reportes");
        mbrMain.add(mnlReports);

        setJMenuBar(mbrMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnEmployeeActionPerformed
        if (tbnEmployee.isSelected() == true){
            lblEmpInd.setVisible(true);
        
        }
        
        else {
            lblEmpInd.setVisible(false);
             
        }
    }//GEN-LAST:event_tbnEmployeeActionPerformed

    private void tbtAfpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtAfpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtAfpsActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        //Sets systems look and feel       
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
 
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAfpInd;
    private javax.swing.JLabel lblBnkInd;
    private javax.swing.JLabel lblEmpInd;
    private javax.swing.JMenuBar mbrMain;
    private javax.swing.JMenu mnlCatalogues;
    private javax.swing.JMenu mnlFile;
    private javax.swing.JMenu mnlReports;
    private javax.swing.JPanel pnlEmployee;
    private javax.swing.JPanel pnlToolBar;
    private javax.swing.JScrollPane spnEmpTbl;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JToggleButton tbnEmployee;
    private javax.swing.JToggleButton tbtAfps;
    private javax.swing.JToggleButton tbtBanks;
    // End of variables declaration//GEN-END:variables
}
