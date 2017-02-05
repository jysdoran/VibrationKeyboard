package GUI;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
    /**
     * Simple swing based typing tutor using frame
     * @author
     * @date
     */
    public class TypingTutor extends JFrame implements KeyListener {
        //Individual keyboard rows
        String firstRow[] = {"~","1","2","3","4","5","6","7","8","9","0","-","+","<<<<<"};//BackSpace
        String secondRow[] = {"Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","\\"};
        String thirdRow[] = {"Caps","A","S","D","F","G","H","J","K","L",":","\"","Enter"};
        String fourthRow[] = {"Shift","Z","X","C","V","B","N","M",",",".","?","   ^" };
        String fifthRow[]={"      " ,"<" ,"\\/",">" };

        //all keys without shift key press
        String noShift="`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
        //special charactors on keyboard that has to be addressed duing keypress
        String specialChars ="~-+[]\\;',.?";

        //Jbuttons corresponting to each individual rows
        JButton first[];

        JButton second[];

        JButton third[];

        JButton fourth[];

        JButton fifth[];

        //default color of the button to be repainted when key released
        Color cc = new JButton().getBackground();

        public void keyTyped(KeyEvent e) {

        }

        /*
                 * Invoked when a key has been pressed.
                 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
                 */
        public void keyPressed(KeyEvent evt) {

        }//end of keypressed

        /**
         * Invoked when a key has been released.
         */
        public void keyReleased(KeyEvent evt)
        {

        }

        /*
         * Driver main method to start the application
         */
        public static void main(String[] args) {
            //launch typing tutor
            new TypingTutor().setVisible(true);
        }
        /*
         * No argument construtor to create frame
         */
        public TypingTutor()
        {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //set non resizable
            this.setResizable(false);
            //super.setSize(500,300);
            //set size of the content pane ie frame
            this.getContentPane().setPreferredSize(new Dimension(1000,600));
            //super.getContentPane().setSize(800,400);
            //set location for the frame
            this.setLocation(50,50);

            //init and paint frame
            initWidgets();
        }

        /**
         * Method to initialize frame component
         */
        private void initWidgets()
        {
            //set the text area on top
            JTextArea  text = new JTextArea();
            text.setPreferredSize(new Dimension(800,200));
            //JScrollPane scrollPane = new JScrollPane(text);
            //scrollPane.setPreferredSize(new Dimension(800, 200));

            // add(typingArea, BorderLayout.PAGE_START);
            // add(scrollPane, BorderLayout.CENTER);
            //set the info label on top
            JLabel info = new JLabel("<html>Type some text using your keyboard.The keys you press will be highlighted and text will be displayed.<br> Note : Clicking the buttons with your mouse will not perform any action. <br><br> </html>" );
            //set the bold font for info
            info.setFont(new Font("Verdana",Font.BOLD,14));

    /*set the layout and place compomnet in place and pack it */
            setLayout(new BorderLayout());
    /*Various panel for the layout */
            JPanel jpNorth = new JPanel();
            JPanel jpCenter = new JPanel();
            JPanel jpKeyboard = new JPanel();
            JPanel jpNote = new JPanel();
            add( jpNorth, BorderLayout.NORTH);
            add( jpNote);
            add( jpCenter, BorderLayout.CENTER);
            add(jpKeyboard, BorderLayout.SOUTH);

            jpNorth.setLayout(new BorderLayout());
            jpNorth.add(info, BorderLayout.WEST);
            jpNorth.add(info, BorderLayout.SOUTH);

            jpCenter.setLayout( new BorderLayout());
            jpCenter.add(text, BorderLayout.WEST);
            jpCenter.add(text, BorderLayout.CENTER);

            //add(text,BorderLayout.WEST);
            // add(scrollPane,BorderLayout.CENTER);

            //layout for keyboard
            jpKeyboard.setLayout(new GridLayout(5,1));
            //pack the components
            pack();

    /*paint first keyboard row  and add it to the keyboard*/
            first = new JButton[firstRow.length];
            //get the panel for the  row
            JPanel p = new JPanel(new GridLayout(1, firstRow.length));
            for(int i = 0; i < firstRow.length; ++i)
            {
                JButton b= new JButton(firstRow[i]);
                b.setPreferredSize(new Dimension(100,50));
                first[i] = b;
                p.add(first[i]);
            }
            jpKeyboard.add(p);

    /*paint second keyboard row  and add it to the keyboard*/
            second = new JButton[secondRow.length];
            //get the panel for the  row
            p = new JPanel(new GridLayout(1, secondRow.length));
            for(int i = 0; i < secondRow.length; ++i)
            {
                second[i] = new JButton(secondRow[i]);
                p.add(second[i]);

            }
            jpKeyboard.add(p);

    /*paint third keyboard row  and add it to the keyboard*/

            third = new JButton[thirdRow.length];
            //get the panel for the  row
            p = new JPanel(new GridLayout(1, thirdRow.length));
            for(int i = 0; i < thirdRow.length; ++i)
            {
                third[i] = new JButton(thirdRow[i]);
                p.add(third[i]);
            }
            jpKeyboard.add(p);

    /*paint fourth keyboard row  and add it to the keyboard*/
            fourth = new JButton[fourthRow.length];
            //get the panel for the  row
            p = new JPanel(new GridLayout(1, fourthRow.length));
            for(int i = 0; i < fourthRow.length; ++i)
            {
                fourth[i] = new JButton(fourthRow[i]);
                p.add(fourth[i]);
                if(i==fourthRow.length-2)
                    p.add(new JPanel());

            }
            p.add(new JPanel());
            jpKeyboard.add(p);

            //paint the fifth row
            fifth = new JButton[fifthRow.length];
            //get the panel for the  row
            p = new JPanel(new GridLayout(1, fifthRow.length));
    /*put empty panel for layout adjustments */
            for(int i = 0; i < 1; ++i)
            {
                JPanel  spacePanel = new JPanel();
                p.add(spacePanel);
            }
    /*draw the buttons */
            for(int i = 0; i < fifthRow.length; ++i)
            {
                if(i==1) //space bar panel
                {
                    JButton b = new JButton(fifthRow[i]);
                    b.setPreferredSize(new Dimension(400,10));
                    b.setBounds(10, 10, 600, 100);
                    fifth[i]=b;
                    //add empty panels for layout
                    p.add(new JPanel());p.add(new JPanel());p.add(new JPanel());p.add(new JPanel());p.add(new JPanel());p.add(new JPanel());p.add(new JPanel());p.add(new JPanel());
                }
                else
                {
                    fifth[i]=new JButton(fifthRow[i]);
                }
                if(i==0) //first black panel
                {
                    //place a black panel at first
                    JPanel  spacePanel = new JPanel();
                    p.add(spacePanel);
                }

                p.add(fifth[i]);

            }
            jpKeyboard.add(p);
    /*add listeners */
            getContentPane().addKeyListener(this);
            text.addKeyListener(this);
    /*add listeners to all the button */
            for(JButton b : first)
                b.addKeyListener(this);

            for(JButton b : second)
                b.addKeyListener(this);
            for(JButton b : third)
                b.addKeyListener(this);

            for(JButton b : fourth)
                b.addKeyListener(this);

            for(JButton b : fifth)
                b.addKeyListener(this);

        } //end of initWidgets
    }//end of class
