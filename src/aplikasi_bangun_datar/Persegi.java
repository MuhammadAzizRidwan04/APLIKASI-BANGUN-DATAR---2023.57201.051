
package aplikasi_bangun_datar;


public class Persegi extends javax.swing.JFrame {

   
    public Persegi() {
        initComponents();
        reset();
    }

    void reset() {
        tsisi.setText("");
        vluas.setText(null);
        vkeliling.setText(null);
    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bhitung = new javax.swing.JButton();
        breset = new javax.swing.JButton();
        bkembali = new javax.swing.JButton();
        tsisi = new javax.swing.JTextField();
        vluas = new javax.swing.JLabel();
        vkeliling = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_bangun_datar/square.png"))); // NOI18N
        jLabel1.setText("PERSEGI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("SISI");

        bhitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bhitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_bangun_datar/search.png"))); // NOI18N
        bhitung.setText("HITUNG");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });

        breset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        breset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_bangun_datar/refresh-arrow.png"))); // NOI18N
        breset.setText("RESET");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        bkembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_bangun_datar/undo.png"))); // NOI18N
        bkembali.setText("KEMBALI");
        bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkembaliActionPerformed(evt);
            }
        });

        tsisi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tsisi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tsisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsisiActionPerformed(evt);
            }
        });

        vluas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vluas.setText("luas");

        vkeliling.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        vkeliling.setText("keliling");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vkeliling)
                    .addComponent(vluas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bhitung)
                        .addGap(18, 18, 18)
                        .addComponent(breset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bkembali))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tsisi, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tsisi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bhitung)
                    .addComponent(breset)
                    .addComponent(bkembali))
                .addGap(30, 30, 30)
                .addComponent(vluas)
                .addGap(18, 18, 18)
                .addComponent(vkeliling)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        double sisi = Double.parseDouble(tsisi.getText());
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        vluas.setText("Luas : " + luas);
        vkeliling.setText("Keliling : " + keliling);
    }//GEN-LAST:event_bhitungActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        reset();
    }//GEN-LAST:event_bresetActionPerformed

    private void bkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkembaliActionPerformed
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_bkembaliActionPerformed

    private void tsisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsisiActionPerformed
        
    }//GEN-LAST:event_tsisiActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persegi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bhitung;
    private javax.swing.JButton bkembali;
    private javax.swing.JButton breset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tsisi;
    private javax.swing.JLabel vkeliling;
    private javax.swing.JLabel vluas;
    // End of variables declaration//GEN-END:variables
}
