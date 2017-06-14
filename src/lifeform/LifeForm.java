package lifeform;
/**
 * 
 * Keeps track of the information associated with a simple life form.
 * Also provides the functionality related to the life form
 *@author Ryan Campbell
 */
public class LifeForm {

	protected String myName;
	protected int currentLifePoints;
	protected int attackPoints;
	/**
	 * create an instance
	 * 
	 * @param name the name of the life form
	 * @param points the current starting life points of the life form
	 * @param ap 
	 */
	public LifeForm(String name, int hp) 
	{
		// TODO Auto-generated constructor stub
		myName = name;
		currentLifePoints = hp;
		if(currentLifePoints < 0)
		{
			currentLifePoints = 0;
		}
	}
	public LifeForm(String name, int hp, int ap)
	{
		this(name, hp);
		attackPoints = ap;
	}
	/**
	 * 
	 * @return the name of the life form.
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return myName;
	}
	/**
	 * 
	 * @return the amount of current life points the life form has.
	 */
	public int getCurrentLifePoints() {
		// TODO Auto-generated method stub
		return currentLifePoints;
	}
	/**
	 * reduces current life points by the damage amount
	 * @param damage amount to reduce current life points
	 */
	public void takeHit(int damage)
	{
		currentLifePoints -= damage;
		if (currentLifePoints < 0)
		{
			currentLifePoints = 0;
		}
	}
	public int attack()
	{
		if (currentLifePoints == 0)
		{
			return 0;
		}
		// TODO Auto-generated method stub
		else
			return attackPoints;
	}
	protected void setAttackPoints(int sap)
	{
		attackPoints = sap;
	}
}
