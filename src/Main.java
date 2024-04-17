import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int count(List<Fruit> Fruits , double  coupon){
        int sum = Fruits.stream().mapToInt(Fruit::getTotalPrice).sum();
        BigDecimal p = new BigDecimal(Double.toString(sum));
        BigDecimal d = new BigDecimal(Double.toString(coupon));
        return  p.subtract(d).intValue();
    }

    public static void main(String[] args) {
             List <Fruit> fs = new ArrayList<>();
             Fruit apple = new Fruit();
             apple.setName("apple");
             apple.setPrice(12);
             apple.setWeight(3);
             apple.setDiscount(0.8);
             fs.add(apple);
             System.out.println(count(fs,  10));

    }
}