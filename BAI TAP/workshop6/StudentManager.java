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
public class StudentManager {
    public static void main(String[] args) {
        String[] options= {"Adđ new student", "Search a student", "Update name and mark", "Remove a student", "List all","Sort All Student by mark (descending) and display using Compable","Sort All Student by mark (Ascending), if mark equals sort by Name and display using Comprator", "Quit"};
        int choice = 0;
        StudentList list = new StudentList();
        do{
            System.out.println("Student managing program.");
            choice = Menu.getChoice(options);
            switch(choice){
                case 1: 
                    list.addStudent();
                    break;
                case 2:
                    list.searchStudent();
                    break;
                case 3:
                    list.updateStudent();
                    break;
                case 4:
                    list.removeStudent();
                    break;
                case 5:
                    list.printAll();
                    break;
                case 6:
                    list.sortByMarkDecresing();
                    break;
                case 7:
                    list.sortByMarkInCresing();
                    break;
                default:
                    System.out.println("Bye");
                    break;
            }
        }while(choice>0 && choice<options.length);
    }
}
