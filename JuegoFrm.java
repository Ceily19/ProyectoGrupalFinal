package ProyectoGrupal;
/**
 * 
 * @author 
 */
public class JuegoFrm extends javax.swing.JFrame {

    private Tablero tabla = new Tablero();
    
    /**
     * Creates new form JuegoFrm
     */
    public JuegoFrm() {
        initComponents();
        
        this.jpContenedor.add( tabla );
        this.jpContenedor.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpContenedor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mimenu = new javax.swing.JMenu();
        cmdPlay = new javax.swing.JMenuItem();
        cmdExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProyectoGrupal");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jpContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpContenedor.setPreferredSize(new java.awt.Dimension(560, 560));

        javax.swing.GroupLayout jpContenedorLayout = new javax.swing.GroupLayout(jpContenedor);
        jpContenedor.setLayout(jpContenedorLayout);
        jpContenedorLayout.setHorizontalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        jpContenedorLayout.setVerticalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jpContenedor, gridBagConstraints);

        mimenu.setText("File");

        cmdPlay.setText("Jugar");
        cmdPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPlayActionPerformed(evt);
            }
        });
        mimenu.add(cmdPlay);

        cmdExit.setText("Salir");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });
        mimenu.add(cmdExit);

        jMenuBar1.add(mimenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPlayActionPerformed
        tabla.comenzarJuego();
    }//GEN-LAST:event_cmdPlayActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cmdExitActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoFrm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cmdExit;
    private javax.swing.JMenuItem cmdPlay;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jpContenedor;
    private javax.swing.JMenu mimenu;
    // End of variables declaration//GEN-END:variables
}
