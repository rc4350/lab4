package weapon;

/**
 * PlasmaCannon class
 *
 */
public class PlasmaCannon extends GenericWeapon
{
	
	/**
	 * PlasmaCannon constructor set the values for PlasmaCannon
	 */
	public PlasmaCannon()
	{
		super(10, 25, 2,10);
	}
	
	/**
	 * damage
	 * Damage for Plasma Cannon
	 * @param distance
	 */
	@Override
	public int damage(int distance)
	{
		if(super.checkRange(distance) == true && super.actualAmmo > 0)
		{
			int dam;
			dam = (int)((float)super.baseDamage * ((float)super.actualAmmo / super.maxAmmo));
			super.actualAmmo--;
			return dam;
		}
		else  
			return 0;
		}
	}
	
