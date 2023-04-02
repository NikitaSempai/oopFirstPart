public class Griffendor extends Hogwarts {
    private int nobility; // благородство
    private int honor; //честь
    private int bravery; // храбрость

    Griffendor(String name, String surname, int magicPower, int transgressionLength, int nobility, int honor, int bravery) {
        super(name, surname, magicPower, transgressionLength);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility <= 100 && nobility >= 0 ? nobility : 0;
    }

    public void setHonor(int honor) {
        this.honor = honor <= 100 && honor >= 0 ? honor : 0;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery <= 100 && bravery >= 0 ? bravery : 0;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return ", благородство=" + nobility + ", честь=" + honor + ", храбрость=" + bravery;
    }

    static void betterStudent(Griffendor firstPerson, Griffendor secondPerson) {
        if (firstPerson.equals(secondPerson)) {
            throw new IllegalArgumentException("Переданные объекты равны");
        } else {
            int sumOfFirstStudent = firstPerson.getNobility() + firstPerson.getBravery() + firstPerson.getHonor();
            int sumOfSecondStudent = secondPerson.getNobility() + secondPerson.getBravery() + secondPerson.getHonor();
            if (sumOfFirstStudent > sumOfSecondStudent) {
                System.out.println(firstPerson.getName() + " лучший Гриффиндорец, чем " + secondPerson.getName());
            } else if (sumOfFirstStudent < sumOfSecondStudent) {
                System.out.println(secondPerson.getName() + " лучший Гриффиндорец, чем " + firstPerson.getName());
            } else {
                System.out.println(firstPerson.getName() + " и " + secondPerson.getName() + " имеют одинаковое колличество баллов");
            }
        }
    }
}
