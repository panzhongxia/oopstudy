package letcode;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
//        int[] paixu = {1,2,3,4,0,0,4,6,3};
//        System.out.println(Arrays.toString(paixu));
//        RemoveDuplicates pp = new RemoveDuplicates();
//        int[] out = pp.removeDuplicates(paixu);
//        System.out.println(Arrays.toString(out));

        Container dd = new Container();
        int[] paixu = {1,2,3,4,8,9,4,6,7};
        int ans = dd.maxArea(paixu);
        System.out.println(ans);

        String treeNodeValues = "1,2,#,#,3,4,#,#,5,6,#,8,#,#";
        Treemid treeHelper = new Treemid();
        treeHelper.setValues(treeNodeValues);
        try {
            TreeNode root = treeHelper.createTree();
            System.out.println("创建二叉树成功！");


            System.out.println("中序遍历二叉树：");
            treeHelper.inorderTraversal(root);
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
