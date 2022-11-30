/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Controller.dadosAlmoxarifado;
import Model.addEdit;
import Model.delete;
import Model.search;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author uande
 */
public class telaTIAlmoxarifadoCadastro extends javax.swing.JInternalFrame {

     int acao;   
    
    dadosAlmoxarifado objpes =  new dadosAlmoxarifado();
    addEdit  AE;
    search Sea;
    delete Del;
    public static boolean almoxarifado;
    public telaTIAlmoxarifadoCadastro() {
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
        almSalvar = new javax.swing.JButton();
        almEditar = new javax.swing.JButton();
        almNovo = new javax.swing.JButton();
        almSair = new javax.swing.JButton();
        almCancelar = new javax.swing.JButton();
        almExcluir = new javax.swing.JButton();
        almCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        almProduto = new javax.swing.JTextField();

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

        almSalvar.setText("Salvar");
        almSalvar.setEnabled(false);
        almSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almSalvarActionPerformed(evt);
            }
        });

        almEditar.setText("Editar");
        almEditar.setEnabled(false);
        almEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almEditarActionPerformed(evt);
            }
        });

        almNovo.setText("Novo");
        almNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almNovoActionPerformed(evt);
            }
        });

        almSair.setText("Sair");
        almSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almSairActionPerformed(evt);
            }
        });

        almCancelar.setText("Cancelar");
        almCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almCancelarActionPerformed(evt);
            }
        });

        almExcluir.setText("Excluir");
        almExcluir.setEnabled(false);
        almExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Produto:");

        almProduto.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(almCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(almProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(almEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(almExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 160, Short.MAX_VALUE)
                                .addComponent(almSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(almSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(almCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(almNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(almCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(almProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(almCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(almNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(almExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(almSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(almSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        setBounds(0, 0, 400, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    private void almSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almSairActionPerformed

        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_almSairActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void almSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almSalvarActionPerformed
        objpes= new dadosAlmoxarifado();
        preencher_objetos();
        try {
            AE = new addEdit();
            
                    if(acao==1){
                        AE.IncluirAlmoxarifado(objpes);
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso !");
                        Salvar();
                    }  
                    if(acao==2){
                        objpes.setCod(Integer.parseInt(almCodigo.getText()));
                        if(AE.EditarAlmoxarifado(objpes)){
                            JOptionPane.showMessageDialog(this, "Alterado com sucesso !");
                            Salvar();
                        }
                        
                    }
        }catch(SQLException error){
           JOptionPane.showMessageDialog (this,"Operação Não Realizada."+error.getMessage());
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_almSalvarActionPerformed

    private void almNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almNovoActionPerformed
        acao=1;
        Novo();
        // TODO add your handling code here:
    }//GEN-LAST:event_almNovoActionPerformed

    private void almEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almEditarActionPerformed
        acao=2;
        Editar();
        // TODO add your handling code here:
    }//GEN-LAST:event_almEditarActionPerformed

    private void almCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almCancelarActionPerformed
        Cancelar();
        // TODO add your handling code here:
    }//GEN-LAST:event_almCancelarActionPerformed

    private void almExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almExcluirActionPerformed
        if (almCodigo.getText().equals(".   .   -")){
            JOptionPane.showMessageDialog(this,"Digite o CPF  :");
        }else{
            int Cod=Integer.parseInt(almCodigo.getText());
            
            Del  = new delete();
            try{
                if  (JOptionPane.showConfirmDialog(this,"Confirma a exclusao ?","Confirmação", JOptionPane.YES_NO_CANCEL_OPTION)  == JOptionPane.YES_OPTION){
                    
                    if(Del.DeleteAlmoxarifado(Cod)){
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
    }//GEN-LAST:event_almExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton almCancelar;
    private static javax.swing.JTextField almCodigo;
    private javax.swing.JButton almEditar;
    private javax.swing.JButton almExcluir;
    private javax.swing.JButton almNovo;
    private javax.swing.JTextField almProduto;
    private javax.swing.JButton almSair;
    private javax.swing.JButton almSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
 public void preencher_objetos(){
            objpes.setCod(Integer.parseInt(almCodigo.getText()));
            objpes.setProduto(almProduto.getText().trim());


    }
        
   public void pesquisa(){
      

          almProduto.setText(objpes.getProduto().trim());
          almEditar.setEnabled(true);
   } 
    

    public void Novo(){
        almProduto.setEnabled(true);
        almSalvar.setEnabled(true);
        almEditar.setEnabled(true);
        almCodigo.setEnabled(true);
        almProduto.setText("");
        almCodigo.setText("");

    }

    public void Cancelar(){
        almProduto.setEnabled(false);
        almSalvar.setEnabled(false);
        almEditar.setEnabled(false);
        almExcluir.setEnabled(false);
        almCodigo.setEnabled(false);
        almProduto.setText("");
        almCodigo.setText("");

}
public void Editar(){
        almProduto.setEnabled(true);
        almSalvar.setEnabled(true);
        almEditar.setEnabled(true);
        almCodigo.setEnabled(true);
        almExcluir.setEnabled(true);
}
public void Salvar(){
        almProduto.setEnabled(false);
        almSalvar.setEnabled(false);
        almEditar.setEnabled(true);
        almExcluir.setEnabled(false);
        
        

}

public static void recebecod(dadosAlmoxarifado objpes){
    almCodigo.setText(String.valueOf(objpes.getCod()));
    almCodigo.requestFocus();
}
}
