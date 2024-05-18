package aplikasi_bangun_datar;

public class PersegiPanjang extends javax.swing.JFrame {

    public PersegiPanjang() {
        initComponents();
        reset();
    }

    void reset() {
        tLebar.setText("");
        tPanjang.setText(null);
        vLuas.setText(null);
        vKeliling.setText(null);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bHitung = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tPanjang = new javax.swing.JTextField();
        tLebar = new javax.swing.JTextField();
        bReset = new javax.swing.JButton();
        bKembali = new javax.swing.JButton();
        vLuas = new javax.swing.JLabel();
        vKeliling = new javax.swing.JLabel();
        bhitung = new javax.swing.JButton();

        bHitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bHitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_bangun_datar/search.png"))); // NOI18N
        bHitung.setText("HITUNG");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_bangun_datar/rectangle.png"))); // NOI18N
        jLabel1.setText("PERSEGI PANJANG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("PANJANG");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("LEBAR");

        tPanjang.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tPanjang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPanjangActionPerformed(evt);
            }
        });

        tLebar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tLebar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tLebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLebarActionPerformed(evt);
            }
        });

        bReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_bangun_datar/refresh-arrow.png"))); // NOI18N
        bReset.setText("RESET");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_bangun_datar/undo.png"))); // NOI18N
        bKembali.setText("KEMBALI");
        bKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKembaliActionPerformed(evt);
            }
        });

        vLuas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vLuas.setText("luas");

        vKeliling.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vKeliling.setText("keliling");

        bhitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bhitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_bangun_datar/search.png"))); // NOI18N
        bhitung.setText("HITUNG");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tLebar)
                            .addComponent(tPanjang)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3)
                            .addComponent(vLuas)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bhitung)
                                .addGap(18, 18, 18)
                                .addComponent(bReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bKembali))
                            .addComponent(vKeliling))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(bKembali)
                    .addComponent(bhitung))
                .addGap(18, 18, 18)
                .addComponent(vLuas)
                .addGap(22, 22, 22)
                .addComponent(vKeliling)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKembaliActionPerformed
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_bKembaliActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        
    }//GEN-LAST:event_bHitungActionPerformed

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        double panjang = Double.parseDouble(tPanjang.getText());
        double lebar = Double.parseDouble(tLebar.getText());
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);
        vLuas.setText("Luas : " + luas);
        vKeliling.setText("Keliling : " + keliling);
    }//GEN-LAST:event_bhitungActionPerformed

    private void tPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPanjangActionPerformed
        
    }//GEN-LAST:event_tPanjangActionPerformed

    private void tLebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLebarActionPerformed
       
    }//GEN-LAST:event_tLebarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersegiPanjang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bKembali;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bhitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tLebar;
    private javax.swing.JTextField tPanjang;
    private javax.swing.JLabel vKeliling;
    private javax.swing.JLabel vLuas;
    // End of variables declaration//GEN-END:variables
}
