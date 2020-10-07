/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author smbillah
 */
public class StudentEntity {
    
    private String name;
    private String id;
    
    public StudentEntity(String name, String id){
        this.name = name;
        this.id = id;
    }
    
    public String toString(){
        return name + " <"+ id+ ">";
    }
    
}
