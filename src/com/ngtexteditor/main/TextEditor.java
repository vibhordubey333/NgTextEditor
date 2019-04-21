package com.ngtexteditor.main;

import com.ngtexteditor.encryption.Encrypt;
import com.sun.speech.freetts.*;
import java.io.*;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Date;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.Event;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TextEditor extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form NewJFrame
     */
    /*class UndoFunk()
    {
        Document editDoc;
       public UndoHandler undoHandler=new UndoHandler();
       public UndoManager undoMan=new UndoManager();
       UndoAction unAc;
       //RedoAction reAc;
       editDoc=jTextArea1.getDocument();
       editDoc.addUndoableEditListener(undoHan);
       KeyStroke undoKeyStroke=KeyStroke.getKeyStroke(KeyEvent.VK_Z,Event.CTRL_MASK);
        unAc=new UndoAction();
        jTextArea1.getInputMap().put(undoKeyStroke,"undoKeyStroke");
        jTextArea1.getActionMap().put("undoKeyStroke",unAc);
    }*/
    public TextEditor() {
        initComponents();
        //getContentPane().setBackground(Color.BLUE); for changing the color of the JFrame
       setTitle("Advance Notepad");
       jMenu2.setMnemonic(KeyEvent.VK_F);
       jMenu2.addActionListener(this);
       jMenu3.setMnemonic(KeyEvent.VK_E);
       jMenu3.addActionListener(this);
       jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK));
       jMenuItem1.addActionListener(this);
       jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,Event.CTRL_MASK));
       jMenuItem2.addActionListener(this);
       jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,Event.CTRL_MASK));
       jMenuItem4.addActionListener(this);
       jMenuItem3.addActionListener(this);
       jMenuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.CTRL_MASK));
       jMenuItem7.addActionListener(this);
       jMenuItem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7,0));
       jMenuItem9.addActionListener(this);
       jMenuItem9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,Event.CTRL_MASK));
       jMenuItem11.addActionListener(this);
       jMenuItem11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));//for date
       jMenuItem10.addActionListener(this);
       jMenuItem10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2,0));// for delete
       jMenuItem8.addActionListener(this);
       jMenuItem8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,Event.CTRL_MASK));
       jMenuItem14.addActionListener(this);
       jMenuItem14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,Event.CTRL_MASK));//encryption
       jMenuItem15.addActionListener(this);
       jMenuItem15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,Event.CTRL_MASK));//decryption
       jMenuItem17.addActionListener(this);
       jMenuItem17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,Event.CTRL_MASK));
       jMenuItem21.addActionListener(this);
       jMenuItem21.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,Event.CTRL_MASK));//for dec font size
       jMenuItem20.addActionListener(this);
       jMenuItem20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,Event.CTRL_MASK));//for inc font size
       jMenuItem16.addActionListener(this);
       jMenuItem16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11,0));// for speech
       jMenuItem12.addActionListener(this);
       jMenuItem12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,Event.CTRL_MASK));
       jMenuItem19.addActionListener(this);
       jMenuItem19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F9,0));
       changeFont();
       
//code for undo/redo
       /*Document editDoc;
       UndoHandler undoHandler=new UndoHandler();
       UndoManager undoMan=new UndoManager();
       UndoAction unAc;
       //RedoAction reAc;
       editDoc=jTextArea1.getDocument();
       editDoc.addUndoableEditListener(undoHandler);
       KeyStroke undoKeyStroke=KeyStroke.getKeyStroke(KeyEvent.VK_Z,Event.CTRL_MASK);
        unAc=new UndoAction();
        jTextArea1.getInputMap().put(undoKeyStroke,"undoKeyStroke");
        jTextArea1.getActionMap().put("undoKeyStroke",unAc);*/
       
       // code for changing the color of the Menubar
       /*try{
       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       }catch(Exception err)
       {
           JOptionPane.showMessageDialog(null, err);
       }*/
       //UIManager.put("jMenuBar1.BACKGROUND",Color.TRANSLUCENT);
    }
    void changeFont()
    {
       jTextArea1.setFont(new Font("Century Gothic", Font.BOLD, 15));
       jTextArea1.setForeground(Color.GREEN);
       jTextArea1.setBackground(Color.decode("#21252B"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu2.setText("File");

        jMenuItem1.setText("New");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Open");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Save");
        jMenu2.add(jMenuItem3);

        jMenuItem7.setText("SaveAs");
        jMenu2.add(jMenuItem7);
        jMenu2.add(jSeparator1);

        jMenuItem4.setText("Exit");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");

        jMenuItem9.setText("Undo");
        jMenu3.add(jMenuItem9);

        jMenuItem13.setText("Replace ");
        jMenu3.add(jMenuItem13);
        jMenu3.add(jSeparator2);

        jMenuItem17.setText("Select All");
        jMenu3.add(jMenuItem17);

        jMenuItem5.setText("Cut");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Copy");
        jMenu3.add(jMenuItem6);

        jMenuItem8.setText("Paste");
        jMenu3.add(jMenuItem8);

        jMenuItem10.setText("Delete");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Date/Time");
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("View");

        jMenuItem19.setText("Full Screen");
        jMenu8.add(jMenuItem19);

        jMenuItem18.setText("Exit Full Screen");
        jMenu8.add(jMenuItem18);

        jMenuItem21.setText("Font Dec.");
        jMenu8.add(jMenuItem21);

        jMenuItem20.setText("Font Inc.");
        jMenu8.add(jMenuItem20);

        jMenuBar1.add(jMenu8);

        jMenu5.setText("Security");

        jMenuItem14.setText("Encryption");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Decryption");
        jMenu5.add(jMenuItem15);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Read");

        jMenuItem16.setText("Text To Speech");
        jMenu6.add(jMenuItem16);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Help");

        jMenuItem12.setText("Help");
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void openFile()
    {
        JFileChooser fc=new JFileChooser();
        int i=fc.showOpenDialog(this);
        if(i==JFileChooser.APPROVE_OPTION)
        {
            File f=fc.getSelectedFile(); // in java.io.File
            String filePath=f.getPath();
            displayContent(filePath);
        }
    }
    void displayContent(String fpath)
    {
        try{
        BufferedReader br=new BufferedReader(new FileReader(fpath));
        String s1="",s2="";
        while((s1=br.readLine())!=null)
        {
            s2+=s1+"\n";
        }
        jTextArea1.setText(s2);
        br.close();
        }catch(Exception e)
                {
                  e.printStackTrace();
                }
    }
    void myClose(TextEditor oa)
    {
        oa.dispose();
    }
    void saveFile()
    {
     JFileChooser sfile=new JFileChooser();
     int option=sfile.showSaveDialog(this); // on success it returns 0
     if(option==JFileChooser.APPROVE_OPTION)
     {
         try{
             BufferedWriter out=new BufferedWriter(new FileWriter(sfile.getSelectedFile().getPath()));
              out.write(jTextArea1.getText());
             out.close();
         }catch(Exception e)
         {
             e.printStackTrace();
         }
     }
    }
    void newFile()
    {
        String str=jTextArea1.getText();
        String s=JOptionPane.showInputDialog(null,"Enter File Name","Create New File", JOptionPane.INFORMATION_MESSAGE);//showInputDialog(null,"Enter file name");
        File f=new File(s);
        if(f.exists()==true)
        {
            JOptionPane.showMessageDialog(null,"File already exist !!!");
        }
        else
        {
            try{
                f.createNewFile();
                jTextArea1.setText("");
               }catch(Exception e){}
        }
    }
    void saveAsFile()
    {
        /*JFileChooser fc=new JFileChooser();
        int option=fc.showSaveDialog(this);
        File f;
        BufferedWriter out;
        if(option==JFileChooser.APPROVE_OPTION)
        {
                try{
                    FileWriter fw=new FileWriter(fc.getSelectedFile().getPath());
                    f=new File(fw.toString());
                    if(f.exists()==true)
                    {
                       int opt=fc.showDialog(jMenu1, "File already exist want to override ? ");
                       if(opt==0)
                       {
                           out=new BufferedWriter(fw);
                           out.write(jTextArea1.getText());
                           out.close();
                       }
                    }
                }catch(Exception e)
                {
                     e.printStackTrace();
                }
        } */
       
       FileDialog fg=new FileDialog(this, "Save As",FileDialog.SAVE);
       fg.setVisible(true);
       String s=fg.getFile();
       String s2=fg.getDirectory();
       String s3=s+s2,data;
       data=jTextArea1.getText();
       byte b[]=data.getBytes();
       File f=new File(s3);
       try{
       FileOutputStream fobj=new FileOutputStream(f);
       for(int i=0;i<data.length();i++)
       {
           fobj.write(b[i]);
       }
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       
//jf.showSaveDialog(this);
       //File s1=jf.getCurrentDirectory(),s2=jf.;
       
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    public javax.swing.JMenuItem jMenuItem14;
    public javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== jMenuItem1)
        {
            newFile();
        }
        if(e.getSource()==jMenuItem2)
        {
            openFile();
        }
        else if(e.getSource()==jMenuItem4)
        {
            myClose(this);
        }
        else if(e.getSource()==jMenuItem3)
        {
            saveFile();// give the message box if user want to override the pre-existing file.
        }
        else if(e.getSource()==jMenuItem7)
        {
            saveAsFile();
        }
        else if (e.getSource()==jMenuItem9)
        {
            
        }
        else if(e.getSource()==jMenuItem11)
        {
           DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
           Date date = new Date();
           String str=jTextArea1.getText(); 
           jTextArea1.setText(str+dateFormat.format(date));
        }
        else if(e.getSource()==jMenuItem8)
        {
            String temp,app;
            try {
                temp=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
                int pos;
                app=jTextArea1.getText();
                pos=jTextArea1.getCaretPosition();
                jTextArea1.setCaretPosition(pos);
                jTextArea1.setText(app+temp);
            } catch (UnsupportedFlavorException ex) {
                Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TextEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(e.getSource()==jMenuItem10)
        {
            int i;
            String msg=jTextArea1.getSelectedText();
            i=jTextArea1.getText().indexOf(msg);
            jTextArea1.replaceRange(" ",i,i+msg.length());
            msg=" ";
        }
        else if(e.getSource()==jMenuItem14)
        {
          //  Encrypt.se
            int flag=0,encheck=1; // using flag variable as a  dummy only , use of encheck is to ensure that user wants to encrypt
            Encrypt oa=new Encrypt();// this text , as Encrypt class will be accessed by the decrypt method...
            oa.vault(flag);
        }
        else if(e.getSource()==jMenuItem17)
        {
            jTextArea1.requestFocusInWindow();
            jTextArea1.selectAll();
        }
        else if(e.getSource()==jMenuItem15)
        {
            int flag=1;// decrypt
            Encrypt p=new Encrypt();
            p.vault(flag);
        }
        else if(e.getSource()==jMenuItem16)
        {
            String VOICENAME="kevin16";
            Voice voice;
            VoiceManager vm=VoiceManager.getInstance();
            voice=vm.getVoice(VOICENAME);
            voice.allocate();
            try{
                voice.speak(jTextArea1.getText());
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        else if(e.getSource()==jMenuItem21)
        {        
        }
        else if(e.getSource()== jMenuItem12)
        {
            JFrame f=new JFrame();
            JPanel p=new JPanel();
            JTextArea t1=new JTextArea();
            t1.setColumns(37);
            t1.setRows(67);
            t1.setText( "<b>Created by l!v3W!r3<b>"+"\n\n" 
                    +"Shortcut key Combinations\n"
                    +"_________________________"
                    +"\n\n"
                    +"Copy : CTRL+C\n"
                    +"Cut  : CTRL+Z");
            t1.setBackground(Color.decode("#21252B"));
            t1.setForeground(Color.GREEN);
            t1.setEditable(false);
            p.add(t1);
            f.add(p);            
            f.setVisible(true);
            f.setSize(450,400);
        }
        else if(e.getSource()==jMenuItem19)
        {
           /* Toolkit toolkit=Toolkit.getDefaultToolkit();
            Dimension scsize=toolkit.getScreenSize();
            System.out.println(scsize);*/
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            setUndecorated(true);
            setVisible(true);
        }
       }
}