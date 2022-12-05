/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gambar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class updateICON extends JPanel{
    private Image image;
    
    public updateICON(){
        image = new ImageIcon(getClass().getResource("/img/update.jpeg")).getImage();
        
    }
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        
        Graphics2D gd = (Graphics2D)grphcs.create();
        gd.drawImage(image, 0, 0,getWidth(), getHeight(), null);
        gd.dispose();
    }
}