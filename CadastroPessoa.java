import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.*;

public class CadastroPessoa {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro de Pessoa");
        janela.setSize(828, 700);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel titulo = new JLabel("Cadastro de Pessoa");
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        titulo.setForeground(new Color(255, 128, 0));
        titulo.setBounds(20, 30, 600, 60);
        janela.add(titulo);

        JLabel tipoLabel = new JLabel("Tipo");
        tipoLabel.setBounds(20, 110, 150, 25);
        tipoLabel.setBorder(Borda());
        tipoLabel.setBackground(Color.WHITE);
        tipoLabel.setOpaque(true);
        centralizarComponente(tipoLabel);

        JComboBox<String> tipoCombo = new JComboBox<>(new String[]{"Física", "Jurídica"});
        tipoCombo.setBounds(180, 110, 180, 25);
        tipoCombo.setBackground(Color.WHITE);
        tipoCombo.setOpaque(true);
        centralizarComponente(tipoCombo);
        janela.add(tipoLabel);
        janela.add(tipoCombo);

        JLabel cpfCnpjLabel = new JLabel("CPF / CNPJ");
        cpfCnpjLabel.setBounds(370, 110, 180, 25);
        cpfCnpjLabel.setBorder(Borda());
        centralizarComponente(cpfCnpjLabel);
        cpfCnpjLabel.setBackground(Color.WHITE);
        cpfCnpjLabel.setOpaque(true);
        JTextField cpfCnpjField = new JTextField();
        cpfCnpjField.setBounds(560, 110, 200, 25);
        janela.add(cpfCnpjLabel);
        janela.add(cpfCnpjField);

        JCheckBox fornecedorCheck = new JCheckBox("Fornecedor");
        fornecedorCheck.setBounds(770, 110, 150, 25);
        janela.add(fornecedorCheck);

        JLabel nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(20, 150, 150, 25);
        nomeLabel.setBorder(Borda());
        centralizarComponente(nomeLabel);
        nomeLabel.setBackground(Color.WHITE);
        nomeLabel.setOpaque(true);
        JTextField nomeField = new JTextField();
        nomeField.setBounds(180, 150, 800, 25);
        janela.add(nomeLabel);
        janela.add(nomeField);

        JLabel rgLabel = new JLabel("RG / Inscrição Estadual");
        rgLabel.setBounds(20, 190, 150, 25);
        centralizarComponente(rgLabel);
        rgLabel.setBorder(Borda());
        rgLabel.setBackground(Color.WHITE);
        rgLabel.setOpaque(true);
        JTextField rgField = new JTextField();
        rgField.setBounds(180, 190, 250, 25);

        JLabel orgaoLabel = new JLabel("Órgão Expedidor");
        orgaoLabel.setBounds(450, 190, 150, 25);
        orgaoLabel.setBorder(Borda());
        centralizarComponente(orgaoLabel);
        orgaoLabel.setBackground(Color.WHITE);
        orgaoLabel.setOpaque(true);
        JTextField orgaoField = new JTextField();
        orgaoField.setBounds(610, 190, 160, 25);
        janela.add(rgLabel);
        janela.add(rgField);
        janela.add(orgaoLabel);
        janela.add(orgaoField);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 230, 150, 25);
        emailLabel.setBorder(Borda());
        centralizarComponente(emailLabel);
        emailLabel.setBackground(Color.WHITE);
        emailLabel.setOpaque(true);
        JTextField emailField = new JTextField();
        emailField.setBounds(180, 230, 430, 25);

        JLabel cepLabel = new JLabel("CEP");
        cepLabel.setBounds(620, 230, 150, 25);
        cepLabel.setBorder(Borda());
        centralizarComponente(cepLabel);
        cepLabel.setBackground(Color.WHITE);
        cepLabel.setOpaque(true);
        JTextField cepField = new JTextField();
        cepField.setBounds(780, 230, 200, 25);
        janela.add(emailLabel);
        janela.add(emailField);
        janela.add(cepLabel);
        janela.add(cepField);

        JLabel paísLabel = new JLabel("País");
        paísLabel.setBounds(20, 270, 150, 25);
        centralizarComponente(paísLabel);
        paísLabel.setBorder(Borda());
        paísLabel.setBackground(Color.WHITE);
        paísLabel.setOpaque(true);

        JTextField paisField = new JTextField("BRASIL");
        paisField.setEnabled(false);
        paisField.setBounds(180, 270, 430, 25);

        JLabel ufLabel = new JLabel("UF");
        ufLabel.setBounds(620, 270, 150, 25);
        ufLabel.setBorder(Borda());
        ufLabel.setBackground(Color.WHITE);
        ufLabel.setOpaque(true);
        centralizarComponente(ufLabel);
        JTextField ufField = new JTextField();
        ufField.setBounds(830, 270, 150, 25);
        janela.add(paísLabel);
        janela.add(paisField);
        janela.add(ufLabel);
        janela.add(ufField);

        JLabel municipioLabel = new JLabel("Município");
        municipioLabel.setBounds(20, 310, 150, 25);
        municipioLabel.setBorder(Borda());
        municipioLabel.setBackground(Color.WHITE);
        municipioLabel.setOpaque(true);
        centralizarComponente(municipioLabel);
        JTextField municipioField = new JTextField();
        municipioField.setBounds(180, 310, 800, 25);
        janela.add(municipioLabel);
        janela.add(municipioField);

        JLabel logradouroLabel = new JLabel("Logradouro");
        logradouroLabel.setBounds(20, 350, 150, 25);
        centralizarComponente(logradouroLabel);
        logradouroLabel.setBorder(Borda());
        logradouroLabel.setBackground(Color.WHITE);
        logradouroLabel.setOpaque(true);
        JTextField logradouroField = new JTextField();
        logradouroField.setBounds(180, 350, 800, 25);

        JLabel numeroLabel = new JLabel("Número");
        numeroLabel.setBounds(20, 390, 150, 25);
        centralizarComponente(numeroLabel);
        numeroLabel.setBackground(Color.WHITE);
        numeroLabel.setOpaque(true);
        numeroLabel.setBorder(Borda());
        JTextField numeroField = new JTextField();
        numeroField.setBounds(180, 390, 150, 25);
        
        JLabel complementoLabel = new JLabel("Complemento");
        complementoLabel.setBounds(340, 390, 150, 25);
        complementoLabel.setBorder(Borda());
        centralizarComponente(complementoLabel);
        complementoLabel.setBackground(Color.WHITE);
        complementoLabel.setOpaque(true);
        JTextField complementoField = new JTextField();
        complementoField.setBounds(500, 390, 480, 25);
        janela.add(logradouroLabel);
        janela.add(logradouroField);
        janela.add(numeroLabel);
        janela.add(numeroField);
        janela.add(complementoLabel);
        janela.add(complementoField);

        JLabel bairroLabel = new JLabel("Bairro");
        bairroLabel.setBounds(20, 430, 150, 25);
        centralizarComponente(bairroLabel);
        bairroLabel.setBackground(Color.WHITE);
        bairroLabel.setOpaque(true);
        bairroLabel.setBorder(Borda());
        JTextField bairroField = new JTextField();
        bairroField.setBounds(180, 430, 150, 25);

        JLabel telefoneLabel = new JLabel("Telefone");
        telefoneLabel.setBounds(340, 430, 150, 25);
        telefoneLabel.setBorder(Borda());
        telefoneLabel.setBackground(Color.WHITE);
        telefoneLabel.setOpaque(true);
        centralizarComponente(telefoneLabel);
        JTextField telefoneField = new JTextField();
        telefoneField.setBounds(500, 430, 200, 25);

        JLabel situacaoLabel = new JLabel("Situação");
        situacaoLabel.setBounds(720, 430, 150, 25);
        situacaoLabel.setBorder(Borda());
        centralizarComponente(situacaoLabel);
        situacaoLabel.setBackground(Color.WHITE);
        situacaoLabel.setOpaque(true);
        JRadioButton ativoRadio = new JRadioButton("Ativo");
        ativoRadio.setBounds(880, 430, 60, 25);
        JRadioButton inativoRadio = new JRadioButton("Inativo");
        inativoRadio.setBounds(940, 430, 80, 25);
        ButtonGroup situacaoGroup = new ButtonGroup();
        situacaoGroup.add(ativoRadio);
        situacaoGroup.add(inativoRadio);

        janela.add(bairroLabel);
        janela.add(bairroField);
        janela.add(telefoneLabel);
        janela.add(telefoneField);
        janela.add(situacaoLabel);
        janela.add(ativoRadio);
        janela.add(inativoRadio);

        JButton confirmarButton = new JButton("Confirmar");
        confirmarButton.setBounds(20, 470, 100, 30);
        confirmarButton.setBackground(Color.orange);
        confirmarButton.setBorder(Borda());

        JButton excluirButton = new JButton("Excluir");
        excluirButton.setBounds(125, 470, 100, 30);
        excluirButton.setBackground(Color.orange);
        excluirButton.setBorder(Borda());

        JButton limparButton = new JButton("Limpar");
        limparButton.setBounds(230, 470, 100, 30);

        janela.add(confirmarButton);
        janela.add(excluirButton);
        janela.add(limparButton);

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

    public static Border Borda() {
        return BorderFactory.createLineBorder(Color.gray, 1);
    }

    public static Color Fundo() {
        return Color.WHITE;
    }

    public static void centralizarComponente(JComponent componente) {
        if (componente instanceof JLabel) {
            ((JLabel) componente).setHorizontalAlignment(SwingConstants.CENTER);
        } else if (componente instanceof AbstractButton) {
            ((AbstractButton) componente).setHorizontalAlignment(SwingConstants.CENTER);
        } else if (componente instanceof JComboBox) {
            ((JComboBox<?>) componente).setRenderer(new DefaultListCellRenderer() {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                    JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                    label.setHorizontalAlignment(SwingConstants.CENTER);
                    return label;
                }
            });
        }
    }
}
