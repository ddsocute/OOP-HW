import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MMORPGv2 {
    public static void main(String[] args) {
        // you cannot change the code in main method
        Adventurer a1 = new Adventurer("Ben", 15);
        Adventurer a2 = new Adventurer("Lucy", 10);
        Adventurer a3 = new Adventurer("Ted", 5);

        AdventureTeam team = new AdventureTeam();
        team.addAdventurer(a1);
        team.addAdventurer(a2);
        team.addAdventurer(a3);
        team.addAdventurer(a1);

        System.out.println("-".repeat(40));

        team = new AdventureTeam();
        team.addAdventurer(a1);
        team.addAdventurer(a2);

        MonsterGroup monsterGroup = new MonsterGroup();
        monsterGroup.addMonster(new Monster("Slime", 10));
        monsterGroup.addMonster(new Monster("Zombie", 20));
        monsterGroup.addMonster(new Monster("Goblin", 30));
        monsterGroup.addMonster(new Monster("Dragon", 57));

        monsterGroup.battle(team);
    }
}

class Adventurer {
    private String name;
    private int atk;

    public Adventurer(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }

    public void attack(Monster m) {
        System.out.printf("%s attacks: ", this.name);
        m.beAttacked(atk);
    }
}

class Monster {
    private String name;
    private int hp;
    private boolean isAlive;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void beAttacked(int damage) {
        if (hp > 0) {
            hp -= damage;
            System.out.printf("The monster %s suffers from %d point of damage\n", name, damage);

            if (hp <= 0) {
                System.out.printf("The monster %s is dead.\n", name);
                this.isAlive = false;
            }
        } else {
            System.out.printf("The monster %s is dead.\n", name);
        }
    }
}

class AdventureTeam {
    private Adventurer[] adventurers; // at most 3 adventurers
    private int addIndex;
    private int errorCount = 0;
    // implement one constructor and two methods.
    public AdventureTeam() {
        adventurers = new Adventurer[2];
        addIndex = 0;
    }

    public void addAdventurer(Adventurer a) {
        try {
            adventurers[addIndex] = a;
            addIndex++;
        } catch (ArrayIndexOutOfBoundsException e) {
            if (errorCount == 0){
                System.out.println("Index 3 out of bounds for length 3 The team is full, so we can't add new adventurers.");
            }
            errorCount += 1;
        }
    }

    public void teamAttack(Monster m) {

        for (Adventurer adventurer : adventurers) {
            if (m.isAlive()) {
                adventurer.attack(m);
            }
        }
    }
}

class MonsterGroup {
    // The monster group does not limit the maximum number of monsters
    private ArrayList<Monster> monsters = new ArrayList<>();

    // implement two methods.
    public void addMonster(Monster m) {
        monsters.add(m);
    }

    public void battle(AdventureTeam aTeam) {
        for (int i = 0; i < monsters.size(); i++) {
            Monster m = monsters.get(i);
            System.out.printf("    The %s round starts. The monster is \"%s\"\n", i + 1, m.getName());
            while (m.isAlive()) {
                aTeam.teamAttack(m);
            }
            System.out.printf("    The %s round ends\n", i + 1);
            System.out.println("-".repeat(40));
        }
    }
}
