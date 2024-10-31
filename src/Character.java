abstract class Character {
    public int age;
    public String name;
    public String weapon;

    public void action() {}

    public final void showTraits() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weapon: " + weapon);
    }


}
