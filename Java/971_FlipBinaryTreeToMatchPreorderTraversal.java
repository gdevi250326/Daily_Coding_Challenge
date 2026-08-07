import java.util.*;

class Solution {
    int index = 0;
    List<Integer> result = new ArrayList<>();

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        if (dfs(root, voyage)) {
            return result;
        }

        return Arrays.asList(-1);
    }

    private boolean dfs(TreeNode node, int[] voyage) {
        if (node == null) {
            return true;
        }

        if (index >= voyage.length || node.val != voyage[index]) {
            return false;
        }

        index++;

        if (node.left != null && index < voyage.length
                && node.left.val != voyage[index]) {
            result.add(node.val);

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }

        return dfs(node.left, voyage) && dfs(node.right, voyage);
    }
}
