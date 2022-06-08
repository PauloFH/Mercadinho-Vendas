/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

import br.com.projeto.view.Frmmenu;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Catita_GS
 */
public class Utilitarios {

    //metodo limparCampos
    public void LimpaTela(JPanel container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
        }
    }

    //Metodo para adicionar imagem de fundo JDesktopPane
//    public void adicionaImagem() {
//
//        ImageIcon icon = new ImageIcon(Frmmenu.class.getResource("br.com.projeto.images/fundo.jpg"));
//        Image img = icon.getImage();
//
//        JDesktopPane painel = new JDesktopPane() {
//            public void paintComponent(Graphics g) {
//                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
//            }
//
//        }
                
                }
