class Droid extends Character {

    public Droid(int age, String name, String weapon) {
        super.age = age;
        super.name = name;
        super.weapon = weapon;

    }

    @Override
    public void action() {
        System.out.println("Droid uses " + weapon + ".");
    }
}
