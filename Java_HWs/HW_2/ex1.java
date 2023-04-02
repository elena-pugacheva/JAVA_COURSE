// Дана json строка { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}}
// Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика. 
// Студент Краснов получил 5 по предмету Физика. 
// Используйте StringBuilder для подготовки ответа


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.*;


public class ex1 {
   public static void main(String[] args) throws IOException {
      String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
            "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
      Logger logger = Logger.getLogger(ex1.class.getName());
      logger.setLevel(Level.INFO);
      FileHandler fileHandler = new FileHandler("log.txt");
      logger.addHandler(fileHandler);
      SimpleFormatter sFormat = new SimpleFormatter();
      fileHandler.setFormatter(sFormat);
      logger.log(Level.WARNING, "Тестовое логирование");
      logger.info("Тестовое логирование");

      String filePath = "students.txt";
      String str = Parse(jsonString);
      WriteToFile(str,filePath);
   }

   public static String Parse(String jsonString) {
      StringBuilder result = new StringBuilder();
      jsonString = jsonString.substring(1, jsonString.length() - 1);
      String[] objects = jsonString.split("},");

      for (String object : objects) {
         object = object.replace("{", "").replace("{", "");
         String[] properties = object.split(",");

         String surname = properties[0].split(":")[1].replace("\"", "");
         String grade = properties[1].split(":")[1].replace("\"", "");
         String subject = properties[2].split(":")[1].replace("\"", "");
         result.append("Студент ").append(surname).append(" получил ").append(grade).append(" по предмету ")
               .append(subject).append(".\n");
      }
      String str = result.toString();
      return str;
   }
   public static void WriteToFile(String s, String filePath){
      File file = new File(filePath);
      if (file.exists()) {
         try {
            file.createNewFile();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }

      try (FileWriter writer = new FileWriter(filePath, false)) {
         writer.write(s);
         Logger.getAnonymousLogger();
         writer.flush();

      } catch (Exception e) {
         e.printStackTrace();
         Logger.getAnonymousLogger();
      }
   }
}






