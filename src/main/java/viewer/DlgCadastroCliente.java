package viewer;

import controller.GerInterGraf;
import controller.Util;
import domain.Cliente;
import domain.Endereco;
import java.awt.Color;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author joaom
 */
public class DlgCadastroCliente extends javax.swing.JDialog {
    private GerInterGraf gerIG;
    private Endereco ender;
    /**
     * Creates new form DlgCadastroCliente
     */
    public DlgCadastroCliente(java.awt.Frame parent, boolean modal, GerInterGraf gerIG) {
        super(parent, modal);
        this.gerIG = gerIG;
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

        btnGroupSexo = new javax.swing.ButtonGroup();
        PanBackground = new javax.swing.JPanel();
        PanTituloPag = new javax.swing.JPanel();
        LabTituloNovaReserva = new javax.swing.JLabel();
        PainelDados = new javax.swing.JPanel();
        labNum = new javax.swing.JLabel();
        labDatNasc = new javax.swing.JLabel();
        tfNome = new javax.swing.JFormattedTextField();
        LabNome = new javax.swing.JLabel();
        tfNum = new javax.swing.JTextField();
        TituloCad = new javax.swing.JLabel();
        dtChooserDatNasc = new com.toedter.calendar.JDateChooser();
        labCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        labBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        tfCPF = new javax.swing.JFormattedTextField();
        LabCPF = new javax.swing.JLabel();
        tfCEP = new javax.swing.JFormattedTextField();
        LabCEP = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        labEmail = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        labSenha = new javax.swing.JLabel();
        labTelefone = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        ftTelefone = new javax.swing.JFormattedTextField();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        PanBarraLateral = new javax.swing.JPanel();
        PanTitleBarraLateral = new javax.swing.JPanel();
        LabPrimeDrive = new javax.swing.JLabel();
        LabAluguelDeCarros = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LabIMGCarro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanBackground.setForeground(new java.awt.Color(255, 255, 255));
        PanBackground.setMinimumSize(new java.awt.Dimension(1360, 720));
        PanBackground.setPreferredSize(new java.awt.Dimension(1360, 720));
        PanBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanTituloPag.setBackground(new java.awt.Color(150, 150, 150));
        PanTituloPag.setForeground(new java.awt.Color(150, 150, 150));
        PanTituloPag.setPreferredSize(new java.awt.Dimension(1050, 100));

        LabTituloNovaReserva.setBackground(new java.awt.Color(255, 255, 255));
        LabTituloNovaReserva.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        LabTituloNovaReserva.setForeground(new java.awt.Color(255, 255, 255));
        LabTituloNovaReserva.setText("Cadastre-se");

        javax.swing.GroupLayout PanTituloPagLayout = new javax.swing.GroupLayout(PanTituloPag);
        PanTituloPag.setLayout(PanTituloPagLayout);
        PanTituloPagLayout.setHorizontalGroup(
            PanTituloPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanTituloPagLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LabTituloNovaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        PanTituloPagLayout.setVerticalGroup(
            PanTituloPagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanTituloPagLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(LabTituloNovaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        PanBackground.add(PanTituloPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 110));

        PainelDados.setForeground(new java.awt.Color(255, 255, 255));
        PainelDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labNum.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        labNum.setText("Num");
        PainelDados.add(labNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 50, -1));

        labDatNasc.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        labDatNasc.setText("Dat Nasc");
        PainelDados.add(labDatNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 70, -1));
        PainelDados.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 200, 36));

        LabNome.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        LabNome.setText("Nome");
        PainelDados.add(LabNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        tfNum.setToolTipText("");
        tfNum.setPreferredSize(new java.awt.Dimension(488, 36));
        PainelDados.add(tfNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 140, 36));

        TituloCad.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TituloCad.setText("Informe as informações a seguir para realizar seu cadastro");
        PainelDados.add(TituloCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        dtChooserDatNasc.setDateFormatString("dd/MM/yyyy");
        PainelDados.add(dtChooserDatNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 140, 36));

        labCidade.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        labCidade.setText("Cidade");
        PainelDados.add(labCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        tfCidade.setToolTipText("");
        tfCidade.setPreferredSize(new java.awt.Dimension(488, 36));
        PainelDados.add(tfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, 36));

        labBairro.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        labBairro.setText("Bairro");
        PainelDados.add(labBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        tfBairro.setToolTipText("");
        tfBairro.setPreferredSize(new java.awt.Dimension(488, 36));
        PainelDados.add(tfBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 360, 36));

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        PainelDados.add(tfCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, 36));

        LabCPF.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        LabCPF.setText("CPF");
        PainelDados.add(LabCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        try {
            tfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCEPFocusLost(evt);
            }
        });
        PainelDados.add(tfCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 100, 36));

        LabCEP.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        LabCEP.setText("CEP");
        PainelDados.add(LabCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));
        PainelDados.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 360, 36));

        labEmail.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        labEmail.setText("Email");
        PainelDados.add(labEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 50, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        btnGroupSexo.add(jRadioButton1);
        jRadioButton1.setMnemonic('M');
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Masculino");

        btnGroupSexo.add(jRadioButton2);
        jRadioButton2.setMnemonic('F');
        jRadioButton2.setText("Feminino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jRadioButton2)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PainelDados.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 120, 80));

        labSenha.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        labSenha.setText("Senha");
        PainelDados.add(labSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 50, -1));

        labTelefone.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        labTelefone.setText("Tel.");
        PainelDados.add(labTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 30, -1));

        pfSenha.setToolTipText("");
        PainelDados.add(pfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 160, 36));

        try {
            ftTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        PainelDados.add(ftTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 110, 36));

        BotaoCadastrar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });
        PainelDados.add(BotaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 110, 30));

        BotaoCancelar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });
        PainelDados.add(BotaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 110, 30));

        PanBackground.add(PainelDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 770, 430));

        PanBarraLateral.setBackground(new java.awt.Color(51, 51, 51));
        PanBarraLateral.setForeground(new java.awt.Color(51, 51, 51));
        PanBarraLateral.setMinimumSize(new java.awt.Dimension(370, 550));
        PanBarraLateral.setPreferredSize(new java.awt.Dimension(360, 720));
        PanBarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanTitleBarraLateral.setBackground(new java.awt.Color(51, 51, 51));
        PanTitleBarraLateral.setForeground(new java.awt.Color(51, 51, 51));

        LabPrimeDrive.setBackground(new java.awt.Color(255, 255, 255));
        LabPrimeDrive.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        LabPrimeDrive.setForeground(new java.awt.Color(255, 255, 255));
        LabPrimeDrive.setText("Prime Drive");
        LabPrimeDrive.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabPrimeDrive.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        LabAluguelDeCarros.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        LabAluguelDeCarros.setForeground(new java.awt.Color(255, 255, 255));
        LabAluguelDeCarros.setText("Aluguel de carros");
        LabAluguelDeCarros.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LabAluguelDeCarros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout PanTitleBarraLateralLayout = new javax.swing.GroupLayout(PanTitleBarraLateral);
        PanTitleBarraLateral.setLayout(PanTitleBarraLateralLayout);
        PanTitleBarraLateralLayout.setHorizontalGroup(
            PanTitleBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanTitleBarraLateralLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LabPrimeDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabAluguelDeCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        PanTitleBarraLateralLayout.setVerticalGroup(
            PanTitleBarraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanTitleBarraLateralLayout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(LabPrimeDrive))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanTitleBarraLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabAluguelDeCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanBarraLateral.add(PanTitleBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 370, 110));
        PanBarraLateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 13));

        LabIMGCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CarroCadastro2.png"))); // NOI18N
        PanBarraLateral.add(LabIMGCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 610, 400));

        PanBackground.add(PanBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 560, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        
        if(validarCampos()){
            String nome = tfNome.getText();
            String email = tfEmail.getText();
            String cpf = tfCPF.getText();
            Date dtNasc = dtChooserDatNasc.getDate();
            char sexo;
            if(btnGroupSexo.getSelection().getMnemonic() == 'F') sexo = 'F';
            else sexo = 'M';
            
            String telefone = ftTelefone.getText();
            ender.setNum(tfNum.getText());
            char[] senha = pfSenha.getPassword();
            String senhaDescriptografada = new String(senha);
            Cliente c = new Cliente(
                                nome,
                                cpf,
                                senhaDescriptografada,
                                dtNasc,
                                email,
                                telefone,
                                sexo,
                                this.ender
            );
            
            if(c != null){
                gerIG.getGerDominio().inserir(c);
                
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso.", "Cadastro de usuário", JOptionPane.INFORMATION_MESSAGE);  
                this.setVisible(false);
                gerIG.voltarPag(this);
            }
            else{
                JOptionPane.showMessageDialog(this, "No cadastro", "ERRO Cadastro", JOptionPane.ERROR_MESSAGE );
            }
        }
        
        
        
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        this.setVisible(false);
        gerIG.voltarPag(this);
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void tfCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCEPFocusLost
        try {
            ender = Util.consultarCEP( tfCEP.getText() );
            if ( ender != null ) {
                tfCidade.setText(ender.getCidade());
                tfBairro.setText(ender.getBairro());
                
            } else {
                JOptionPane.showMessageDialog(this, "CEP não encontrado!", "Cadastro de Cliente", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "ERRO ao consultar CEP!", "Cadastro de Cliente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tfCEPFocusLost

    
    private boolean validarCampos() {
        StringBuilder msgErro = new StringBuilder();
       
        // Resetar cores
        LabNome.setForeground(Color.black);
        labEmail.setForeground(Color.black);
        labTelefone.setForeground(Color.black);
        LabCEP.setForeground(Color.black);
        labDatNasc.setForeground(Color.black);
        labNum.setForeground(Color.black);
        labCidade.setForeground(Color.black);
        labBairro.setForeground(Color.black);
        labSenha.setForeground(Color.black);

        // Capturar data
        Date dat = dtChooserDatNasc.getDate();

        // Validar data de retirada
        if (dat == null) {
            msgErro.append("Informe a data de nascimento.\n");
            labDatNasc.setForeground(Color.red);
        }


        String cpf = tfCPF.getText().replaceAll("\\D", "");
        if (cpf.isEmpty()) {
            msgErro.append("Informe seu CPF.\n");
            LabCPF.setForeground(Color.red);
        }
        
        String nome = tfNome.getText();
        if (nome.isEmpty()) {
            msgErro.append("Informe seu Nome.\n");
            LabNome.setForeground(Color.red);
        }
        
        String email = tfEmail.getText();
        if (email.isEmpty()) {
            msgErro.append("Informe seu Email.\n");
            labEmail.setForeground(Color.red);
        }
        
        String tel = ftTelefone.getText().replaceAll("\\D", "");
        if (tel.isEmpty()) {
            msgErro.append("Informe seu Telefone.\n");
            labTelefone.setForeground(Color.red);
        }
        
        String cep = tfCEP.getText().replaceAll("\\D", "");
        if (cep.isEmpty()) {
            msgErro.append("Informe seu CEP.\n");
            LabCEP.setForeground(Color.red);
        }
        
        String num = tfNum.getText();
        if (num.isEmpty()) {
            msgErro.append("Informe o número da sua residência.\n");
            labNum.setForeground(Color.red);
        }
        
        String cid = tfCidade.getText();
        if (cid.isEmpty()) {
            msgErro.append("Informe sua cidade.\n");
            labCidade.setForeground(Color.red);
        }
        
        String bai = tfBairro.getText();
        if (bai.isEmpty()) {
            msgErro.append("Informe seu bairro.\n");
            labBairro.setForeground(Color.red);
        }
        
        char[] senha = pfSenha.getPassword();
        if (senha.length == 0) {
            msgErro.append("Informe sua senha.\n");
            labSenha.setForeground(Color.red);
        }

        // Se houver erro, mostrar diálogo
        if (msgErro.length() > 0) {
            JOptionPane.showMessageDialog(this, msgErro.toString(), "ERRO Reserva", JOptionPane.ERROR_MESSAGE );
            return false;
        }

        return true;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JLabel LabAluguelDeCarros;
    private javax.swing.JLabel LabCEP;
    private javax.swing.JLabel LabCPF;
    private javax.swing.JLabel LabIMGCarro;
    private javax.swing.JLabel LabNome;
    private javax.swing.JLabel LabPrimeDrive;
    private javax.swing.JLabel LabTituloNovaReserva;
    private javax.swing.JPanel PainelDados;
    private javax.swing.JPanel PanBackground;
    private javax.swing.JPanel PanBarraLateral;
    private javax.swing.JPanel PanTitleBarraLateral;
    private javax.swing.JPanel PanTituloPag;
    private javax.swing.JLabel TituloCad;
    private javax.swing.ButtonGroup btnGroupSexo;
    private com.toedter.calendar.JDateChooser dtChooserDatNasc;
    private javax.swing.JFormattedTextField ftTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labBairro;
    private javax.swing.JLabel labCidade;
    private javax.swing.JLabel labDatNasc;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labNum;
    private javax.swing.JLabel labSenha;
    private javax.swing.JLabel labTelefone;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfCEP;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JFormattedTextField tfNome;
    private javax.swing.JTextField tfNum;
    // End of variables declaration//GEN-END:variables
}
