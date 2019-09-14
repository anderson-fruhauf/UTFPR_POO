package aula2_23_08_checkbox;

import javax.swing.JFrame;

/**
 * CheckBoxTest
 */

@SuppressWarnings("serial")
public class CheckBoxTest {

    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();
        checkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBox.setSize(300, 100);
        checkBox.setVisible(true);
    }
}