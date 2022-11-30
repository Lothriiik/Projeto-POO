/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.dadosLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author uande
 */
public class authenticateLogin {
    Connection Connection;
    public static ResultSet autenticacaoUsuario(dadosLogin objusuario) throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
       
            String sql= "select * from logins  where usuario = ? and senha= ?";
            PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
            pstm.setString(1,objusuario.getUsuario());
            pstm.setString(2,objusuario.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        
       
       
    }
    public static ResultSet checkSector(dadosLogin objusuario) throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
       
            String sql= "select * from logins  where usuario = ? and senha= ?";
            PreparedStatement pstm = conexao.getConnection().prepareStatement(sql);
            pstm.setString(1,objusuario.getUsuario());
            pstm.setString(2,objusuario.getSenha());
            ResultSet rs = pstm.executeQuery();
            return rs;
            
            
        
}

}