/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author uande
 */
public class delete {
    public boolean Delete(String cpf) throws SQLException{
        connectionDataBase  conexao = new connectionDataBase();
        int registros;
        try (PreparedStatement pstmt = conexao.getConnection().prepareStatement 
        ("delete from registro_recepcao where cpf=?")){
            pstmt.setString(1,cpf);
            registros = pstmt.executeUpdate();
    }
        if (registros ==1){
            return true;}
        else{
            return false;}
        }
    public boolean DeleteLogin(int cod) throws SQLException{
        connectionDataBase  conexao = new connectionDataBase();
        int registros;
        try (PreparedStatement pstmt = conexao.getConnection().prepareStatement 
        ("delete from logins where cod=?")){
            pstmt.setInt(1,cod);
            registros = pstmt.executeUpdate();
    }
        if (registros ==1){
            return true;}
        else{
            return false;}
        }
     public boolean DeleteAlmoxarifado(int cod) throws SQLException{
        connectionDataBase  conexao = new connectionDataBase();
        int registros;
        try (PreparedStatement pstmt = conexao.getConnection().prepareStatement 
        ("delete from produtos_almoxarifado where cod=?")){
            pstmt.setInt(1,cod);
            registros = pstmt.executeUpdate();
    }
        if (registros ==1){
            return true;}
        else{
            return false;}
        }
     public boolean DeleteAlmoxarifadoPedidos(int cod, String produto, String  quantidade, String setor) throws SQLException{
        connectionDataBase  conexao = new connectionDataBase();
        int registros;
        try (PreparedStatement pstmt = conexao.getConnection().prepareStatement 
        ("delete from pedidos_almoxarifado where cod=? and produto=? and quantidade=? and setor=?")){
            pstmt.setInt(1,cod);
            pstmt.setString(2,produto);
            pstmt.setString(3,quantidade);
            pstmt.setString(4,setor);
            registros = pstmt.executeUpdate();
    }
        if (registros ==1){
            return true;}
        else{
            return false;}
        }
     public boolean DeleteFarmacia(int cod) throws SQLException{
        connectionDataBase  conexao = new connectionDataBase();
        int registros;
        try (PreparedStatement pstmt = conexao.getConnection().prepareStatement 
        ("delete from produtos_farmacia where cod=?")){
            pstmt.setInt(1,cod);
            registros = pstmt.executeUpdate();
    }
        if (registros ==1){
            return true;}
        else{
            return false;}
        }
     public boolean DeleteFarmaciaPedidos(int cod,String produto, String  quantidade, String setor) throws SQLException{
        connectionDataBase  conexao = new connectionDataBase();
        int registros;
        try (PreparedStatement pstmt = conexao.getConnection().prepareStatement 
        ("delete from pedidos_farmacia where cod=? and produto=? and quantidade=? and setor=?")){
            pstmt.setInt(1,cod);
            pstmt.setString(2,produto);
            pstmt.setString(3,quantidade);
            pstmt.setString(4,setor);
            registros = pstmt.executeUpdate();
    }
        if (registros ==1){
            return true;}
        else{
            return false;}
        }
}
    

