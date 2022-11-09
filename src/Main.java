import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        Date date;
        try (Scanner scanner = new Scanner(System.in)) {
            int day = 0, month = 0, year = 0;
            for (int i = 0; i < 3; i++) {

                switch (i) {
                    case (0):
                        System.out.print("Введите год (ГГГГ): ");
                        if (scanner.hasNextInt()) {
                            year = (scanner.nextInt() - 1900);
                        }
                        break;
                    case (1):
                        System.out.print("Введите месяц (ММ): ");
                        if (scanner.hasNextInt()) {
                            month = (scanner.nextInt() - 1);
                        }
                        break;
                    case (2):
                        System.out.print("Введите день (ДД): ");
                        if (scanner.hasNextInt()) {
                            day = scanner.nextInt();
                        }
                        break;
                    default:
                        break;
                }
            }
            date = new Date(year, month, day);
// Задаем филтры отображения даты
            String pattern1 = "EEEE";
// Задаем Язык и страну отображения даты
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1, new Locale("en", "EN"));
// Создаем строку и передадим в нее сегодняшнюю дату с заданными форматированиями
            String date1New = simpleDateFormat1.format(date);
// Выводим на консоль.
            System.out.println("вывод на консоль названия дня недели по введенной дате: " + date1New);

//____________________________________________________
//2.1 по сегодняшней дате
        System.out.println("\nЗадание №2.1");

            Date date1 = new Date();
            long j = (date1.getTime() + (24 * 60 * 60 * 1000)); // для сегодняшной даты

            for (int i = 0; i < 7; i++) {
                j += ((24 * 60 * 60 * 1000));
                date1.setTime(j);
                String tuesday = "Tuesday";
                String pattern5 = "EEEE";
                SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(pattern5, new Locale("en", "EN"));
                String date5n = simpleDateFormat5.format(date1);
                if (date5n.equals(tuesday)) {
                    String pattern5New = "dd MM yyyy";
                    SimpleDateFormat simpleDateFormat5New = new SimpleDateFormat(pattern5New, new Locale("en", "EN"));
                    String date5New = simpleDateFormat5New.format(date1);
                    System.out.println("Дата следующего вторника: " + date5New + " (ДД.ММ.ГГГГ)");

                }
            }
//_____________________________________________________________________________________

//2.2 По введенной дате
            System.out.println("\nЗадание №2.2");
        j = date.getTime();
        for (int i = 0; i < 14; i++) {
            j += ((24 * 60 * 60 * 1000));
            date.setTime(j);
            String tuesday = "Tuesday";
            String pattern2 = "EEEE";
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2, new Locale("en", "EN"));
            String date2S = simpleDateFormat2.format(date);
            if (date2S.equals(tuesday)) {
                String pattern2New = "dd MM yyyy";
                SimpleDateFormat simpleDateFormat2New = new SimpleDateFormat(pattern2New, new Locale("en", "EN"));
                String date2New = simpleDateFormat2New.format(date);
                System.out.println("Дата следующего вторника (с введенной даты) : " + date2New + " (ДД.ММ.ГГГГ)");
                break;
            }
        }

//___________________________________________________________________
//3 Задание.
            System.out.println("\nЗадание №3");

            System.out.print("Введите 1 для использования интерффейса: ");
            if (scanner.nextInt() == 1){
                System.out.println("Какое слово перевернуть?: ");
                String liters = scanner.next();
                FunInter<String> funInter = funInterLiters -> {
                    StringBuilder stringBuilder = new StringBuilder(funInterLiters);
                    stringBuilder.reverse();
                };
                funInter.FunIn(liters);
                System.out.println(funInter);
            }
        }
    }
}