/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy_twitter.login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Admin
 */
public class loginTemplate extends JFrame {
    
    //Declaracion objetos decoradores
    private Color colorAzulos, colorAzulClaro,colorAzulcielo, colorNegrotransparente;
    private Font fontTitulos, fontTitulo, fontBotReg, fontBotIni;
    private Cursor cMano;
    private Border borderAbajo, borderTodos;
    private ImageIcon iLogo, iPuntos, iContraseña, iDimaux;
    
    //Declaración objetos graficos 
    private JPanel pArriba, pAbajo, pMedio;
    private JTextField tNombreus;
    private JPasswordField tClaveus;
    private JButton bEntrar, bContraseña, bRegistrarse, bICon, bPuntos;
    private JLabel lTitulo, ltituloentrada, ltitulocontraseña, lLogo; 
    
    public loginTemplate() {
        super("Login de Usuario");
        //objetos decoradores 
        colorAzulos = new Color(26, 38, 55);
        colorAzulClaro = new Color(40, 48, 79);
        colorAzulcielo = new Color(59, 154, 215);
        //colortransparente=newColor(#,#,#,#t);
        fontTitulos = new Font("Arial",0, 14);
        fontTitulo = new Font("Arial",1, 19);
        fontBotReg = new Font("Arial",1, 15);
        fontBotIni = new Font("Arial",1, 12);
        cMano = new Cursor(Cursor.HAND_CURSOR);
        borderAbajo = BorderFactory.createMatteBorder(0,0,2,0,colorAzulcielo);
        borderTodos = BorderFactory.createMatteBorder(0,0,2,0,Color.LIGHT_GRAY);
        iLogo = new ImageIcon("resources/img/icons8-twitter-48.png");
        iPuntos = new ImageIcon("resources/img/icons8-más-96.png");
        iContraseña = new ImageIcon("resources/img/icons8-visible-50.png");

//objetos graficos 
        pArriba = new JPanel();
        pArriba.setSize(350, 50);
        pArriba.setLocation(0,0);
        pArriba.setLayout(null);
        pArriba.setBackground(colorAzulClaro);
        this.add(pArriba);
        
        pMedio = new JPanel();
        pMedio.setSize(350, 349);
        pMedio.setLocation(0,50);
        pMedio.setLayout(null);
        pMedio.setBackground(colorAzulos);
        this.add(pMedio);
        
        pAbajo = new JPanel();
        pAbajo.setSize(350, 60);
        pAbajo.setLocation(0,400);
        pAbajo.setLayout(null); //no utilizar el posicionamiento y poder ponerlo donde quiera
        pAbajo.setBackground(colorAzulos);
        this.add(pAbajo);
        
        lTitulo = new JLabel("Iniciar Sesión en Twitter.");
        lTitulo.setBounds(10, 07, 300, 20);
        lTitulo.setForeground(Color.WHITE);
        lTitulo.setVisible(true);
        lTitulo.setFont(fontTitulo);
        pMedio.add(lTitulo);
        
        ltituloentrada = new JLabel("Teléfono, correo o usuario");
        ltituloentrada.setBounds(10, 75, 200, 10);
        ltituloentrada.setForeground(Color.LIGHT_GRAY);
        ltituloentrada.setVisible(true);
        ltituloentrada.setFont(fontTitulos);
        pMedio.add(ltituloentrada);
        
        ltitulocontraseña = new JLabel("Contraseña");
        ltitulocontraseña.setBounds(10, 145, 100, 10);
        ltitulocontraseña.setForeground(Color.lightGray);
        ltitulocontraseña.setVisible(true);
        ltitulocontraseña.setFont(fontTitulos);
        pMedio.add(ltitulocontraseña);
        
        
        tNombreus = new JTextField();
        tNombreus.setSize(300, 35);
        tNombreus.setLocation(10, 96);
        tNombreus.setForeground(Color.DARK_GRAY);
        tNombreus.setBackground(colorAzulos);
        tNombreus.setCaretColor(Color.GRAY);
        tNombreus.setHorizontalAlignment(SwingConstants.CENTER);
        tNombreus.setBorder(borderTodos);
        pMedio.add(tNombreus);
        
        tClaveus = new JPasswordField();
        tClaveus.setText("");
        tClaveus.setSize(300, 35);
        tClaveus.setLocation(10,166);
        tClaveus.setBackground(colorAzulos);
        tClaveus.setForeground(Color.WHITE);
        tClaveus.setCaretColor(colorAzulcielo);
        tClaveus.setHorizontalAlignment(SwingConstants.CENTER);
        tClaveus.setBorder(borderAbajo);
        pMedio.add(tClaveus);
        
        bContraseña = new JButton("¿Olvidaste tu contraseña?");
        bContraseña.setSize(220, 45);
        bContraseña.setLocation(53, 295); 
        bContraseña.setBackground(colorAzulos); //color fonde
        bContraseña.setForeground(Color.GRAY); //color de la letra
        bContraseña.setFocusable(false); //para quitar el cuadro alrededor de la letra
        bContraseña.setBorder(null);
        bContraseña.setCursor(cMano);
        pMedio.add(bContraseña);
        
        iDimaux = new ImageIcon(iContraseña.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING));
        
        bICon = new JButton();
        bICon.setSize(25, 25);
        bICon.setLocation(313, 174);
        bICon.setBackground(colorAzulos);
        bICon.setBorder(null);
        bICon.setIcon(iDimaux);
        bICon.setCursor(cMano);
        pMedio.add(bICon);
        
        bRegistrarse = new JButton("Regístrate");
        bRegistrarse.setSize(90, 24);
        bRegistrarse.setLocation(228, 15); 
        bRegistrarse.setBackground(colorAzulClaro);
        bRegistrarse.setForeground(colorAzulcielo); 
        bRegistrarse.setFocusable(false);
        bRegistrarse.setBorder(null);
        bRegistrarse.setFont(fontBotReg);
        bRegistrarse.setCursor(cMano);
        pArriba.add(bRegistrarse);
        
        iDimaux = new ImageIcon(iPuntos.getImage().getScaledInstance(30, 35, Image.SCALE_AREA_AVERAGING));
        
        bPuntos = new JButton();
        bPuntos.setSize(15, 30);
        bPuntos.setLocation(317, 10);
        bPuntos.setBackground(colorAzulClaro);
        bPuntos.setForeground(colorAzulcielo);
        bPuntos.setIcon(iDimaux);
        bPuntos.setBorder(null);
        bPuntos.setCursor(cMano);
        pArriba.add(bPuntos);
        
        iDimaux = new ImageIcon(iLogo.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        
        lLogo = new JLabel();
        lLogo.setBounds(150, 07, 40, 40);
        lLogo.setIcon(iDimaux);
        lLogo.setVisible(true);
        pArriba.add(lLogo);
                
        bEntrar = new JButton("Iniciar sesión");
        bEntrar.setSize(120, 35);
        bEntrar.setLocation(208, 8); 
        bEntrar.setBackground(colorAzulcielo); //color fonde
        bEntrar.setForeground(Color.WHITE); //color de la letra
        bEntrar.setFocusable(false); //para quitar el cuadro alrededor de la letra
        bEntrar.setHorizontalAlignment(SwingConstants.CENTER);
        bEntrar.setFont(fontBotIni);
        bEntrar.setBorder(null);
        bEntrar.setCursor(cMano);
        pAbajo.add(bEntrar);
        
        
        this.setSize(348, 483);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        
    }
}
