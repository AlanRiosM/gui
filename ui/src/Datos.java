import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Datos extends JFrame {
    private JPanel panel1;
    private JButton saludarButton;
    private JButton sumarButton;
    private JButton unionButton;
    private JButton limpiarButton;
    private JButton cerrarButton;
    private JTextField text1;
    private JTextField text2;

    public Datos(){
        super("OPERACIONES");

        setContentPane(panel1);

        saludarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String saludo = "Hola mundo ";
                JOptionPane.showMessageDialog(null, saludo);
            }
        });

        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor1 = Datos.this.text1.getText();
                String valor2 = Datos.this.text2.getText();
                float numeroFloat1 = Float.parseFloat(valor1);
                float numeroFloat2 = Float.parseFloat(valor1);
                float total = numeroFloat1 + numeroFloat2;
                JOptionPane.showMessageDialog(null, total);
            }
        });

        unionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor1 = Datos.this.text1.getText();
                String valor2 = Datos.this.text2.getText();
                String recibe = valor1 + valor2;
                JOptionPane.showMessageDialog(null, recibe);
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
                text2.setText("");
            }
        });



        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
}

