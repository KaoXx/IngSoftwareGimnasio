/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Socio;

import Code.Activity;
import Code.Gym;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import utiles.Excepcion;
import utiles.ModeloTabla;
import utiles.Util_Interfaz;

/**
 *
 * @author alejandrobenitotrujillo
 */
public class Actividades extends javax.swing.JFrame {

    private ModeloTabla modeloTabla;
    private ArrayList<Activity> actividadesFiltradas;

    /**
     * Creates new form Mis_Actividades
     */
    public Actividades() {
        initComponents();
        
        inicializarTabla();
    }

    private void rellenarTablaActividades(DefaultTableModel modeloTabla, ArrayList<Activity> actividades) {
        try {
            Object[] filaTabla = new Object[5];
            for (Activity actividad : actividades) {
                filaTabla[0] = actividad.getType();
                filaTabla[1] = actividad.getDias();
                filaTabla[2] = actividad.getHorario();
                filaTabla[3] = String.valueOf(actividad.getCapacity());
                filaTabla[4] = actividad.getRoom();
                modeloTabla.addRow(filaTabla);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void vaciarTabla() {
        for (int i = modeloTabla.getRowCount() - 1; i >= 0; i--) { //tiene que eliminarse de la ultima a la primera, porque si has eliminado varias, quedan 3 y la cuenta va por 4, no puedes eliminar la 4 porque solo quedan 3
            modeloTabla.removeRow(i);
        }
    }

    private void inicializarTabla() {

        tabla.getTableHeader().setReorderingAllowed(false);

        String[] columnas = {"Tipo", "Días", "Horario", "Capacidad", "Sala"};
        modeloTabla = new ModeloTabla(null, columnas); //null es para que no rellene las filas

        tabla.setModel(modeloTabla);

        scrollTabla.getVerticalScrollBar().setUnitIncrement(10);
        desplegable.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        desplegable = new javax.swing.JComboBox<>();
        botonVolver = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 45, 62));
        setIconImage(new ImageIcon("src/main/java/imagenes/logo.png").getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACTIVIDADES");

        desplegable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        desplegable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BodyPump", "Spinning", "Bicicleta", "Bodycombat", "Yoga", "Zumba" }));
        desplegable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegableActionPerformed(evt);
            }
        });

        botonVolver.setIcon(new ImageIcon("src/main/java/imagenes/volver.png"));
        botonVolver.setPressedIcon(new ImageIcon("src/main/java/imagenes/volver_pequeno.png"));
        botonVolver.setRolloverIcon(new ImageIcon("src/main/java/imagenes/volver_grande.png"));
        botonVolver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonVolver.setBorderPainted(false);
        botonVolver.setContentAreaFilled(false);
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setRowHeight(150);
        tabla.setRowHeight(50);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        scrollTabla.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void desplegableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegableActionPerformed
        actividadesFiltradas = Gym.getActividadesPorTipo(String.valueOf(desplegable.getSelectedItem()));
        vaciarTabla(); //primero vacia la tabla y luego la rellena
        rellenarTablaActividades(modeloTabla, actividadesFiltradas);
    }//GEN-LAST:event_desplegableActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
        VentanaSocio sc = new VentanaSocio();
        sc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed

        int seleccion = tabla.rowAtPoint(evt.getPoint()); //te muestra la fila que seleccionas al hacer click en la tabla
        Activity actividadSeleccionada = actividadesFiltradas.get(seleccion);
        int eleccion = JOptionPane.showOptionDialog(this, "¿Esta seguro de que desea reservar la actividad: " + actividadSeleccionada.getType() + " los días: " + actividadSeleccionada.getDias() + " en el horario: "+actividadSeleccionada.getHorario(), "Mensaje de confirmación", 0, 0, null, new String[]{"SI", "NO"}, this);
        try {
        if (eleccion == JOptionPane.YES_OPTION) {
            
            
                Gym.reservarActividad(actividadSeleccionada);
                
                VentanaSocio sc = new VentanaSocio();
                sc.setVisible(true);
                this.setVisible(false);
            }
            JOptionPane.showMessageDialog(this, "Se ha reservado la actividad", "Gimnasio", JOptionPane.INFORMATION_MESSAGE);
            
        }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error a la hora de reservar la actividad","ERROR",JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.toString());
        }

    }//GEN-LAST:event_tablaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> desplegable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}