package weapon;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGenericWeapon
{

	@Test
	public void testConstruct()
	{
		GenericWeapon gw = new MockWeapon(10, 10, 10, 10);
		assertNotNull(gw);
		assertTrue(gw instanceof Weapon);
	}
	@Test
	public void testGetters()
	{
		GenericWeapon gw = new MockWeapon(10, 9, 8, 7);
		assertEquals(10,gw.getBaseDamage());
		assertEquals(9, gw.getMaxRange());
		assertEquals(8, gw.getRateOfFire());
		assertEquals(7, gw.getMaxAmmo());
		assertEquals(7, gw.getActualAmmo());
	}
	@Test
	public void testDamage()
	{
		GenericWeapon gw = new MockWeapon(10, 9, 8, 7);
		assertEquals(10, gw.damage(0));
	}
	@Test
	public void testRange()
	{
		GenericWeapon gw = new MockWeapon(10, 9, 8, 7);
		assertTrue(gw.checkRange(9));
		assertTrue(gw.checkRange(0));
		assertFalse(gw.checkRange(10));
		assertFalse(gw.checkRange(-1));
		
	}
	@Test
	public void testReload()
	{
		GenericWeapon gw = new MockWeapon(10, 9, 8, 7);
		gw.actualAmmo = 0;
		gw.reload();
		assertEquals(gw.maxAmmo, gw.actualAmmo);
		
	}
}

class MockWeapon extends GenericWeapon
{

	public MockWeapon(int i, int j, int k, int l)
	{
		super(i, j, k, l);
	}
}
