package lifeform;
import static org.junit.Assert.*;

import org.junit.Test;
/**
 *  Test LifeForm class
 * @author Ryan Campbell
 *
 */

public class TestLifeForm {

	
	@Test
	public void testAttack()
	{
		LifeForm lf = new MockLifeForm("Bob", 40, 10);
		assertEquals(10, lf.attack());	
	}
	@Test
	public void testAttackHit()
	{
		MockLifeForm ml1 = new MockLifeForm("Bob", 40, 10);
		MockLifeForm ml2 = new MockLifeForm("John", 100, 20);
		ml2.takeHit(ml1.attack());
		assertEquals(90, ml2.currentLifePoints);
	}
	@Test
	public void testDeadAttack()
	{
		MockLifeForm ml = new MockLifeForm("Bob", 0, 10);
		assertEquals(0, ml.attack());
	}
	
	//lab 1-2 tests
	@Test
	public void testInitialization()
	{
		LifeForm entity;
		entity = new MockLifeForm("Bob", 40);
		assertEquals("Bob", entity.getName());
		assertEquals(40, entity.getCurrentLifePoints());
	}

	@Test
	public void testHit()
	{
		MockLifeForm mlf = new MockLifeForm("Bob", 40);
		mlf.takeHit(10);
		assertEquals(30, mlf.currentLifePoints);
	}
	
	@Test
	public void testHitNegative()
	{
		MockLifeForm mlf = new MockLifeForm("Bob", 40);
		mlf.takeHit(50);
		assertEquals(0, mlf.currentLifePoints);
	}
	@Test
	public void testHitToZero()
	{
		MockLifeForm mlf = new MockLifeForm("Bob", 40);
		mlf.takeHit(40);
		assertEquals(0, mlf.currentLifePoints);
	}
	@Test
	public void testHitAtZero()
	{
		MockLifeForm mlf = new MockLifeForm("Bob", 0);
		mlf.takeHit(40);
		assertEquals(0, mlf.currentLifePoints);
	}
}
