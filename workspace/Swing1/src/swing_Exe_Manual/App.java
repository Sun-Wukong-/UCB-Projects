/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swing_Exe_Manual;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ninja
 */
public class App {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
               
               new MainFrame();
            }
        });
        }
    }
 
