/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy_twitter.InterfaceGrafica;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Admin
 */
public class VistaPrincipalTemplate extends JFrame {

    private JButton benviar;
    private JTextField tNombre;
    private JLabel lnombre;

    public VistaPrincipalTemplate() {
        super("Vista Principal");
        this.saludar();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }

    public void saludar() {
        String mensaje = "Hola Mundo";
        System.out.println(mensaje);
    }
}
