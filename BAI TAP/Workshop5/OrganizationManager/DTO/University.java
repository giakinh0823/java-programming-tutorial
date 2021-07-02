/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop5.OrganizationManager.DTO;

/**
 *
 * @author giaki
 */
public class University extends Organization{
      private String name;

    public University() {
    }

    public University(String name) {
        this.name = name;
    }

    public University(int size, String name) {
        super(size);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void  enroll(){
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }
    
    public void educate(){
        System.out.println("Provide education at university standard");
    }
    
    @Override
    public void communicateByTool() {
        System.out.println("In the university, people communicate by voice");
    }

    @Override
    public String toString() {
        return "Encourage the advancement and development of knowledge";
    }
}
