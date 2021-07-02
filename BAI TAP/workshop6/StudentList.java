/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author giaki
 */
public class StudentList extends ArrayList<Student> {

    public StudentList() {
        super();
    }

    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(code)) {
                return this.get(i);
            }
        };
        return null;
    }

    private boolean isCodeDuplicated(String code) {
        code = code.trim().toUpperCase();
        return this.search(code) != null;
    }

    public void addStudent() {
        String newCode, newName;
        int newMark;
        boolean codeDuplicated = false;
        do {
            newCode = Inputter.inputPattern("St. code S000: ", "[sS][\\d]{3}");
            codeDuplicated = isCodeDuplicated(newCode);
            if (codeDuplicated) {
                System.out.println("Code is duplicated");
            }
        } while (codeDuplicated);
        newName = Inputter.inputNonBlankStr("Name of new student: ").toUpperCase();
        newMark = Inputter.inputInt("Mark: ", 0, 10);
        Student student = new Student(newCode, newName, newMark);
        this.add(student);
        System.out.println("Student " + newCode + " has been added");
    }

    public void searchStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No search can be performend!");
        } else {
            String sCode = Inputter.inputStr("Input student code for search: ");
            Student student = this.search(sCode);
            if (student == null) {
                System.out.println("Student " + sCode + " doesn't existed!");
            } else {
                System.out.println("Founđ: " + student);
            }
        }
    }

    public void updateStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No update can be performend!");
        } else {
            String sCode = Inputter.inputStr("Input code of update student: ");
            Student student = this.search(sCode);
            if (student == null) {
                System.out.println("Student " + sCode + " doesn't existed!");
            } else {
                String newName = Inputter.inputNonBlankStr("Old name: " + student.getName() + ", new name: ");
                student.setName(newName);
                int newMark = Inputter.inputInt("Old mark: " + student.getMark() + ", new mark: ", 0, 10);
                student.setMark(newMark);
                System.out.println("Student " + sCode + " has bean updated.");
            }
        }
    }

    public void removeStudent() {
        if (this.isEmpty()) {
            System.out.println("Empty list. No remove can be performend!");
        } else {
            String sCode = Inputter.inputStr("Input code of remove student: ");
            Student student = this.search(sCode);
            if (student == null) {
                System.out.println("Student " + sCode + " doesn't existed!");
            } else {
                this.remove(student);
                System.out.println("Student " + sCode + " has been removed.");
            }
        }
    }

    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            System.out.println("Student list:");
            for (Student student : this) {
                System.out.println(student);
            }
            System.out.println("Total: " + this.size() + " student(s).");
        }
    }

    public void sortByMarkDecresing() {
        Collections.sort(this);
    }

    public void sortByMarkInCresing() {
        Collections.sort(this, new Comparator<Student>() {
            @Override
            public int compare(Student t, Student t1) {
                return t.getMark() > t1.getMark() ? 1 : ( t.getMark() == t1.getMark() ? t.getName().compareTo(t1.getName()): -1);
            }
        });
    }
}
