package weapon;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStabilizer
{

	@Test
	public void testConstruct()
	{
		Pistol pl = new Pistol();
		Attachment stb = new Stabilizer(pl);
		assertNotNull(stb);
		assertTrue(stb instanceof Attachment);
	}
	
	@Test
	public void testDamage()
	{
		Pistol pl = new Pistol();
		Stabilizer stb = new Stabilizer(pl);
		
		assertEquals(10, stb.damage(10));
		assertEquals(5, stb.damage(20));
		assertEquals(0, stb.damage(10));
	}
	@Test
	public void testAutoReload()
	{
		Pistol pl = new Pistol();
		Stabilizer stb = new Stabilizer(pl);
		pl.actualAmmo = 1;
		stb.damage(10);
		assertEquals(stb.getMaxAmmo(), stb.getActualAmmo());
	}
}
