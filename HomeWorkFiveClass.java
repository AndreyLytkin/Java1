package HW5;

public class HomeWorkFiveClass {

    public static void main(String[] args) {

        EmployeeClass mainEmployee = new EmployeeClass("Александр", "Валерьевич",
                "Гладков", "8(495)000-11-22",
                "Test Manager", 80000, 1986);

        EmployeeClass[] office = {
                mainEmployee,
                new EmployeeClass("Андрей", "Андреевич",
                        "Андреев", "8(495)111-22-33",
                        "project owner", 520000, 1973),
                new EmployeeClass("Евгений", "Евгеньевич",
                        "Евгеньев", "8(495)222-33-44",
                        "project manager", 40000, 1963),
                new EmployeeClass("Наталья", "Натальевна",
                        "Натальева", "8(495)333-44-55",
                        "senior developer", 90000, 1990),
                new EmployeeClass("Тетенька", "Тетеньковна",
                        "Тетенькова", "8(495)444-55-66",
                        "engineer", 50000, 1983)
        };

        getAllPersonsInOffice(office);
        System.out.println("***************");
        getOldPerson(office, 40);
    }

    private static void getOldPerson(EmployeeClass[] office, int year) {
        for (int i = 0; i < office.length; i++)
            if (office[i].getAge() > year) {
                System.out.println(office[i].getFullInfo());
            }
    }

    private static void getAllPersonsInOffice(EmployeeClass[] office) {
        System.out.println("All person: ");
        for (int i = 0; i < office.length; i++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }
}
