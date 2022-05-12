
public class Wizard extends Character {


    public Wizard(String name) {
        super(name);
    };

    public void MagicMarks(Character enemyCharacter) {
        System.out.println(super.characterName  + "attacks" + enemyCharacter.characterName  + "with Magic Marks(Damage - 50)");
        int damagePoints = 50;
        int Mana_decrease = 60;
        damageTarget(enemyCharacter, damagePoints, Mana_decrease);
    };
    public static void recover(Character character) {
       recovering(character); 
    }

}
