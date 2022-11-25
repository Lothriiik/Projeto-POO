/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uande
 */
public class query {
    public static ResultSet loadTableRecepcao() throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT nome, sexo, data, cpf, telefoneproprio, telefoneconhecido, rua, bairro, numerocasa FROM registro_recepcao");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }
    public static ResultSet loadTableRecepcao (String tipo, String arg) throws SQLException
    {
            String argumento=tipo+" "+"like '"+arg+"%'";
        
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
              "SELECT nome, data, cpf, telefoneproprio, telefoneconhecido, rua, bairro, numerocasa FROM registro_recepcao where "+argumento+"");
             
                ResultSet rs = pstmt.executeQuery();
                
                return rs;
    }
    public static ResultSet loadTableProntuario() throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT nome, cpf, hora, dia, mes, ano FROM prontuario");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }
    public static ResultSet loadTableProntuario (String tipo, String arg) throws SQLException
    {
        String argumento=tipo+" "+"like '"+arg+"%'";
        
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
              "SELECT nome, cpf, hora, dia, mes, ano FROM prontuario where "+argumento+"");
             
                ResultSet rs = pstmt.executeQuery();
                
                return rs;
    }
    public static ResultSet loadTableLogin() throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT cod, nome, usuario, senha, setor FROM logins");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }
    public static ResultSet loadTableLogin (String tipo, String arg) throws SQLException
    {
        String argumento=tipo+" "+"like '"+arg+"%'";
        
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
              "SELECT cod, nome, usuario, senha, setor FROM logins where "+argumento+"");
             
                ResultSet rs = pstmt.executeQuery();
                
                return rs;
    }
    public static ResultSet loadTableAlmoxarifado() throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT cod, produto FROM produtos_almoxarifado");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }
    public static ResultSet loadTableAlmoxarifado (String tipo, String arg) throws SQLException
    {
        String argumento=tipo+" "+"like '"+arg+"%'";
        
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
              "SELECT cod, produto FROM produtos_almoxarifado where "+argumento+"");
             
                ResultSet rs = pstmt.executeQuery();
                
                return rs;
    }
    public static ResultSet loadTableLog() throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT log FROM log");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }
    public static ResultSet loadTableAlmoxarifadoPedidos() throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT produto,quantidade,setor FROM pedidos_almoxarifado");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }
    public static ResultSet loadTableFarmacia() throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT cod, produto FROM produtos_farmacia");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }
    public static ResultSet loadTableFarmacia (String tipo, String arg) throws SQLException
    {
        String argumento=tipo+" "+"like '"+arg+"%'";
        
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
              "SELECT cod, produto FROM produtos_farmacia where "+argumento+"");
             
                ResultSet rs = pstmt.executeQuery();
                
                return rs;
    }
    public static ResultSet loadTableFarmaciaPedidos() throws SQLException{
        connectionDataBase conexao = new connectionDataBase();
        PreparedStatement pstmt = conexao.getConnection().prepareStatement(
                "SELECT produto,quantidade,setor FROM pedidos_farmacia");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }
}
