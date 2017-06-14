package weapon;

import exceptions.MyNewException;

public class Scope extends Attachment
{

	public Scope(Weapon wpn) throws MyNewException
	{
		super(wpn);
	
	}

	@Override
	public int damage(int distance)
	{
		int dmg = super.baseWeapon.damage(distance);
		int moddmg =(int)( (float)dmg*(1.0+( ( (float)baseWeapon.getMaxRange()-(float)distance )/(float)baseWeapon.getMaxRange() )));
		return moddmg;
		
		
		
	}
}