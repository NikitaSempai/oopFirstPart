public class Kogtevran extends Hogwarts {
    private int mind; // ум
    private int wisdom; // мудрость
    private int wit; // остроумие
    private int creation; // творчество

    Kogtevran(String name, String surname, int magicPower, int transgressionLength, int mind, int wisdom, int wit, int creation) {
        super(name, surname, magicPower, transgressionLength);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void setMind(int mind) {
        this.mind = mind <= 100 && mind >= 0 ? mind : 0;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom <= 100 && wisdom >= 0 ? wisdom : 0;
    }

    public void setWit(int wit) {
        this.wit = wit <= 100 && wit >= 0 ? wit : 0;
    }

    public void setCreation(int creation) {
        this.creation = creation <= 100 && creation >= 0 ? creation : 0;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return
                ", ум: " + mind +
                        ", мудрость: " + wisdom +
                        ", остроумие: " + wit +
                        ", творчество: " + creation;
    }

    static void betterStudent(Kogtevran firstPerson, Kogtevran secondPerson) {
        if (firstPerson.equals(secondPerson)) {
            throw new IllegalArgumentException("Переданные объекты равны");
        } else {
            int sumOfFirstStudent = firstPerson.getMind() + firstPerson.getCreation() + firstPerson.getWisdom() + firstPerson.getWit();
            int sumOfSecondStudent = secondPerson.getMind() + secondPerson.getCreation() + secondPerson.getWisdom() + secondPerson.getWit();
            if (sumOfFirstStudent > sumOfSecondStudent) {
                System.out.println(firstPerson.getName() + " лучший Когтевранец, чем " + secondPerson.getName());
            } else if (sumOfFirstStudent < sumOfSecondStudent) {
                System.out.println(secondPerson.getName() + " лучший Когтевранец, чем " + firstPerson.getName());
            } else {
                System.out.println(firstPerson.getName() + " и " + secondPerson.getName() + " имеют одинаковое колличество баллов");
            }
        }
    }
}
