package weapon;

public abstract class GenericWeapon implements Weapon
{
	protected int baseDamage;
	protected int maxRange;
	protected int rateOfFire;
	protected int maxAmmo;
	protected int actualAmmo;
	protected int round;
	protected int fired;
	
	public GenericWeapon(int bd, int rng, int rof, int ammo)
	{
		baseDamage = bd;
		maxRange = rng;
		rateOfFire = rof;
		maxAmmo = ammo;
		actualAmmo = ammo;
		round = 0;
		fired = 0;
	}
	/**
	 * returns value baseDamage
	 */
	@Override
	public int getBaseDamage()
	{
		return baseDamage;
	}
	/**
	 * return value of maxRange
	 */
	@Override
	public int getMaxRange()
	{
		return maxRange;
	}
	/**
	 * returns value of rateOfFire
	 */
	@Override
	public int getRateOfFire()
	{
		return rateOfFire;
	}
	/**
	 * returns value of maxAmmo
	 */
	@Override
	public int getMaxAmmo()
	{
		return maxAmmo;
	}
	/**
	 * returns value of actualAmmo
	 */
	@Override
	public int getActualAmmo()
	{
		return actualAmmo;
	}
	@Override
	/**
	 * abstract class will return damage as baseDamage
	 * will not check range as method will be overridden in subclasses
	 * so behavior will not be used
	 */
	public int damage(int distance)
	{
		return baseDamage;
	}
	/**
	 * checks that distance is valid and less than max range
	 */
	@Override
	public boolean checkRange(int distance)
	{
		if (distance <0 || distance > maxRange)
		{
			return false;
		}
		else
			return true;
	}
	/**
	 * checks if number of times fired in round has exceeded rate of fire
	 * @return true if able to fire
	 */
	public boolean rofCheck()
	{
		if (fired < rateOfFire)
		{
			return true;
		}
		else
			return false;
	}
	/**
	 * resets actualAmmo to maxAmmo
	 */
	@Override
	public void reload()
	{
		actualAmmo = maxAmmo;		
	}
	
	@Override
	public void updateTime(int time)
	{
		round = time;
		fired = 0;
	}

}
