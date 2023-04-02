public class Main {
    public static void main(String[] args) {
        Griffendor[] griffendors = {
                new Griffendor("Harry", "Potter", 65, 40, 88, 92, 98),
                new Griffendor("Germiona", "Greindjer", 71, 79, 64, 74, 85),
                new Griffendor("Ron", "Yuizly", 59, 34, 76, 70, 50)
        };

        Slizerin[] slizerins = {
                new Slizerin("Drako", "Malfoi", 72, 70, 81, 60, 89, 75, 95),
                new Slizerin("Gregxem", "Montegu", 64, 40, 61, 65, 80, 71, 74),
                new Slizerin("Gregory", "Goil", 65, 43, 65, 71, 70, 56, 81),
        };

        Puffendui[] puffenduis = {
                new Puffendui("Zaxaria", "Smith", 70, 43, 78, 73, 65),
                new Puffendui("Sedrick", "Diggory", 81, 61, 77, 77, 74),
                new Puffendui("Justin", "Finch-Fletchli", 51, 41, 69, 88, 84)
        };

        Kogtevran[] kogtevrans = {
                new Kogtevran("Chjou", "Chang", 49, 59, 69, 66, 56, 80),
                new Kogtevran("Padma", "Patil", 43, 49, 88, 76, 46, 60),
                new Kogtevran("Markus", "Belbi", 63, 69, 70, 57, 93, 83)
        };

        PrintService printService = new PrintService();
        printService.print(slizerins[0]); // описание студента
        Griffendor.betterStudent(griffendors[0], griffendors[1]); // сравнение студентов одного факультета
        Puffendui.betterStudent(puffenduis[0], puffenduis[1]); // сравнение студентов одного факультета
        Kogtevran.betterStudent(kogtevrans[0], kogtevrans[1]); // сравнение студентов одного факультета
        Slizerin.betterStudent(slizerins[0], slizerins[1]); // сравнение студентов одного факультета
        printService.studentComparison(griffendors[0], slizerins[0]); // сравнение студентов по мощности в магии и длине трансгрессии
    }
}