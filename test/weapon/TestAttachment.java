package weapon;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAttachment
{

	@Test
	public void testConstruct()
	{
		Pistol pl = new Pistol();
		Attachment at = new MockAttachment(pl);
		assertNotNull(at);
		assertEquals(pl, at.baseWeapon);
		
	}
	@Test
	public void testGetters()
	{
		Pistol pl = new Pistol();
		Attachment at = new MockAttachment(pl);
		assertEquals(pl.getBaseDamage(),at.getBaseDamage());
		assertEquals(pl.getMaxRange(), at.getMaxRange());
		assertEquals(pl.getRateOfFire(), at.getRateOfFire());
		assertEquals(pl.getMaxAmmo(), at.getMaxAmmo());
		assertEquals(pl.getActualAmmo(), at.getActualAmmo());
	}
	@Test
	public void testRange()
	{
		Pistol pl = new Pistol();
		Attachment at = new MockAttachment(pl);
		assertTrue(at.checkRange(25));
		assertFalse(at.checkRange(26));
	}

}

class MockAttachment extends Attachment
{
	public MockAttachment(Weapon wpn)
	{
		super(wpn);
	}

}