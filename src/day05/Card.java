package day05;

/**
 * 封装银行卡属性的类
 */
public class Card {
    public String bank;  //发卡行
    public String pwd;   //密码
    public double bal;   //余额

    /**
     * 定义带参构造方法
     * @param bank
     * @param pwd
     * @param bal
     */
    public Card(String bank, String pwd, double bal) {
        this.bank = bank;
        this.pwd = pwd;
        this.bal = bal;
    }
}
