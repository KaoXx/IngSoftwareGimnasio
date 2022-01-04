package utiles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Util_Interfaz {

    /**
     * Establece un tipo de fuente, letra y alineación específica en un JLabel
     * @param texto JLabel al que se le desea aplicar
     */
    public static void establecerModeloLetrasRegistro(JLabel texto) {
        texto.setFont(new Font("Microsoft New Tai Lue", 0, 16));
        texto.setForeground(Color.white);
        texto.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    /**
     * Reescala una imagen teniendo en cuenta si es ancha, larga o cuadrada
     * @param imagen Imagen a reescalar
     * @return Imagen reescalada
     */
    public static ImageIcon reescalarImagen(ImageIcon imagen) {
        Image imagenReescaladaImage;
        if (imagen.getIconWidth() - imagen.getIconHeight() < 100 && imagen.getIconWidth() - imagen.getIconHeight() > -100) { //imagen cuadrada
            imagenReescaladaImage = imagen.getImage().getScaledInstance(160, 160, Image.SCALE_DEFAULT);
        } else if (imagen.getIconWidth() >= imagen.getIconHeight() + 100) {
            imagenReescaladaImage = imagen.getImage().getScaledInstance(180, 140, Image.SCALE_DEFAULT); //imagen ancha
        } else {
            imagenReescaladaImage = imagen.getImage().getScaledInstance(110, 150, Image.SCALE_DEFAULT); //imagen alta
        }
        return new ImageIcon(imagenReescaladaImage);
    }

    /**
     * Añade las categorías de los productos a un JComboBox
     * @param desplegableCategorias
     */
    /*
    public static void inicializarDesplegableCategoria(JComboBox desplegableCategorias) {
        Categoria[] arrayCategorias = Categoria.values();
        String[] arrayCategoriasString = new String[Categoria.values().length];

        for (int i = 0; i < arrayCategorias.length; i++) {
            arrayCategoriasString[i] = arrayCategorias[i].toString();
        }

        desplegableCategorias.setModel(new DefaultComboBoxModel<>(arrayCategoriasString));
    }

    /**
     * Añade los estados de los productos a un JCombobox
     * @param desplegableEstados 
     */
    /*
    public static void inicializarDesplegableEstado(JComboBox desplegableEstados) {
        Estado[] arrayEstados = Estado.values();
        String[] arrayEstadosString = new String[Estado.values().length];

        for (int i = 0; i < arrayEstados.length; i++) {
            arrayEstadosString[i] = arrayEstados[i].toString();
        }

        desplegableEstados.setModel(new DefaultComboBoxModel<>(arrayEstadosString));
    }
    
    /**
     * Añade a la aplicación una imagen. Si ya exixte una imagen con el mismo nombre, le añade un numero al final sucesivamente hasta que no exista una imagen con dicho nombre
     * @param archivo
     * @param rutaArchivo
     * @return Nombre del archivo que se ha subido
     * @throws IOException Se lanza cuando se produzca algun fallo relacionado con la entrada/salida del programa
     */
    public static String subirImagenBaseDatos(File archivo, Path rutaArchivo) throws IOException {
        Path rutaDestino;
        StringBuilder nombreArchivo = new StringBuilder(archivo.getName());
        boolean valido = false;
        int contador = 1;
        nombreArchivo = nombreArchivo.insert(nombreArchivo.lastIndexOf("."), contador);
        while (!valido) {
            if (contador != 1) {
                nombreArchivo = nombreArchivo.replace(nombreArchivo.lastIndexOf(".") - 1, nombreArchivo.lastIndexOf("."), String.valueOf(contador));
            }
            try {
                rutaDestino = Path.of(System.getProperty("user.dir") + "\\src\\main\\java\\imagenes\\" + nombreArchivo);
                Files.copy(rutaArchivo, rutaDestino);
                return nombreArchivo.toString();
            } catch (FileAlreadyExistsException ex) {
                contador++;
            }
        }
        return null;
    }
    
    /**
     * Convierte un Object de tipo Long o Double en tipo Double
     * @param numero
     * @return El objeto en tipo Double
     */
    public static Double arreglarGetValueJFTextField(Object numero){ //porque el JFormattedTextFile en modo decimales, cuando escribes un numero entero el metodo getValue te lo devuelve como Long pero si escribes un decimal te lo devuelve como Double
        if (numero.getClass().equals(Long.class)){       
            Long num=(Long)numero;
            return num.doubleValue();
        }else{ //su clase el Double
            return (Double) numero;
        }
    }

}
