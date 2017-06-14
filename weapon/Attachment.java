package weapon;

import exceptions.MyNewException;

public abstract class Attachment implements Weapon
{
	protected Weapon baseWeapon;
	
	public Attachment(Weapon wpn) throws MyNewException
	{
		if(wpn.getAttachmentCount() >= 2)
		{
			throw new MyNewException();
		}
		else
		baseWeapon = wpn;
		baseWeapon.increaseAttachmentCount();
		
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
		return baseWeapon.damage(distance);
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
		baseWeapon.reload();
	}
	/**
	 * calls baseWeapon.updateTime
	 */
	@Override
	public void updateTime(int time)
	{
		baseWeapon.updateTime(time);
		
	}
	/**
	 *  get's base weapon attachment count
	 */
	@Override
	public int getAttachmentCount()
	{
		return baseWeapon.getAttachmentCount();
	}
	/**
	 * increase base weapon's attachment count
	 */
	@Override
	public void increaseAttachmentCount()
	{
		baseWeapon.increaseAttachmentCount();
	}
	
}
