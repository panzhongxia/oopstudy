package letcode.linkedlist;

/**
 * @description: 定义一个测试类
 * @author: xiaozhi
 * @create: 2020-07-23 23:22
 * https://blog.csdn.net/li1325169021/article/details/107554029
 * https://blog.csdn.net/weixin_46726346/article/details/108742370
 * https://cloud.tencent.com/developer/article/1583256
 */
public class CircleLinkedListTest {
    public static void main(String[] args) {
        CircleLinkedList circleLinkedList=new CircleLinkedList();
        circleLinkedList.addPersonNode(5);
        circleLinkedList.selectPersonNode();
    }
}
/**
 * @description: 创建一个环形链表管理人员节点
 * @author: xiaozhi
 * @create: 2020-07-23 21:54
 */
class CircleLinkedList {

    //创建一个first节点，first节点没有值
    private PersonNode first=null;
    /**
     * @Description: 添加环形节点，构成环形链表
     * @Param: count 表示节点数量
     * @Author: xz
     * @return: void
     * @Date: 2020/7/23 22:47
     */
    public void addPersonNode(int count){
        if(count<1){
            System.out.println("count的值不正确");
            return;
        }
        PersonNode currentNode=null;//定义一个临时节点
        //for循环创建环形链表
        for(int i=1;i<=count;i++){
            PersonNode personNode=new PersonNode(i);//根据编号创建人员节点
            if(i==1){//如果创建的是第一个节点
                first=personNode;//给第一个节点赋值
                first.setNext(first);//第一个节点的next域指向第一个节点，构成一个节点的环形链表
                currentNode=first;//因为第一个节点固定，不能移动，所以把第一个节点赋值给临时节点
            }else{
                currentNode.setNext(personNode);//当前节点后指向创建的人员节点
                personNode.setNext(first);//创建的人员节点指向first节点
                currentNode=personNode;//当前节点后移
            }
        }
    }
    /**
     * @Description: 遍历环形链表
     * @Param: count 表示节点数量
     * @Author: xzli
     * @return: void
     * @Date: 2020/7/23 22:47
     */
    public void selectPersonNode(){
        if(first==null){
            System.out.println("空的环形链表");
            return;
        }
        PersonNode currentNode=first;//定义一个临时节点
        while(true){
            System.out.printf("人员节点编号%d \n",currentNode.getNum());
            if(currentNode.getNext() ==first){//遍历结束
                break;
            }
            currentNode=currentNode.getNext();//临时节点后移
        }
    }
}
/**
 * @description: 定义一个人员节点类，每一个PersonNode对象就是一个节点
 * @author: xiaozhi
 * @create: 2020-07-23 21:51
 */
class PersonNode {
    private int num;
    private PersonNode next;

    public PersonNode(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public PersonNode getNext() {
        return next;
    }

    public void setNext(PersonNode next) {
        this.next = next;
    }
}


