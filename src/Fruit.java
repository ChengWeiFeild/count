import java.math.BigDecimal;

public class Fruit {

    private String name ;

    private String type ;

    private int  price ;

    private int  weight ;

    private double  discount = 1 ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public BigDecimal getTotalPrice() {
        if(price==0||weight==0){
            return BigDecimal.valueOf(0);
        }
        BigDecimal p = new BigDecimal(Double.toString(price));
        BigDecimal d = new BigDecimal(Double.toString(discount));
        BigDecimal w = new BigDecimal(Double.toString(weight));
        return  p.multiply(w).multiply(d);
    }
}
