import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Administrador extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton registrarButton;
    private JButton limpiarButton;
    private JPanel principal;

    public Administrador(){
        setTitle("Admin");
        setSize(500, 400);
        setContentPane(principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String prod=textField1.getText();
                double costo= Double.parseDouble(textField2.getText());
                if (prod.equals("")){
                    JOptionPane.showMessageDialog(null,"Ingrese las credenciales solicitadas, no dejar vacio");
                } else {
                    JOptionPane.showMessageDialog(null,"Bien");
                }
            }
        });
    }

}
