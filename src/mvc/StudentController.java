/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author smbillah
 */
public class StudentController implements ActionListener {
    
    private ArrayList<StudentEntity> students = new ArrayList<StudentEntity>();
    
    private StudentView view;
    
    public StudentController(StudentView view){
        this.view = view;    
        
        this.view.addButtonListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = view.getStudentName();
        String id   = view.getStudentID();
                      
        StudentEntity student = new StudentEntity(name, id);
        
        students.add(student);
        view.displayStudent(student);  
        
    }
    
    
    
    
}
