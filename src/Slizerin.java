public class Slizerin extends Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти

    Slizerin(String name, String surname, int magicPower, int transgressionLength, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magicPower, transgressionLength);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning <= 100 && cunning >= 0 ? cunning : 0;
    }

    public void setDetermination(int determination) {
        this.determination = determination <= 100 && determination >= 0 ? determination : 0;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition <= 100 && ambition >= 0 ? ambition : 0;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness <= 100 && resourcefulness >= 0 ? resourcefulness : 0;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower <= 100 && lustForPower >= 0 ? lustForPower : 0;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return
                ", хитрость: " + cunning +
                        ", решительность: " + determination +
                        ", амбициозность: " + ambition +
                        ", находчивость: " + resourcefulness +
                        ", жажда власти: " + lustForPower;
    }

    static void betterStudent(Slizerin firstPerson, Slizerin secondPerson) {
        if (firstPerson.equals(secondPerson)) {
            throw new IllegalArgumentException("Переданные объекты равны");
        } else {
            int sumOfFirstStudent = firstPerson.getAmbition() + firstPerson.getCunning() + firstPerson.getDetermination() + firstPerson.getResourcefulness() + firstPerson.getLustForPower();
            int sumOfSecondStudent = secondPerson.getAmbition() + secondPerson.getCunning() + secondPerson.getDetermination() + secondPerson.getResourcefulness() + secondPerson.getLustForPower();
            if (sumOfFirstStudent > sumOfSecondStudent) {
                System.out.println(firstPerson.getName() + " лучший Слизаренец, чем " + secondPerson.getName());
            } else if (sumOfFirstStudent < sumOfSecondStudent) {
                System.out.println(secondPerson.getName() + " лучший Слизаренец, чем " + firstPerson.getName());
            } else {
                System.out.println(firstPerson.getName() + " и " + secondPerson.getName() + " имеют одинаковое колличество баллов");
            }
        }
    }
}
