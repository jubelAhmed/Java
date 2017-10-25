/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_management_system;

import java.awt.Color;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    
    JLabel picLabel ;
    Timer tm;
    int x= 0;
    String [] list= {"C:/Users/jubel/Pictures/1.jpg",
    "C:/Users/jubel/Pictures/flower.jpg",
    "C:/Users/jubel/Pictures/b.jpg",
    "C:/Users/jubel/Pictures/hill.jpg",
    "C:/Users/jubel/Pictures/fall.jpg"
   };
    
    public Main(){
        super("java slideShow");
        picLabel = new JLabel();
        picLabel.setBounds(40,30,700,300);
        
        tm = new Timer(2000, (ActionEvent e) -> {
            setImageSize(x);
            x+=1;
            if(x>=list.length){
                x=0;
            }
        });
        
        add(picLabel);
        tm.start();
        setLayout(null);
        setSize(800, 400);
        getContentPane().setBackground(Color.decode("#bdb67b"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    public void setImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImage = img.getScaledInstance(picLabel.getWidth(), picLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);
        picLabel.setIcon(newIcon);
        
       
    }
    
    
    
    public static void main(String[] args) {
        Main maintain = new Main();
    }
}

/*
"C:\Users\jubel\Pictures\1.jpg",
    "C:\Users\jubel\Pictures\flower.jpg",
    "C:\Users\jubel\Pictures\b.jpg",
    "C:\Users\jubel\Pictures\hill.jpg",
    "C:\Users\jubel\Pictures\fall.jpg"
   };
*/