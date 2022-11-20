/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author uande
 */
public class connectionDataBase {
    
    public Connection getConnection() throws SQLException{
        
            Connection connect  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pooProjeto", "postgres", "Piece0303@");
            return connect;
        
        }
    }
   
    

