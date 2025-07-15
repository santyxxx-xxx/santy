import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cajero extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton validarButton;
    private JPanel principal;

    public Cajero() {
        setTitle("Cajero");
        setSize(500, 400);
        setContentPane(principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        validarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre=textField1.getText();
                int edad= Integer.parseInt(textField1.getText());

                if (edad<100 || edad>=18){
                    JOptionPane.showMessageDialog(null,"Ingreso con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "solo clientes mayores de edad");
                }

            }
        });
    }
}
