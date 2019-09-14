package aula2_23_08_checkbox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * CheckBox
 */
public class CheckBox extends JFrame {
    private JTextField textField;
    private JCheckBox boldjCheckBox;
    private JCheckBox italicJCheckBox;

    public CheckBox() {
        super("check box teste");
        setLayout(new FlowLayout());
        textField = new JTextField("veja a fonte mudar", 20);
        textField.setFont(new Font("serif", Font.PLAIN, 14));
        add(textField);

        boldjCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");

        add(boldjCheckBox);
        add(italicJCheckBox);

        CheckBoxHandler handler = new CheckBoxHandler();
        boldjCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);

    }

    private class CheckBoxHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font fonte = null;

            if (boldjCheckBox.isSelected() && italicJCheckBox.isSelected()) {
                fonte = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (boldjCheckBox.isSelected()) {
                fonte = new Font("Serif", Font.BOLD, 14);
            } else if (italicJCheckBox.isSelected()) {
                fonte = new Font("Serif", Font.ITALIC, 14);
            } else {
                fonte = new Font("Serif", Font.PLAIN, 14);
            }

            textField.setFont(fonte);
        }

    }
}