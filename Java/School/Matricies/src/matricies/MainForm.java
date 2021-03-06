/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricies;

import java.awt.BorderLayout;
import mathinterpreter.Operation.Operation;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import mathinterpreter.*;

/**
 *
 * @author ostlinja
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    Map<String,Matrix> matricies;
    ArrayList<Command> commands;
    ArrayList<Command> creators;
    File importFile;
    MathEquation equation;
    boolean shiftState = false;
    
    public MainForm() {
        matricies = new HashMap();
        commands = createCommands();
        creators = createCreators();
        equation = new MatrixEquation(this);
        initComponents();
        jPanel5.setLayout(new GridLayout(0,1));        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matrices");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(getCommands()));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane2.addTab("Matricies", jTabbedPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Help");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        jTabbedPane2.addTab("Equation", jPanel1);

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jTabbedPane2.addTab("Output Log", jPanel4);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(getCreators()));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private ArrayList<Command> createCreators()
    {
        ArrayList<Command> res = new ArrayList();
        res.add(new Command("New Basic",()->createNew()));
        res.add(new Command("New Identity",()->newIdentity()));
        res.add(new Command("From File",()->importMatrix()));
        
        return res;
    }
    
    private String[] getCreators(){
        ArrayList<String> res = new ArrayList();
        res.add("New...");
        creators.forEach(x->res.add(x.name));
        return Arrays.copyOf(res.toArray(),res.size(),String[].class);
    }
    
    private ArrayList<Command> createCommands()
    {
        ArrayList<Command> res = new ArrayList();
        res.add(new Command("Determinant",()->determinant()));
        res.add(new Command("Multiply",()->multiply()));
        res.add(new Command("Dot Product",()->dot()));
        res.add(new Command("Add",()->add()));
        res.add(new Command("Traspose",()->transpose()));
        res.add(new Command("Detailed",()->details()));
        res.add(new Command("Guass Jordan",()->gaussJordan()));
               
        return res;
    }
    
    private String[] getCommands(){
        ArrayList<String> res = new ArrayList();
        res.add("Commands...");
        commands.forEach(x->res.add(x.name));
        return Arrays.copyOf(res.toArray(),res.size(),String[].class);
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String cmd = jComboBox1.getSelectedItem().toString();
        if(matricies.size()>0){
            for(Command c: commands)
                if(c.name.equals(cmd))
                    c.execute();
        }
        else{
            JOptionPane.showMessageDialog(this, "There are currently no matricies", "Error", JOptionPane.ERROR_MESSAGE);
        }
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String choice = jComboBox2.getSelectedItem().toString();
        for(Command c: creators)
            if(c.name.equals(choice))
                c.execute();
        jComboBox2.setSelectedIndex(0);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_SHIFT)
            shiftState = false;
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_SHIFT)
            shiftState = true;
        if(evt.getKeyCode()==KeyEvent.VK_ENTER && shiftState){
            try{
                int index = jTextArea1.getLineOfOffset(jTextArea1.getCaretPosition());
                String[] text = jTextArea1.getText().split("\n");
                String line = text[index];
                if(line.contains(" :="))
                    line = line.substring(0,line.indexOf(" :="));
                
                String res = preformEquation(line);
                
                if(!res.equals("")){
                    jTextArea1.setText(addResult(text,index,res));
                    String t = jTextArea1.getText();
                    int length = t.length();
                    int pos = 0;
                    for(int i=0; i<=index;i++)
                    {
                        int x = t.indexOf("\n", pos+1);
                        pos += t.substring(pos, x==-1 ? length : x).length();
                    }
                    jTextArea1.setCaretPosition(pos);
                }
                Matrix m = matricies.get(res);
                if(m!=null)
                    newOutput(line+" = "+res+"<br>"+m.toHtml());
                else
                    newOutput(line+" = "+res);
            }catch(Exception e){e.printStackTrace(System.out);}
            
        }
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JTabbedPane tPane = new JTabbedPane();
        JTextArea matrixCommands = new JTextArea(
                                          "Addition     :  add[<Matrix>, <Matrix or Number>]\n"
                                        + "Subtract     :  sub[<Matrix>, <Matrix or Number>]\n"
                                        + "Multiply     :  mult[<Matrix>, <Matrix or Number>]\n"
                                        + "Divide       :  div[<Matrix>, <Matrix or Number>]\n"
                                        + "Dot Product  :  <Matrix> dot <Matrix or Number>\n"
                                        + "Determinate  :  det <Matrix>\n"
                                        + "Guass Jordan :  gj <Matrix>\n"
                                        + "Transpose    :  trans <Matrix>\n"
                                        + "New Matrix   :  new[<Rows>, <Columns>]\n"
                                        + "New Identity :  id[<Rows>, <Columns>]\n"
                                        + "Set Value    :  set[<Matrix>, <Row>, <Column>, <Value>]\n"
                                        + "Resize       :  resize[<Matrix>, <Rows>, <Columns>]\n\n"
                                        + "(Case Sensitive)");
        matrixCommands.setEditable(false);
        matrixCommands.setFont(new Font("Monospaced", Font.BOLD, 18));
        tPane.add(matrixCommands);
        ArrayList<Operation> op = equation.getOperations();
        op.sort((x,y)->x.operator.compareToIgnoreCase(y.operator));
        String s = "";
        for(Operation o: op)
            if(!s.contains(o.getUsage()))
                s += o.getUsage()+"\n";
        JTextArea t = new JTextArea(s); 
        t.setEditable(false);
        t.setFont(new Font("Monospaced", Font.BOLD, 18));
        
        JScrollPane sp = new JScrollPane();
        sp.setPreferredSize(matrixCommands.getSize());
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(t, BorderLayout.CENTER);
        
        sp.setViewportView(p);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        //p.add(sp);
        
        tPane.setTitleAt(0, "Matrix");
        tPane.add(sp);
        tPane.setTitleAt(1, "Math");
        
        
        JOptionPane pane = new JOptionPane(tPane,JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = pane.createDialog(null, "Commands");
        dialog.setModal(false);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public String addResult(String[] text,int index,String res){
        String result = "";
        for(int i=0;i<text.length;i++)
        {
            if(i==index){
                String line = text[i];
                if(line.contains(" :="))
                    line = line.substring(0, line.indexOf(" :="));
                result += line+" := "+res;
            }
            else
                result += text[i];
            if(i!=text.length-1)
                result+="\n";
        }
        return result;
    }
    
    public String preformEquation(String e){
        if(!e.equals("")){
            equation.setEquation(e);
            String res = "";
            try{res = new MathInterpreter(equation).interpret();}
            catch(Exception ex){res = ex.getMessage();}
            updateAllTabs();
            return res;
        }
        return "";
    }
    
    public void updateAllTabs() 
    {
        for(Component c: jTabbedPane1.getComponents())
            ((MatrixForm)c).drawMatrix();
    }
    
    private void newIdentity()
    {
        JTextField row = new JTextField(5);
        row.setText("2");
        JTextField col = new JTextField(5);
        col.setText("2");
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Rows:"));
        myPanel.add(row);
        myPanel.add(new JLabel("Columns:"));
        myPanel.add(col);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"New Identity",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            if(isNumber(row.getText())&&isNumber(col.getText()))
            {
                int r = Integer.parseInt(row.getText());
                int c = Integer.parseInt(col.getText());
                Matrix m = new Matrix();
                createNew(m.newIdentity(r, c));
            }
        }
    }
    
    private void importMatrix()
    {
        String filePath = "";
        if(importFile!=null){
            String path = importFile.getAbsolutePath();
            filePath = path.substring(0, path.lastIndexOf("\\"));
        }
        JFileChooser fc = new JFileChooser(filePath);
        int result = fc.showDialog(this, "Select File");
        if(result==JFileChooser.APPROVE_OPTION)
        {
            try{importFile = fc.getSelectedFile();
                Matrix m = importData(importFile);
                if(m!=null)
                    createNew(m,importFile.getName().split("\\.")[0]);
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    
    private void determinant()
    {
        JComboBox j = new JComboBox(matricies.keySet().toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Determinate",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            if(s!=null && s!="Select...")
            {
                Matrix temp = (Matrix)matricies.get((String)j.getSelectedItem());
                double d = temp.determinate();
                newOutput("Determinant |["+s+"]| = "+d+" <br>"+temp.toHtml());
            }
        }
    }
    
    private void multiply()
    {
        JComboBox j = new JComboBox(matricies.keySet().toArray());
        JComboBox j2 = new JComboBox(matricies.keySet().toArray());
        JTextField value = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        myPanel.add(new JLabel("Enter Value:"));
        myPanel.add(value);
        myPanel.add(new JLabel("Or Matrix:"));
        myPanel.add(j2);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Multiply",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            String s2 = j2.getSelectedItem().toString();
            String v = value.getText();
            if(s!=null)
            {
                Matrix temp = (Matrix)matricies.get((String)j.getSelectedItem());
                if(s2=="Select..." && isNumber(v))
                {
                    temp.multiply(Double.parseDouble(v));
                    newOutput("Multiplication ["+s+"] * "+v+"<br>"+temp.toHtml());
                }
                else if(s2!="Select...")
                {
                    try{temp.multiply((Matrix)matricies.get((String)j2.getSelectedItem()));
                        newOutput("Multiplication ["+s+"] * ["+s2+"]<br>"+temp.toHtml());
                    }
                    catch(Exception e){System.out.println(e);}
                    
                }
                ((MatrixForm)jTabbedPane1.getComponentAt(j.getSelectedIndex())).drawMatrix();   
            }
        }
    }
    
    private void dot()
    {
        JComboBox j = new JComboBox(matricies.keySet().toArray());
        JComboBox j2 = new JComboBox(matricies.keySet().toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        myPanel.add(new JLabel("Other Matrix:"));
        myPanel.add(j2);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Dot Product",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            String s2 = j2.getSelectedItem().toString();
            if(s!=null && s2!=null && s!="Select..." && s2!="Select...")
            {
                Matrix temp = (Matrix)matricies.get((String)j.getSelectedItem());
                try{Matrix newM = temp.dot((Matrix)matricies.get((String)j2.getSelectedItem()));
                    newOutput("Dot Product ["+s+"] . ["+s2+"]<br>"+newM.toHtml());
                    createNew(newM);
                }
                catch(Exception e){e.printStackTrace();}
                ((MatrixForm)jTabbedPane1.getComponentAt(j.getSelectedIndex())).drawMatrix();   
            }
        }
    }
    
    private void add()
    {
        ArrayList<String> t = new ArrayList();
        t.add("Select...");
        t.addAll(matricies.keySet());
        JComboBox j = new JComboBox(matricies.keySet().toArray());
        JComboBox j2 = new JComboBox(t.toArray());
        JTextField value = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        myPanel.add(new JLabel("Enter Value:"));
        myPanel.add(value);
        myPanel.add(new JLabel("Or Matrix:"));
        myPanel.add(j2);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Addition",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            String s2 = j2.getSelectedItem().toString();
            String v = value.getText();
            if(s!=null)
            {
                Matrix temp = (Matrix)matricies.get((String)j.getSelectedItem());
                if(s2=="Select..." && isNumber(v))
                {
                    temp.add(Double.parseDouble(v));
                    newOutput("Addition ["+s+"] + "+v+"<br>"+temp.toHtml());
                }
                else if(s2!="Select...")
                {
                    try{temp.add((Matrix)matricies.get((String)j2.getSelectedItem()));
                        newOutput("Addition ["+s+"] + ["+s2+"]<br>"+temp.toHtml());
                    }
                    catch(Exception e){System.out.println(e);}
                    
                }
                ((MatrixForm)jTabbedPane1.getComponentAt(j.getSelectedIndex())).drawMatrix();                
            }
        }
    }
    
    public void inverse()
    {
        
    }
    
    public void transpose()
    {
        JComboBox j = new JComboBox(matricies.keySet().toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Transpose",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            if(s!=null && s!="Select...")
            {
                Matrix temp = (Matrix)matricies.get((String)j.getSelectedItem());
                temp.transpose();
                newOutput("Transpose ["+s+"]<br>"+temp.toHtml());
                ((MatrixForm)jTabbedPane1.getComponentAt(j.getSelectedIndex())).drawMatrix();   
            }
            
        }
    }
    
    public void details()
    {
        JComboBox j = new JComboBox(matricies.keySet().toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Detailed View",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            if(s!=null && s!="Select...")
            {
                Matrix temp = (Matrix)matricies.get((String)j.getSelectedItem());
                newOutput("Details ["+s+"]<br>"+temp.toHtml(4));
            }
        }
    }
    
    public void gaussJordan()
    {
        JComboBox j = new JComboBox(matricies.keySet().toArray());
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Matrix:"));
        myPanel.add(j);
        int res = JOptionPane.showConfirmDialog(this,myPanel,"Gauss Jordan Elimination",JOptionPane.OK_CANCEL_OPTION);
        if(res==JOptionPane.OK_OPTION)
        {
            String s = j.getSelectedItem().toString();
            if(s!=null && s!="Select...")
            {
                Matrix temp = (Matrix)matricies.get((String)j.getSelectedItem());
                newOutput("Gauss Jordan Elminiation ["+s+"]<br>"+temp.toHtml());
                createNew(temp.gaussJordan());
            }
        }
    }
    
    public void resize(String name, int r, int c){
        MatrixForm m = (MatrixForm)jTabbedPane1.getComponentAt(jTabbedPane1.indexOfTab(name));
        m.updateSize();
        m.drawMatrix();
    }
    
    public Matrix importData(File f) throws Exception//loads and reads a given file
    { 
        double[][] mat;
        Charset charset = Charset.forName("US-ASCII");
        try (BufferedReader reader = Files.newBufferedReader(f.toPath(), charset)) {
            String line = null;
            line = reader.readLine();
            String[] dim = line.split("[,]");
            if(dim.length==2&&isNumber(dim[0])&&isNumber(dim[1]))
                mat = new double[Integer.parseInt(dim[0])][Integer.parseInt(dim[1])];
            else
                throw new Exception("Imported Matrix dimensions are invaild");
            int row = 0;
            int col = 0;
            while ((line = reader.readLine()) != null) {
                Pattern p = Pattern.compile("[^\\s,]+");
                Matcher m = p.matcher(line);  
                while(m.find())
                {
                    String s = line.substring(m.start(), m.end());
                    if(isNumber(s))
                    {
                        mat[row][col] = Integer.parseInt(s);
                        col++;
                    }
                }
                row++;
                col = 0;
            }
            return new Matrix(Integer.parseInt(dim[0]),Integer.parseInt(dim[1]),mat);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
        return null;
    }
    
    protected String createNew()
    {
        return createNew(new Matrix(2,2));
    }
    
    protected String createNew(Matrix m)
    {
        String name = getAvailableChar();
        return createNew(m,name);
    }
    
    protected String createNew(Matrix m,String name)
    {
        int index = jTabbedPane1.getTabCount();
        jTabbedPane1.add(new MatrixForm(m,this,name),name);
        jTabbedPane1.setSelectedIndex(index);
        matricies.put(name, m);
        newOutput("New Matrix ["+name+"]<br>"+m.toHtml());
        equation.extra.add(name);
        return name;
    }
    
    public void duplicate(Matrix m)
    {
        createNew(m.clone());
    }
    
    public void newOutput(String s)
    {
        JLabel l = new JLabel("<html>"+s+"<br></html>");
        l.setFont(new Font("Monospaced",1,18));
        jPanel5.add(l);
        int x = 0;
        int y = jPanel5.getHeight();
        //i dont know why but it needs two statements to set the scroll bar position to the bottom, figures
        jScrollPane2.getViewport().setViewPosition(new Point(x, y));
        jScrollPane2.getViewport().setViewPosition(new Point(x, y));
    }
    
    private String getAvailableChar()
    {
        for(int count = 0;count<5; count++)
        {
            String name = nameHelper("",count);
            if(!matricies.containsKey(name)&&name!="")
                return name;
        }
        return "...";
    }
    
    private String nameHelper(String base,int depth)
    {
        if (depth>0)
        {
            for (char c = 'A'; c <= 'Z'; ++c)
            {
                String name = nameHelper(base+c,depth-1);
                if(!matricies.containsKey(name)&&name!="")
                    return name;
            }
        }
        return base;
    }
   
    public boolean isNumber(String s)
    {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
    
    public String getAlphabet()
    {
        String alpha = "";
        for (char c = 'A'; c <= 'Z'; ++c)
            alpha+=c;
        
        return alpha;
    }
    
    public String convertDec(int value,int base)
    {
        if(base<=36 && base>1 && value>0)
        {
            String alpha = getAlphabet();
            int remainder = value%base;
            String temp = "";
            if(remainder>9)
                temp = alpha.substring(remainder-10, remainder-9);
            else
                temp = Integer.toString(remainder);
            return convertDec((int)(value/base),base)+temp;

        }
        return "";
    }
       
    public String rename(String oldname,String newname)
    {
        if(!matricies.containsKey(newname))
        {
            newOutput("Rename ["+oldname+"] -> ["+newname+"]");
            jTabbedPane1.setTitleAt(jTabbedPane1.indexOfTab(oldname), newname);
            matricies.put(newname, matricies.get(oldname));
            matricies.remove(oldname);
            equation.extra.set(equation.extra.indexOf(oldname), newname);
            return newname;
        }
        else
            JOptionPane.showMessageDialog(null, "A matrix called '"+newname+"' already exists", "", JOptionPane.ERROR_MESSAGE);
        return oldname;
    }
    
    public void delete(String name)
    {
        newOutput("Delete ["+name+"]");
        jTabbedPane1.remove(jTabbedPane1.indexOfTab(name));
        matricies.remove(name);
        equation.extra.remove(name);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

class Command
{
    String name;
    CMDOperation operation;
    public Command(String n,CMDOperation o){
        name = n;
        operation = o;
    }
    
    public void execute(){
        operation.execute();
    }
}

interface CMDOperation
{
    public void execute();
}

