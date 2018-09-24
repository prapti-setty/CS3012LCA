import java.util.ArrayList;
import java.util.List;
 
// reference: GeeksForGeeks

class Node {
    int data;
    Node left, right;
 
    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class LCAProblem
{
    Node root;
    private List<Integer> path1 = new ArrayList<>();
    private List<Integer> path2 = new ArrayList<>();
 
    int findLCA(int n1, int n2) {
        path1.clear();
        path2.clear();
        return findLCAInternal(root, n1, n2);
    }
 
    private int findLCAInternal(Node root, int n1, int n2) {
 
        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
            System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
            return -1;
        }
 
        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
          //  System.out.println(path1.get(i) + " " + path2.get(i));
            if (!path1.get(i).equals(path2.get(i)))
                break;
        }
 
        return path1.get(i-1);
    }
 
    private boolean findPath(Node root, int n, List<Integer> path)
    {
        if (root == null) {
            return false;
        }
 
        path.add(root.data);
 
        if (root.data == n) {
            return true;
        }
 
        if (root.left != null && findPath(root.left, n, path)) {
            return true;
        }
 
        if (root.right != null && findPath(root.right, n, path)) {
            return true;
        }
 
        path.remove(path.size()-1);
 
        return false;
    }
    public static LCAProblem tree = new LCAProblem(); 
//	 	 1
//	   /   \
//	  2      3
//	/  \   	/ \
// 4    5  6   7
    public static void treeOne()
    {
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
    }
    
    public static int computeLCA(int a, int b)
    {
    	treeOne();
    	int lca = tree.findLCA(a,b);
    	System.out.print("LCA(" + a + "," + b + ")=" + lca);
    	
    	return lca;
    }
    
    
}