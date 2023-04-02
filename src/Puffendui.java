public class Puffendui extends Hogwarts {
    private int hardWork; // трудолюбие
    private int loyalty; // верность
    private int honesty; // честность

    Puffendui(String name, String surname, int magicPower, int transgressionLength, int hardWork, int loyalty, int honesty) {
        super(name, surname, magicPower, transgressionLength);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork <= 100 && hardWork >= 0 ? hardWork : 0;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty <= 100 && loyalty >= 0 ? loyalty : 0;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty <= 100 && honesty >= 0 ? honesty : 0;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return ", трудолюбие: " + hardWork + ", верность: " + loyalty + ", честность: " + honesty;
    }

    static void betterStudent(Puffendui firstPerson, Puffendui secondPerson) {
        if (firstPerson.equals(secondPerson)) {
            throw new IllegalArgumentException("Переданные объекты равны");
        } else {
            int sumOfFirstStudent = firstPerson.getHardWork() + firstPerson.getLoyalty() + firstPerson.getHonesty();
            int sumOfSecondStudent = secondPerson.getHardWork() + secondPerson.getLoyalty() + secondPerson.getHonesty();
            if (sumOfFirstStudent > sumOfSecondStudent) {
                System.out.println(firstPerson.getName() + " лучший Пуффендуец, чем " + secondPerson.getName());
            } else if (sumOfFirstStudent < sumOfSecondStudent) {
                System.out.println(secondPerson.getName() + " лучший Пуффендуец, чем " + firstPerson.getName());
            } else {
                System.out.println(firstPerson.getName() + " и " + secondPerson.getName() + " имеют одинаковое колличество баллов");
            }
        }
    }
}
