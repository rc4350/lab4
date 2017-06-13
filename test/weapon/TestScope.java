package weapon;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestScope
{

	@Test
	public void testConstruct()
	{
		Pistol pl = new Pistol();
		Attachment scp = new Scope(pl);
		assertNotNull(scp);
		assertTrue(scp instanceof Attachment);
	}

	@Test
	public void testDamage()
	{
		Pistol pl = new Pistol();
		Scope scp = new Scope(pl);
		assertEquals(12, scp.damage(10));
		assertEquals(2, scp.damage(24));
		assertEquals(0, scp.damage(10));
	}
}
