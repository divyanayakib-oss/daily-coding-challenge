class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode curr = root;

        while(curr != null) {
            if(curr.val == val) {
                return curr;
            } else if (val > curr.val) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        return null;
    }
}