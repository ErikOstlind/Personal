
package compsciproject;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author erik
 */
public class CompSciGUI extends javax.swing.JFrame
{

    static Puzzle puzzle;
    static Path path;
    private String commonLetter = "N/A";
    boolean whichText,charSelected = false;

    public CompSciGUI()
    {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")//a bunch of hard to understand layout code generated by NetBeans
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button6 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        OriginalTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        CurrentTextArea = new javax.swing.JTextArea();
        OriginalLabel = new javax.swing.JLabel();
        CurrentLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 48), new java.awt.Dimension(0, 48), new java.awt.Dimension(32767, 48));
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cryptoquip");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        button1.setLabel("Switch");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jToolBar1.add(button1);

        button2.setLabel("Solve");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jToolBar1.add(button2);

        button3.setLabel("Change Log");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jToolBar1.add(button3);

        button6.setLabel("History");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        jToolBar1.add(button6);

        button4.setLabel("Hints");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jToolBar1.add(button4);

        button5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button5.setLabel("Open");
        button5.setName(""); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jToolBar1.add(button5);

        OriginalTextArea.setEditable(false);
        OriginalTextArea.setColumns(20);
        OriginalTextArea.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        OriginalTextArea.setLineWrap(true);
        OriginalTextArea.setRows(5);
        OriginalTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OriginalTextAreaMouseClicked(evt);
            }
        });
        OriginalTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                OriginalTextAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(OriginalTextArea);

        CurrentTextArea.setEditable(false);
        CurrentTextArea.setColumns(20);
        CurrentTextArea.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        CurrentTextArea.setLineWrap(true);
        CurrentTextArea.setRows(5);
        jScrollPane2.setViewportView(CurrentTextArea);

        OriginalLabel.setText("Original");

        CurrentLabel.setText("Current");

        jCheckBox2.setText("Masked Text");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(OriginalLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jCheckBox2))
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CurrentLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OriginalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(CurrentLabel)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button5ActionPerformed
    {//GEN-HEADEREND:event_button5ActionPerformed
        List<String> results = new ArrayList();
        File[] listOfFiles = new File("Puzzles").listFiles();
        for(int i = 0; i < listOfFiles.length; i++)
        {
            if (listOfFiles[i].isFile() && !listOfFiles[i].getName().equals("Hints.txt")) 
            {
                String extension = "";
                int x = listOfFiles[i].getName().lastIndexOf('.');
                if (x > 0) 
                {
                    extension = listOfFiles[i].getName().substring(x);
                }
                if(extension.equals(".txt"))
                {
                    results.add(listOfFiles[i].getName());
                }
            }
        }
        JPanel MainPanel = new JPanel(new GridLayout(0, 1));
        JList fileList = new JList(results.toArray());
        fileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
        fileList.setVisibleRowCount(6);
        JScrollPane SP = new JScrollPane();
        SP.setViewportView(fileList);
        MainPanel.add(SP);
        int result = JOptionPane.showOptionDialog(null, MainPanel, "Select a File", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Open", "Cancel"}, null);   //creating dialoge box
        if (result == JOptionPane.OK_OPTION && fileList.getSelectedValue()!=null)
        {
            setPath(results.get(fileList.getSelectedIndex()));
        }

    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button4ActionPerformed
    {//GEN-HEADEREND:event_button4ActionPerformed
        JTextArea textArea = new JTextArea(readHints() + "\nThe most common letter in this puzzle is: " + commonLetter);            //set the text in the text area to the text from Hints.txt
        JScrollPane scrollPane = new JScrollPane(textArea);         //creates a scroll pane with the text area in it
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(300, 300));
        showDialog("Hints", scrollPane, JOptionPane.CLOSED_OPTION); //creates the JOptionPane
    }//GEN-LAST:event_button4ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button3ActionPerformed
    {//GEN-HEADEREND:event_button3ActionPerformed
        if (puzzle == null)
        {
            JOptionPane.showMessageDialog(null, "No Puzzle Selected", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else
        {
            ChangeLogFrame temp = new ChangeLogFrame(puzzle);   //calls the HistoryFrame class 
            temp.pack();
            temp.setVisible(true);
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button2ActionPerformed
    {//GEN-HEADEREND:event_button2ActionPerformed
        JPanel myPanel = new JPanel(new GridLayout(1, 0));
        JTextArea textArea = new JTextArea();   //creating a text feild
        textArea.setColumns(30);            //setting the dimesions of the text field 
        textArea.setLineWrap(true);         //^^^
        textArea.setRows(5);                //^^^
        textArea.setWrapStyleWord(true);    //^^^
        myPanel.add(textArea);  // adds the text field to the main panel
        int result = JOptionPane.showOptionDialog(null, myPanel, "Solve the puzzle", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Solve", "Cancel"}, null);    //creates dialoge box
        if (result == JOptionPane.OK_OPTION)
        {
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button1ActionPerformed
    {//GEN-HEADEREND:event_button1ActionPerformed
        if (puzzle == null)
        {
            JOptionPane.showMessageDialog(null, "No Puzzle Selected", "ERROR", JOptionPane.ERROR_MESSAGE); //shows if a puzzle is not selected
        } else
        {
            JTextField firstLetter = new JTextField(1); //creating text field for user input
            JTextField secondLetter = new JTextField(1);//^^^^
            JPanel myPanel = new JPanel(new GridLayout(1, 0));   //creating a main panel
            myPanel.add(new JLabel("Switch"));  //creating a label
            myPanel.add(firstLetter);   //adding label to main panel
            myPanel.add(new JLabel("to"));
            myPanel.add(secondLetter);
            int result = JOptionPane.showConfirmDialog(null, myPanel, "Switch a letter", JOptionPane.OK_CANCEL_OPTION); //creating dialoge box
            if (result == JOptionPane.OK_OPTION)
            {
                if (firstLetter.getText().length() == 1 && secondLetter.getText().length() == 1)
                {
                    puzzle.switchLetters(firstLetter.getText(), secondLetter.getText(),true);  //calling "switchLetters" in the main class
                    //CurrentTextArea.setText(puzzle.getCurrent());   //sets the current puzzle to the puzzle that was just created by seitching the language
                } else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Input", "", JOptionPane.ERROR_MESSAGE); //shows if the user inputs a wrong answer
                }
            }
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_button6ActionPerformed
    {//GEN-HEADEREND:event_button6ActionPerformed
        if (puzzle == null)
        {

            JOptionPane.showMessageDialog(null, "No Puzzle Selected", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else
        {
            if (puzzle.getHistory()[0]==null)
            {
                showDialog("History", "None", 1);
            } else
            {
                HistoryFrame temp = new HistoryFrame(puzzle);   //calls the HistoryFrame class 
                temp.pack();
                temp.setVisible(true);
            }
        }
    }//GEN-LAST:event_button6ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox2ActionPerformed
    {//GEN-HEADEREND:event_jCheckBox2ActionPerformed
        if (puzzle == null)
        {
            jCheckBox2.setSelected(false);
            JOptionPane.showMessageDialog(null, "No Puzzle Selected", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else
        {
            whichText = !whichText; //switches between states (normal or masked text)
            setCurrentText(puzzle.getCurrent(), puzzle.getMaskedCurrent());
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void OriginalTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OriginalTextAreaMouseClicked
        try{
                if(OriginalTextArea.getText((evt.getX()/8)+((evt.getY()/15)*(OriginalTextArea.getWidth()/8)), 1).matches("[A-Za-z]"))
                {
                    OriginalTextArea.setSelectionStart((evt.getX()/8)+((evt.getY()/15)*(OriginalTextArea.getWidth()/8)));
                    OriginalTextArea.setSelectionEnd(OriginalTextArea.getSelectionStart()+1);
                    charSelected = true;
                }
                else
                    charSelected = false;
           }
        catch(Exception e){System.out.println(e.toString());}
    }//GEN-LAST:event_OriginalTextAreaMouseClicked

    private void OriginalTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OriginalTextAreaKeyTyped
        if(charSelected)
        {
            puzzle.switchLetters(OriginalTextArea.getSelectedText(),Character.toString(evt.getKeyChar()),true);
            charSelected = false;
        }
    }//GEN-LAST:event_OriginalTextAreaKeyTyped
   
    private void showDialog(String title, Object message, int type)
    {
        JOptionPane pane = new JOptionPane(message, type);
        JDialog dialog = pane.createDialog(null, title);
        dialog.setModal(false); //if something is modal then you can not interact with anything else, this sets the JOptionPane so that its not modal so that the user can interact with other windows
        dialog.show();
    }
   
    public void getCommonLetter(String p)   //finds the most common letter in the puzzle 
    {
        char[] idk = p.toCharArray();   //turns the string into a charArray
        HashMap letters = new HashMap();    //creates a hashmap
        for (char l : idk)  //goes through all of the characters, if a character is not already in the hashamp then it adds it if it is then it increments its count
        {
            if (l != ' ')
            {
                if (letters.get(l) == null) //adds the letter if it doesnt exist in the hashmap
                {
                    letters.put(l, 1);  //sets its count to one
                } 
                else
                {
                    letters.put(l, (Integer) (letters.get(l)) + 1); //if it exists then increment its count
                }
            }
        }
        int largest = 0;
        String letter = "";
        Set set = letters.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) //goes through the hashmap and finds the largest value
        {
            Map.Entry me = (Map.Entry) i.next();
            if ((Integer) (me.getValue()) > largest)
            {
                largest = (Integer) (me.getValue());
                letter = me.getKey().toString();
            }
        }
        commonLetter = letter.toUpperCase(); //returns the most common letter
    }

    private Puzzle getPuzzle()
    {
        return puzzle;
    }

    public void readPuzzleFile()
    {
        String temp = "";
        //path = Paths.get("test.txt");
        try
        {
            Scanner scanner = new Scanner(path, StandardCharsets.UTF_8.name()); //creates a scanner so that the program can read the file
            while (scanner.hasNextLine())
            {
                temp += scanner.nextLine();// + "\n";  //collects the contents of the file
            }
            puzzle = new Puzzle(temp, this);
            OriginalTextArea.setText(puzzle.getOriginal());
            setCurrentText(puzzle.getCurrent(), puzzle.getMaskedCurrent());
            getCommonLetter(temp);
        } catch (Exception e) //a "catch", in case the "try" fails when reading or locating the file
        {
            System.out.println("//ERROR " + e.toString());
        }

    }

    public String readHints()
    {
        String temp = "";
        try
        {
            Scanner scanner = new Scanner(Paths.get("Hints.txt"), StandardCharsets.UTF_8.name()); //creates a scanner so that the program can read the file
            while (scanner.hasNextLine())
            {
                temp += scanner.nextLine() + "\n";  //collects the contents of the file
            }

        } catch (Exception e) //a "catch", in case the "try" fails when reading or locating the file
        {
            System.out.println("//ERROR " + e.toString());
        }
        return temp;

    }

    public void setCurrentText(String text, String maskedText)  //sets the text in the CurrentTextField 
    {
        if (whichText)
        {
            CurrentTextArea.setText(maskedText);
        } else
        {
            CurrentTextArea.setText(text);
        }
    }

    public void setPath(String p)
    {
        path = Paths.get("Puzzles/"+p);  //sets the path of the file
        readPuzzleFile();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentLabel;
    protected javax.swing.JTextArea CurrentTextArea;
    private javax.swing.JLabel OriginalLabel;
    protected javax.swing.JTextArea OriginalTextArea;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
