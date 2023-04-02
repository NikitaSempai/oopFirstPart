public class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int transgressionLength;

    public Hogwarts(String name, String surname, int magicPower, int transgressionLength) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgressionLength = transgressionLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower <= 100 && magicPower >= 0 ? magicPower : 0;
    }

    public void setTransgressionLength(int transgressionLength) {
        this.transgressionLength = transgressionLength <= 100 && transgressionLength >= 0 ? transgressionLength : 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionLength() {
        return transgressionLength;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Фамилия: " + surname + ", Мощность магии: " + magicPower + ", Длина трансгрессии: " + transgressionLength;
    }
}
