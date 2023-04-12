import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        Map<String, Integer> nameCount = new HashMap<>();

        for (String employee : employees) {
            String name = employee.split(" ")[0];
            if (nameCount.containsKey(name)) {
                nameCount.put(name, nameCount.get(name) + 1);
            } else {
                nameCount.put(name, 1);
            }
        }

        Map<String, Integer> sortedNameCount = new TreeMap<>((o1, o2) -> nameCount.get(o2) - nameCount.get(o1));
        sortedNameCount.putAll(nameCount);

        for (Map.Entry<String, Integer> entry : sortedNameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
//        Map<String,Integer> map = new TreeMap<>(Collections.reverseOrder());
//
//        for (String employee : employees) {
//            if (!map.containsKey(employee)) {
//                map.put(employee, 1);
//            } else {
//                map.put(employee, map.get(employee) + 1);
//            }
//        }
//        System.out.println("Повторяющиеся имена: ");
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            String name = entry.getKey();
//            int count = entry.getValue();
//            if (count > 1) {
//                System.out.println(name + ": " + count);
//            }
//        }
//    }
//}




