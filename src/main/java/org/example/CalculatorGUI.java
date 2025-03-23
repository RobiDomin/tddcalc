package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private JFrame frame;
    private JTextField input1, input2;
    private JLabel resultLabel;
    private Calculator calculator;

    public CalculatorGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        calculator = new Calculator();
        frame = new JFrame("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Pole do wpisywania liczb
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JLabel("Liczba 1:"), gbc);

        gbc.gridx = 1;
        input1 = new JTextField();
        input1.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(input1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JLabel("Liczba 2:"), gbc);

        gbc.gridx = 1;
        input2 = new JTextField();
        input2.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(input2, gbc);

        // Panel z przyciskami
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 3, 10, 10));

        addButton(buttonPanel, "+", "add");
        addButton(buttonPanel, "-", "sub");
        addButton(buttonPanel, "*", "mul");
        addButton(buttonPanel, "/", "div");
        addButton(buttonPanel, "√", "sqrt");
        addButton(buttonPanel, "^", "power");
        addButton(buttonPanel, "%", "modulo");

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        frame.add(buttonPanel, gbc);

        // Wynik
        gbc.gridy = 3;
        frame.add(new JLabel("Wynik:"), gbc);

        gbc.gridy = 4;
        resultLabel = new JLabel(" ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(resultLabel, gbc);

        frame.setVisible(true);
    }

    private void addButton(JPanel panel, String label, String operation) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBackground(Color.LIGHT_GRAY);
        button.addActionListener(e -> performOperation(operation));
        panel.add(button);
    }

    private void performOperation(String operation) {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = input2.getText().isEmpty() ? 0 : Double.parseDouble(input2.getText());
            double result = 0;

            switch (operation) {
                case "add": result = calculator.add(num1, num2); break;
                case "sub": result = calculator.substract(num1, num2); break;
                case "mul": result = calculator.multiply(num1, num2); break;
                case "div": result = calculator.divide(num1, num2); break;
                case "sqrt": result = calculator.sqrt(num1); break;
                case "power": result = calculator.power(num1, num2); break;
                case "modulo": result = calculator.modulo(num1, num2); break;
            }
            resultLabel.setText("Wynik: " + result);
        } catch (ArithmeticException e) {
            resultLabel.setText("Błąd: " + e.getMessage());
        } catch (NumberFormatException e) {
            resultLabel.setText("Błąd: Podaj liczby!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorGUI::new);
    }
}
