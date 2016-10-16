package GUI;


import Client.Client;
import Student.DataBase;
import Student.StudentInfo;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateDetails.java
 *
 * Created on Oct 24, 2010, 12:38:59 AM
 */

/**
 *
 * @author Kavindya
 */
public class UpdateDetails extends javax.swing.JFrame {

    /** Creates new form UpdateDetails */
    public UpdateDetails(DataBase database) {
        initComponents();

        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
         setVisible(true);
        this.database=database;
        student=new StudentInfo();
    }

    UpdateDetails(StudentInfo student) {
       
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        this.temp=student;
           //student=new StudentInfo();
        first.setText(student.getFirstName());
        add.setText(student.getHomeAddres());
        initials.setText(student.getNameWithInitials());
        tp.setText(student.getTelephoneNo());
        sem.setText(student.getSemester());
        bday.setText(student.getDateOfbirth());
        index.setText(student.getIndexNo());
        date.setText(student.getRegDate());
        if(student.getGender().equalsIgnoreCase("male"))
        gender.setText(student.getGender());
        else gender.setText(student.getGender());
                //Create a label with your image file
        photo.setIcon(resizeImageIcon(student.getiImage(), 0.2));
         date.setSize(10,10);
    }
    public ImageIcon resizeImageIcon(ImageIcon imageIcon, double factor) {
        Image image = imageIcon.getImage();

        int width = (int) (factor * image.getWidth(null));
        int height = (int) (factor * image.getHeight(null));

        Image newImage  = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon newImageIcon = new ImageIcon(newImage);

        return newImageIcon;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        initials = new javax.swing.JTextField();
        first = new javax.swing.JTextField();
        tp = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        index = new javax.swing.JLabel();
        sem = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        bday = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Window");

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");

        jLabel3.setText("Index Number");

        jLabel4.setText("Name With Initials");

        jLabel11.setText("Semester");

        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Gender");

        jLabel5.setText("Home Address");

        jLabel6.setText("Date Of Birth");

        jLabel8.setText("Telephone No");

        jLabel9.setText("Photo");

        jButton2.setText("Change");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("RegiterDate");

        date.setText("da");

        index.setText("in");

        sem.setText("jLabel10");

        gender.setText("Gender");

        bday.setText("jLabel10");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Studnet.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(initials, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(sem)
                                    .addComponent(gender)
                                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(first, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(tp, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(index, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bday, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, Short.MAX_VALUE))
                                        .addGap(8, 8, 8))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(initials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(index))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(bday))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(gender))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(sem))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                 // TODO add your handling code here:
          boolean finish=true;
          int count=0;
          String state = null;
          student=new StudentInfo();
          student.setFirstName(first.getText());
          student.setHomeAddres(add.getText());
          student.setNameWithInitials(initials.getText());
          student.setTelephoneNo(tp.getText());
          student.setSemester(sem.getText());
          if(icon==null)
          {
          student.setiImage(temp.getiImage());
         }
          else {student.setiImage(icon);}
          student.setPassword(temp.getPassword());
          student.setGender(gender.getText());
          student.setIndexNo(index.getText());
          student.setRegDate(date.getText());
          student.setDateOfbirth(bday.getText());
          System.out.println(student.getSemester());
          if(initials.getText().equalsIgnoreCase(""))
          {
          finish=false;
          count++;
          state="Initials are missing\nPlease enter the initials";
          }
          else if(first.getText().equalsIgnoreCase(""))
          {
          finish=false;
          count++;
          state="Firstname is missing\nPlease enter the firstname";
          }
          else if(tp.getText().equalsIgnoreCase(""))
          {
          finish=false;
          count++;
          state="Telephone number is missing\nPlease enter the telephone number";
          }
          else if(add.getText().equalsIgnoreCase(""))
          {
          finish=false;
          count++;
          state="Address is missing\nPlease enter the address";
          }
          else if(index.getText().equals(""))
          {
          finish=false;
          count++;
          state="Index is missing\nPlease enter the index";
          }
          if(count==1)
          {
                 JOptionPane.showMessageDialog(new JFrame(), state);
          }
          if(finish==true&&count==0)
          {
                JOptionPane.showMessageDialog(new JFrame(), "Make sure you change the details correctly");
          }
       
          if(finish)
          {
            try {
                client = new Client();
                client.update(student);
            } catch (UnknownHostException ex) {
                Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
            }

          JOptionPane.showMessageDialog(new JFrame(), "Successfully updated the  Profile");
          setVisible(false);
        }
          count=0;
          finish=true;
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
}//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:    String filename;
               int w,h;
               JFileChooser fc = new JFileChooser();
               fc.showOpenDialog(this);
               String filename = fc.getSelectedFile().getAbsolutePath();
               try {
                bImage = ImageIO.read(new File(filename));
                w = bImage.getWidth(null);
                h = bImage.getHeight(null);
                if (bImage.getType() != BufferedImage.TYPE_INT_RGB) {
                BufferedImage bi2 =
                    new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
                Graphics big = bi2.getGraphics();
                big.drawImage(bImage, 0, 0, null);
               icon=new ImageIcon(filename);
                //Create a label with your image file
                JLabel label=new JLabel(icon);
                //Create a window using JFrame with title ( Put image on JLabel )
                JFrame frame=new JFrame("Put image on JLabel");
                //Add created label into JFrame
                frame.add(label);
                //Set default close operation for JFrame
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                //Set JFrame size
                frame.setSize(400,400);
                //Make JFrame visible. So we can see it.
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                } }catch (IOException e) {
                System.out.println("Image could not be read");
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UpdateDetails().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JLabel bday;
    private javax.swing.JLabel date;
    private javax.swing.JTextField first;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel index;
    private javax.swing.JTextField initials;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel sem;
    private javax.swing.JTextField tp;
    // End of variables declaration//GEN-END:variables
    private DataBase database;
    private StudentInfo student;
    private int currantstudentNo;
    private BufferedImage bImage;
    private ImageIcon icon=null;
    private StudentInfo temp;
    private Client client;
}
