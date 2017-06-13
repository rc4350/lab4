package weapon;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlasmaCannon {

	/**
	 * Weapons need to do the correct amount of damage based 
	 * on the range of the target.
	 */
	@Test
	public void testPlasmaCannonDamage() 
	{
		PlasmaCannon pc = new PlasmaCannon();
		assertNotNull(pc);
		assertTrue(pc instanceof GenericWeapon);
		//pc.damage(1);
		
		// damage = baseDamage * (actualAmmo / maxAmmo)
		// damage = 50*(4/4) = 50 
		
		//assertEquals(50,pc.getDamage());
	}
	
	/**
	 * Weapons fired at targets too far away do 0 damage 
	 * as do weapons that have no ammo.
	 */
	@Test
	public void testZeroDamage()
	{
		PlasmaCannon pc = new PlasmaCannon();
		
		// target too far than max range
		//pc.damage(26);	
		assertEquals(0,pc.damage(26));
		
		//weapon that have not ammo
		//pc.setActualAmmo(0);
		//pc.damage(1);
		assertEquals(0,pc.damage(-1));
		
	}
	
	/**
	 * Weapons need to update ammo correctly when fired, 
	 * even if fired at a target too far away.
	 */
	@Test
	public void testUpdateAmmo()
	{
		PlasmaCannon pc = new PlasmaCannon();
		// without fire
		assertEquals(4, pc.getActualAmmo());
		// first fire
		pc.damage(1);	
		assertEquals(3, pc.getActualAmmo());
		//second fire
		pc.damage(2);
		assertEquals(2, pc.getActualAmmo());
		//third fire and target too far away
		pc.damage(26);
		assertEquals(1, pc.getActualAmmo());
				
	}
	
	/**
	 * testReloaded
	 * Weapons can be reloaded.
	 */
	@Test
	public void testReloaded()
	{
		PlasmaCannon pc = new PlasmaCannon();
		
		// fire PlasmaCannon 4 times and actualAmmo should be 6
		pc.damage(1);
		pc.damage(1);
		pc.damage(1);
		pc.damage(1);
		assertEquals(0, pc.getActualAmmo());
		
		//reload pc
		pc.reload();
		assertEquals(pc.getMaxRange(), pc.getActualAmmo());
		
	}
	

}
