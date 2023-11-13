/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_amanieu_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import lightoff_amanieu_version_console.CelluleLumineuse;
        /**
 *
 */
public class CelluleGraphique extends JButton {
 int largeur; // largeur en pixel de la cellule
 int hauteur; // hauteur en pixel de la cellule
 CelluleLumineuse celluleLumineuseAssociee;
 // constructeur (appel� depuis FenetrePrincipale)
 public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l,int h) {
 this.largeur = l;
 this.hauteur = h;
 this.celluleLumineuseAssociee = celluleLumineuseAssociee;
 }
 // Methode g�rant le dessin de la cellule
 @Override
protected void paintComponent(Graphics g) {
    int w = this.getWidth();
    int h = this.getHeight();
    if (celluleLumineuseAssociee.getEtat() == CelluleLumineuse.Etat.X) {
       g.setColor(Color.red);
    } else {
       g.setColor(Color.yellow);
    }
    g.fillOval(2, 2, w - 4, h - 4);
}}
