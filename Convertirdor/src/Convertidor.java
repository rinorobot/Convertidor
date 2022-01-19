import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Convertidor extends JFrame implements ActionListener{
    JLabel et, resul;
    JTextField entrada;
    JButton btn;
    Float celcius,fahre;
    Convertidor(){
    setLayout(null);
    setTitle("Convertidor de Celcius a Fahrenheit");
    setBounds(300,300,400,200);
    //Etiqueta de instrucciones
    et = new JLabel("Ingresa los grados C para convertir a grados F");
    et.setBounds(20,15,350,30);
    add(et);
    //Entrada de datos
    entrada = new JTextField();
    entrada.setBounds(50,60,150,30);
    add(entrada);
    //Resultado
    resul = new JLabel();
    resul.setBounds(220,60,100,30);
    resul.setOpaque(true);
    resul.setBackground(Color.WHITE);
    add(resul);
    //Botón
    btn = new JButton("Convertir");
    btn.setBounds(50,110,100,30);
    btn.addActionListener(this);
    add(btn);
    
    
    }
    
    public static void main(String[] args) {
        Convertidor marco = new Convertidor();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      celcius= Float.parseFloat(entrada.getText()); 
      fahre=(celcius*9/5)+32;
      resul.setText(fahre+" F");
    }
    
}
