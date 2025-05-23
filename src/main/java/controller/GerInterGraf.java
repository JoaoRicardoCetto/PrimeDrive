/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ConexaoHibernate;
import viewer.DlgCadastroCliente;
import viewer.DlgHome;
import viewer.DlgReservas;
import viewer.DlgNovaReserva;
import viewer.FrmInicial;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author joaom
 */
public class GerInterGraf {
    
    private FrmInicial frmInicial = null;
    private DlgHome dlgHome = null;
    private DlgReservas dlgReservas = null;
    private DlgNovaReserva dlgNovaReserva = null;
    private DlgCadastroCliente dlgCadCliente = null;

    private GerenciadorDominio gerDominio;
    
    
    public GerInterGraf() {
        try {
            gerDominio = new GerenciadorDominio();
            
            //Esse OptionPane será removido futuramente. foi criado apenas para validar a criação do banco.
            JOptionPane.showMessageDialog(null,"Banco Criado com Sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } catch (java.lang.ExceptionInInitializerError | HibernateException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao inicializar.", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }    
    
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){
            try{
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerInterGraf.class).newInstance(parent, true, this);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                JOptionPane.showMessageDialog(frmInicial, "Erro ao abrir a janela" + classe.getName());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }
    
    public void voltarPag(javax.swing.JDialog pagina){
        pagina.setVisible(false);
    }
    
    public void abrirFrmInicial(){
        if(frmInicial == null){
          frmInicial = new FrmInicial(this);  
        }
        frmInicial.setVisible(true);
    }
    
    public void abrirDlgHome(){
        abrirJanela(frmInicial, dlgHome, DlgHome.class);
    }
    
    public void abrirDlgReservas(){
        abrirJanela(frmInicial, dlgReservas, DlgReservas.class);
    }
    
    public void abrirDlgNovaReserva(){
        abrirJanela(frmInicial, dlgNovaReserva, DlgNovaReserva.class);
    }
    
    
    public void abrirDlgCadastroCliente(){
        abrirJanela(frmInicial, dlgCadCliente, DlgCadastroCliente.class);
    }
    
    
    
    
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        GerInterGraf gerIG = new GerInterGraf();
        gerIG.abrirFrmInicial();
                System.out.println("\n\nFOI-----------------\n\n\n\n");

    }
}
