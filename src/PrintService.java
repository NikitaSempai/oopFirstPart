public class PrintService {
    private String facultyName;

    public void print(Hogwarts person) {
        facultyName = person instanceof Griffendor ? "Гриффиндор" : facultyName;
        facultyName = person instanceof Slizerin ? "Слизерин" : facultyName;
        facultyName = person instanceof Puffendui ? "Пуффендуй" : facultyName;
        facultyName = person instanceof Kogtevran ? "Когтевран" : facultyName;
        System.out.println(
                "Название факультета: " + facultyName + "\n" +
                        "Имя: " + person.getName() +
                        ", Фамилия: " + person.getSurname() +
                        ", Мощность магии: " + person.getMagicPower() +
                        ", Длина трнасгрессии: " + person.getTransgressionLength() + person);
    }

    public void studentComparison(Hogwarts firstPerson, Hogwarts secondPerson) {
        if (firstPerson.equals(secondPerson)) {
            throw new IllegalArgumentException("Переданные объекты равны");
        } else {
            if (firstPerson.getTransgressionLength() > secondPerson.getTransgressionLength()) {
                System.out.println(firstPerson.getName() + " обладает большей длиной трансгрессии, чем " + secondPerson.getName());
            } else if (firstPerson.getTransgressionLength() < secondPerson.getTransgressionLength()) {
                System.out.println(secondPerson.getName() + " обладает большей длиной трансгрессии, чем " + firstPerson.getName());
            } else {
                System.out.println(firstPerson.getName() + " и " + secondPerson.getName() + " обладают одинаковой длиной трансгрессии");
            }
            if (firstPerson.getMagicPower() > secondPerson.getMagicPower()) {
                System.out.println(firstPerson.getName() + " обладает большей мощностью магии, чем " + secondPerson.getName());
            } else if (firstPerson.getMagicPower() < secondPerson.getMagicPower()) {
                System.out.println(secondPerson.getName() + " обладает большей мощностью магии, чем " + firstPerson.getName());
            } else {
                System.out.println(firstPerson.getName() + " и " + secondPerson.getName() + " обладают одинаковой мощностью магии");
            }
        }

    }
}
