/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.dadosEnfermaria;
import Controller.dadosLogin;
import Model.addEdit;
import Model.delete;
import Model.search;
import static View.telaEnfermariaPrincipal.telaPrincipal;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author uande
 */
public class telaTILoginCadastro extends javax.swing.JInternalFrame {

     int acao;   
    
    dadosLogin objpes =  new dadosLogin();
    addEdit  AE;
    search Sea;
    delete Del;
    public static boolean prontuario;
    public telaTILoginCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        logVerificar = new javax.swing.JButton();
        logSalvar = new javax.swing.JButton();
        logEditar = new javax.swing.JButton();
        logNovo = new javax.swing.JButton();
        enfSair = new javax.swing.JButton();
        logCancelar = new javax.swing.JButton();
        logExcluir = new javax.swing.JButton();
        logCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        logUsuario = new javax.swing.JTextField();
        logSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logSetor = new javax.swing.JComboBox<>();

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel13.setText("Toma algum rémedio ? Se sim qual?");

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        logVerificar.setText("Verificar");
        logVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logVerificarActionPerformed(evt);
            }
        });

        logSalvar.setText("Salvar");
        logSalvar.setEnabled(false);
        logSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logSalvarActionPerformed(evt);
            }
        });

        logEditar.setText("Editar");
        logEditar.setEnabled(false);
        logEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logEditarActionPerformed(evt);
            }
        });

        logNovo.setText("Novo");
        logNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logNovoActionPerformed(evt);
            }
        });

        enfSair.setText("Sair");
        enfSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enfSairActionPerformed(evt);
            }
        });

        logCancelar.setText("Cancelar");
        logCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logCancelarActionPerformed(evt);
            }
        });

        logExcluir.setText("Excluir");
        logExcluir.setEnabled(false);
        logExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Nome Funcionario:");

        logNome.setEnabled(false);

        jLabel3.setText("Usuário:");

        logUsuario.setEnabled(false);

        logSenha.setEnabled(false);

        jLabel4.setText("Senha:");

        jLabel5.setText("Setor:");

        logSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Recepção", "TI", "Enfermaria", "Almoxarifado", "Farmacia" }));
        logSetor.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(logSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enfSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addComponent(logEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(logVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(logNome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logVerificar)
                    .addComponent(logCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(enfSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 22, Short.MAX_VALUE))
        );

        setBounds(0, 0, 400, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        telaTIPrincipal.cadastroUsuario=true;
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void enfSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enfSairActionPerformed
        telaTIPrincipal.cadastroUsuario=false;
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_enfSairActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        telaTIPrincipal.cadastroUsuario=false;
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void logSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logSalvarActionPerformed
        objpes= new dadosLogin();
        preencher_objetos();
        try {
            AE = new addEdit();
            
                    if(acao==1){
                        AE.IncluirLogin(objpes);
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso !");
                        Salvar();
                    }  
                    if(acao==2){
                        objpes.setCod(Integer.parseInt(logCodigo.getText()));
                        if(AE.EditarLogin(objpes)){
                            JOptionPane.showMessageDialog(this, "Alterado com sucesso !");
                            Salvar();
                        }
                        
                    }
        }catch(SQLException error){
           JOptionPane.showMessageDialog (this,"Operação Não Realizada."+error.getMessage());
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_logSalvarActionPerformed

    private void logNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logNovoActionPerformed
        acao=1;
        Novo();
        // TODO add your handling code here:
    }//GEN-LAST:event_logNovoActionPerformed

    private void logEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logEditarActionPerformed
        acao=2;
        Editar();
        // TODO add your handling code here:
    }//GEN-LAST:event_logEditarActionPerformed

    private void logVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logVerificarActionPerformed
//        objpes= new dadosEnfermaria();
       
       if(logCodigo.getText().equals("")){

                telaTILoginConsulta  objconsulta  =  new  telaTILoginConsulta();
                telaTIPrincipal.telaPrincipal.add(objconsulta);
                objconsulta.setVisible(true);
                telaTIPrincipal.telaPrincipal.setComponentZOrder(objconsulta,0);
       
     
       }
       else{
           objpes.setCod(Integer.parseInt(logCodigo.getText()));
                    Sea=  new  search();
                    try{
                        
                        if(Sea.SearchLogin(objpes)){
                            if((objpes !=  null)){
                                pesquisa();
                            }
                                
                            }
                        }catch(SQLException erro){
                            JOptionPane.showMessageDialog(this,"Erro ao Pesquisar"+  erro.getMessage());
                        }
                    }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_logVerificarActionPerformed

    private void logCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logCancelarActionPerformed
        Cancelar();
        // TODO add your handling code here:
    }//GEN-LAST:event_logCancelarActionPerformed

    private void logExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logExcluirActionPerformed
        if (logCodigo.getText().equals(".   .   -")){
            JOptionPane.showMessageDialog(this,"Digite o CPF  :");
        }else{
            int Cod=Integer.parseInt(logCodigo.getText());
            
            Del  = new delete();
            try{
                if  (JOptionPane.showConfirmDialog(this,"Confirma a exclusao ?","Confirmação", JOptionPane.YES_NO_CANCEL_OPTION)  == JOptionPane.YES_OPTION){
                    
                    if(Del.DeleteLogin(Cod)){
                        JOptionPane.showMessageDialog(this,"Excluido  com sucesso ");
                        Cancelar();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Erro ao excluir o cadastro ");
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"Operação concluida ");
                    Cancelar();
                }
            
        }catch( SQLException  error){
            JOptionPane.showMessageDialog(this,"Erro: Exclusão não realizada !" +error.getMessage());
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_logExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enfSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JButton logCancelar;
    private static javax.swing.JTextField logCodigo;
    private javax.swing.JButton logEditar;
    private javax.swing.JButton logExcluir;
    private javax.swing.JTextField logNome;
    private javax.swing.JButton logNovo;
    private javax.swing.JButton logSalvar;
    private javax.swing.JTextField logSenha;
    private javax.swing.JComboBox<String> logSetor;
    private javax.swing.JTextField logUsuario;
    private javax.swing.JButton logVerificar;
    // End of variables declaration//GEN-END:variables
 public void preencher_objetos(){
            objpes.setCod(Integer.parseInt(logCodigo.getText()));
            objpes.setNome(logNome.getText().trim());
            objpes.setUsuario(logUsuario.getText());
            objpes.setSenha(logSenha.getText());
            objpes.setSetor((String) logSetor.getSelectedItem());

    }
        
   public void pesquisa(){
      
        if(objpes.getSetor().equals("Recepção")){
           logSetor.setSelectedIndex(1); 
        }
        if(objpes.getSetor().equals("Enfermaria")){
           logSetor.setSelectedIndex(2); 
        }
        if(objpes.getSetor().equals("TI")){
           logSetor.setSelectedIndex(3); 
        }
        if(objpes.getSetor().equals("Almoxarifado")){
           logSetor.setSelectedIndex(4); 
        }
        if(objpes.getSetor().equals("Farmacia")){
           logSetor.setSelectedIndex(5); 
        }
        
            
       
          logNome.setText(objpes.getNome().trim());
          logUsuario.setText(objpes.getUsuario().trim());       
          logSenha.setText(objpes.getSenha().trim()); 
          logEditar.setEnabled(true);
   } 
    

    public void Novo(){
        logNome.setEnabled(true);
        logUsuario.setEnabled(true);
        logSenha.setEnabled(true);
        logSetor.setEnabled(true);
        logSalvar.setEnabled(true);
        logEditar.setEnabled(true);
        logCodigo.setEnabled(true);
        logNome.setText("");
        logUsuario.setText("");   
        logSenha.setText("");
        logCodigo.setText("");
        logSetor.setSelectedIndex(0);
    }

    public void Cancelar(){
        logNome.setEnabled(false);
        logUsuario.setEnabled(false);
        logSenha.setEnabled(false);
        logSetor.setEnabled(false);
        logSalvar.setEnabled(false);
        logEditar.setEnabled(false);
        logExcluir.setEnabled(false);
        logCodigo.setEnabled(false);
        logNome.setText("");
        logUsuario.setText("");   
        logSenha.setText("");
        logCodigo.setText("");
        logSetor.setSelectedIndex(0);

}
public void Editar(){
        logNome.setEnabled(true);
        logUsuario.setEnabled(true);
        logSenha.setEnabled(true);
        logSetor.setEnabled(true);
        logSalvar.setEnabled(true);
        logEditar.setEnabled(true);
        logCodigo.setEnabled(true);
        logExcluir.setEnabled(true);
}
public void Salvar(){
        logNome.setEnabled(false);
        logUsuario.setEnabled(false);
        logSenha.setEnabled(false);
        logSetor.setEnabled(false);
        logSalvar.setEnabled(false);
        logEditar.setEnabled(true);
        logExcluir.setEnabled(false);
        logCodigo.setEnabled(false);
        

}

public static void recebecod(dadosLogin objpes){
    logCodigo.setText(String.valueOf(objpes.getCod()));
    logCodigo.requestFocus();
}
}
