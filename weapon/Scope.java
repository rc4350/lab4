package weapon;

public class Scope extends Attachment
{

	public Scope(Weapon wpn)
	{
		super(wpn);
	
	}

	@Override
	public int damage(int distance)
	{
		int moddmg = super.baseWeapon.damage(distance);
		int dmg =(int)( (float)moddmg*(1.0+( ( (float)baseWeapon.getMaxRange()-(float)distance )/(float)baseWeapon.getMaxRange() )));
		return dmg;
		
		
		
	}
}
