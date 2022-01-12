/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Socio;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.table.TableRowSorter;
import utiles.ModeloTabla;
import utiles.Util_Interfaz;

/**
 *
 * @author alejandrobenitotrujillo
 */
public class Mis_Actividades extends javax.swing.JFrame {

    /**
     * Creates new form Mis_Actividades
     */
    public Mis_Actividades() {
        initComponents();

        inicializarTabla();
    }

    private void inicializarTabla() {

        tabla.getTableHeader().setReorderingAllowed(false);

        String[] columnas = {"Tipo", "Fecha", "Capacidad"};
        ModeloTabla modeloTabla = new ModeloTabla(null, columnas); //null es para que no rellene las filas

        String[] filaTabla = new String[5];
        /*
        for (Cliente cliente : Aplicacion.getClientesRegistrados()) {
            filaTabla[0] = cliente.getNombre();
            filaTabla[1] = cliente.getDNI();
            filaTabla[2] = cliente.getCorreoElectronico();
            modeloTabla.addRow(filaTabla);
        }

        //productosUsuario = usuarioSeleccionado.getProductos();
        tabla.setModel(modeloTabla);

        //rellenarTablaProductos(modeloTabla, productosUsuario);
        /*        
        }else if (tipo.equals(Administrador.CONSULTA_CLIENTES)){
            tabla.setRowHeight(30); //ajusta la altura de las filas
            String[] columnas={"Nombre", "DNI", "Correo", "Contraseña", "Ubicación"};
            
            ModeloTabla modeloTabla=new ModeloTabla(null, columnas);
            
            String[] filaTabla=new String[5];
            for (Cliente cliente:Aplicacion.getClientesRegistrados()){
                filaTabla[0]=cliente.getNombre();
                filaTabla[1]=cliente.getDNI();
                filaTabla[2]=cliente.getCorreoElectronico();
                filaTabla[3]=cliente.getContrasenna();
                filaTabla[4]=cliente.getUbicacion().getCiudad();
                modeloTabla.addRow(filaTabla);
            } 
            tabla.setModel(modeloTabla);
            
        }else if(tipo.equals(Administrador.CONSULTA_PRODUCTOS)){

            String[] columnas={"Fotografía", "Título", "Descripción", "Categoría", "Precio"};
            
            ModeloTabla modeloTabla=new ModeloTabla(null, columnas);
            
            
            tabla.setModel(modeloTabla); //hay que añadir primero el modelo y luego rellenarlo porque sino el LabelRenderer da error
            
            rellenarTablaProductos(modeloTabla, Aplicacion.getProductosRegistrados());
      
        }else if(tipo.equals(Administrador.CONSULTA_VENTAS)){ //viene del admin

            String[] columnas={"Fotografía", "Título", "Descripción", "Categoría", "Precio"};
            
            ModeloTabla modeloTabla=new ModeloTabla(null, columnas);
            
            tabla.setModel(modeloTabla);
            
            rellenarTablaProductos(modeloTabla, convertirArrayVentasEnProductos(GestionAdministrador.consultaVentasRealizadas()));
            
            this.modeloTabla=modeloTabla; //para poder acceder a el desde el boton filtrar
            laminaFiltrarFecha.setVisible(true);
            
        }else if (tipo.equals(Usuario.BUSCAR_PRODUCTO)){
            laminaBuscarProducto.setVisible(true);
            
            String[] columnas={"Fotografía", "Título", "Descripción", "Categoría", "Precio"};
            
            modeloTabla=new ModeloTabla(null, columnas);
            
            tabla.setModel(modeloTabla);
            
            Util_Interfaz.inicializarDesplegableCategoria(desplegableCategorias);
            desplegableCategorias.setSelectedIndex(0);
            
            filtroTabla=new TableRowSorter(modeloTabla);
            tabla.setRowSorter(filtroTabla);
            
        }else if(tipo.equals(Usuario.VENDER_PRODUCTO)){
            tabla.setRowHeight(50);
            String[] columnas={"Nombre", "DNI", "Ubicación", "Precio ofertado"};
            modeloTabla=new ModeloTabla(null, columnas);
            
            ArrayList<Cliente> clavesOfertasOrdenadas=new ArrayList<>(productoSeleccionado.getOfertas().keySet()); //relleno el arrayList con las claves del hashmap
            Collections.sort(clavesOfertasOrdenadas, new OrdenarArrayListPorValoresHasmap(productoSeleccionado.getOfertas()));

            
            String[] filaTabla=new String[4];
            for (Cliente cliente:clavesOfertasOrdenadas){
                filaTabla[0]=cliente.getNombre();
                filaTabla[1]=cliente.getDNI();
                filaTabla[2]=cliente.getUbicacion().getCiudad();
                filaTabla[3]=String.valueOf(productoSeleccionado.getOfertas().get(cliente)); //para obtener el valor asociado a la clave de ese cliente (la oferta)
                modeloTabla.addRow(filaTabla);
            }          
            tabla.setModel(modeloTabla);
        }
        scrollTabla.getVerticalScrollBar().setUnitIncrement(10);
         */
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonVolver = new javax.swing.JButton();
        reservarClase = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(33, 45, 62));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MIS ACTIVIDADES");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bodypump", "Spinning", "Bicicleta", "Bodycombat", "Yoga", "Zumba" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
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

        reservarClase.setIcon(new ImageIcon("src/main/java/imagenes/reservar_clase_normal.png"));
        reservarClase.setPressedIcon(new ImageIcon("src/main/java/imagenes/reservar_clase_peque.png"));
        reservarClase.setRolloverIcon(new ImageIcon("src/main/java/imagenes/reservar_clase_grande.png"));
        reservarClase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        reservarClase.setBorderPainted(false);
        reservarClase.setContentAreaFilled(false);

        tabla.setBackground(new java.awt.Color(33, 45, 62));
        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.setForeground(new java.awt.Color(73, 181, 172));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setRowHeight(150);
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
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(reservarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(reservarClase, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
        VentanaSocio sc = new VentanaSocio();
        sc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        /*
        int seleccion=tabla.rowAtPoint(evt.getPoint()); //te muestra la fila que seleccionas al hacer click en la tabla

        if (tipo.equals(Usuario.VER_PRODUCTOS)){
            VentanaProducto ventanaProducto=new VentanaProducto(this, productosUsuario.get(seleccion), Usuario.VENDEDOR);
        }else if (tipo.equals(Administrador.CONSULTA_CLIENTES)){
            VentanaVerPerfil ventanaVerPerfil=new VentanaVerPerfil(this, Aplicacion.getClientesRegistrados().get(seleccion), Administrador.ADMINISTRADOR);
        }else if (tipo.equals(Administrador.CONSULTA_PRODUCTOS)){
            VentanaProducto ventanaProducto=new VentanaProducto(this, Aplicacion.getProductosRegistrados().get(seleccion), Administrador.ADMINISTRADOR);
        }else if(tipo.equals(Administrador.CONSULTA_PRODUCTOS_CLIENTE)){
            VentanaProducto ventanaProducto=new VentanaProducto(this, productosUsuario.get(seleccion), Administrador.ADMINISTRADOR);
        }else if(tipo.equals(Administrador.CONSULTA_VENTAS)){
            VentanaProducto ventanaProducto=new VentanaProducto(this, arrayVentas.get(seleccion), Administrador.CONSULTA_VENTAS);
        }else if(tipo.equals(Usuario.BUSCAR_PRODUCTO)){
            VentanaProducto ventanaProducto=new VentanaProducto(this, productosFiltrados.get(seleccion), Usuario.COMPRADOR);
        }else if(tipo.equals(Usuario.VENDER_PRODUCTO)){
            Cliente clienteCompradorSeleccionado=ClaveHasmapOfertasPorPosicion(seleccion);
            int eleccion=JOptionPane.showOptionDialog(this, "¿Esta seguro de que desea vender el producto "+productoSeleccionado.getTitulo()+" a "+clienteCompradorSeleccionado.getNombre()+" por "+productoSeleccionado.getOfertas().get(clienteCompradorSeleccionado)+"€?", "Mensaje de confirmación", 0, 0, null, new String[]{"SI", "NO"}, this);
            if (eleccion==JOptionPane.YES_OPTION){
                try {
                    Aplicacion.getUsuarioLogueado().venderProducto(productoSeleccionado, clienteCompradorSeleccionado);
                    JOptionPane.showMessageDialog(this, "El producto se ha vendido correctamente, el importe de la venta se importará a su tarjeta de crédito en breves instantes", "JavaPop", JOptionPane.INFORMATION_MESSAGE);
                    ventanaAnterior.productoVendido(); //para que se actualice la ventanaProducto que es la que se va a mostrar a continuación
                    this.dispose();
                } catch (Excepcion ex) {
                    JOptionPane.showMessageDialog(this, "Error, "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error a la hora de generar el documento de venta, "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
         */
    }//GEN-LAST:event_tablaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reservarClase;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
