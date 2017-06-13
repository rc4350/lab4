package weapon;

public interface Weapon
{
	public int damage(int distance);
	public void reload();
	public int getBaseDamage();
	public int getMaxRange();
	public int getRateOfFire();
	public int getMaxAmmo();
	public int getActualAmmo();
	public boolean checkRange(int distance);
}
