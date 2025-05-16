/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalfinancemanagement;
import javax.swing.JFrame;
import Login.Login;

/**
 *
 * @author hp
 */
public class PersonalFinanceManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);  
        LoginFrame.pack();
//        LoginFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Makes it full screen
        LoginFrame.setLocationRelativeTo(null); 
    }
    
}
