package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snazzy Keyboard");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel keyboard = new JPanel();
        frame.add(keyboard);
        placeComponents(keyboard);
        frame.setVisible(true);
    }

    public static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JTextField text = new JTextField(20);
        text.setBounds(100, 20, 800, 200);
        panel.add(text);

        //Individual keyboard rows
        String firstRow[] = {"~", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+", "<<<<<"};//BackSpace
        String secondRow[] = {"Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "\\"};
        String thirdRow[] = {"Caps", "A", "S", "D", "F", "G", "H", "J", "K", "L", ":", "\"", "Enter"};
        String fourthRow[] = {"Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "?", "   ^"};


        //Jbuttons corresponting to each individual rows
        JButton first[] = new JButton[firstRow.length];
        first = new JButton[firstRow.length];
        //get the panel for the  row
        JPanel p = new JPanel(new GridLayout(1, firstRow.length));
        for (int i = 0; i < firstRow.length; ++i) {
            JButton b = new JButton(firstRow[i]);
            b.setPreferredSize(new Dimension(100, 50));
            first[i] = b;
            p.add(first[i]);
        }
        panel.add(p);

        JButton second[] = new JButton[secondRow.length];
        //get the panel for the  row
        p = new JPanel(new GridLayout(1, secondRow.length));
        for (int i = 0; i < secondRow.length; ++i) {
            second[i] = new JButton(secondRow[i]);
            p.add(second[i]);

        }
        panel.add(p);

        JButton third[] = new JButton[thirdRow.length];
        //get the panel for the  row
        p = new JPanel(new GridLayout(1, thirdRow.length));
        for (int i = 0; i < thirdRow.length; ++i) {
            third[i] = new JButton(thirdRow[i]);
            p.add(third[i]);
        }
        panel.add(p);

        JButton fourth[] = new JButton[fourthRow.length];
        //get the panel for the  row
        p = new JPanel(new GridLayout(1, fourthRow.length));
        for (int i = 0; i < fourthRow.length; ++i) {
            fourth[i] = new JButton(fourthRow[i]);
            p.add(fourth[i]);
            if (i == fourthRow.length - 2)
                p.add(new JPanel());

        }
        p.add(new JPanel());
        panel.add(p);
    }


    }
