import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.*;

public class CadastroPessoa {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro de Pessoa");
        janela.setSize(828, 700);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel titulo = new JLabel("Cadastro de Pessoa");
        titulo.setBounds(350, 10, 300, 30);
        janela.add(titulo);

        JLabel tipoLabel = new JLabel("Tipo");
        tipoLabel.setBounds(20, 50, 50, 20);
        JComboBox<String> tipoCombo = new JComboBox<>(new String[]{"Física", "Jurídica"});
        tipoCombo.setBounds(70, 50, 100, 25);
        janela.add(tipoLabel);
        janela.add(tipoCombo);

        JLabel cpfCnpjLabel = new JLabel("CPF / CNPJ");
        cpfCnpjLabel.setBounds(180, 50, 100, 20);
        JTextField cpfCnpjField = new JTextField();
        cpfCnpjField.setBounds(260, 50, 150, 25);
        janela.add(cpfCnpjLabel);
        janela.add(cpfCnpjField);

        JCheckBox fornecedorCheck = new JCheckBox("Fornecedor");
        fornecedorCheck.setBounds(430, 50, 120, 25);
        janela.add(fornecedorCheck);

        JLabel nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(20, 90, 100, 20);
        JTextField nomeField = new JTextField();
        nomeField.setBounds(70, 90, 400, 25);
        janela.add(nomeLabel);
        janela.add(nomeField);

        JLabel rgLabel = new JLabel("RG - Inscrição Estadual");
        rgLabel.setBounds(20, 130, 150, 20);
        JTextField rgField = new JTextField();
        rgField.setBounds(170, 130, 150, 25);
        JLabel orgaoLabel = new JLabel("Órgã Expedidor");
        orgaoLabel.setBounds(330, 130, 120, 20);
        JTextField orgaoField = new JTextField();
        orgaoField.setBounds(450, 130, 100, 25);
        janela.add(rgLabel);
        janela.add(rgField);
        janela.add(orgaoLabel);
        janela.add(orgaoField);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 170, 100, 20);
        JTextField emailField = new JTextField();
        emailField.setBounds(70, 170, 200, 25);
        JLabel cepLabel = new JLabel("CEP");
        cepLabel.setBounds(280, 170, 40, 20);
        JTextField cepField = new JTextField();
        cepField.setBounds(320, 170, 100, 25);
        janela.add(emailLabel);
        janela.add(emailField);
        janela.add(cepLabel);
        janela.add(cepField);

        JLabel paisLabel = new JLabel("País");
        paisLabel.setBounds(20, 210, 40, 20);
        JTextField paisField = new JTextField("BRASIL");
        paisField.setEnabled(false);
        paisField.setBounds(70, 210, 100, 25);
        JLabel ufLabel = new JLabel("UF");
        ufLabel.setBounds(180, 210, 30, 20);
        JTextField ufField = new JTextField();
        ufField.setBounds(210, 210, 50, 25);
        janela.add(paisLabel);
        janela.add(paisField);
        janela.add(ufLabel);
        janela.add(ufField);

        JLabel municipioLabel = new JLabel("Município");
        municipioLabel.setBounds(270, 210, 80, 20);
        JTextField municipioField = new JTextField();
        municipioField.setBounds(350, 210, 150, 25);
        janela.add(municipioLabel);
        janela.add(municipioField);

        JLabel logradouroLabel = new JLabel("Logradouro");
        logradouroLabel.setBounds(20, 250, 100, 20);
        JTextField logradouroField = new JTextField();
        logradouroField.setBounds(120, 250, 200, 25);
        JLabel numeroLabel = new JLabel("Número");
        numeroLabel.setBounds(330, 250, 60, 20);
        JTextField numeroField = new JTextField();
        numeroField.setBounds(390, 250, 50, 25);
        JLabel complementoLabel = new JLabel("Complemento");
        complementoLabel.setBounds(450, 250, 100, 20);
        JTextField complementoField = new JTextField();
        complementoField.setBounds(550, 250, 100, 25);
        janela.add(logradouroLabel);
        janela.add(logradouroField);
        janela.add(numeroLabel);
        janela.add(numeroField);
        janela.add(complementoLabel);
        janela.add(complementoField);

        JLabel bairroLabel = new JLabel("Bairro");
        bairroLabel.setBounds(20, 290, 60, 20);
        JTextField bairroField = new JTextField();
        bairroField.setBounds(80, 290, 150, 25);
        JLabel telefoneLabel = new JLabel("Telefone");
        telefoneLabel.setBounds(240, 290, 80, 20);
        JTextField telefoneField = new JTextField();
        telefoneField.setBounds(320, 290, 150, 25);
        janela.add(bairroLabel);
        janela.add(bairroField);
        janela.add(telefoneLabel);
        janela.add(telefoneField);

        JLabel situacaoLabel = new JLabel("Situação");
        situacaoLabel.setBounds(20, 330, 60, 20);
        JRadioButton ativoRadio = new JRadioButton("Ativo");
        ativoRadio.setBounds(90, 330, 60, 25);
        JRadioButton inativoRadio = new JRadioButton("Inativo");
        inativoRadio.setBounds(160, 330, 70, 25);
        ButtonGroup situacaoGroup = new ButtonGroup();
        situacaoGroup.add(ativoRadio);
        situacaoGroup.add(inativoRadio);
        janela.add(situacaoLabel);
        janela.add(ativoRadio);
        janela.add(inativoRadio);

        JButton confirmarButton = new JButton("Confirmar");
        confirmarButton.setBounds(20, 380, 100, 30);
        confirmarButton.setBackground(Color.orange);
        confirmarButton.setBorder(Borda());

        JButton excluirButton = new JButton("Excluir");
        excluirButton.setBounds(130, 380, 100, 30);
        excluirButton.setBackground(Color.orange);
        excluirButton.setBorder(Borda());

        JButton limparButton = new JButton("Limpar");
        limparButton.setBounds(240, 380, 100, 30);
        janela.add(confirmarButton);
        janela.add(excluirButton);
        janela.add(limparButton);


        //Essa parte faz com que o botão "LIMPAR" funcione. Não encontrei outro método como um form.reset().
        limparButton.addActionListener(e -> {
            tipoCombo.setSelectedIndex(0);
            cpfCnpjField.setText("");
            fornecedorCheck.setSelected(false);
            nomeField.setText("");
            rgField.setText("");
            orgaoField.setText("");
            emailField.setText("");
            cepField.setText("");
            ufField.setText("");
            municipioField.setText("");
            logradouroField.setText("");
            numeroField.setText("");
            complementoField.setText("");
            bairroField.setText("");
            telefoneField.setText("");
            situacaoGroup.clearSelection(); 
        });

        janela.setVisible(true);
    }

    public static Border Borda(){
        return BorderFactory.createLineBorder(Color.black, 3);
    };
}
