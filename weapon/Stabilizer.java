package weapon;

import exceptions.MyNewException;

public class Stabilizer extends Attachment
{

	public Stabilizer(Weapon wpn) throws MyNewException
	{
		super(wpn);
	}
	
	@Override
	public int damage(int distance)
	{
		int dmg = super.baseWeapon.damage(distance);
		int moddmg = (int) ((float)dmg*1.25);
		if(super.getActualAmmo() == 0)
		{
			super.reload();
		}
		return moddmg;
	}

}
