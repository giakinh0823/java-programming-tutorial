/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

/**
 *
 * @author giaki
 */
public class Student implements Comparable<Student>{
    String code;
    String name;
    int mark;
    
    public Student() {
        code="";
        name="";
        mark=0;
    }
    
    
    public Student(String code, String name, int mark) {
        this.code = code.toUpperCase();
        this.name = name.toUpperCase();
        this.mark = (mark>=0 && mark<=10)? mark : 0;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name.length()>0){
            this.name = name.trim().toUpperCase();
       }
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = (mark>=0 && mark<=10)? mark : 0;
    }

    @Override
    public String toString() {
        return code +", "+name+", "+mark;
    }

    @Override
    public int compareTo(Student t) {
        return -(this.getMark() - t.getMark());
    }   
}
