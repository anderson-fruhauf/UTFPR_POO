package aula2_23_08_checkbox;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * CheckBox
 */
public class CheckBox extends JFrame{
    private JTextField textField;
    private JCheckBox jCheckBox;
    private JCheckBox italixJCheckBox;

    public CheckBox(){
        super("check box teste");
        setLayout(new FlowLayout());
        textField = new JTextField("mude o tamanho da fonte para 20");
        textField.setFont(new Font("serif", Font.PLAIN, 14));
                
    }
}