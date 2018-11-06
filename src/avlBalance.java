/**
 * Created by ashishsowmya on 5/9/18.
 */

 // Definition for a binary tree node.





public class avlBalance {
    public TreeNode sortedArrayToBST(int[] nums) {
        return formBST(nums, 0, nums.length-1);
    }


 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }



    public TreeNode formBST(int[] nums, int l, int r){
        if(l>r) return null;
        int mid = (l+r+1)/2;
        TreeNode node = new TreeNode(nums[mid]);
        if(l==r) return node;
        node.left = formBST(nums,l,mid-1);
        node.right = formBST(nums,mid+1,r);
        return node;
    }


    public static void main(String args[])
    {

        avlBalance obj = new avlBalance();
        int A[] ={2,5,6,8,9};
      TreeNode node=  obj.sortedArrayToBST(A);









    }
}


