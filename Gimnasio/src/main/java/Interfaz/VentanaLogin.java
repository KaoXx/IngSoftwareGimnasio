package Interfaz;

import Code.Gym;
import Code.*;
import javax.swing.*;

import Interfaz_Socio.Socio;
import utiles.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

public class VentanaLogin extends javax.swing.JFrame {
    Program program;

    public VentanaLogin() {
        //Aplicacion.cargarDatos();
        initComponents();
        scrollLaminaRegistrarse.setVisible(false);
        inicializarComponentesRegistro();
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
        textocontrasennaRegistro = new javax.swing.JLabel();
        campoContrasennaRegistro = new javax.swing.JTextField();
        textoDNI = new javax.swing.JLabel();
        campoDNI = new javax.swing.JTextField();
        textoCorreoRegistro = new javax.swing.JLabel();
        campoCorreoRegistro = new javax.swing.JTextField();
        textoTarjetaCredito = new javax.swing.JLabel();
        campoTarjetaCredito = new javax.swing.JTextField();
        textoCodigoPostal = new javax.swing.JLabel();
        campoCodigoPostal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gimnasio");
        setIconImage(new ImageIcon("src/main/java/imagenes/logo.png").getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(laminaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(botonIniciarSesion)))
                .addContainerGap(54, Short.MAX_VALUE))
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
                        .addGap(52, 52, 52)
                        .addComponent(botonIniciarSesion)
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
        desplegableTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Miembro", "Monitor", "Recepcionista", "Entrenador" }));
        desplegableTipoCliente.setSelectedIndex(0);
        desplegableTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegableTipoClienteActionPerformed(evt);
            }
        });
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

        textocontrasennaRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textocontrasennaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        textocontrasennaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textocontrasennaRegistro.setText("Contraseña:");
        laminaObjetosRegistrarse.add(textocontrasennaRegistro);

        campoContrasennaRegistro.setBackground(new java.awt.Color(33, 45, 62));
        campoContrasennaRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoContrasennaRegistro.setForeground(new java.awt.Color(73, 181, 172));
        campoContrasennaRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoContrasennaRegistro);

        textoDNI.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoDNI.setForeground(new java.awt.Color(255, 255, 255));
        textoDNI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoDNI.setText("DNI:");
        laminaObjetosRegistrarse.add(textoDNI);

        campoDNI.setBackground(new java.awt.Color(33, 45, 62));
        campoDNI.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoDNI.setForeground(new java.awt.Color(73, 181, 172));
        campoDNI.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoDNI);

        textoCorreoRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoCorreoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        textoCorreoRegistro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoCorreoRegistro.setText("Correo electrónico:");
        laminaObjetosRegistrarse.add(textoCorreoRegistro);

        campoCorreoRegistro.setBackground(new java.awt.Color(33, 45, 62));
        campoCorreoRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoCorreoRegistro.setForeground(new java.awt.Color(73, 181, 172));
        campoCorreoRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoCorreoRegistro);

        textoTarjetaCredito.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoTarjetaCredito.setForeground(new java.awt.Color(255, 255, 255));
        textoTarjetaCredito.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoTarjetaCredito.setText("Tarjeta de crédito:");
        laminaObjetosRegistrarse.add(textoTarjetaCredito);

        campoTarjetaCredito.setBackground(new java.awt.Color(33, 45, 62));
        campoTarjetaCredito.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoTarjetaCredito.setForeground(new java.awt.Color(73, 181, 172));
        campoTarjetaCredito.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoTarjetaCredito);

        textoCodigoPostal.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 16)); // NOI18N
        textoCodigoPostal.setForeground(new java.awt.Color(255, 255, 255));
        textoCodigoPostal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoCodigoPostal.setText("Codigo postal:");
        laminaObjetosRegistrarse.add(textoCodigoPostal);

        campoCodigoPostal.setBackground(new java.awt.Color(33, 45, 62));
        campoCodigoPostal.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        campoCodigoPostal.setForeground(new java.awt.Color(73, 181, 172));
        campoCodigoPostal.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 0)));
        laminaObjetosRegistrarse.add(campoCodigoPostal);

        javax.swing.GroupLayout laminaRegistrarseLayout = new javax.swing.GroupLayout(laminaRegistrarse);
        laminaRegistrarse.setLayout(laminaRegistrarseLayout);
        laminaRegistrarseLayout.setHorizontalGroup(
            laminaRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaBotonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addComponent(laminaObjetosRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        laminaRegistrarseLayout.setVerticalGroup(
            laminaRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laminaRegistrarseLayout.createSequentialGroup()
                .addComponent(laminaObjetosRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laminaBotonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void desplegableTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegableTipoClienteActionPerformed
        if (desplegableTipoCliente.getSelectedIndex() == 0) {
            laminaObjetosRegistrarse.remove(textoDescripcion);
            laminaObjetosRegistrarse.remove(campoDescripcion);
            laminaObjetosRegistrarse.remove(textoTelefono);
            laminaObjetosRegistrarse.remove(campoTelefono);
            laminaObjetosRegistrarse.remove(textoWeb);
            laminaObjetosRegistrarse.remove(campoWeb);
            laminaObjetosRegistrarse.remove(textoHorario);
            laminaObjetosRegistrarse.remove(cajaHorizontalHorario);
            GridLayout layout = (GridLayout) laminaObjetosRegistrarse.getLayout();
            layout.setVgap(40);
            scrollLaminaRegistrarse.updateUI();
        }
        else if (desplegableTipoCliente.getSelectedIndex() == 1) {
            laminaObjetosRegistrarse.add(textoDescripcion);
            laminaObjetosRegistrarse.add(campoDescripcion);
            laminaObjetosRegistrarse.add(textoTelefono);
            laminaObjetosRegistrarse.add(campoTelefono);
            laminaObjetosRegistrarse.add(textoWeb);
            laminaObjetosRegistrarse.add(campoWeb);
            laminaObjetosRegistrarse.add(textoHorario);
            laminaObjetosRegistrarse.add(cajaHorizontalHorario);
            GridLayout layout = (GridLayout) laminaObjetosRegistrarse.getLayout();
            layout.setVgap(25);
            scrollLaminaRegistrarse.updateUI();
        } 
        
    }//GEN-LAST:event_desplegableTipoClienteActionPerformed

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

    private void botonRegistrarseActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed

        switch (desplegableTipoCliente.getSelectedIndex()){
            case 0: //Member

                Member member = new Member();
                try {
                    program.SignUp(member); //Se inserta en la base de datos
                    //Aplicacion.setUsuarioLogueado(usuarioNuevo);
                    VentanaPrincipal ventanaPrincipalCliente = new VentanaPrincipal(Usuario.USUARIO);
                    this.dispose();
                } catch (Excepcion excepcion) {
                    JOptionPane.showMessageDialog(this, "Error, " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            
            case 1: // Monitor
                horarioAperturaClienteProfesional = VentanaHorario.getHorarioApertura();

                //Ubicacion ubicacion = new Ubicacion(campoCiudad.getText(), campoCodigoPostal.getText());
                //ClienteProfesional usuarioProfesionalNuevo = new ClienteProfesional(campoDescripcion.getText(), VentanaHorario.getHorarioApertura(), campoTelefono.getText(), campoWeb.getText(), campoNombreUsuarioRegistro.getText(), campoDNI.getText(), campoCorreoRegistro.getText(), campoContrasennaRegistro.getText(), campoTarjetaCredito.getText(), ubicacion);
                try {
                    //Aplicacion.registrarCliente(usuarioProfesionalNuevo);
                    //Aplicacion.setUsuarioLogueado(usuarioProfesionalNuevo);
                    VentanaPrincipal ventanaPrincipalCliente = new VentanaPrincipal(Usuario.USUARIO);
                    this.dispose();
                } catch (Excepcion excepcion) {
                    JOptionPane.showMessageDialog(this, "Error, " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            case 2: //Receptionist


                try{

                }
                catch (Excepcion excepcion){
                    JOptionPane.showMessageDialog(this, "Error, " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            case 3: //Trainer
                try{

                }
                catch (Excepcion excepcion){
                    JOptionPane.showMessageDialog(this, "Error, " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }


        }

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Aplicacion.guardarDatos();
    }//GEN-LAST:event_formWindowClosing

    private void reiniciarCamposLogin() {
        campoCorreo.setText("");
        campoContrasenna.setText("");
        imagenArroba.setIcon(new ImageIcon("src/main/java/imagenes/Arroba.png"));
        imagenCandado.setIcon(new ImageIcon("src/main/java/imagenes/Candado.png"));
        separadorCorreo.setBackground(new Color(73, 181, 172));
        separadorContrasenna.setBackground(new Color(73, 181, 172));
    }

    private void botonVerHorarioActionPerformed(ActionEvent evt) {
        /*try {
            ventanaHorario.setVisible(true);
            VentanaHorario.laminaVerHorario.setVisible(true);
            VentanaHorario.scrolllaminaAñadirHorario.setVisible(false);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Primero debes añadir un horario", "ERROR", JOptionPane.ERROR_MESSAGE);
        }*/
    }

    private void botonAñadirHorarioActionPerformed(ActionEvent evt) {/*
        botonVerHorario.setIcon(new ImageIcon("src/main/java/imagenes/BotonVer.png"));
        botonVerHorario.setPressedIcon(new ImageIcon("src/main/java/imagenes/BotonVerPulsado.png"));
        botonVerHorario.setRolloverIcon(new ImageIcon("src/main/java/imagenes/BotonVerSeleccionado.png"));
        ventanaHorario = new VentanaHorario();
        ventanaHorario.setVisible(true);
        VentanaHorario.scrolllaminaAñadirHorario.setVisible(true);
        VentanaHorario.laminaVerHorario.setVisible(false);*/
    }

    private void inicializarComponentesRegistro() {
        scrollLaminaRegistrarse.getVerticalScrollBar().setUnitIncrement(7); //aumentar la velocidad del scrollbar

        textoDescripcion = new JLabel("Descripcion:");
        Util_Interfaz.establecerModeloLetrasRegistro(textoDescripcion);
        campoDescripcion = new JTextField();
        establecerModeloCamposRegistro(campoDescripcion);
        textoTelefono = new JLabel("Telefono:");
        Util_Interfaz.establecerModeloLetrasRegistro(textoTelefono);
        campoTelefono = new JTextField();
        establecerModeloCamposRegistro(campoTelefono);
        textoWeb = new JLabel("Página web:");
        Util_Interfaz.establecerModeloLetrasRegistro(textoWeb);
        campoWeb = new JTextField();
        establecerModeloCamposRegistro(campoWeb);

        textoHorario = new JLabel("Horario:");
        Util_Interfaz.establecerModeloLetrasRegistro(textoHorario);

        cajaHorizontalHorario = Box.createHorizontalBox();
        botonVerHorario = new JButton(new ImageIcon("src/main/java/imagenes/BotonVerRojo.png"));
        botonVerHorario.setPressedIcon(new ImageIcon("src/main/java/imagenes/BotonVerRojoPulsado.png"));
        botonVerHorario.setRolloverIcon(new ImageIcon("src/main/java/imagenes/BotonVerRojoSeleccionado.png"));
        botonVerHorario.setBorderPainted(false);
        botonVerHorario.setContentAreaFilled(false);

        botonAñadirHorario = new JButton(new ImageIcon("src/main/java/imagenes/BotonAñadir.png"));
        botonAñadirHorario.setPressedIcon(new ImageIcon("src/main/java/imagenes/BotonAñadirPulsado.png"));
        botonAñadirHorario.setRolloverIcon(new ImageIcon("src/main/java/imagenes/BotonAñadirSeleccionado.png"));
        botonAñadirHorario.setBorderPainted(false);
        botonAñadirHorario.setContentAreaFilled(false);
        cajaHorizontalHorario.add(botonVerHorario);
        cajaHorizontalHorario.add(Box.createHorizontalStrut(-20)); //añadir separacion
        cajaHorizontalHorario.add(botonAñadirHorario);

        botonVerHorario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botonVerHorarioActionPerformed(evt);
            }
        });

        botonAñadirHorario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                botonAñadirHorarioActionPerformed(evt);
            }
        });
    }

    private void establecerModeloCamposRegistro(JTextField campo) {
        campo.setBackground(new Color(33, 45, 62));
        campo.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14));
        campo.setForeground(new Color(73, 181, 172));
        campo.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), BorderFactory.createEmptyBorder(5, 5, 5, 0)));
    }

    private boolean comprobarUsuarioContrasenna(String nombreUsuario, String contrasenna) {/*
        try {
            for (Cliente usuario : Aplicacion.getClientesRegistrados()) {
                if (usuario.getNombre().equals(nombreUsuario)) {
                    if (usuario.getContrasenna().equals(contrasenna)) {
                        return true;
                    } else {
                        campoCorreo.setBackground(new Color(33, 45, 62));
                        campoContrasenna.setBackground(Color.red);
                        throw new Excepcion("La contraseña introducida es incorrecta");
                    }
                }
            }
            campoContrasenna.setBackground(new Color(33, 45, 62));
            campoCorreo.setBackground(new Color(33, 45, 62));
            throw new Excepcion("El nombre de usuario no existe, si desea crear una cuenta, pulse aquí");
        } catch (Excepcion e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }*/
        return false;
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
    private javax.swing.JTextField campoCodigoPostal;
    private javax.swing.JPasswordField campoContrasenna;
    private javax.swing.JTextField campoContrasennaRegistro;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoCorreoRegistro;
    private javax.swing.JTextField campoDNI;
    private javax.swing.JTextField campoNombreUsuarioRegistro;
    private javax.swing.JTextField campoNombreUsuarioRegistro1;
    private javax.swing.JTextField campoTarjetaCredito;
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
    private javax.swing.JLabel textoCodigoPostal;
    private javax.swing.JLabel textoContrasenna;
    private javax.swing.JLabel textoCorreo;
    private javax.swing.JLabel textoCorreoRegistro;
    private javax.swing.JLabel textoDNI;
    private javax.swing.JLabel textoNombreUsuarioRegistro;
    private javax.swing.JLabel textoRegistrarse;
    private javax.swing.JLabel textoTarjetaCredito;
    private javax.swing.JLabel textoTipoCuenta;
    private javax.swing.JLabel textoTipoCuenta1;
    private javax.swing.JLabel textocontrasennaRegistro;
    // End of variables declaration//GEN-END:variables

    private JLabel textoDescripcion;
    private JTextField campoDescripcion;
    private JLabel textoTelefono;
    private JTextField campoTelefono;
    private JLabel textoWeb;
    private JTextField campoWeb;
    private JLabel textoHorario;
    private Box cajaHorizontalHorario;
    private JButton botonVerHorario;
    private JButton botonAñadirHorario;
    //private VentanaHorario ventanaHorario;

    //private VentanaVerPerfil ventanaVerPerfil;

    private LocalTime[][] horarioAperturaClienteProfesional;
}
