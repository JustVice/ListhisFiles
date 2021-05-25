package UI;

import Logic.ListhisFiles_run;
import Logic.Static;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultFrame extends javax.swing.JFrame {

    public DefaultFrame() {
        initComponents();
        settings();
    }
    
     // <editor-fold desc="Settings">

    private void settings() {
        setIconImage(Static.getIconImage());
        this.setLocationRelativeTo(null);
        this.setTitle(Static.program_name + ". V: " + Static.version);
//        jRadioButton1_print_for_normal_txt.setSelected(Static.data.getUserData().getPrint_for_normal());
//        jRadioButton2_print_for_notepad.setSelected(Static.data.getUserData().getPrint_for_notepad());
        jRadioButton3_scan_files.setSelected(Static.data.getUserData().getScan_files());
        jRadioButton4_scan_folders.setSelected(Static.data.getUserData().getScan_folders());
        jRadioButton5_open_after_run.setSelected(Static.data.getUserData().getOpen_file_aften_run());
        scan_buttons_control();
        //jRadioButton5_open_after_run.setEnabled(false);
//        jRadioButton1_print_for_normal_txt.setEnabled(false);
//        jRadioButton2_print_for_notepad.setEnabled(false);
        //file_type_normal_or_notepad();
    }

   
    private void scan_buttons_control() {
        if (!jRadioButton3_scan_files.isSelected() && !jRadioButton4_scan_folders.isSelected()) {
            try {
                //jRadioButton3_scan_files.setEnabled(false);
                //jRadioButton4_scan_folders.setEnabled(false);
                jRadioButton3_scan_files.setSelected(true);
                Static.data.getUserData().setScan_files(true);
                Static.data.getUserData().setScan_folders(false);
                try {
                    Thread.sleep(250);
                } catch (Exception e) {
                }
                Static.data.updateInfo();
                //jRadioButton3_scan_files.setEnabled(true);
                //jRadioButton4_scan_folders.setEnabled(true);
            } catch (Exception e) {
            }
        }
    }

    // </editor-fold>
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton3_scan_files = new javax.swing.JRadioButton();
        jRadioButton4_scan_folders = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton5_open_after_run = new javax.swing.JRadioButton();
        jButton2_run_program = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRadioButton3_scan_files.setText("Scan files");
        jRadioButton3_scan_files.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_scan_filesActionPerformed(evt);
            }
        });

        jRadioButton4_scan_folders.setText("Scan folders");
        jRadioButton4_scan_folders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_scan_foldersActionPerformed(evt);
            }
        });

        jButton1.setText("How to use");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton5_open_after_run.setText("Open file after run");
        jRadioButton5_open_after_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5_open_after_runActionPerformed(evt);
            }
        });

        jButton2_run_program.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2_run_program.setText("RUN");
        jButton2_run_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_run_programActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton3_scan_files)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton4_scan_folders)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton5_open_after_run)
                            .addComponent(jButton2_run_program, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jRadioButton3_scan_files))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4_scan_folders)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton5_open_after_run)
                .addGap(18, 18, 18)
                .addComponent(jButton2_run_program)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        jLabel1.setText("Made by SPLIT VICE");

        logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/iconLogo.png"))); // NOI18N

        jLabel2.setText("<html><a href=\"\">Click here for more.<a/></html>");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logo_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo_label))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("About", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton5_open_after_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5_open_after_runActionPerformed
        Static.data.getUserData().setOpen_file_aften_run(jRadioButton5_open_after_run.isSelected());
        Static.data.updateInfo();
    }//GEN-LAST:event_jRadioButton5_open_after_runActionPerformed

    private void jRadioButton3_scan_filesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_scan_filesActionPerformed
        Static.data.getUserData().setScan_files(jRadioButton3_scan_files.isSelected());
        Static.data.getUserData().setScan_folders(jRadioButton4_scan_folders.isSelected());
        Static.data.updateInfo();
        scan_buttons_control();
    }//GEN-LAST:event_jRadioButton3_scan_filesActionPerformed

    private void jRadioButton4_scan_foldersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_scan_foldersActionPerformed
        Static.data.getUserData().setScan_files(jRadioButton3_scan_files.isSelected());
        Static.data.getUserData().setScan_folders(jRadioButton4_scan_folders.isSelected());
        Static.data.updateInfo();
        scan_buttons_control();
    }//GEN-LAST:event_jRadioButton4_scan_foldersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Frame_howToUse fhtu = new Frame_howToUse();
        fhtu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //</editor-fold>
    
    private void jButton2_run_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_run_programActionPerformed
        ListhisFiles_run ltfr = new ListhisFiles_run(jRadioButton3_scan_files.isSelected(),jRadioButton4_scan_folders.isSelected(),jRadioButton5_open_after_run.isSelected());
    }//GEN-LAST:event_jButton2_run_programActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        openLink("http://split-vice.com");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void openLink(String link){
    if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2_run_program;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton3_scan_files;
    private javax.swing.JRadioButton jRadioButton4_scan_folders;
    private javax.swing.JRadioButton jRadioButton5_open_after_run;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logo_label;
    // End of variables declaration//GEN-END:variables
}
