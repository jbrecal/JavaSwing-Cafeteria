/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

/**
 *
 * @author brene
 */
public class ReservasRealizadasPorClientes extends javax.swing.JFrame {

    /**
     * Creates new form Reservas
     */
    public ReservasRealizadasPorClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelIconCafeGrande2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelSucuarsales = new javax.swing.JLabel();
        jLabelHorarios = new javax.swing.JLabel();
        jLabelEventos = new javax.swing.JLabel();
        jLabelReservas = new javax.swing.JLabel();
        jLabelTelefonos = new javax.swing.JLabel();
        jLabelInfoConforme = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabelLetrasReserva = new javax.swing.JLabel();
        jLabelSolicitudReservas = new javax.swing.JLabel();
        jLabelNombreSolicitud = new javax.swing.JLabel();
        jLabelTelefonoSolicitud = new javax.swing.JLabel();
        jLabelMailSolicitud = new javax.swing.JLabel();
        jLabelFechaSolicitud = new javax.swing.JLabel();
        jLabelInfo2 = new javax.swing.JLabel();
        jLabelComentariosSolicitud = new javax.swing.JLabel();
        jCheckBoxConforme = new javax.swing.JCheckBox();
        jLabelInfo = new javax.swing.JLabel();
        jTextFieldComentarios = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabelIconCafeGrande = new javax.swing.JLabel();
        jLabelMenu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(290, 585));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo200.png"))); // NOI18N
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(120, 77, 60));
        jLabelUsuario.setText("Usuario");
        jPanel1.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(120, 77, 60));
        jLabelPassword.setText("Contraseña");
        jPanel1.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jTextFieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 210, 30));

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

        jLabelIconCafeGrande2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cafe128.png"))); // NOI18N
        jPanel1.add(jLabelIconCafeGrande2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(735, 535));
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSucuarsales.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSucuarsales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sucursales64-64.png"))); // NOI18N
        jLabelSucuarsales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSucuarsalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSucuarsalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSucuarsalesMouseExited(evt);
            }
        });
        jPanel2.add(jLabelSucuarsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabelHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abierto64-64.png"))); // NOI18N
        jLabelHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHorariosMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabelEventos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evento64Marron.png"))); // NOI18N
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
        jPanel2.add(jLabelEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabelReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reservado64-64.png"))); // NOI18N
        jPanel2.add(jLabelReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabelTelefonos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llamada-telefonica64-64.png"))); // NOI18N
        jLabelTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTelefonosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelTelefonosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTelefonosMouseExited(evt);
            }
        });
        jPanel2.add(jLabelTelefonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabelInfoConforme.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jLabelInfoConforme.setForeground(new java.awt.Color(120, 77, 60));
        jLabelInfoConforme.setText("le informamos que los datos personales recabados del propio interesado, serán tratados bajo la responsabilidad del Responsable del Tratamiento, Monster Coffee");
        jPanel2.add(jLabelInfoConforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jSeparator5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(120, 77, 60), new java.awt.Color(120, 77, 60), new java.awt.Color(120, 77, 60), new java.awt.Color(120, 77, 60)));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 510, -1));

        jLabelLetrasReserva.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabelLetrasReserva.setForeground(new java.awt.Color(120, 77, 60));
        jLabelLetrasReserva.setText("Reservas");
        jPanel2.add(jLabelLetrasReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabelSolicitudReservas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelSolicitudReservas.setForeground(new java.awt.Color(120, 77, 60));
        jLabelSolicitudReservas.setText("Solicitud de reserva");
        jPanel2.add(jLabelSolicitudReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabelNombreSolicitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelNombreSolicitud.setForeground(new java.awt.Color(120, 77, 60));
        jLabelNombreSolicitud.setText("Nombre");
        jPanel2.add(jLabelNombreSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabelTelefonoSolicitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelTelefonoSolicitud.setForeground(new java.awt.Color(120, 77, 60));
        jLabelTelefonoSolicitud.setText("Telefono");
        jPanel2.add(jLabelTelefonoSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabelMailSolicitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelMailSolicitud.setForeground(new java.awt.Color(120, 77, 60));
        jLabelMailSolicitud.setText("E-mail");
        jPanel2.add(jLabelMailSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabelFechaSolicitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelFechaSolicitud.setForeground(new java.awt.Color(120, 77, 60));
        jLabelFechaSolicitud.setText("Fecha");
        jPanel2.add(jLabelFechaSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jLabelInfo2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabelInfo2.setForeground(new java.awt.Color(120, 77, 60));
        jLabelInfo2.setText("Su reserva será confirmada vía e-mail y sms");
        jPanel2.add(jLabelInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabelComentariosSolicitud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabelComentariosSolicitud.setForeground(new java.awt.Color(120, 77, 60));
        jLabelComentariosSolicitud.setText("Comentarios");
        jPanel2.add(jLabelComentariosSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jCheckBoxConforme.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxConforme.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        jCheckBoxConforme.setForeground(new java.awt.Color(120, 77, 60));
        jCheckBoxConforme.setText("Conforme a lo establecido en el Artículo 13 del Reglamento (UE) 2016/679 del Parlamento Europeo y del Consejo y la Ley Orgánica 3/2018 de 5 de diciembre (LOPDGDD), ");
        jCheckBoxConforme.setActionCommand("Conforme a lo establecido en el Artículo 13 del Reglamento (UE) 2016/679 del Parlamento Europeo y del Consejo y la Ley Orgánica 3/2018 /n de 5 de diciembre (LOPDGDD), le informamos que los datos personales recabados del propio interesado, serán tratados bajo la responsabilidad del Responsable del Tratamiento, [indicar el nombre de la empresa], para el envío de comunicaciones sobre nuestros productos y servicios y se conservarán mientras ninguna de las partes se oponga a ello o durante el período necesario para cumplir con las obligaciones legales. Se garantiza un tratamiento de datos leal y transparente. Los datos no se cederán a terceros salvo en los casos en que exista una obligación legal.");
        jCheckBoxConforme.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCheckBoxConforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxConformeActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxConforme, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jLabelInfo.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabelInfo.setForeground(new java.awt.Color(120, 77, 60));
        jLabelInfo.setText("Rellana los datos del formulario solictando tu reserva. No olvide indicarnos la fecha y el número de comensales.");
        jPanel2.add(jLabelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        jTextFieldComentarios.setBackground(new java.awt.Color(222, 205, 186));
        jTextFieldComentarios.setBorder(null);
        jPanel2.add(jTextFieldComentarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 550, 50));

        jTextFieldNombre.setBackground(new java.awt.Color(222, 205, 186));
        jTextFieldNombre.setBorder(null);
        jTextFieldNombre.setMinimumSize(new java.awt.Dimension(64, 22));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel2.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 310, -1));

        jTextFieldTelefono.setBackground(new java.awt.Color(222, 205, 186));
        jTextFieldTelefono.setBorder(null);
        jTextFieldTelefono.setMinimumSize(new java.awt.Dimension(64, 22));
        jTextFieldTelefono.setPreferredSize(new java.awt.Dimension(64, 22));
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 310, -1));

        jTextFieldMail.setBackground(new java.awt.Color(222, 205, 186));
        jTextFieldMail.setBorder(null);
        jTextFieldMail.setMinimumSize(new java.awt.Dimension(64, 22));
        jTextFieldMail.setPreferredSize(new java.awt.Dimension(64, 22));
        jTextFieldMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 310, -1));

        jTextFieldFecha.setBackground(new java.awt.Color(222, 205, 186));
        jTextFieldFecha.setBorder(null);
        jTextFieldFecha.setPreferredSize(new java.awt.Dimension(64, 22));
        jPanel2.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 310, -1));

        jLabelIconCafeGrande.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/granos-de-cafe 128.png"))); // NOI18N
        jPanel2.add(jLabelIconCafeGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu64Marron.png"))); // NOI18N
        jLabelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMenuMouseExited(evt);
            }
        });
        jPanel2.add(jLabelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(735, 50));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarMarron32.png"))); // NOI18N
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseExited(evt);
            }
        });
        jPanel3.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 43, -1));

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
        jPanel3.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 43, -1));

        jLabelBack.setForeground(new java.awt.Color(255, 255, 255));
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
        jPanel3.add(jLabelBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jCheckBoxConformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxConformeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxConformeActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMailActionPerformed

    private void jLabelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBackMouseClicked
        Login volverLogin = new Login();
        volverLogin.setVisible(true);
        volverLogin.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelBackMouseClicked

    private void jLabelSucuarsalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSucuarsalesMouseClicked
        Sucursales abrir = new Sucursales();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelSucuarsalesMouseClicked

    private void jLabelTelefonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTelefonosMouseClicked
        Telefonos abrir = new Telefonos();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelTelefonosMouseClicked

    private void jLabelHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHorariosMouseClicked
        Horarios abrir = new Horarios();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelHorariosMouseClicked

    private void jLabelEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMouseClicked
        Eventos abrir = new Eventos();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);
                
    }//GEN-LAST:event_jLabelEventosMouseClicked

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

    private void jLabelSucuarsalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSucuarsalesMouseEntered
        jLabelSucuarsales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sucuarsales64MarronClaro.png")));
    }//GEN-LAST:event_jLabelSucuarsalesMouseEntered

    private void jLabelSucuarsalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSucuarsalesMouseExited
        jLabelSucuarsales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sucuarsales64MarronClaro.png")));
    }//GEN-LAST:event_jLabelSucuarsalesMouseExited

    private void jLabelTelefonosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTelefonosMouseEntered
        jLabelTelefonos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llamada-telefonica64MarronClaro.png")));
    }//GEN-LAST:event_jLabelTelefonosMouseEntered

    private void jLabelTelefonosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTelefonosMouseExited
        jLabelTelefonos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/llamada-telefonica64.png")));
    }//GEN-LAST:event_jLabelTelefonosMouseExited

    private void jLabelEventosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMouseEntered
        jLabelEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evento64MarronClaro.png")));
    }//GEN-LAST:event_jLabelEventosMouseEntered

    private void jLabelEventosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEventosMouseExited
        jLabelEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evento64Marron.png")));
    }//GEN-LAST:event_jLabelEventosMouseExited

    private void jLabelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseClicked
        Carta abrir = new Carta();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_jLabelMenuMouseClicked

    private void jLabelMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseEntered
        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu64MarronClaro.png")));
    }//GEN-LAST:event_jLabelMenuMouseEntered

    private void jLabelMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuMouseExited
        jLabelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu64Marron.png")));
    }//GEN-LAST:event_jLabelMenuMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new java.awt.Color(150, 90, 25));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new java.awt.Color(120, 77, 60));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxConforme;
    private javax.swing.JLabel jLabelBack;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelComentariosSolicitud;
    private javax.swing.JLabel jLabelEventos;
    private javax.swing.JLabel jLabelFechaSolicitud;
    private javax.swing.JLabel jLabelHorarios;
    private javax.swing.JLabel jLabelIconCafeGrande;
    private javax.swing.JLabel jLabelIconCafeGrande2;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelInfo2;
    private javax.swing.JLabel jLabelInfoConforme;
    private javax.swing.JLabel jLabelLetrasReserva;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMailSolicitud;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelNombreSolicitud;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelReservas;
    private javax.swing.JLabel jLabelSolicitudReservas;
    private javax.swing.JLabel jLabelSucuarsales;
    private javax.swing.JLabel jLabelTelefonoSolicitud;
    private javax.swing.JLabel jLabelTelefonos;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextFieldComentarios;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}