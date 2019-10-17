import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Main {

    private static Object Date;

    public static void main(String[] args) {
//1 способ int to string//
        System.out.println(inttostring(4123));
//2 способ int to string//
        System.out.println(Integer.toString(5654));
//1 способ string to int//
        int x = Integer.valueOf("1234");
        int s = x + 5;
        System.out.println(s);
//2 способ string to int//
        int y = Integer.parseInt("345");
        int d = y + 3;
        System.out.println(d);
//четность числа//
        System.out.println(evenNumber(4));
////окончание на 7//
        System.out.println(endWith7(1787));
//определение символа в строке//
        System.out.println(symbol("how are you", 'z'));
//часы в минуты и секунды//
        System.out.println(hoursToMinAndSec(3));
//секунды в дни, часы, минут и секунды//
        System.out.println(secondsToDaysHoursMinSeconds(45089));
// изменение регистра //
        System.out.println(charDance("asdfgghjg"));
//вычисление площади и длины круга//
        System.out.println(circlePar(45.1));
// закрывает ли круг отверстие//
        System.out.println(hole(-5, 5, 6));
//вычисление возраста (работает плохо, на все месяцы имеющие номер больше текущего выдает отрицательные значения, не правильно показывает день)//
        System.out.println(birthday(1995, 1, 18));
    }


    public static int inttostring(int a) {
        return a;

    }


    public static boolean evenNumber(int a) {
        return (a % 2 == 0);
    }

    public static boolean endWith7(int number) {
        if (number % 10 != 7) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean symbol(String a, char c) {
        if (a.indexOf(c) != -1) {
            return true;
        } else {
            return false;
        }
    }


    public static String hoursToMinAndSec(int hours) {
        int minutes = hours * 60;
        int seconds = hours * 3600;
        String res = minutes + " минут " + seconds + " секунд";
        return res;
    }

    public static String secondsToDaysHoursMinSeconds(int sec) {
        int day = (int) TimeUnit.SECONDS.toDays(sec);
        long hours = TimeUnit.SECONDS.toHours(sec) - (day * 24);
        long minute = TimeUnit.SECONDS.toMinutes(sec) - (TimeUnit.SECONDS.toHours(sec) * 60);
        long second = TimeUnit.SECONDS.toSeconds(sec) - (TimeUnit.SECONDS.toMinutes(sec) * 60);
        String res = day + " д. " + hours + " ч. " + minute + " мин." + second + " сек";
        return res;
    }

    public static String charDance(String s) {
        char[] chars = s.toCharArray();
        String rez = "";
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                s = "" + chars[i];
                rez = rez + s.toUpperCase();
            } else {
                s = "" + chars[i];
                rez = rez + s.toLowerCase();
            }
        }
        return rez;

    }

    public static String circlePar(double r) {
        double square = Math.PI * r * r;
        double lenght = 2 * Math.PI * r;
        String result = square + " Площадь окружности " + lenght + " Длина окружности";
        return result;
    }

    public static boolean hole(double r, double a, double b) {
        double circleSquare = Math.PI * r * r;
        double hole = a * b;
        if (hole < circleSquare && hole > 0 && r > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String birthday(int year, int month, int day) {
        LocalDate bday = LocalDate.of(year, month, day);
        Period bdayrezult = Period.between(bday, LocalDate.now());
        return "You are " + bdayrezult.getYears() + " years " + bdayrezult.getMonths() + " months " + bdayrezult.getDays() + " days";
        //LocalDate date = LocalDate.now();
        //int Month = date.getMonthValue();
        //int Year = date.getYear();
        //int Day = date.getDayOfMonth();
        //int bdYear = Year - year;
        //int bdMonth = Month - month;
        //int bdDay = Day - day;
        //String result = "" + bdYear + " years " + bdMonth + " month " + bdDay + " days";

        //if (bdMonth > month) {
          //  bdMonth++;
        //} else if (month > Month) {

          //  if (bdDay > Day) {
            //    bdMonth++;
            //}
        //}
        //return result;
    }
}


