package Interfaz;

import Code.Gym;
import Code.*;
import javax.swing.*;
import utiles.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

public class VentanaLogin extends javax.swing.JFrame {

    public VentanaLogin() {
        initComponents();
        scrollLaminaRegistrarse.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laminaLogin = new javax.swing.JPanel();
        textoCorreo = new javax.swing.JLabel();
        textoContrasenna = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        botonIniciarSesion = new javax.swing.JButton();
        textoRegistrarse = new javax.swing.JLabel();
        textoClickAqui = new javax.swing.JLabel();
        imagenLogo = new javax.swing.JLabel(Util_Interfaz.reescalarImagen(new ImageIcon("src/main/java/imagenes/logo.png")));
        campoContrasenna = new javax.swing.JPasswordField();
        checkBoxMostrarContraseña = new javax.swing.JCheckBox();
        separadorCorreo = new javax.swing.JSeparator();
        separadorContrasenna = new javax.swing.JSeparator();
        imagenArroba = new javax.swing.JLabel(new ImageIcon("src/main/java/imagenes/Arroba.png"));
        imagenCandado = new javax.swing.JLabel(new ImageIcon("src/main/java/imagenes/Candado.png"));
        scrollLaminaRegistrarse = new javax.swing.JScrollPane();
        laminaRegistrarse = new javax.swing.JPanel();
        laminaBotonRegistrarse = new javax.swing.JPanel();
        botonAtrasRegistrarse = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JButton();
        laminaObjetosRegistrarse = new javax.swing.JPanel();
        textoTipoCuenta = new javax.swing.JLabel();
        desplegableTipoCliente = new javax.swing.JComboBox<>();
        textoNombreUsuarioRegistro = new javax.swing.JLabel();
        campoNombreUsuarioRegistro = new javax.swing.JTextField();
        textoTipoCuenta1 = new javax.swing.JLabel();
        campoNombreUsuarioRegistro1 = new javax.swing.JTextField();
        textocorreo = new javax.swing.JLabel();
        campoCorreoRegistro = new javax.swing.JTextField();
        textoContrasennaRegistro = new javax.swing.JLabel();
        campoContrasennaRegistro = new javax.swing.JTextField();
        textoNumeroTelefono = new javax.swing.JLabel();
        campoNumeroTelefono = new javax.swing.JTextField();
        textoIBAN = new javax.swing.JLabel();
        campoIBAN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gimnasio");
        setIconImage(new ImageIcon("src/main/java/imagenes/logo.png").getImage());

        laminaLogin.setBackground(new java.awt.Color(33, 45, 62));

        textoCorreo.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 24)); // NOI18N
        textoCorreo.setForeground(new java.awt.Color(255, 255, 255));
        textoCorreo.setText("Correo electrónico:");

        textoContrasenna.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 24)); // NOI18N
        textoContrasenna.setForeground(new java.awt.Color(255, 255, 255));
        textoContrasenna.setText("Contraseña:");

        campoCorreo.setBackground(new java.awt.Color(33, 45, 62));
        campoCorreo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(73, 181, 172));
        campoCorreo.setBorder(null);
        campoCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCorreoKeyTyped(evt);
            }
        });

        botonIniciarSesion.setIcon(new ImageIcon("src/main/java/imagenes/botonIniciarSesion.png"));
        botonIniciarSesion.setPressedIcon(new ImageIcon("src/main/java/imagenes/botonIniciarSesionPulsado.png"));
        botonIniciarSesion.setRolloverIcon(new ImageIcon("src/main/java/imagenes/botonIniciarSesionSeleccionado.png"));
        botonIniciarSesion.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 18)); // NOI18N
        botonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciarSesion.setBorderPainted(false);
        botonIniciarSesion.setContentAreaFilled(false);
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        textoRegistrarse.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        textoRegistrarse.setForeground(new java.awt.Color(212, 212, 212));
        textoRegistrarse.setText("¿No tienes una cuenta?, regístrate haciendo click ");

        textoClickAqui.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        textoClickAqui.setForeground(new java.awt.Color(103, 140, 249));
        textoClickAqui.setText("aquí");
        textoClickAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textoClickAquiMousePressed(evt);
            }
        });

        campoContrasenna.setBackground(new java.awt.Color(33, 45, 62));
        campoContrasenna.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16)); // NOI18N
        campoContrasenna.setForeground(new java.awt.Color(73, 181, 172));
        campoContrasenna.setBorder(null);
        campoContrasenna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoContrasennaKeyTyped(evt);
            }
        });

        checkBoxMostrarContraseña.setBackground(new java.awt.Color(33, 45, 62));
        checkBoxMostrarContraseña.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        checkBoxMostrarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        checkBoxMostrarContraseña.setText("Mostrar contraseña");
        checkBoxMostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMostrarContraseñaActionPerformed(evt);
            }
        });

        separadorCorreo.setBackground(new java.awt.Color(73, 181, 172));
        separadorCorreo.setForeground(new java.awt.Color(73, 181, 172));
        separadorCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        separadorCorreo.setEnabled(false);
        separadorCorreo.setOpaque(true);

        separadorContrasenna.setBackground(new java.awt.Color(73, 181, 172));
        separadorContrasenna.setForeground(new java.awt.Color(73, 181, 172));
        separadorContrasenna.setEnabled(false);
        separadorContrasenna.setOpaque(true);

        javax.swing.GroupLayout laminaLoginLayout = new javax.swing.GroupLayout(laminaLogin);
        laminaLogin.setLayout(laminaLoginLayout);
        laminaLoginLayout.setHorizontalGroup(
            laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, laminaLoginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, laminaLoginLayout.createSequentialGroup()
                        .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, laminaLoginLayout.createSequentialGroup()
                        .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(separadorCorreo)
                            .addComponent(separadorContrasenna)
                            .addGroup(laminaLoginLayout.createSequentialGroup()
                                .addComponent(imagenArroba)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(laminaLoginLayout.createSequentialGroup()
                                .addGap(0, 24, Short.MAX_VALUE)
                                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, laminaLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkBoxMostrarContraseña)
                .addGap(56, 56, 56))
            .addGroup(laminaLoginLayout.createSequentialGroup()
                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(laminaLoginLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCorreo)
                            .addComponent(textoContrasenna)
                            .addComponent(imagenCandado)))
                    .addGroup(laminaLoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textoRegistrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoClickAqui))
                    .addGroup(laminaLoginLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        laminaLoginLayout.setVerticalGroup(
            laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laminaLoginLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(textoCorreo)
                .addGap(22, 22, 22)
                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenArroba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(textoContrasenna)
                .addGap(18, 18, 18)
                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(laminaLoginLayout.createSequentialGroup()
                        .addComponent(campoContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separadorContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkBoxMostrarContraseña)
                        .addGap(18, 18, 18)
                        .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoRegistrarse)
                            .addComponent(textoClickAqui)))
                    .addComponent(imagenCandado))
                .addGap(9, 9, 9))
        );

        scrollLaminaRegistrarse.setBackground(new java.awt.Color(33, 45, 62));
        scrollLaminaRegistrarse.setBorder(null);
        scrollLaminaRegistrarse.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        laminaRegistrarse.setBackground(new java.awt.Color(33, 45, 62));
        laminaRegistrarse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 20, 1));

        laminaBotonRegistrarse.setBackground(new java.awt.Color(33, 45, 62));
        laminaBotonRegistrarse.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 25));
        laminaBotonRegistrarse.setLayout(new java.awt.GridLayout(0, 2));

        botonAtrasRegistrarse.setIcon(new ImageIcon("src/main/java/imagenes/botonAtras.png"));
        botonAtrasRegistrarse.setPressedIcon(new ImageIcon("src/main/java/imagenes/botonAtrasPulsado.png"));
        botonAtrasRegistrarse.setRolloverIcon(new ImageIcon("src/main/java/imagenes/botonAtrasSeleccionado.png"));
        botonAtrasRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonAtrasRegistrarse.setBorder(null);
        botonAtrasRegistrarse.setBorderPainted(false);
        botonAtrasRegistrarse.setContentAreaFilled(false);
        botonAtrasRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasRegistrarseActionPerformed(evt);
            }
        });
        laminaBotonRegistrarse.add(botonAtrasRegistrarse);

        botonRegistrarse.setIcon(new ImageIcon("src/main/java/imagenes/botonRegistrarse.png"));
        botonRegistrarse.setPressedIcon(new ImageIcon("src/main/java/imagenes/botonRegistrarsePulsado.png"));
        botonRegistrarse.setRolloverIcon(new ImageIcon("src/main/java/imagenes/botonRegistrarseSeleccionado.png"));
        botonRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonRegistrarse.setBorder(null);
        botonRegistrarse.setBorderPainted(false);
        botonRegistrarse.setContentAreaFilled(false);
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        laminaBotonRegistrarse.add(botonRegistrarse);

        laminaObjetosRegistrarse.setBackground(new java.awt.Color(33, 45, 62));
        laminaObjetosRegistrarse.setBorder(javax.swing.BorderFactory.createEmptyBorder(35, 10, 30, 50));
        laminaObjetosRegistrarse.setLayout(new java.awt.GridLayout(0, 2, 25, 40));

        textoTipoCuenta.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoTipoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        textoTipoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoTipoCuenta.setText("Tipo de cuenta:");
        laminaObjetosRegistrarse.add(textoTipoCuenta);

        desplegableTipoCliente.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        desplegableTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Estudiante", "Jubilado", "Familia numerosa" }));
        desplegableTipoCliente.setSelectedIndex(0);
        laminaObjetosRegistrarse.add(desplegableTipoCliente);

        textoNombreUsuarioRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoNombreUsuarioRegistro.setForeground(new java.awt.Color(255, 255, 255));
        textoNombreUsuarioRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoNombreUsuarioRegistro.setText("Nombre:");
        laminaObjetosRegistrarse.add(textoNombreUsuarioRegistro);

        campoNombreUsuarioRegistro.setBackground(new java.awt.Color(33, 45, 62));
        campoNombreUsuarioRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoNombreUsuarioRegistro.setForeground(new java.awt.Color(73, 181, 172));
        campoNombreUsuarioRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoNombreUsuarioRegistro);

        textoTipoCuenta1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoTipoCuenta1.setForeground(new java.awt.Color(255, 255, 255));
        textoTipoCuenta1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoTipoCuenta1.setText("Apellidos:");
        laminaObjetosRegistrarse.add(textoTipoCuenta1);

        campoNombreUsuarioRegistro1.setBackground(new java.awt.Color(33, 45, 62));
        campoNombreUsuarioRegistro1.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoNombreUsuarioRegistro1.setForeground(new java.awt.Color(73, 181, 172));
        campoNombreUsuarioRegistro1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoNombreUsuarioRegistro1);

        textocorreo.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textocorreo.setForeground(new java.awt.Color(255, 255, 255));
        textocorreo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textocorreo.setText("Correo electrónico:");
        laminaObjetosRegistrarse.add(textocorreo);

        campoCorreoRegistro.setBackground(new java.awt.Color(33, 45, 62));
        campoCorreoRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoCorreoRegistro.setForeground(new java.awt.Color(73, 181, 172));
        campoCorreoRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoCorreoRegistro);

        textoContrasennaRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoContrasennaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        textoContrasennaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoContrasennaRegistro.setText("Contraseña:");
        laminaObjetosRegistrarse.add(textoContrasennaRegistro);

        campoContrasennaRegistro.setBackground(new java.awt.Color(33, 45, 62));
        campoContrasennaRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoContrasennaRegistro.setForeground(new java.awt.Color(73, 181, 172));
        campoContrasennaRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoContrasennaRegistro);

        textoNumeroTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoNumeroTelefono.setForeground(new java.awt.Color(255, 255, 255));
        textoNumeroTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoNumeroTelefono.setText("Número de teléfono:");
        laminaObjetosRegistrarse.add(textoNumeroTelefono);

        campoNumeroTelefono.setBackground(new java.awt.Color(33, 45, 62));
        campoNumeroTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoNumeroTelefono.setForeground(new java.awt.Color(73, 181, 172));
        campoNumeroTelefono.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoNumeroTelefono);

        textoIBAN.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoIBAN.setForeground(new java.awt.Color(255, 255, 255));
        textoIBAN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoIBAN.setText("Número IBAN:");
        laminaObjetosRegistrarse.add(textoIBAN);

        campoIBAN.setBackground(new java.awt.Color(33, 45, 62));
        campoIBAN.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoIBAN.setForeground(new java.awt.Color(73, 181, 172));
        campoIBAN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoIBAN);

        javax.swing.GroupLayout laminaRegistrarseLayout = new javax.swing.GroupLayout(laminaRegistrarse);
        laminaRegistrarse.setLayout(laminaRegistrarseLayout);
        laminaRegistrarseLayout.setHorizontalGroup(
            laminaRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaBotonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
            .addComponent(laminaObjetosRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        laminaRegistrarseLayout.setVerticalGroup(
            laminaRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laminaRegistrarseLayout.createSequentialGroup()
                .addComponent(laminaObjetosRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laminaBotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        scrollLaminaRegistrarse.setViewportView(laminaRegistrarse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollLaminaRegistrarse, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollLaminaRegistrarse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Convierte un array de char en un String
     *
     * @param array Array de char que deseamos convertir
     * @return El String
     */
    private String arrayCharToString(char[] array) {
        String mensaje = "";
        for (char letra : array) {
            mensaje = mensaje.concat(String.valueOf(letra));
        }
        return mensaje;
    }

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        /*
        int validarIniciarSesion = Gym.iniciarSesion(campoCorreo.getText(), arrayCharToString(campoContrasenna.getPassword()));
        switch (validarIniciarSesion) {
            case 0:
                VentanaPrincipal ventanaPrincipalCliente = new VentanaPrincipal(Usuario.USUARIO);
                this.dispose();
                break;
            case 1:
                VentanaPrincipal ventanaPrincipalAdmin = new VentanaPrincipal(Administrador.ADMINISTRADOR);
                this.dispose();
                break;
            case -1:
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta", "ERROR", JOptionPane.ERROR_MESSAGE);
                imagenArroba.setIcon(new ImageIcon("src/main/java/imagenes/Arroba.png"));
                separadorCorreo.setBackground(new Color(73, 181, 172));
                imagenCandado.setIcon(new ImageIcon("src/main/java/imagenes/CandadoRojo.png"));
                separadorContrasenna.setBackground(Color.red);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Correo electrónico incorrecto", "ERROR", JOptionPane.ERROR_MESSAGE);
                imagenArroba.setIcon(new ImageIcon("src/main/java/imagenes/ArrobaRojo.png"));
                separadorCorreo.setBackground(Color.red);
                imagenCandado.setIcon(new ImageIcon("src/main/java/imagenes/Candado.png"));
                separadorContrasenna.setBackground(new Color(73, 181, 172));
                break;
        }
*/
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void textoClickAquiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoClickAquiMousePressed
        laminaLogin.setVisible(false);
        scrollLaminaRegistrarse.setVisible(true);
    }//GEN-LAST:event_textoClickAquiMousePressed

    private void botonAtrasRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasRegistrarseActionPerformed
        reiniciarCamposLogin();
        laminaLogin.setVisible(true);
        scrollLaminaRegistrarse.setVisible(false);
        scrollLaminaRegistrarse.getVerticalScrollBar().setValue(scrollLaminaRegistrarse.getVerticalScrollBar().getMinimum()); //subir la barra de scroll arriba por si vuelve a darle a registrar
    }//GEN-LAST:event_botonAtrasRegistrarseActionPerformed

    private void checkBoxMostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMostrarContraseñaActionPerformed
        if (checkBoxMostrarContraseña.isSelected()) {
            campoContrasenna.setEchoChar((char) 0);
        } else {
            campoContrasenna.setEchoChar('*');
        }
    }//GEN-LAST:event_checkBoxMostrarContraseñaActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        /*
        switch (desplegableTipoCliente.getSelectedIndex()){
            case 0:

                //Ubicacion ubicacion = new Ubicacion(campoCiudad.getText(), campoCodigoPostal.getText());
                //Cliente usuarioNuevo = new Cliente(campoNombreUsuarioRegistro.getText(), campoDNI.getText(), campoCorreoRegistro.getText(), campoContrasennaRegistro.getText(), campoTarjetaCredito.getText(), ubicacion);
                try {
                    //Aplicacion.registrarCliente(usuarioNuevo);
                    //Aplicacion.setUsuarioLogueado(usuarioNuevo);
                    VentanaPrincipal ventanaPrincipalCliente = new VentanaPrincipal(Usuario.USUARIO);
                    this.dispose();
                } catch (Excepcion ex) {
                    JOptionPane.showMessageDialog(this, "Error, " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            
            case 1:
                horarioAperturaClienteProfesional = VentanaHorario.getHorarioApertura();

                //Ubicacion ubicacion = new Ubicacion(campoCiudad.getText(), campoCodigoPostal.getText());
                //ClienteProfesional usuarioProfesionalNuevo = new ClienteProfesional(campoDescripcion.getText(), VentanaHorario.getHorarioApertura(), campoTelefono.getText(), campoWeb.getText(), campoNombreUsuarioRegistro.getText(), campoDNI.getText(), campoCorreoRegistro.getText(), campoContrasennaRegistro.getText(), campoTarjetaCredito.getText(), ubicacion);
                try {
                    //Aplicacion.registrarCliente(usuarioProfesionalNuevo);
                    //Aplicacion.setUsuarioLogueado(usuarioProfesionalNuevo);
                    VentanaPrincipal ventanaPrincipalCliente = new VentanaPrincipal(Usuario.USUARIO);
                    this.dispose();
                } catch (Excepcion ex) {
                    JOptionPane.showMessageDialog(this, "Error, " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
        }
        */
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void campoContrasennaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoContrasennaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            botonIniciarSesion.doClick(); //da un click al boton de iniciar sesion
        }
    }//GEN-LAST:event_campoContrasennaKeyTyped

    private void campoCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCorreoKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            campoContrasenna.requestFocus(); //le pasa el foco al campo contraseña
        }
    }//GEN-LAST:event_campoCorreoKeyTyped

    private void reiniciarCamposLogin() {
        campoCorreo.setText("");
        campoContrasenna.setText("");
        imagenArroba.setIcon(new ImageIcon("src/main/java/imagenes/Arroba.png"));
        imagenCandado.setIcon(new ImageIcon("src/main/java/imagenes/Candado.png"));
        separadorCorreo.setBackground(new Color(73, 181, 172));
        separadorContrasenna.setBackground(new Color(73, 181, 172));
    }

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtrasRegistrarse;
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JPasswordField campoContrasenna;
    private javax.swing.JTextField campoContrasennaRegistro;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoCorreoRegistro;
    private javax.swing.JTextField campoIBAN;
    private javax.swing.JTextField campoNombreUsuarioRegistro;
    private javax.swing.JTextField campoNombreUsuarioRegistro1;
    private javax.swing.JTextField campoNumeroTelefono;
    private javax.swing.JCheckBox checkBoxMostrarContraseña;
    private javax.swing.JComboBox<String> desplegableTipoCliente;
    private javax.swing.JLabel imagenArroba;
    private javax.swing.JLabel imagenCandado;
    private javax.swing.JLabel imagenLogo;
    private javax.swing.JPanel laminaBotonRegistrarse;
    private javax.swing.JPanel laminaLogin;
    private javax.swing.JPanel laminaObjetosRegistrarse;
    private javax.swing.JPanel laminaRegistrarse;
    private javax.swing.JScrollPane scrollLaminaRegistrarse;
    private javax.swing.JSeparator separadorContrasenna;
    private javax.swing.JSeparator separadorCorreo;
    private javax.swing.JLabel textoClickAqui;
    private javax.swing.JLabel textoContrasenna;
    private javax.swing.JLabel textoContrasennaRegistro;
    private javax.swing.JLabel textoCorreo;
    private javax.swing.JLabel textoIBAN;
    private javax.swing.JLabel textoNombreUsuarioRegistro;
    private javax.swing.JLabel textoNumeroTelefono;
    private javax.swing.JLabel textoRegistrarse;
    private javax.swing.JLabel textoTipoCuenta;
    private javax.swing.JLabel textoTipoCuenta1;
    private javax.swing.JLabel textocorreo;
    // End of variables declaration//GEN-END:variables

}
