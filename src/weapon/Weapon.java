package weapon;

import gameplay.TimeObserver;

public interface Weapon extends TimeObserver
{
	public int damage(int distance);
	public void reload();
	public int getBaseDamage();
	public int getMaxRange();
	public int getRateOfFire();
	public int getMaxAmmo();
	public int getActualAmmo();
	public boolean checkRange(int distance);
	public int getAttachmentCount();
	public void increaseAttachmentCount();
}
