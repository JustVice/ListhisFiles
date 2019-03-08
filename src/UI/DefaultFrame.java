package UI;

import Logic.ReadFiles;
import Logic.Static;

public class DefaultFrame extends javax.swing.JFrame {

    public DefaultFrame() {
        initComponents();
        settings();
    }

    private void settings() {
        setIconImage(Static.getIconImage());
        this.setLocationRelativeTo(null);
        this.setTitle(Static.program_name + ". Version: " + Static.version);
        jRadioButton1_print_for_normal_txt.setSelected(Static.data.getUserData().getPrint_for_normal());
        jRadioButton2_print_for_notepad.setSelected(Static.data.getUserData().getPrint_for_notepad());
        jRadioButton3_scan_files.setSelected(Static.data.getUserData().getScan_files());
        jRadioButton4_scan_folders.setSelected(Static.data.getUserData().getScan_folders());
        jRadioButton5_open_after_run.setSelected(Static.data.getUserData().getOpen_file_aften_run());
        scan_buttons_control();
        //file_type_normal_or_notepad();
    }

    // <editor-fold desc="Radio buttons settings">
    private void scan_buttons_control() {
        if (!jRadioButton3_scan_files.isSelected() && !jRadioButton4_scan_folders.isSelected()) {
            try {
                //jRadioButton3_scan_files.setEnabled(false);
                //jRadioButton4_scan_folders.setEnabled(false);
                jRadioButton3_scan_files.setSelected(true);
                Static.data.getUserData().setScan_files(true);
                Static.data.getUserData().setScan_folders(false);
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
        jRadioButton1_print_for_normal_txt = new javax.swing.JRadioButton();
        jRadioButton2_print_for_notepad = new javax.swing.JRadioButton();
        jRadioButton3_scan_files = new javax.swing.JRadioButton();
        jRadioButton4_scan_folders = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton5_open_after_run = new javax.swing.JRadioButton();
        jButton2_run_program = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1_print_for_normal_txt);
        jRadioButton1_print_for_normal_txt.setText("Print for normal txt file");
        jRadioButton1_print_for_normal_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_print_for_normal_txtActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2_print_for_notepad);
        jRadioButton2_print_for_notepad.setText("Print for Notepad");
        jRadioButton2_print_for_notepad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_print_for_notepadActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1_print_for_normal_txt)
                            .addComponent(jRadioButton2_print_for_notepad))
                        .addGap(120, 120, 120))
                    .addComponent(jRadioButton5_open_after_run, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jButton2_run_program))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jRadioButton3_scan_files)
                                .addComponent(jRadioButton4_scan_folders)))))
                .addGap(283, 283, 283))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jRadioButton3_scan_files))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1_print_for_normal_txt)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2_print_for_notepad)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton5_open_after_run)
                            .addComponent(jRadioButton4_scan_folders))))
                .addGap(18, 18, 18)
                .addComponent(jButton2_run_program)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("About", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 286, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold desc="Radio buttons action performed">
    
    private void jRadioButton1_print_for_normal_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_print_for_normal_txtActionPerformed
        Static.data.getUserData().setPrint_for_normal(true);
        Static.data.getUserData().setPrint_for_notepad(false);
        Static.data.updateInfo();
    }//GEN-LAST:event_jRadioButton1_print_for_normal_txtActionPerformed

    private void jRadioButton2_print_for_notepadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_print_for_notepadActionPerformed
        Static.data.getUserData().setPrint_for_normal(false);
        Static.data.getUserData().setPrint_for_notepad(true);
        Static.data.updateInfo();
    }//GEN-LAST:event_jRadioButton2_print_for_notepadActionPerformed

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
        //ReadFiles readFiles = new ReadFiles(System.getProperty("user.dir"),jRadioButton3_scan_files.isSelected(),jRadioButton4_scan_folders.isSelected());
    }//GEN-LAST:event_jButton2_run_programActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2_run_program;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1_print_for_normal_txt;
    private javax.swing.JRadioButton jRadioButton2_print_for_notepad;
    private javax.swing.JRadioButton jRadioButton3_scan_files;
    private javax.swing.JRadioButton jRadioButton4_scan_folders;
    private javax.swing.JRadioButton jRadioButton5_open_after_run;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}