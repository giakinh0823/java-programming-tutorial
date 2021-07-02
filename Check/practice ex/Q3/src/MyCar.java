
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> t) {
        int sum = 0;
        for (Car car : t) {
            sum+=car.getRate();
        }
        return (int)Math.floor((double)sum/t.size());
    }

    @Override
    public void f2(List<Car> t) {
        int d=0;
        int vtmax=0;
        int vtmin=0;
        Car max=t.get(0);
        Car min=t.get(0);
        for (Car car : t) {
            if(car.getRate()>max.getRate()){
                max = car;
                vtmax = d;
            }
             if(car.getRate()<min.getRate()){
                min = car;
                vtmin = d;
            }
            d++;
        }
        
        t.set(vtmax, min);
        t.set(vtmin, max);
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, new Comparator<Car>(){
            @Override
            public int compare(Car t, Car t1) {
                return t.getMaker().compareTo(t1.getMaker())==1? 1:t.getMaker().compareTo(t1.getMaker())==0 ? -(t.getRate()-t1.getRate()):-1;
            }
        
        });
    }
}
