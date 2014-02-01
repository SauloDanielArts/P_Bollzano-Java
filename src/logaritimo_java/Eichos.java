/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logaritimo_java;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


/**
 *
 * @author Administrador
 */
public class Eichos extends JPanel{

    @Override
    protected void paintComponent(Graphics g)
    {
     g.setColor(Color.BLACK);
     g.fillRect(0, 0, 640, 480);
     g.setColor(Color.GREEN);
     g.drawLine(0, 240, 640, 240);
     g.drawLine(320, 0, 320, 480);
    }

}

