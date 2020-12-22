package day05;

import java.util.Scanner;

public class InterfaceTestdyn {
    public static void main(String[] args){
        //强制类型转换
        IPolice pol = new ATMCBC(); //pol指向的实际对象是ATMCBC类型
        pol.takePic();//编译正确
//        pol.drawMoney();//编译错误，父类型IPolice中没有定义取款方法
//        ATMCBC c=pol;//编译错误，不能自动从父类型IPolice转换为子类型ATMCBC
        // 解决：强制类型转换。为什么可以强转：pol指向的实际对象类型为ATMCBC；目标类型也是ATMCBC，可以强制转换
        ATMCBC c=(ATMCBC)pol;
//        c.drawMoney(money); //编译正确
//        IUnionPay p = pol; //编译错误，父类型的变量不能自动转换为子类型的变量
        //解决：强制转换
        IUnionPay p = (IUnionPay)pol;
//        p.drawMoney(money); //编译正确
        //因为实际对象是ATMCBC类型，目标类型是IUnionpay类型，实际对象类型是目标类型的子类型
        System.out.println(pol instanceof ATMABC);
        if(pol instanceof ATMABC){
            ATMABC aa=(ATMABC)pol;  //编译正确
        }else{
            System.out.println("不能强转");
        }
//        ATMABC aa=(ATMABC)pol;  //编译正确
        //运行时异常：day05.ATMCBC cannot be cast to day05.ATMABC。异常类型：java.lang.ClassCastException
        //异常原因：实际对象ATMCBC类型，目标类型ATMABC。实际对象类型既不是目标类型的子类型，也不是目标类型本身，所以不能强制转换！


        //实例化取款机对象
        //第二种方法：使用接口类型变量，引用实现类的对象
//        IUnionPay atm= new ATMCBC();
        IUnionPay atm;
        //实例化一张银行卡
        Card card = new Card(IUnionPay.CBC,"123456",5000);
        //动态实例化对象
        if(card.bank.equals(IUnionPay.CBC)){
            atm=new ATMCBC();
        }else if(card.bank.equals(IUnionPay.ABC)){
            atm=new ATMABC();
        }else{
            System.out.println("不支持的银行卡");
            return;
        }

        //将银行卡放入取款机A
        atm.setCard(card);
        //先拍照，再操作
//        atm.takePic();
        //编译错误：父类型只能调用子类重写的方法！父类型不能调用子类非重写的方法

        //提示用户输入密码，获得用户输入的密码，保存在变量input中
        System.out.println("请输入密码：");
        Scanner sc= new Scanner(System.in);
        String input = sc.next();
        //step5:调用ATM机对象的验证密码方法，如果验证通过：就提示用户输入取款金额，并保存到变量money中
        //调用ATM机对象的取款方法，判断取款结构：如果取款成功，提示卡内余额；否则，提示余额不足，取款失败
        //否则：提示密码验证失败
        if(atm.checkPwd(input)){
            /**A
             * 取款的方法测试**/
             System.out.println("请输入取款金额");
             double money = sc.nextDouble();
             if(atm.drawMoney(money)){
                 System.out.println("取款成功！余额:"+atm.getBalance());
             }else{
                 System.out.println("余额不足，取款失败！退出");
             }
             //取款后，继续充话费
//            atm.payTelBill(tel,money)){ }  //编译错误：因为payTelBill是在子类型ATMABC中定义的。atm是父类型IUionPay，其中没有定义充花费方法，自然不能使用
            //解决：将父类型变量，强制转换回子类型变量
            if(atm instanceof ATMABC){
                ATMABC aa=(ATMABC)atm; //编译错误：从父类型变量不能自动转换回子类型变量
                //解决：强制转换，问题：无法保证运行时atm指向的实际变量就是ATMABC类型
                //解决：凡是强转都要先判断再转换
                System.out.println("请输入电话号码：");
                String  tel=sc.next();
                System.out.println("请输入充值金额");
                money = sc.nextDouble();
                if( aa.payTelBill(tel,money)){
                    System.out.println("充值成功");
                }else{
                    System.out.println("充值失败");
                }
            }else{
                System.out.println("您的银行卡不支持充话费");
            }

        }else{
            System.out.println("密码验证失败！退出");
        }

//            System.out.println("请输入手机号");
//            String  tel=sc.next();
//            System.out.println("请输入充值金额");
//            double money = sc.nextDouble();
//            if(atm.payTelBill(tel,money)){
//                System.out.println("充值成功！余额:"+atm.getBalance());
//            }else{
//                System.out.println("余额不足，充值失败！退出");
//            }
//        }else{
//            System.out.println("密码验证失败！退出");
//        }
    }
}
