import static org.junit.Assert.*;
import org.junit.Test;

public class LCAProblemTest 
{

	@Test
	public void testOne() 
	{
		assertEquals("testing LCA of 4,5", LCAProblem.computeLCA(4,5), 2);
	}
	
	@Test
	public void testTwo() 
	{
		assertEquals("testing LCA of 4,6", LCAProblem.computeLCA(4,6), 1);
	}
	
	@Test
	public void testThree() 
	{
		assertEquals("testing LCA of 3,4", LCAProblem.computeLCA(3,4), 1);
	}

}