package UI;

import Logic.Static;
import java.io.File;
import java.util.LinkedList;

public class Test_room extends javax.swing.JFrame {

    public Test_room() {
        initComponents();
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1_test_1 = new javax.swing.JButton();
        jButton1_test_2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1_test_1.setText("Test 1");
        jButton1_test_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_test_1ActionPerformed(evt);
            }
        });

        jButton1_test_2.setText("Test 2");
        jButton1_test_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_test_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1_test_2)
                    .addComponent(jButton1_test_1))
                .addContainerGap(737, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1_test_1)
                .addGap(27, 27, 27)
                .addComponent(jButton1_test_2)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_test_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_test_1ActionPerformed
        File file = new File(System.getProperty("user.dir"));
        String[] files_list = file.list();
        
        
        LinkedList<String> list_programs = new LinkedList<String>();
        LinkedList<String> list_dirs = new LinkedList<String>();
        String result = "";
        
        for (int i = 0; i < files_list.length; i++) {
            String path_review = System.getProperty("user.dir") +"\\"+ files_list[i];
            //System.out.println(path_review);
            File file_review = new File(path_review);
            if(file_review.isFile()){
                System.out.println("File name: " + files_list[i]);
                result += files_list[i] + "\n";
            }
        }
        Static.run.BuildTxtFile("here", "ListhisFiles results", ".txt", result);
    }//GEN-LAST:event_jButton1_test_1ActionPerformed

    private void jButton1_test_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_test_2ActionPerformed
        //File file = new File("F:\\Programas\\MediBangPaintProSetup-13.1-64bit.exe");
        File file = new File(System.getProperty("user.dir") +"\\" + "ListhisFiles results.txt");
        if(file.isFile()){
            System.out.println("is file");
        }
    }//GEN-LAST:event_jButton1_test_2ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_test_1;
    private javax.swing.JButton jButton1_test_2;
    // End of variables declaration//GEN-END:variables
}
