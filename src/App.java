import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventObject;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

class App{

    public static void main(String args []){
        new Calculetor().setVisible(true);
    }
}
///////////////////////////////////////  Calculator class  ///////////////////

class Calculetor extends JFrame implements ActionListener {

   private JFrame homeFrame = new JFrame(); //// Home frame
   private JFrame calculatorFrame = new JFrame(); //// Clculator frame
   private  JPanel numPanel =new JPanel(); // number panel
   private  JPanel textPanel = new JPanel(); // text Field
    private JLabel homeLabel = new JLabel();
   private JToggleButton toggleButton = new JToggleButton("on");
   private ImageIcon homeImgIcon=new ImageIcon("image/homeBatImg.png");

    
    Calculetor(){ ///// Conctuctor  /////////////
        /////////////////////////////////////// Home Page ////////
        homeFrame.setVisible(true);
        homeFrame.setTitle("Calculetor");
        homeFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        homeFrame.setSize(420, 560); // frame size
        homeFrame.setResizable(true);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.add(homeLabel);
        ///////////////////////////////////////////////////////////
        calculatorFrame.setVisible(false);
        calculatorFrame.setTitle("Calculetor");
        calculatorFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculatorFrame.setSize(420, 560); // frame size
        calculatorFrame.setLocationRelativeTo(null);
        calculatorFrame.setResizable(true);
        calculatorFrame.add(new JButton("hii"));
        ////////////////////////////////////////////////////////////////
        homeLabel.setIcon(homeImgIcon);
        /////////////////////////////////// on/off button //////////
        homeLabel.add(toggleButton);
        toggleButton.setBounds(180, 320, 80,50);
        toggleButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){///////// home on/off button funtion//
        if (toggleButton.isSelected()) {
            // on
            calculatorFrame.setVisible(true);
            homeFrame.setVisible(false);
        }else{
            //off
        }
    }

    


   
}
