package day05;

/**
 * 封装银联标准功能定义的接口
 */
public interface IUnionPay {
    /**
     * 定义常量备选项！
     * 完整： public static final String ABC="ABC";
     * public static final 可以省略，编译器会自动添加
     * 常量：必须在声明时初始化
     */
    String ABC="ABC";
    String CBC="CBC";
    /**
     * 验证密码方法的标准定义
     * @param input 用户输入的密码
     * @return 是否验证成功
     */
    //public abstract boolean checkPwd(String input);
    boolean checkPwd(String input);

    /**
     * 取款方法的标准定义
     * @param money 取款金额
     * @return  是否取款成功
     */
    boolean drawMoney(double money);

    /**
     * 查询余额的标准方法定义
     * @return
     */
    double getBalance();

    /**
     * 插卡方法的标准定义
     * @param card 银行卡类型的对象
     */
    void setCard(Card card);
}
