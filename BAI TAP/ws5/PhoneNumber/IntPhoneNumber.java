/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneNumber;

/**
 *
 * @author GIA KINH
 */
public class IntPhoneNumber extends PhoneNumber{
    protected String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String countryCode, int area, String number) {
        super(area, number);
        this.countryCode = countryCode;
    }
    
    @Override
    public void display(){
        if (!this.countryCode.isEmpty()) {
            System.out.print(this.countryCode + "-");
        }
        if (this.area!=0) {
            System.out.print(this.area + "-");
        }
        if(!this.number.isEmpty()){
            System.out.print(this.number);
        }
        System.out.println();
    }
}
