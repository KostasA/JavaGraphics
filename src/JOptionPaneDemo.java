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

public class JOptionPaneDemo {
    public static void main(String[] args)
    {
        String appleString;
        appleString = JOptionPane.showInputDialog("Enter number of apples:");
        int appleCount;
        appleCount = Integer.parseInt(appleString);
        
        String orangeString;
        orangeString = JOptionPane.showInputDialog("Enter number of oranges");
        int orangeCount;
        orangeCount = Integer.parseInt(orangeString);
        
        int totalFruitCount;
        totalFruitCount = appleCount + orangeCount;
        
        JOptionPane.showMessageDialog(null,"The total number of fruits = " + totalFruitCount);
        System.exit(0);
    }
}
