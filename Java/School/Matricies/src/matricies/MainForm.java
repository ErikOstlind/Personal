/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricies;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
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
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import mathinterpreter.Equation;

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
    //Equation equation;
    public MainForm() {
        matricies = new HashMap();
        commands = createCommands();
        creators = createCreators();
        initComponents();
        jPanel5.setLayout(new GridLayout(0,1));
        //equation = new Equation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(getCommands()));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane2.addTab("Matricies", jTabbedPane1);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jTextField2.setText("Equation...");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTextField2)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
/*
    private void setUpEquation(Equation e){
        e.clearOperators();
        e.clearFunctions();
        e.addOperator(new Operation<Matrix>("+",0,(x,y)->{
            
        }),x->{
            
        });
    }
    */
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
        for(Command c: creators)
            res.add(c.name);
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
        for(Command c: commands)
            res.add(c.name);
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

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode()==13)
            preformEquation(jTextField2.getText());
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        preformEquation(jTextField2.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.selectAll();
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        jTextField2.select(0, -1);
    }//GEN-LAST:event_jTextField2FocusLost

    public void preformEquation(String e){
        
    }
    
    private void newIdentity()
    {
        JTextField row = new JTextField(5);
        JTextField col = new JTextField(5);
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
                createNew(temp.GaussJordan());
            }
        }
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
    
    private void createNew()
    {
        createNew(new Matrix(2,2));
    }
    
    private void createNew(Matrix m)
    {
        String name = getAvailableChar();
        createNew(m,name);
    }
    
    private void createNew(Matrix m,String name)
    {
        int index = jTabbedPane1.getTabCount();
        jTabbedPane1.add(new MatrixForm(m,this,name),name);
        jTabbedPane1.setSelectedIndex(index);
        matricies.put(name, m);
        newOutput("New Matrix ["+name+"]<br>"+m.toHtml());
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
        int count = 1;
        while (count<5)
        {
            String name = nameHelper("",count);
            if(!matricies.containsKey(name)&&name!="")
                return name;
            count++;
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
            return newname;
        }
        return oldname;
    }
    
    public void delete(String name)
    {
        jTabbedPane1.remove(jTabbedPane1.indexOfTab(name));
        matricies.remove(name);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField2;
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
/*
class MatrixConverter extends Converter<Matrix>
{
    public MatrixConverter(ArrayList<)
    public Matrix convert(String s){
        
    }
}*/
