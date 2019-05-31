package hospital;

public class Patient {

	private static final int DEFAULT_HEALTH_LEVEL = 10;

	private static final int DEFAULT_BLOOD_LEVEL = 20;

	private int bloodLevel = DEFAULT_BLOOD_LEVEL;

	private int healthLevel = DEFAULT_HEALTH_LEVEL;

	//assessors
	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public int getHealthLevel() {

		return healthLevel;
	}

	//methods
	
	public void removeBlood(int amount) {

		bloodLevel -= amount;
	}

	public void addHealth(int amount) {

		healthLevel += amount;
	}



}
