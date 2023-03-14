package dialogodeinstalacion;

import javax.swing.JOptionPane;

/**
 *
 * @author xaxbe
 *
 * JOptionPane Este programa ilustra el cuadro de diálogo del objeto
 * JOptionPane.
 *
 */
public class DialogoDeInstalacion {
    public void cpp(){
        JOptionPane.showMessageDialog(null, "Antes de comenzar la instalación, " + "cierre todas las aplicaciones.");
    }

    public static void main(String[] args) {

        DialogoDeInstalacion Dialogo = new DialogoDeInstalacion();
        Dialogo.cpp();
    }

}
