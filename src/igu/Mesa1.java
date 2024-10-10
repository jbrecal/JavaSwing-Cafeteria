
package igu;
import javax.swing.JOptionPane;


public class Mesa1 extends javax.swing.JFrame {

   
    public Mesa1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMesa2 = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelNombreCliente = new javax.swing.JLabel();
        jLabelTelefonoCliente = new javax.swing.JLabel();
        jComboBoxComensales = new javax.swing.JComboBox<>();
        jLabelIconMesa = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();
        jButtonAnular = new javax.swing.JButton();
        jTextFieldHora = new javax.swing.JTextField();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        jTextFieldTelefonoCliente = new javax.swing.JTextField();
        jButtonReservar = new javax.swing.JButton();
        jLabelIconCafeGrande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMesa2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelMesa2.setForeground(new java.awt.Color(120, 77, 60));
        jLabelMesa2.setText("Mesa 1");
        jPanel1.add(jLabelMesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabelHora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(120, 77, 60));
        jLabelHora.setText("Hora");
        jPanel1.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabelNombreCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNombreCliente.setForeground(new java.awt.Color(120, 77, 60));
        jLabelNombreCliente.setText("Nombre");
        jPanel1.add(jLabelNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabelTelefonoCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTelefonoCliente.setForeground(new java.awt.Color(120, 77, 60));
        jLabelTelefonoCliente.setText("Telefono");
        jPanel1.add(jLabelTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jComboBoxComensales.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxComensales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxComensales.setForeground(new java.awt.Color(148, 92, 60));
        jComboBoxComensales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numero de comensales", "1", "2", "3", "4" }));
        jPanel1.add(jComboBoxComensales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabelIconMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mesa 64.png"))); // NOI18N
        jPanel1.add(jLabelIconMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarMarron32.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseExited(evt);
            }
        });
        jPanel1.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizarMarron32.png"))); // NOI18N
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseExited(evt);
            }
        });
        jPanel1.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 10, -1, -1));

        jLabelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back32Marron.png"))); // NOI18N
        jLabelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBackMouseExited(evt);
            }
        });
        jPanel1.add(jLabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButtonAnular.setBackground(new java.awt.Color(148, 92, 60));
        jButtonAnular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAnular.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnular.setText("Anular Reserva");
        jButtonAnular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAnularMouseClicked(evt);
            }
        });
        jButtonAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnularActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        jTextFieldHora.setBackground(new java.awt.Color(222, 205, 186));
        jTextFieldHora.setForeground(new java.awt.Color(132, 84, 60));
        jTextFieldHora.setBorder(null);
        jTextFieldHora.setMinimumSize(new java.awt.Dimension(64, 22));
        jTextFieldHora.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel1.add(jTextFieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 220, -1));

        jTextFieldNombreCliente.setBackground(new java.awt.Color(222, 205, 186));
        jTextFieldNombreCliente.setForeground(new java.awt.Color(132, 84, 60));
        jTextFieldNombreCliente.setBorder(null);
        jTextFieldNombreCliente.setMinimumSize(new java.awt.Dimension(64, 22));
        jTextFieldNombreCliente.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel1.add(jTextFieldNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 220, -1));

        jTextFieldTelefonoCliente.setBackground(new java.awt.Color(222, 205, 186));
        jTextFieldTelefonoCliente.setForeground(new java.awt.Color(132, 84, 60));
        jTextFieldTelefonoCliente.setBorder(null);
        jTextFieldTelefonoCliente.setMinimumSize(new java.awt.Dimension(64, 22));
        jTextFieldTelefonoCliente.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel1.add(jTextFieldTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 220, -1));

        jButtonReservar.setBackground(new java.awt.Color(148, 92, 60));
        jButtonReservar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonReservar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReservar.setText("Reservar");
        jButtonReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonReservarMouseClicked(evt);
            }
        });
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jLabelIconCafeGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/granos-de-cafe 128.png"))); // NOI18N
        jPanel1.add(jLabelIconCafeGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAnularActionPerformed

    private void jButtonAnularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAnularMouseClicked
        JOptionPane.showMessageDialog(this,"Reserva anulada");
    }//GEN-LAST:event_jButtonAnularMouseClicked

    private void jButtonReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReservarMouseClicked
         JOptionPane.showMessageDialog(this,"Reserva realizada");
    }//GEN-LAST:event_jButtonReservarMouseClicked

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonReservarActionPerformed

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        Reservas abrir = new Reservas();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        Reservas abrir = new Reservas();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jLabelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseEntered
         jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar32MarronClaro.png")));
    }//GEN-LAST:event_jLabelCerrarMouseEntered

    private void jLabelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseExited
         jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarMarron32.png")));
    }//GEN-LAST:event_jLabelCerrarMouseExited

    private void jLabelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseEntered
        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar32MarronClaro.png")));
    }//GEN-LAST:event_jLabelMinimizarMouseEntered

    private void jLabelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseExited
        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizarMarron32.png")));
    }//GEN-LAST:event_jLabelMinimizarMouseExited

    private void jLabelBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseEntered
        jLabelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back32MarronClaro.png")));
    }//GEN-LAST:event_jLabelBackMouseEntered

    private void jLabelBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseExited
        jLabelBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back32Marron.png")));
    }//GEN-LAST:event_jLabelBackMouseExited

  
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnular;
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JComboBox<String> jComboBoxComensales;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelIconCafeGrande;
    private javax.swing.JLabel jLabelIconMesa;
    private javax.swing.JLabel jLabelMesa2;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelTelefonoCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldNombreCliente;
    private javax.swing.JTextField jTextFieldTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
