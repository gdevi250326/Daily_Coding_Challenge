/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> root1LeafValues = new ArrayList<>();
    List<Integer> root2LeafValues = new ArrayList<>();

    // Main Method
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        getChildsOfRoot1(root1);
        getChildsOfRoot2(root2);

        return root1LeafValues.equals(root2LeafValues);
    }


    // Get Childs of root1
    private void getChildsOfRoot1 (TreeNode node) {
        if(node == null) {
            return;
        }

        if(node.left == null && node.right == null) {
            root1LeafValues.add(node.val);
        }

        getChildsOfRoot1(node.left);
        getChildsOfRoot1(node.right);
    }


    // Get childs of root2
    private void getChildsOfRoot2 (TreeNode node) {
        if(node == null) {
            return;
        }

        if(node.left == null && node.right == null) {
            root2LeafValues.add(node.val);
        }

        getChildsOfRoot2(node.left);
        getChildsOfRoot2(node.right);
    }
}