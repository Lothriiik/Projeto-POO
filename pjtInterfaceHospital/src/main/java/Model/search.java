/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.dadosAlmoxarifado;
import Controller.dadosEnfermaria;
import Controller.dadosFarmacia;
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
public class search {
    dadosRecepcao objpes = new dadosRecepcao();
    
    public boolean SearchRecepcao(dadosRecepcao objpes) throws SQLException
    {       
        String cpf=objpes.getCpf();
        
        connectionDataBase  conexao = new connectionDataBase();
        PreparedStatement pstmt =
         conexao.getConnection().prepareStatement(
         "SELECT * FROM registro_recepcao where cpf =  ?");
        pstmt.setString(1,cpf);
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()){
            objpes.setNome(rs.getString("nome"));
            objpes.setData(rs.getString("data"));
            objpes.setCep(rs.getString("cep"));
            objpes.setRua(rs.getString("rua"));
            objpes.setBairro(rs.getString("bairro"));
            objpes.setNumeroCasa(rs.getString("numerocasa"));
            objpes.setComplemento(rs.getString("complemento"));
            objpes.setCidade(rs.getString("cidade"));
            objpes.setEstado(rs.getString("estado"));
            objpes.setTelefoneProprio(rs.getString("telefoneproprio"));
            objpes.setTelefoneConhecido(rs.getString("telefoneconhecido"));
            objpes.setSexo(rs.getString("sexo"));
            objpes.setCor(rs.getString("cor"));
            objpes.setCivil(rs.getString("civil"));
            objpes.setCpf(rs.getString("cpf"));
            objpes.setRg(rs.getString("rg"));
            objpes.setEscolaridade(rs.getString("escolaridade"));
            objpes.setSus(rs.getString("sus"));
            objpes.setAdicional(rs.getString("adicional"));
        }
                return true;    
}
     public boolean SearchEnfermaria(dadosEnfermaria objpes) throws SQLException
    {       
        String cpf=objpes.getCpf();
        
        connectionDataBase  conexao = new connectionDataBase();
        PreparedStatement pstmt =
         conexao.getConnection().prepareStatement(
         "SELECT * FROM registro_enfermaria where cpf =  ?");
        pstmt.setString(1,cpf);
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()){
            objpes.setNome(rs.getString("nome"));
            objpes.setData(rs.getString("data"));
            objpes.setSexo(rs.getString("sexo"));
            objpes.setRaca(rs.getString("raca"));
            objpes.setAltura(rs.getString("altura"));
            objpes.setCpf(rs.getString("cpf"));
            objpes.setTiposanguineo(rs.getString("tiposanguineo"));
            objpes.setTremediobox(rs.getString("tremediobox"));
            objpes.setTremediotexto(rs.getString("tremediotexto"));
            objpes.setTcancerbox(rs.getString("tcancerbox"));
            objpes.setTcancertexto(rs.getString("tcancertexto"));
            objpes.setThipertensaobox(rs.getString("thipertensaobox"));
            objpes.setThipertensaotexto(rs.getString("thipertensaotexto"));
            objpes.setTdiabetebox(rs.getString("tdiabetebox"));
            objpes.setTdiabetetexto(rs.getString("tdiabetebox"));
            objpes.setTcardiacabox(rs.getString("tcardiacabox"));
            objpes.setTcardiacatexto(rs.getString("tcardiacatexto"));
            objpes.setTcronicabox(rs.getString("tcronicabox"));
            objpes.setTcronicatexto(rs.getString("tcronicatexto"));
            objpes.setTcirurgiabox(rs.getString("tcirurgiabox"));
            objpes.setTcirurgiatexto(rs.getString("tcirurgiatexto"));
            objpes.setTalergiabox(rs.getString("talergiabox"));
            objpes.setTalergiatexto(rs.getString("talergiatexto"));
            objpes.setStatus(rs.getString("status"));
            
        }
                return true;    
}
     public boolean SearchProntuario(dadosProntuario objpes) throws SQLException
    {       
        String cpf=objpes.getCpf();
        String dia=objpes.getDia();
        String mes=objpes.getMes();
        String ano=objpes.getAno();
        
        connectionDataBase  conexao = new connectionDataBase();
        PreparedStatement pstmt =
         conexao.getConnection().prepareStatement(
         "SELECT * FROM prontuario where cpf =  ? and dia = ? and mes = ? and ano = ?");
        pstmt.setString(1,cpf);
        pstmt.setString(2,dia);
        pstmt.setString(3,mes);
        pstmt.setString(4,ano);
        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()){
            objpes.setNome(rs.getString("nome"));
            objpes.setDia(rs.getString("dia"));
            objpes.setMes(rs.getString("mes"));
            objpes.setAno(rs.getString("ano"));
            objpes.setHora(rs.getString("hora"));
            objpes.setCpf(rs.getString("cpf"));
            objpes.setInformacao(rs.getString("informacao"));
            objpes.setAvaliacao(rs.getString("avaliacao"));
            objpes.setOrientacao(rs.getString("orientacao"));

            
        }
                return true;    
}
     public boolean SearchLogin(dadosLogin objpes) throws SQLException
    {       
        int cod=objpes.getCod();
        
        
        connectionDataBase  conexao = new connectionDataBase();
        PreparedStatement pstmt =
         conexao.getConnection().prepareStatement(
         "SELECT * FROM logins where cod =  ? ");
        pstmt.setInt(1,cod);

        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()){
            objpes.setCod(rs.getInt("cod"));
            objpes.setNome(rs.getString("nome"));
            objpes.setUsuario(rs.getString("usuario"));
            objpes.setSenha(rs.getString("senha"));
            objpes.setSetor(rs.getString("setor"));

        }
                return true;    
}
     public boolean SearchAlmoxarifado(dadosAlmoxarifado objpes) throws SQLException
    {       
        int cod=objpes.getCod();
        
        
        connectionDataBase  conexao = new connectionDataBase();
        PreparedStatement pstmt =
         conexao.getConnection().prepareStatement(
         "SELECT * FROM produtos_almoxarifado where cod =  ? ");
        pstmt.setInt(1,cod);

        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()){
            objpes.setCod(rs.getInt("cod"));
            objpes.setProduto(rs.getString("produto"));


        }
                return true;    
}
     public boolean SearchFarmacia(dadosFarmacia objpes) throws SQLException
    {       
        int cod=objpes.getCod();
        
        
        connectionDataBase  conexao = new connectionDataBase();
        PreparedStatement pstmt =
         conexao.getConnection().prepareStatement(
         "SELECT * FROM produtos_farmacia where cod =  ? ");
        pstmt.setInt(1,cod);

        
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()){
            objpes.setCod(rs.getInt("cod"));
            objpes.setProduto(rs.getString("produto"));


        }
                return true;    
}
}