package com.jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://www.javable.com/tutorials/fesunov/lesson12/}
 */
public class Dlg2 extends JFrame {


    Dlg2() {
        super("Знакомство с BoxLayout");

        try  {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e) {
        }

        setSize(560, 100);
        Container c = getContentPane();
        GridLayout gl = new GridLayout(1,0);
        c.setLayout(gl);
        JPanel pn1 = new JPanel();
        JLabel l1 = new JLabel("Short");
        pn1.setBorder(BorderFactory.createEtchedBorder());
        pn1.add(l1);
        JTextField txt = new JTextField(8);
        pn1.add(txt);
        c.add(pn1);
        JPanel pn2 = new JPanel();
        JLabel l2 = new JLabel("Long Label");
        pn2.add(l2);
        JTextField txt2 = new JTextField(16);
        pn2.add(txt2);
        pn2.setBorder(BorderFactory.createEtchedBorder());
        c.add(pn2);

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);

        setVisible(true);
    }

    public static void main(String[] args) {
        Dlg2 d = new Dlg2();
    }
}
