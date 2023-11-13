
package view;

import control.CalculatorControl;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Calculator;
/**
 *
 * @author 503
 */
public class CalculatorView extends JFrame implements ActionListener{
    private JTextField txtFirstnumber;
    private JTextField txtSecondnumber;
    private JButton btnAdd, btnSub, btnMul, btnDiv;
    public CalculatorView(){
        super("Calculator using web service");
        txtFirstnumber = new JTextField(8);
        txtSecondnumber = new JTextField(8);
        btnAdd = new JButton("+");
        btnSub = new JButton("-");
        btnMul = new JButton("*");
        btnDiv = new JButton("/");
        
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("First number:"));
        content.add(txtFirstnumber);
        content.add(new JLabel("Second number:"));
        content.add(txtSecondnumber);
        content.add(btnAdd);
        content.add(btnSub);
        content.add(btnMul);
        content.add(btnDiv);
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);
        this.setContentPane(content);
        this.pack();
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
                
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator cal = null;
        try{
            double a = Double.parseDouble(txtFirstnumber.getText());
            double b = Double.parseDouble(txtSecondnumber.getText());
            cal = new Calculator(a, b);
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        CalculatorControl cc = new CalculatorControl();
        if(e.getSource().equals(btnAdd)){
            showMessage("Result of " + cal.getFirstNumber() + " + " + cal.getSecondNumber() + " = " + cc.add(cal));
        }else if(e.getSource().equals(btnSub)){
            showMessage("Result of " + cal.getFirstNumber() + " - " + cal.getSecondNumber() + " = " + cc.sub(cal));
        }else if(e.getSource().equals(btnMul)){
            showMessage("Result of " + cal.getFirstNumber() + " - " + cal.getSecondNumber() + " = " + cc.multiple(cal));
        }else if(e.getSource().equals(btnDiv)){
            showMessage("Result of " + cal.getFirstNumber() + " - " + cal.getSecondNumber() + " = " + cc.div(cal));
        }
       
    }
    
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
    
    
}
