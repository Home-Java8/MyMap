package com.framework.collection.set.treeset.tasks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import java.util.TreeSet;


/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://www.javable.com/tutorials/fesunov/lesson12/}
 */
public class PhoneNotes extends JFrame {

    JTextField   fldFio = new JTextField(25);
    JTextField fldPhone = new JTextField(25);
    JTextField   fldCnt = new JTextField(4);
    TreeSet         set = new TreeSet();

    public PhoneNotes() {
        super("Записная книжка");

        try  {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {}

        setSize(400, 250);
        Container c = getContentPane();
        // Центральная панель
        JPanel centerPanel = new JPanel(new GridLayout(3, 1, 5, 5));
        centerPanel.setBorder(BorderFactory.createEtchedBorder());
        JPanel      aPanel = new JPanel();
        JLabel      aLabel = new JLabel("Фамилия ");
        aPanel.add(aLabel);
        aPanel.add(fldFio);
        centerPanel.add(aPanel);
        aPanel = new JPanel();
        aLabel = new JLabel("Телефон ");
        aPanel.add(aLabel);
        aPanel.add(fldPhone);
        centerPanel.add(aPanel);
        aPanel = new JPanel();
        JButton       btn = new JButton("Печатать");
        aPanel.add(btn);
        centerPanel.add(aPanel);
        c.add(centerPanel, BorderLayout.CENTER);
        // Нижняя панель
        JPanel statusPanel = new JPanel();
        statusPanel.setBorder(BorderFactory.createEtchedBorder());
        aLabel = new JLabel("Количество записей ");
        statusPanel.add(aLabel);
        fldCnt.setEnabled(false);
        statusPanel.add(fldCnt);
        c.add(statusPanel, BorderLayout.SOUTH);
        // Listener'ы полей и кнопок
        fldPhone.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Person prs = new Person(fldFio.getText(), fldPhone.getText());
                fldFio.setText("");
                fldPhone.setText("");
                set.add(prs);
                fldCnt.setText("" + set.size());
                fldFio.requestFocus();
            }
        });
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Iterator iter = set.iterator();
                for ( int i = 0; iter.hasNext(); i++ ) {
                    Person cur = (Person)iter.next();
                    String str = cur.toString();
                    try {
//                        byte[] b = str.getBytes("Cp866");
                        byte[] b = str.getBytes();
                        System.out.write(b);
                    } catch ( Exception ex ) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PhoneNotes();
    }
}

