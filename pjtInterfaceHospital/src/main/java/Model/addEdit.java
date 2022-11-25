/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.dadosAlmoxarifado;
import Controller.dadosAlmoxarifadoPedidos;
import Controller.dadosEnfermaria;
import Controller.dadosFarmacia;
import Controller.dadosFarmaciaPedidos;
import Controller.dadosLogin;
import Controller.dadosProntuario;
import Controller.dadosRecepcao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author uande
 */
public class addEdit {
    dadosRecepcao objpes = new dadosRecepcao();
    
    public void IncluirRecepcao(dadosRecepcao objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO registro_recepcao(nome, data, cep, rua, bairro, numerocasa,complemento, cidade, estado, telefoneProprio, telefoneConhecido, sexo, cor,civil, cpf, rg, escolaridade, sus, adicional)"+
     " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"))                               {
          pstmt.setString(1,objpes.getNome().toUpperCase().trim());
          pstmt.setString(2,objpes.getData());       
          pstmt.setString(3,objpes.getCep().trim()); 
          pstmt.setString(4,objpes.getRua().trim()); 
          pstmt.setString(5,objpes.getBairro().trim()); 
          pstmt.setString(6,objpes.getNumeroCasa().trim()); 
          pstmt.setString(7,objpes.getComplemento().trim()); 
          pstmt.setString(8,objpes.getCidade().trim()); 
          pstmt.setString(9,objpes.getEstado().trim()); 
          pstmt.setString(10,objpes.getTelefoneProprio().trim()); 
          pstmt.setString(11,objpes.getTelefoneConhecido().trim()); 
          pstmt.setString(12,objpes.getSexo().trim()); 
          pstmt.setString(13,objpes.getCor().trim()); 
          pstmt.setString(14,objpes.getCivil().trim()); 
          pstmt.setString(15,objpes.getCpf().trim()); 
          pstmt.setString(16,objpes.getRg().trim()); 
          pstmt.setString(17,objpes.getEscolaridade().trim()); 
          pstmt.setString(18,objpes.getSus().trim()); 
          pstmt.setString(19,objpes.getAdicional().trim()); 
          
                  
       registros = pstmt.executeUpdate();        
    }
          
  
    
    
    }//fim do metodo incluir
    
    public boolean EditarRecepcao(dadosRecepcao objpes)  throws SQLException
        {
                connectionDataBase  conexao = new connectionDataBase();
                int registros;
                try  (PreparedStatement pstmt = conexao.getConnection().prepareStatement
                            ("update registro_recepcao set nome=?, data=?, cep=?, rua=?, bairro=?, numerocasa=?,complemento=?, cidade=?, estado=?, telefoneproprio=?, telefoneconhecido=?, sexo=?, cor=?,civil=?, cpf=?, rg=?, escolaridade=?, sus=?, adicional=? where cpf = ?")) {
                            pstmt.setString(1,objpes.getNome().toUpperCase().trim());
                            pstmt.setString(2,objpes.getData());
                            pstmt.setString(3,objpes.getCep().trim()); 
                            pstmt.setString(4,objpes.getRua().trim()); 
                            pstmt.setString(5,objpes.getBairro().trim()); 
                            pstmt.setString(6,objpes.getNumeroCasa().trim()); 
                            pstmt.setString(7,objpes.getComplemento().trim()); 
                            pstmt.setString(8,objpes.getCidade().trim()); 
                            pstmt.setString(9,objpes.getEstado().trim()); 
                            pstmt.setString(10,objpes.getTelefoneProprio().trim()); 
                            pstmt.setString(11,objpes.getTelefoneConhecido().trim()); 
                            pstmt.setString(12,objpes.getSexo().trim()); 
                            pstmt.setString(13,objpes.getCor().trim()); 
                            pstmt.setString(14,objpes.getCivil().trim()); 
                            pstmt.setString(15,objpes.getCpf().trim()); 
                            pstmt.setString(16,objpes.getRg().trim()); 
                            pstmt.setString(17,objpes.getEscolaridade().trim()); 
                            pstmt.setString(18,objpes.getSus().trim()); 
                            pstmt.setString(19,objpes.getAdicional().trim()); 
                            pstmt.setString(20,objpes.getCpf().trim()); 
                            
                            registros = pstmt.executeUpdate(); 
                }
                
               if (registros ==1){
                   return true;  }

               
               else {     
               return false; 
               }
               
    
        }
    public void IncluirEnfermagem(dadosEnfermaria objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO registro_enfermaria(nome, data, sexo, raca, altura,cpf, tiposanguineo,  tremediobox,  tremediotexto, tcancerbox, tcancertexto, thipertensaobox,  thipertensaotexto" +
" , tdiabetebox, tdiabetetexto,  tcardiacabox,  tcardiacatexto, tcronicabox,  tcronicatexto,  tcirurgiabox, tcirurgiatexto, talergiabox, talergiatexto, status)"+
     " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"))                               {
                            pstmt.setString(1,objpes.getNome().toUpperCase().trim());
                            pstmt.setString(2,objpes.getData());
                            pstmt.setString(3,objpes.getSexo().trim());
                            pstmt.setString(4,objpes.getRaca().trim());
                            pstmt.setString(5,objpes.getAltura().trim());
                            pstmt.setString(6,objpes.getCpf().trim());
                            pstmt.setString(7,objpes.getTiposanguineo().trim());
                            pstmt.setString(8,objpes.getTremediobox().trim());
                            pstmt.setString(9,objpes.getTremediotexto().trim());
                            pstmt.setString(10,objpes.getTcancerbox().trim());
                            pstmt.setString(11,objpes.getTcancertexto().trim());
                            pstmt.setString(12,objpes.getThipertensaobox().trim());
                            pstmt.setString(13,objpes.getThipertensaotexto().trim());
                            pstmt.setString(14,objpes.getTdiabetebox().trim());
                            pstmt.setString(15,objpes.getTdiabetetexto().trim());
                            pstmt.setString(16,objpes.getTcardiacabox().trim());
                            pstmt.setString(17,objpes.getTcardiacatexto().trim());
                            pstmt.setString(18,objpes.getTcronicabox().trim());
                            pstmt.setString(19,objpes.getTcronicatexto().trim());
                            pstmt.setString(20,objpes.getTcirurgiabox().trim());
                            pstmt.setString(21,objpes.getTcirurgiatexto().trim());
                            pstmt.setString(22,objpes.getTalergiabox().trim());
                            pstmt.setString(23,objpes.getTalergiatexto().trim());
                            pstmt.setString(24,objpes.getStatus().trim());
          
                  
       registros = pstmt.executeUpdate();        
    }
          
  
    
    
    }//fim do metodo incluir
    
    public boolean EditarEnfermagem(dadosEnfermaria objpes)  throws SQLException
        {
                connectionDataBase  conexao = new connectionDataBase();
                int registros;
                try  (PreparedStatement pstmt = conexao.getConnection().prepareStatement
                            ("update registro_enfermaria set nome=?, data=?, sexo=?, raca=?,altura=?, cpf=?, tiposanguineo=?,tremediobox=?, tremediotexto=?,tcancerbox=?, tcancertexto=?, thipertensaobox=?, thipertensaotexto=?, tdiabetebox=?,tdiabetetexto=?, tcardiacabox=?, tcardiacatexto=?, tcronicabox=?, tcronicatexto=?, tcirurgiabox=?, tcirurgiatexto=?, talergiabox=?, talergiatexto=?, status=? where cpf = ?")) {
                            pstmt.setString(1,objpes.getNome().toUpperCase().trim());
                            pstmt.setString(2,objpes.getData());
                            pstmt.setString(3,objpes.getSexo().trim());
                            pstmt.setString(4,objpes.getRaca().trim());
                            pstmt.setString(5,objpes.getAltura().trim());
                            pstmt.setString(6,objpes.getCpf().trim());
                            pstmt.setString(7,objpes.getTiposanguineo().trim());
                            pstmt.setString(8,objpes.getTremediobox().trim());
                            pstmt.setString(9,objpes.getTremediotexto().trim());
                            pstmt.setString(10,objpes.getTcancerbox().trim());
                            pstmt.setString(11,objpes.getTcancertexto().trim());
                            pstmt.setString(12,objpes.getThipertensaobox().trim());
                            pstmt.setString(13,objpes.getThipertensaotexto().trim());
                            pstmt.setString(14,objpes.getTdiabetebox().trim());
                            pstmt.setString(15,objpes.getTdiabetetexto().trim());
                            pstmt.setString(16,objpes.getTcardiacabox().trim());
                            pstmt.setString(17,objpes.getTcardiacatexto().trim());
                            pstmt.setString(18,objpes.getTcronicabox().trim());
                            pstmt.setString(19,objpes.getTcronicatexto().trim());
                            pstmt.setString(20,objpes.getTcirurgiabox().trim());
                            pstmt.setString(21,objpes.getTcirurgiatexto().trim());
                            pstmt.setString(22,objpes.getTalergiabox().trim());
                            pstmt.setString(23,objpes.getTalergiatexto().trim());
                            pstmt.setString(24,objpes.getStatus().trim());
                            pstmt.setString(25,objpes.getCpf().trim());
                            
                            
                            registros = pstmt.executeUpdate(); 
                }
                
               if (registros ==1){
                   return true;  }

               
               else {     
               return false; 
               }
               
    
        }
    public void IncluirProntuario(dadosProntuario objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO prontuario(nome, dia, mes, ano, hora,cpf,informacao,  avaliacao,  orientacao)"+
     " VALUES (?,?,?,?,?,?,?,?,?)"))                               {
                            pstmt.setString(1,objpes.getNome().toUpperCase().trim());
                            pstmt.setString(2,objpes.getDia());
                            pstmt.setString(3,objpes.getMes().trim());
                            pstmt.setString(4,objpes.getAno().trim());
                            pstmt.setString(5,objpes.getHora().trim());
                            pstmt.setString(6,objpes.getCpf().trim());
                            pstmt.setString(7,objpes.getInformacao().trim());
                            pstmt.setString(8,objpes.getAvaliacao().trim());
                            pstmt.setString(9,objpes.getOrientacao().trim());
                            
          
                  
       registros = pstmt.executeUpdate();        
    }
          
  
    
    
    }//fim do metodo incluir
    
    public boolean EditarProntuario(dadosProntuario objpes)  throws SQLException
        {
                connectionDataBase  conexao = new connectionDataBase();
                int registros;
                try  (PreparedStatement pstmt = conexao.getConnection().prepareStatement
                            ("update prontuario set nome=?, dia=?, mes=?, ano=?,hora=?, cpf=?, informacao=?,avaliacao=?, orientacao=? where cpf = ?")) {
                            pstmt.setString(1,objpes.getNome().toUpperCase().trim());
                            pstmt.setString(2,objpes.getDia());
                            pstmt.setString(3,objpes.getMes().trim());
                            pstmt.setString(4,objpes.getAno().trim());
                            pstmt.setString(5,objpes.getHora().trim());
                            pstmt.setString(6,objpes.getCpf().trim());
                            pstmt.setString(7,objpes.getInformacao().trim());
                            pstmt.setString(8,objpes.getAvaliacao().trim());
                            pstmt.setString(9,objpes.getOrientacao().trim());
                            pstmt.setString(10,objpes.getCpf().trim());
                            
                            
                            registros = pstmt.executeUpdate(); 
                }
                
               if (registros ==1){
                   return true;  }

               
               else {     
               return false; 
               }
               
    
        }
    public void IncluirLogin(dadosLogin objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO logins(cod,nome, usuario, senha, setor)"+
     " VALUES (?,?,?,?,?)"))                               {
                            pstmt.setInt(1,objpes.getCod());
                            pstmt.setString(2,objpes.getNome().toUpperCase().trim());
                            pstmt.setString(3,objpes.getUsuario().trim());
                            pstmt.setString(4,objpes.getSenha().trim());
                            pstmt.setString(5,objpes.getSetor().trim());
                           
          
                  
       registros = pstmt.executeUpdate();        
    }
          
  
    
    
    }//fim do metodo incluir
    
    public boolean EditarLogin(dadosLogin objpes)  throws SQLException
        {
                connectionDataBase  conexao = new connectionDataBase();
                int registros;
                try  (PreparedStatement pstmt = conexao.getConnection().prepareStatement
                            ("update logins set nome=?, usuario=?, senha=?, setor=? where cod = ?")) {
                            pstmt.setString(1,objpes.getNome().toUpperCase().trim());
                            pstmt.setString(2,objpes.getUsuario());
                            pstmt.setString(3,objpes.getSenha().trim());
                            pstmt.setString(4,objpes.getSetor().trim());
                  
                            
                            registros = pstmt.executeUpdate(); 
                }
                
               if (registros ==1){
                   return true;  }

               
               else {     
               return false; 
               }
               
    
        }
    public void IncluirAlmoxarifado(dadosAlmoxarifado objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO produtos_almoxarifado(cod,produto)"+
     " VALUES (?,?)"))                               {
                            pstmt.setInt(1,objpes.getCod());
                            pstmt.setString(2,objpes.getProduto().trim());

                           
       registros = pstmt.executeUpdate();        
    }
          
  
    
    
    }//fim do metodo incluir
    
    public boolean EditarAlmoxarifado(dadosAlmoxarifado objpes)  throws SQLException
        {
                connectionDataBase  conexao = new connectionDataBase();
                int registros;
                try  (PreparedStatement pstmt = conexao.getConnection().prepareStatement
                            ("update produtos_almoxarifado set nome=? where cod = ?")) {
                            pstmt.setString(1,objpes.getProduto().toUpperCase().trim());
                            pstmt.setInt(2,objpes.getCod());

                            
                            registros = pstmt.executeUpdate(); 
                }
                
               if (registros ==1){
                   return true;  }

               
               else {     
               return false; 
               }
               
    
        }
    public void IncluirLog( dadosRecepcao objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO log(log)"+
     " VALUES (?)"))                               {
                            pstmt.setString(1,objpes.getNome());


                           
       registros = pstmt.executeUpdate();        
    }
    }
     public void IncluirAlmoxarifadoPedido(dadosAlmoxarifadoPedidos objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO pedidos_almoxarifado(produto,quantidade,setor)"+
     " VALUES (?,?,?)"))                               {
                            pstmt.setString(1,objpes.getProduto().trim());
                            pstmt.setString(2,objpes.getQuantidade().trim());
                            pstmt.setString(3,objpes.getSetor().trim());

                           
       registros = pstmt.executeUpdate();        
    }
    }
     public void IncluirFarmacia(dadosFarmacia objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO produtos_farmacia(cod,produto)"+
     " VALUES (?,?)"))                               {
                            pstmt.setInt(1,objpes.getCod());
                            pstmt.setString(2,objpes.getProduto().trim());

                           
       registros = pstmt.executeUpdate();        
    }
          
  
    
    
    }//fim do metodo incluir
    
    public boolean EditarFarmacia(dadosFarmacia objpes)  throws SQLException
        {
                connectionDataBase  conexao = new connectionDataBase();
                int registros;
                try  (PreparedStatement pstmt = conexao.getConnection().prepareStatement
                            ("update produtos_farmacia set nome=? where cod = ?")) {
                            pstmt.setString(1,objpes.getProduto().toUpperCase().trim());
                            pstmt.setInt(2,objpes.getCod());

                            
                            registros = pstmt.executeUpdate(); 
                }
                
               if (registros ==1){
                   return true;  }

               
               else {     
               return false; 
               }
               
    
        }
    public void IncluirFarmaciaPedido(dadosFarmaciaPedidos objpes) throws SQLException
                                                                                                                           
    {          
          connectionDataBase  conexao = new connectionDataBase();
          int registros;
          try (PreparedStatement pstmt = conexao.getConnection().prepareStatement
    ("INSERT INTO pedidos_farmacia(produto,quantidade,setor)"+
     " VALUES (?,?,?)"))                               {
                            pstmt.setString(1,objpes.getProduto().trim());
                            pstmt.setString(2,objpes.getQuantidade().trim());
                            pstmt.setString(3,objpes.getSetor().trim());

                           
       registros = pstmt.executeUpdate();        
    }
    }
}

 