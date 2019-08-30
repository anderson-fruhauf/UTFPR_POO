/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttontest;

/**
 *
 * @author Marcelo
 */
import javax.swing.JFrame;

public class ButtonTest 
{
   public static void main( String args[] )
   { 
      ButtonFrame buttonFrame = new ButtonFrame(); // cria ButtonFrame
      buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      buttonFrame.setSize( 275, 110 ); // configura o tamanho do frame
      buttonFrame.setVisible( true ); // exibe o frame
   } // fim de main
} // fim da classe ButtonTest
