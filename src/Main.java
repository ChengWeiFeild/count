import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static BigDecimal count(List<Fruit> fruits , double  coupon){
        if(fruits.isEmpty()){
            return BigDecimal.valueOf(0);
        }
        BigDecimal sum = fruits.stream().map(Fruit::getTotalPrice).reduce(new BigDecimal(0),  BigDecimal::add);
        BigDecimal per = new BigDecimal(100);
        if(coupon==0 || sum.compareTo(per)>0){
            return  sum;
        }
        int times = sum.intValue()%100;
        BigDecimal d = new BigDecimal(Double.toString(coupon));
        BigDecimal t = new BigDecimal(Double.toString(times));
        BigDecimal s = d.multiply(t);
        return  sum.subtract(s);
    }
    public static void test1() {
        List <Fruit> fs = new ArrayList<>();
        Fruit apple = new Fruit();
        apple.setName("apple");
        apple.setPrice(8);
        apple.setWeight(1);
        fs.add(apple);
        Fruit strawberry = new Fruit();
        strawberry.setName("strawberry");
        strawberry.setPrice(13);
        strawberry.setWeight(1);
        fs.add(strawberry);
        System.out.println(count(fs,  0));
    }

    public static void test2() {
        List <Fruit> fs = new ArrayList<>();
        Fruit m = new Fruit();
        m.setName("m");
        m.setPrice(20);
        m.setWeight(1);
        fs.add(m);
        Fruit apple = new Fruit();
        apple.setName("apple");
        apple.setPrice(8);
        apple.setWeight(1);
        fs.add(apple);
        Fruit strawberry = new Fruit();
        strawberry.setName("strawberry");
        strawberry.setPrice(13);
        strawberry.setWeight(1);
        fs.add(strawberry);
        System.out.println(count(fs,  0));
    }

    public static void test3() {
        List <Fruit> fs = new ArrayList<>();
        Fruit m = new Fruit();
        m.setName("m");
        m.setPrice(20);
        m.setWeight(1);

        fs.add(m);
        Fruit apple = new Fruit();
        apple.setName("apple");
        apple.setPrice(8);
        apple.setWeight(1);
        fs.add(apple);
        Fruit strawberry = new Fruit();
        strawberry.setName("strawberry");
        strawberry.setPrice(13);
        strawberry.setWeight(1);
        strawberry.setDiscount(0.8);
        fs.add(strawberry);
        System.out.println(count(fs,  0));
    }
    public static void test4() {
        List <Fruit> fs = new ArrayList<>();
        Fruit m = new Fruit();
        m.setName("m");
        m.setPrice(20);
        m.setWeight(20);

        fs.add(m);
        Fruit apple = new Fruit();
        apple.setName("apple");
        apple.setPrice(8);
        apple.setWeight(30);
        fs.add(apple);
        Fruit strawberry = new Fruit();
        strawberry.setName("strawberry");
        strawberry.setPrice(13);
        strawberry.setWeight(1);
        strawberry.setDiscount(0.8);
        fs.add(strawberry);
        System.out.println(count(fs,  10));
    }



        public static void main(String[] args) {
          test1();
            test2();
            test3();
            test4();

        }
}