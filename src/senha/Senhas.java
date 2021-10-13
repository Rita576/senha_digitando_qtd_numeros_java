
package senha;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Senhas extends JFrame{
    private JLabel senha;
    private JTextField meuTextField;
    private JTextField meuTextField2;
    private JButton calcular;
     public Senhas(){
         
        super ("Senha");
        setLayout(new FlowLayout());
        
        
        senha = new JLabel("\n Digite a quantidade de numeros :");               
        meuTextField = new JTextField(15);       
        add(senha);
        add(meuTextField);
        
        
         calcular = new JButton("Gerar Senha");
          add(calcular);
          
         calcular.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){       
                     
                       String[] digitos = { "a", "1", "b", "2", "4", "5", "6", "7", "8",
                         "9", "a", "b", "c", "d", "e" };
                      float num = Float.parseFloat(meuTextField.getText());
                      StringBuilder senha = new StringBuilder();               
                    for (int i = 0; i < num; i++) {
                        int j = (int) (Math.random() * digitos.length);
                        senha.append(digitos[j]);            
                        JOptionPane.showMessageDialog(null,"Digitos da Senha: "+ senha);
        }
            
    }
                                                   
     }
       );
       
         }
    
      } 
    