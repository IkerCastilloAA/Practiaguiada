package gui.main;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class AthleteFormPanel extends JPanel {
	
    private JFormattedTextField codeField;
    private JTextField nameField;
    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JFormattedTextField birthDateField;
    private JComboBox<String> countryComboBox;

    public AthleteFormPanel() {
        // Configuración del layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Etiqueta y campo para el código
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Código:"), gbc);

        try {
            MaskFormatter codeFormatter = new MaskFormatter("######");
            codeFormatter.setPlaceholderCharacter(' ');
            codeField = new JFormattedTextField(codeFormatter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        gbc.gridx = 1;
        add(codeField, gbc);

        // Etiqueta y campo para el nombre
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Nombre:"), gbc);

        nameField = new JTextField(15);
        gbc.gridx = 1;
        add(nameField, gbc);

        // Etiqueta y opciones para el género
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Género:"), gbc);

        maleRadio = new JRadioButton("Hombre");
        femaleRadio = new JRadioButton("Mujer");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        
        gbc.gridx = 1;
        add(genderPanel, gbc);

        // Etiqueta y campo para la fecha de nacimiento
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Nacimiento:"), gbc);

        try {
            MaskFormatter birthDateFormatter = new MaskFormatter("##/##/####");
            birthDateFormatter.setPlaceholderCharacter('_');
            birthDateField = new JFormattedTextField(birthDateFormatter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        gbc.gridx = 1;
        add(birthDateField, gbc);

        // Etiqueta y selección de país
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("País:"), gbc);

        String[] countries = {"Country 1", "Country 2", "Country 3"};
        countryComboBox = new JComboBox<>(countries);
        gbc.gridx = 1;
        add(countryComboBox, gbc);
    }

    // Método main para probar el panel
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario de Atleta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new AthleteFormPanel());
        frame.setVisible(true);
    }
}

