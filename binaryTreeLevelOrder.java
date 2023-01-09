class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        var result = new ArrayList<List<Integer>>();

        getLevel(result, 0, root);

        return result;
    }

    private void getLevel(List<List<Integer>> result, int level, TreeNode current) {
        if(current == null) return;

        if (result.size() == level) {
            result.add(new LinkedList<>());
        }

        var arr = result.get(level);
        arr.add(current.val);

        getLevel(result, level + 1, current.left);
        getLevel(result, level + 1, current.right);
    }
}