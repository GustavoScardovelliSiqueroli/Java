package ProjetoSaulo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gustavo
 */
public class frmAtualizarCliente extends javax.swing.JFrame {

    /**
     * Creates new form frmCadastroCliente
     */
    public frmAtualizarCliente() {
    	addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowOpened(WindowEvent e) {
    		}
    	});
        initComponents();
        CarregarComboBox();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        cmbCidade = new javax.swing.JComboBox<>();
        btnGravarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Cidade");

        jLabel3.setText("CPF");

        jLabel4.setText("Endereco");

        cmbCidade.setSelectedIndex(-1);

        btnGravarCliente.setText("Atualizar");
        btnGravarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarClienteActionPerformed(evt);
            }
        });
        
        JLabel lblNewLabel = new JLabel("ATUALIZAR CLIENTE");
        
        txtID = new JTextField();
        
        JLabel lblId = new JLabel();
        lblId.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel2)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(cmbCidade, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel1)
        								.addComponent(jLabel3))
        							.addGap(28)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel4)
        								.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txtID, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))))
        					.addGap(89)
        					.addComponent(btnGravarCliente, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
        				.addComponent(lblNewLabel))
        			.addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblNewLabel)
        					.addGap(17)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3)
        						.addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1)
        						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(cmbCidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(7)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel4)
        						.addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblId)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(49)
        					.addComponent(btnGravarCliente, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarClienteActionPerformed
    AlterarCliente();    
    }//GEN-LAST:event_btnGravarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAtualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAtualizarCliente().setVisible(true);
            }
        });
    }
    
    
       Vector<Integer> id_cidade = new Vector<Integer>();
    public void CarregarComboBox(){
        ResultSet rs; 
        try{
            ClienteDAO objclientedao = new ClienteDAO();
            rs = objclientedao.carregarCBX();
            while(rs.next()){
                id_cidade.addElement(rs.getInt(1));
                cmbCidade.addItem(rs.getString(2));
            }
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Carregar ComboBox de Cidades: " + erro);
        }
    }
    
    
    private void AlterarCliente(){ 
        int ID_cliente; 
        String Nome_cliente, CPF_cliente, Endereco_cliente;
        int Cidade_FK_cliente, cod_cidade;

        ID_cliente = Integer.parseInt(txtID.getText()); 
        Nome_cliente = txtNome.getText(); 
        CPF_cliente = txtCPF.getText(); 
        Endereco_cliente = txtEndereco.getText(); 
        cod_cidade =  id_cidade.get(cmbCidade.getSelectedIndex());

        ClienteDTO objClienteDTO = new ClienteDTO(); 
        objClienteDTO.setID_cliente(ID_cliente); 
        objClienteDTO.setNome_cliente(Nome_cliente); 
        objClienteDTO.setCPF_cliente(CPF_cliente); 
        objClienteDTO.setEndereco_cliente(Endereco_cliente); 
        objClienteDTO.setCidade_FK_cliente(cod_cidade); 

        ClienteDAO objClienteDAO = new ClienteDAO(); 
        objClienteDAO.alterarCliente(objClienteDTO); 
 } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravarCliente;
    private javax.swing.JComboBox<String> cmbCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private JTextField txtID;
}