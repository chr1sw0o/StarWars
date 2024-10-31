class Jedi extends Character {

    public Jedi(int age, String name, String weapon) {
        super.age = age;
        super.name = name;
        super.weapon = weapon;

    }

    @Override
    public void action() {
        System.out.println("Jedi uses " + weapon + ".");
    }
}
