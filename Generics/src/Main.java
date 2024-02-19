public class Main {
    public static void main(String[] args) {

        // Ohne Generics
        Weapon sword = new Weapon("Sword");
        Character player1 = new Character(sword);
        // Wenn Spieler neue Waffe nimmt
        Weapon bow = new Weapon("bow");
        player1.set(bow);
        WeaponSword weaponSword = new WeaponSword();




        // Mit Generics
        Sword realSword = new Sword();
        Bow realBow = new Bow();

        Goblin<Sword> MonsieurGoblin = new Goblin<Sword>(realSword);
        Goblin<Bow> MadamGoblin = new Goblin<Bow>(realBow);

        System.out.println(MonsieurGoblin);
        System.out.println(MadamGoblin);







    }
}