package day04;

public class Shop {
    private double buying=5.5;
    private double price=8;
    double total;

    public double getBuying() {
        return buying;
    }

    public void setBuying(double buying) {

    }

    public double getPrice(){
        return price;
    }

//    void sale(double money, double count){
//    public void sale(double money, double count){
    protected void sale(double money, double count){
        //公开方法，防屌丝
        if(money <= 0||count<=0){
            System.out.println("购买数量和钱数必须>0");
        }else if(money <= price*count){
            System.out.println("您的数学是体育老师教的吗？");
        }else {
            total+=count;
            System.out.println("您购买"+count+"斤水果，收您"
                    +money+"元；找零"
                    +(money-price*count));
        }
    }
}
