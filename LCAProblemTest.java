import static org.junit.Assert.*;
import org.junit.Test;

public class LCAProblemTest 
{
	public static LCAProblem tree;
    public static void treeOne()
    {
    	tree = new LCAProblem();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
    }
 
	@Test
	public void test() 
	{
		treeOne();
		assertEquals("testing LCA of 4,5", LCAProblem.computeLCA(4,5,tree), 2);
		assertEquals("testing LCA of 4,6", LCAProblem.computeLCA(4,6,tree), 1);
		assertEquals("testing LCA of 3,4", LCAProblem.computeLCA(3,4,tree), 1);
	}
	
	@Test
	public void testFalse() 
	{
		treeOne();
		assertEquals("", LCAProblem.computeLCA(8, 8, tree), -1);
		assertEquals("", LCAProblem.computeLCA(1, 8, tree), -1);
		assertEquals("", LCAProblem.computeLCA(8, 2, tree), -1);
	}

}
