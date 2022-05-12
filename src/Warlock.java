
public class Warlock extends Character {

    public Warlock(String name) {
        super(name);
    }

    public void StormAxe(Character enemyCharacter) {
        System.out.println(super.characterName + "attacks" + enemyCharacter.characterName + "with Storm Axe(Damage - 50) ");
        int damagePoints = 50;
        int manaLost = 40;
        damageTarget(enemyCharacter, damagePoints, manaLost);

    };

    public static void recover(Character character) {
        recovering(character);
    }

}
