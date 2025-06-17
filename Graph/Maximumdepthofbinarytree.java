import javax.swing.tree.TreeNode;

public class Maximumdepthofbinarytree {
   static int minimum=Integer.MAX_VALUE;
public static void rec( TreeNode curr , int level)
{
    if(curr==null)
    {
         return;
    }
    if(curr.left==null&&curr.right==null)
{
    // leaf node 
    if(level<minimum)
    {
        minimum=level;
    }
    return;
}
}

public int minimumdepth(TreeNode root)
{
    minimum=Integer.MAX_VALUE;
    rec(root,1);
    return minimum;
}

    public static void main(String[] args) {
        
    }
    
}
