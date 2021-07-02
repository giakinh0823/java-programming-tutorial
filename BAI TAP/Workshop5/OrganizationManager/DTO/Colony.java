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
public class Colony extends Organization{
    private String place;

    public Colony() {
    }
    
    public Colony(String place) {
        this.place = place;
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void grow(){
        System.out.println("An annual cycle of growth that begins in spring");
    }
    
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }
    @Override
    public void communicateByTool() {
        System.out.println("The colony communicate by sound");
    }

    @Override
    public String toString() {
        return "The colony size is " + super.getSize() + ", the colony’s place is " + place;
    }
}
