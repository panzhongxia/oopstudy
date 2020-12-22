package day05;

import java.util.Scanner;

public class InterfaceTest {
    public static void main(String[] args){
        //实例化取款机对象
//        ATMCBC atm = new ATMCBC();
        ATMABC atm = new ATMABC();
        //实例化一张银行卡
        Card card = new Card("CBC","123456",5000);
        //将银行卡放入取款机
        atm.setCard(card);
        //先拍照，再操作
        atm.takePic();
        //提示用户输入密码，获得用户输入的密码，保存在变量input中
        System.out.println("请输入密码：");
        Scanner sc= new Scanner(System.in);
        String input = sc.next();
        //step5:调用ATM机对象的验证密码方法，如果验证通过：就提示用户输入取款金额，并保存到变量money中
        //调用ATM机对象的取款方法，判断取款结构：如果取款成功，提示卡内余额；否则，提示余额不足，取款失败
        //否则：提示密码验证失败
        if(atm.checkPwd(input)){
            /**
             * 取款的方法测试
            System.out.println("请输入取款金额");
            double money = sc.nextDouble();
            if(atm.drawMoney(money)){
                System.out.println("取款成功！余额:"+atm.getBalance());
            }else{
                System.out.println("余额不足，取款失败！退出");
            }
        }else{
            System.out.println("密码验证失败！退出");
        }   **/
            System.out.println("请输入手机号");
            String  tel=sc.next();
            System.out.println("请输入充值金额");
            double money = sc.nextDouble();
            if(atm.payTelBill(tel,money)){
                System.out.println("充值成功！余额:"+atm.getBalance());
            }else{
                System.out.println("余额不足，充值失败！退出");
            }
        }else{
            System.out.println("密码验证失败！退出");
        }
    }
}
