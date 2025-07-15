import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class correccion extends JFrame{
    private JPanel principal;
    private JTextField UsuarioTxt;
    private JComboBox comboBox1;
    private JButton ingresarButton;
    private JPasswordField passwordField1;
    private JButton ingresarComoCajeroButton;
    private JButton ingresarComoAdministradorButton;

    public correccion(){
        setTitle("Login");
        setSize(300, 200);
        setContentPane(principal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        ingresarComoAdministradorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario= UsuarioTxt.getText();
                String contraseña= String.copyValueOf(passwordField1.getPassword());
                if (usuario.equals("1") || contraseña.equals("1")){
                    JOptionPane.showMessageDialog(null,"Ingreso correcto");
                    new Cajero();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null,"Ingrese bien");
                }
            }
        });
        ingresarComoCajeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                    String usuario2 = UsuarioTxt.getText();
                    String contraseña2 = String.copyValueOf(passwordField1.getPassword());
                    if (usuario2.equals("2") || contraseña2.equals("2")) {
                        JOptionPane.showMessageDialog(null, "Ingreso correcto");
                        new Administrador();
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null,"Ingrese bien sus credenciales");
                    }
                }

        });
}}
