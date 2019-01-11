package programmenentukanbadanideal;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnEditValue1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("The Application of Ideal Weight Calculator");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 27, 381, 30);

        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCalculate.setText("Calculate Ideal Weight");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate);
        btnCalculate.setBounds(90, 90, 230, 25);

        btnEditValue1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditValue1.setText("Exit");
        btnEditValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditValue1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditValue1);
        btnEditValue1.setBounds(90, 170, 230, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/programmenentukanbadanideal/berat1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-20, 0, 620, 280);

        setSize(new java.awt.Dimension(423, 277));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(false);
        new Frame_Badan_Ideal().setVisible(true);
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnEditValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditValue1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnEditValue1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnEditValue1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
