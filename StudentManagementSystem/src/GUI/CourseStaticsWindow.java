/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CourseStaticsWindow.java
 *
 * Created on Jan 17, 2011, 12:47:00 AM
 */

package GUI;
import Student.DataBase;
import Student.StudentInfo;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Kavindya
 */
public class CourseStaticsWindow extends javax.swing.JDialog {

    /** Creates new form CourseStaticsWindow */
    public CourseStaticsWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public CourseStaticsWindow(DataBase db) {
        this.db=db;
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        view();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public void view()
    {
        ArrayList<StudentInfo> student;
        student=db.getStudents();
    String col[] = {"Initials","IndexNo","Gender","TelephoneNo","Address","Semester","RegisteredDate","DateOfBirth"};
    DefaultTableModel model = new DefaultTableModel(null,col);
        for(int i=0;i<student.size();i++)
        {
        Vector<String> vector=new Vector<String>();
    //table=new JTable(model);
    Vector<String> v=new Vector<String>();
    v.addElement(student.get(i).getNameWithInitials());
    v.addElement(student.get(i).getFirstName());
    v.addElement(student.get(i).getIndexNo());
    v.addElement(student.get(i).getTelephoneNo());
    v.addElement(student.get(i).getHomeAddres());
    v.addElement(student.get(i).getSemester());
    v.addElement(student.get(i).getRegDate());
    v.addElement(student.get(i).getDateOfbirth());
       model.addRow(v);
        }
    Total.setText(Integer.toString(student.size()));
    table.setModel(model);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Course Statics");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Initials", "Name", "Gender", "Semester", "DateOfBirth", "Address", "Telephone", "IndexNo", "RegisteredDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jScrollPane2.setViewportView(jScrollPane1);

        jLabel1.setText("Student Registered");

        jLabel2.setText("TotalStudents");

        Total.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(594, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Total)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Total))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CourseStaticsWindow dialog = new CourseStaticsWindow(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    private DataBase db;
}
