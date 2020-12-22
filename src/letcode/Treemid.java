package letcode;

import java.util.ArrayList;
import java.util.List;

public class Treemid {
    static int index;
    static String[] values;

    public Treemid(){}
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }
    public void setValues(String treeValues) {
        values = treeValues.split(",");
        index = 0;

    }

    public TreeNode createTree() {
        TreeNode node = null;
        if(index < values.length){
            if (values[index].equals("#")) {
                index++;
                return null;
            }
            node = new TreeNode(Integer.parseInt(values[index]));
            index++;
            node.left = createTree();
            node.right = createTree();
        }
        return node;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        System.out.print(root.val + " ");
        res.add(root.val);
        inorder(root.right, res);
    }
}

