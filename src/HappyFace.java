/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KostasA
 */
import javax.swing.*;
import java.awt.*;

public class HappyFace extends JApplet {
    
    @Override
    public void paint(Graphics canvas)
    {
        
        canvas.drawOval(100,50,200,200);
        canvas.fillOval(155, 100, 10, 20);
        canvas.fillOval(230, 100, 10, 20);
        canvas.drawArc(150, 200, 100, 50, 0, 180);
    }
    
       
}
