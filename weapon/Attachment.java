package weapon;

public abstract class Attachment implements Weapon
{
	protected Weapon baseWeapon;
	
	public Attachment(Weapon wpn)
	{
		baseWeapon = wpn;
	}
	/**
	 * returns value baseDamage
	 */
	@Override
	public int getBaseDamage()
	{
		return baseWeapon.getBaseDamage();
	}
	/**
	 * return value of maxRange
	 */
	@Override
	public int getMaxRange()
	{
		return baseWeapon.getMaxRange();
	}
	/**
	 * returns value of rateOfFire
	 */
	@Override
	public int getRateOfFire()
	{
		return baseWeapon.getRateOfFire();
	}
	/**
	 * returns value of maxAmmo
	 */
	@Override
	public int getMaxAmmo()
	{
		return baseWeapon.getMaxAmmo();
	}
	/**
	 * returns value of actualAmmo
	 */
	@Override
	public int getActualAmmo()
	{
		return baseWeapon.getActualAmmo();
	}
	@Override
	/**
	 * abstract class will return damage as baseDamage
	 * will not check range as method will be overridden in subclasses
	 * so behavior will not be used
	 */
	public int damage(int distance)
	{
		return 0;
	}
	/**
	 * checks that distance is valid and less than max range
	 */
	@Override
	public boolean checkRange(int distance)
	{
		return baseWeapon.checkRange(distance);
	}
	/**
	 * resets actualAmmo to maxAmmo
	 */
	@Override
	public void reload()
	{
			
	}
	@Override
	public void updateTime(int time)
	{
		baseWeapon.updateTime(time);
		
	}
}
