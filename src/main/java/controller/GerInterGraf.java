/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Veiculo;
import viewer.DlgCadastroCliente;
import viewer.DlgHome;
import viewer.DlgReservas;
import viewer.DlgNovaReserva;
import viewer.FrmInicial;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import viewer.DlgVeiculos;

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
    private DlgVeiculos dlgVeiculos = null;
    
    private GerenciadorDominio gerDominio;
    private GerenciadorRelatorios gerRel;
    
    public GerInterGraf() {
        try {
            gerDominio = new GerenciadorDominio();
            gerRel = new GerenciadorRelatorios();
        } catch (java.lang.ExceptionInInitializerError | HibernateException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao inicializar.", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }    
    
    
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, GerInterGraf.class).newInstance(parent, true, this);                                
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex );
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
        dlgHome = (DlgHome) abrirJanela(frmInicial, dlgHome, DlgHome.class);
    }
    
    public void abrirDlgReservas(){
        dlgReservas = (DlgReservas) abrirJanela(frmInicial, dlgReservas, DlgReservas.class);
    }
    
    public void abrirDlgNovaReserva(){
        dlgNovaReserva = (DlgNovaReserva) abrirJanela(frmInicial, dlgNovaReserva, DlgNovaReserva.class);
    }
    
    public void abrirDlgVeiculos(){
        dlgVeiculos = (DlgVeiculos) abrirJanela(frmInicial, dlgVeiculos, DlgVeiculos.class);
    }
    
    public void abrirDlgCadastroCliente(){
        dlgCadCliente = (DlgCadastroCliente) abrirJanela(frmInicial, dlgCadCliente, DlgCadastroCliente.class);
    }

    public GerenciadorDominio getGerDominio() {
        return gerDominio;
    }

    public GerenciadorRelatorios getGerRel() {
        return gerRel;
    }
    
    public void carregarCombo(JComboBox combo, Class classe) {
        try {
            List lista = gerDominio.listar(classe);                
            combo.setModel(  new DefaultComboBoxModel( lista.toArray() )   );
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(frmInicial, ex, "Erro ao carregar ComboBox" , JOptionPane.ERROR_MESSAGE );
        }
    }
    
    public void carregarComboVeiculosDisponíveis(JComboBox combo) {
        try {
            List lista = gerDominio.listarVeiculosDisponiveis();                
            combo.setModel(  new DefaultComboBoxModel( lista.toArray() )   );
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(frmInicial, ex, "Erro ao carregar ComboBox" , JOptionPane.ERROR_MESSAGE );
        }
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

    }
}
