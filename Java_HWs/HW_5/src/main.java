public class main {
    public static void main(String[] args){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson("Иван Иванов", "123-45-67");
        phoneBook.addPerson("Иван Иванов", "890-12-34");
        phoneBook.addPerson("Петр Петров", "555-55-55");
        phoneBook.addPerson("Мария Миронова", "777-55-55");
        phoneBook.addPerson("Дмитрий Дмитриев", "555-77-55");
        phoneBook.addPerson("Дмитрий Дмитриев", "555-77-88");

        System.out.println(phoneBook.getPhoneNumbers("Иван Иванов")); // [123-45-67, 890-12-34]
        System.out.println(phoneBook.getPhoneNumbers("Петр Петров")); // [555-55-55]
        System.out.println(phoneBook.getPhoneNumbers("Сергей Сергеев")); // null
        System.out.println(phoneBook.getPhoneNumbers("Дмитрий Дмитриев"));

        phoneBook.printAll();

    }
}
