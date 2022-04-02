public class Hunter { 
	int power;
	Monster monster = new Monster(1000); 
	Hunter(int power){
		this.power = power; 
	}	
	void attack() {
		if(power>monster.hp) {
			System.out.println("kill Monster");
		}
		else { 
			int a = monster.hp - power;
			monster.hp = a;
			System.out.println("Hunter attacked Monster with a power of " + power);
			System.out.println("Monster has " + monster.hp + "hp");
		}
	}
}
