package day05;

/**
 * 封装厨房成员和方法的类
 */
public class Kitchen {
    private String name; //餐厅的名称
    private Garnish garnish;
    private Cook cook;

    /**
     * 餐厅外部类的带参构造方法
     * @param name  餐厅的名称
     * @param garnish
     * @param cook
     */
    public Kitchen(String name, String garnish, String cook) {
        this.name = name;
        /**
         * 内部类的实例化最好尽在外部类的内部进行
         * 内部类的对象，一般仅供外部类内使用
         */
        this.garnish = new Garnish(garnish);
        this.cook = new Cook(cook);
    }

    /**
     * 客户点菜的方法
     * @param menu 菜名
     * @return  做好的菜
     */
    public String order(String menu){
        //请配菜工配菜
        garnish.cutting();
        //请厨子做菜
        cook.cooking();
        return "您的"+menu+"来了......!";
    }

    public class Garnish{
        private String name;//配菜工的姓名

        /**
         * 配菜工带参构造方法
         * @param name 配菜工姓名
         */
        public Garnish(String name) {
            this.name = name;
        }

        /**
         * 配菜工切菜的方法
         */
        public void cutting(){
            System.out.println("配菜工："+name+"切菜.....");
        }
    }

    /**
     * 封装厨子属性和功能的内部类
     */
    public class Cook{
        private String name; //厨子的姓名

        /**
         * 带参构造方法
         * @param name 厨子的姓名
         */
        public Cook(String name) {
            this.name = name;
        }

        /**
         * 厨子做饭的方法
         */
        public void cooking(){
            //哪家餐厅的哪位主厨为客人服务
            System.out.println(Kitchen.this.name+"餐厅，主厨"+name+"正在炒菜....");

        }
    }
}
