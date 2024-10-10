
package igu;

import java.awt.Color;


public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelLogo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelIconCafeGrande2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelReservas = new javax.swing.JLabel();
        jLabelLetrasSucursales = new javax.swing.JLabel();
        jLabelLetrasTelefono = new javax.swing.JLabel();
        jLabelLetrasEventos = new javax.swing.JLabel();
        jLabelLetrasCarta = new javax.swing.JLabel();
        jLabelLetrasReserva = new javax.swing.JLabel();
        jLabelLetrasHorario = new javax.swing.JLabel();
        jLabelSucursales = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelHorarios = new javax.swing.JLabel();
        jLabelEventos = new javax.swing.JLabel();
        jLabelCarta = new javax.swing.JLabel();
        jLabelIconCafeGrande = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelCerrarApp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(290, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(120, 77, 60));
        jLabelPassword.setText("Contraseña:");
        jPanel1.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(120, 77, 60));
        jLabelUsuario.setText("Usuario: ");
        jPanel1.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 210, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 220, 10));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 180, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 220, 10));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo200.png"))); // NOI18N
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menuhamburguesa.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelIconCafeGrande2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/granos-de-cafe 128.png"))); // NOI18N
        jPanel1.add(jLabelIconCafeGrande2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        jButton1.setBackground(new java.awt.Color(120, 77, 60));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENVIAR");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(760, 540));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelReservas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelReservas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reservado128Marron.png"))); // NOI18N
        jLabelReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelReservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelReservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelReservasMouseExited(evt);
            }
        });
        jPanel2.add(jLabelReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 130, -1));

        jLabelLetrasSucursales.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLetrasSucursales.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelLetrasSucursales.setForeground(new java.awt.Color(120, 77, 60));
        jLabelLetrasSucursales.setText("SUCURSALES");
        jLabelLetrasSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLetrasSucursalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLetrasSucursalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLetrasSucursalesMouseExited(evt);
            }
        });
        jPanel2.add(jLabelLetrasSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, 20));

        jLabelLetrasTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLetrasTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelLetrasTelefono.setForeground(new java.awt.Color(120, 77, 60));
        jLabelLetrasTelefono.setText("TELÉFONOS");
        jLabelLetrasTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLetrasTelefonoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLetrasTelefonoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLetrasTelefonoMouseExited(evt);
            }
        });
        jPanel2.add(jLabelLetrasTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 130, 20));

        jLabelLetrasEventos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLetrasEventos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelLetrasEventos.setForeground(new java.awt.Color(120, 77, 60));
        jLabelLetrasEventos.setText("EVENTOS");
        jLabelLetrasEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLetrasEventosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLetrasEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLetrasEventosMouseExited(evt);
            }
        });
        jPanel2.add(jLabelLetrasEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 130, 20));

        jLabelLetrasCarta.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLetrasCarta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelLetrasCarta.setForeground(new java.awt.Color(120, 77, 60));
        jLabelLetrasCarta.setText("CARTA");
        jLabelLetrasCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLetrasCartaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLetrasCartaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLetrasCartaMouseExited(evt);
            }
        });
        jPanel2.add(jLabelLetrasCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 80, 20));

        jLabelLetrasReserva.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLetrasReserva.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelLetrasReserva.setForeground(new java.awt.Color(120, 77, 60));
        jLabelLetrasReserva.setText("RESERVAS");
        jLabelLetrasReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLetrasReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLetrasReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLetrasReservaMouseExited(evt);
            }
        });
        jPanel2.add(jLabelLetrasReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 130, 20));

        jLabelLetrasHorario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLetrasHorario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelLetrasHorario.setForeground(new java.awt.Color(120, 77, 60));
        jLabelLetrasHorario.setText("HORARIOS");
        jLabelLetrasHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLetrasHorarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLetrasHorarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLetrasHorarioMouseExited(evt);
            }
        });
        jPanel2.add(jLabelLetrasHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 130, 20));

        jLabelSucursales.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSucursales.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sucursales64Marron.png"))); // NOI18N
        jLabelSucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSucursalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSucursalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSucursalesMouseExited(evt);
            }
        });
        jPanel2.add(jLabelSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, -1));

        jLabelTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llamada-telefonica128.png"))); // NOI18N
        jLabelTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTelefonoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelTelefonoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTelefonoMouseExited(evt);
            }
        });
        jPanel2.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 130, -1));

        jLabelHorarios.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHorarios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abierto64Marron.png"))); // NOI18N
        jLabelHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHorariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHorariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHorariosMouseExited(evt);
            }
        });
        jPanel2.add(jLabelHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 130, -1));

        jLabelEventos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEventos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evento128Marron.png"))); // NOI18N
        jLabelEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEventosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEventosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEventosMouseExited(evt);
            }
        });
        jPanel2.add(jLabelEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 130, -1));

        jLabelCarta.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCarta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu128Marron.png"))); // NOI18N
        jLabelCarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCartaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCartaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCartaMouseExited(evt);
            }
        });
        jPanel2.add(jLabelCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 130, -1));

        jLabelIconCafeGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/granos-de-cafe 128.png"))); // NOI18N
        jPanel2.add(jLabelIconCafeGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/granos-de-cafe 128.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-78, 435, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 45, 745, 545));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(745, 50));
        jPanel3.setVerifyInputWhenFocusTarget(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizarMarron32.png"))); // NOI18N
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseExited(evt);
            }
        });
        jPanel3.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, 40));

        jLabelCerrarApp.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCerrarApp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrarApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarMarron32.png"))); // NOI18N
        jLabelCerrarApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCerrarAppMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCerrarAppMouseExited(evt);
            }
        });
        jPanel3.add(jLabelCerrarApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 4, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 745, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabelSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSucursalesMouseClicked
     Sucursales abrir = new Sucursales();  //nos trasladamos a Sucursales y cerramos Login
     abrir.setVisible(true);
     abrir.setLocationRelativeTo(null);
     this.setVisible(false);
     
     
     
    }//GEN-LAST:event_jLabelSucursalesMouseClicked

    private void jLabelLetrasSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasSucursalesMouseClicked
        Sucursales abrir = new Sucursales();   //nos trasladamos a Sucursales y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelLetrasSucursalesMouseClicked

    private void jLabelSucursalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSucursalesMouseEntered
jLabelSucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sucursales128MarronClaro.png")));       
    }//GEN-LAST:event_jLabelSucursalesMouseEntered

    private void jLabelLetrasSucursalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasSucursalesMouseEntered
     jLabelLetrasSucursales.setFont(new java.awt.Font("Dialog", 1, 18));
    }//GEN-LAST:event_jLabelLetrasSucursalesMouseEntered

    private void jLabelLetrasSucursalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasSucursalesMouseExited
        jLabelLetrasSucursales.setFont(new java.awt.Font("Dialog", 0, 18));
    }//GEN-LAST:event_jLabelLetrasSucursalesMouseExited

    private void jLabelTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTelefonoMouseClicked
        Telefonos abrir = new Telefonos();  //nos trasladamos a Telefonos y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelTelefonoMouseClicked

    private void jLabelLetrasTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasTelefonoMouseClicked
        Telefonos abrir = new Telefonos();  //nos trasladamos a Telefonos y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelLetrasTelefonoMouseClicked

    private void jLabelHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHorariosMouseClicked
        Horarios abrir = new Horarios();  //nos trasladamos a Horarios y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabelHorariosMouseClicked

    private void jLabelEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMouseClicked
        Eventos abrir = new Eventos();  //nos trasladamos a Eventos y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelEventosMouseClicked

    private void jLabelLetrasHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasHorarioMouseClicked
        Horarios abrir = new Horarios();  //nos trasladamos a Horarios y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabelLetrasHorarioMouseClicked

    private void jLabelLetrasEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasEventosMouseClicked
        Eventos abrir = new Eventos();  //nos trasladamos a Eventos y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelLetrasEventosMouseClicked

    private void jLabelCartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCartaMouseClicked
        Carta abrir = new Carta();  // nos trasladamos a Carta y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelCartaMouseClicked

    private void jLabelLetrasCartaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasCartaMouseClicked
        Carta abrir = new Carta();  // nos trasladamos a Carta y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelLetrasCartaMouseClicked

    private void jLabelReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReservasMouseClicked
        Reservas abrir = new Reservas();  // nos trasladamos a reservas y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelReservasMouseClicked

    private void jLabelLetrasReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasReservaMouseClicked
        ReservasRealizadasPorClientes abrir = new ReservasRealizadasPorClientes();  // nos trasladamos a reservas y cerramos Login
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelLetrasReservaMouseClicked

    private void jLabelSucursalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSucursalesMouseExited
        jLabelSucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sucursales64Marron.png")));
    }//GEN-LAST:event_jLabelSucursalesMouseExited

    private void jLabelTelefonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTelefonoMouseEntered
        jLabelTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llamada-telefonica128MarronClaro.png")));
    }//GEN-LAST:event_jLabelTelefonoMouseEntered

    private void jLabelTelefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTelefonoMouseExited
        jLabelTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llamada-telefonica128.png")));
    }//GEN-LAST:event_jLabelTelefonoMouseExited

    private void jLabelHorariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHorariosMouseEntered
        jLabelHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abierto128MarronClaro.png")));
    }//GEN-LAST:event_jLabelHorariosMouseEntered

    private void jLabelHorariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHorariosMouseExited
        jLabelHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abierto64Marron.png")));
    }//GEN-LAST:event_jLabelHorariosMouseExited

    private void jLabelEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMouseEntered
        jLabelEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evento128MarronClaro.png")));
    }//GEN-LAST:event_jLabelEventosMouseEntered

    private void jLabelEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMouseExited
        jLabelEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evento128Marron.png")));
    }//GEN-LAST:event_jLabelEventosMouseExited

    private void jLabelCartaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCartaMouseEntered
        jLabelCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu128MarronClaro.png")));
    }//GEN-LAST:event_jLabelCartaMouseEntered

    private void jLabelCartaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCartaMouseExited
        jLabelCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu128Marron.png")));
    }//GEN-LAST:event_jLabelCartaMouseExited

    private void jLabelReservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReservasMouseEntered
        jLabelReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reservado128MarronClaro.png")));
    }//GEN-LAST:event_jLabelReservasMouseEntered

    private void jLabelReservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelReservasMouseExited
        jLabelReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reservado128Marron.png")));
    }//GEN-LAST:event_jLabelReservasMouseExited

    private void jLabelCerrarAppMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarAppMouseEntered
         jLabelCerrarApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar32MarronClaro.png")));
    }//GEN-LAST:event_jLabelCerrarAppMouseEntered

    private void jLabelCerrarAppMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarAppMouseExited
         jLabelCerrarApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarMarron32.png")));
    }//GEN-LAST:event_jLabelCerrarAppMouseExited

    private void jLabelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseEntered
        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizar32MarronClaro.png")));
    }//GEN-LAST:event_jLabelMinimizarMouseEntered

    private void jLabelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseExited
        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimizarMarron32.png")));
    }//GEN-LAST:event_jLabelMinimizarMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(150, 90, 25));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(120, 77, 60));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelLetrasTelefonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasTelefonoMouseEntered
       jLabelLetrasTelefono.setFont(new java.awt.Font("Dialog", 1, 18));
    }//GEN-LAST:event_jLabelLetrasTelefonoMouseEntered

    private void jLabelLetrasTelefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasTelefonoMouseExited
        jLabelLetrasTelefono.setFont(new java.awt.Font("Dialog", 0, 18));
    }//GEN-LAST:event_jLabelLetrasTelefonoMouseExited

    private void jLabelLetrasHorarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasHorarioMouseEntered
        jLabelLetrasHorario.setFont(new java.awt.Font("Dialog", 1, 18));
    }//GEN-LAST:event_jLabelLetrasHorarioMouseEntered

    private void jLabelLetrasHorarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasHorarioMouseExited
        jLabelLetrasHorario.setFont(new java.awt.Font("Dialog", 0, 18));
    }//GEN-LAST:event_jLabelLetrasHorarioMouseExited

    private void jLabelLetrasEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasEventosMouseEntered
        jLabelLetrasEventos.setFont(new java.awt.Font("Dialog", 1, 18));
    }//GEN-LAST:event_jLabelLetrasEventosMouseEntered

    private void jLabelLetrasEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasEventosMouseExited
        jLabelLetrasEventos.setFont(new java.awt.Font("Dialog", 0, 18));
    }//GEN-LAST:event_jLabelLetrasEventosMouseExited

    private void jLabelLetrasCartaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasCartaMouseEntered
        jLabelLetrasCarta.setFont(new java.awt.Font("Dialog", 1, 18));
    }//GEN-LAST:event_jLabelLetrasCartaMouseEntered

    private void jLabelLetrasCartaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasCartaMouseExited
        jLabelLetrasCarta.setFont(new java.awt.Font("Dialog", 0, 18));
    }//GEN-LAST:event_jLabelLetrasCartaMouseExited

    private void jLabelLetrasReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasReservaMouseEntered
        jLabelLetrasReserva.setFont(new java.awt.Font("Dialog", 1, 18));
    }//GEN-LAST:event_jLabelLetrasReservaMouseEntered

    private void jLabelLetrasReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLetrasReservaMouseExited
        jLabelLetrasReserva.setFont(new java.awt.Font("Dialog", 0, 18));
    }//GEN-LAST:event_jLabelLetrasReservaMouseExited

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCarta;
    private javax.swing.JLabel jLabelCerrarApp;
    private javax.swing.JLabel jLabelEventos;
    private javax.swing.JLabel jLabelHorarios;
    private javax.swing.JLabel jLabelIconCafeGrande;
    private javax.swing.JLabel jLabelIconCafeGrande2;
    private javax.swing.JLabel jLabelLetrasCarta;
    private javax.swing.JLabel jLabelLetrasEventos;
    private javax.swing.JLabel jLabelLetrasHorario;
    private javax.swing.JLabel jLabelLetrasReserva;
    private javax.swing.JLabel jLabelLetrasSucursales;
    private javax.swing.JLabel jLabelLetrasTelefono;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelReservas;
    private javax.swing.JLabel jLabelSucursales;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private Color Color(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
