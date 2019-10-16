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
        print(String.valueOf(inttostring(4123)));
//2 способ int to string//
        print(String.valueOf(Integer.toString(5654)));
//1 способ string to int//
        int x = Integer.valueOf(stringtoint("1234"));
        int s = x + 5;
        System.out.println(s);
//2 способ string to int//
        int y = Integer.parseInt(stringtoint("345"));
        int d = y + 3;
        System.out.println(d);
//четность числа//
        System.out.println(evennumber(4));
////окончание на 7//
        System.out.println(number7(1787));
//определение символа в строке//
        System.out.println(symbol("you are happy"));
//часы в минуты и секунды//
        print(minsec(3));
//секунды в дни, часы, минут и секунды//
        print(dayshoursmin(45089));
// изменение регистра //
        print(chardance("asdfgghjg"));
//вычисление площади и длины круга//
        print(circlepar(45.1));
// закрывает ли круг отверстие//
        System.out.println(hole(-5, 5, 6));
//вычисление возраста (работает плохо, на все месяцы имеющие номер больше текущего выдает отрицательные значения, не правильно показывает день)//
        System.out.println(birthday2(1995,1,18));
    }


    public static void print(String s) {
        System.out.println(s);

    }

    public static int inttostring(int a) {
        return a;

    }

    public static String stringtoint(String b) {

        return b;
    }

    public static boolean evennumber(int a) {
        return (a % 2 == 0);
    }

    public static boolean number7(int number) {
        if (number % 10 != 7) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean symbol(String a) {
        boolean contein = stringtoint(a).contains("r");
        return contein;

    }

    public static String minsec(int hours) {
        int minutes = hours * 60;
        int seconds = hours * 3600;
        String res = minutes + " минут " + seconds + " секунд";
        return res;
    }

    public static String dayshoursmin(int sec) {
        int day = (int) TimeUnit.SECONDS.toDays(sec);
        long hours = TimeUnit.SECONDS.toHours(sec) - (day * 24);
        long minute = TimeUnit.SECONDS.toMinutes(sec) - (TimeUnit.SECONDS.toHours(sec) * 60);
        long second = TimeUnit.SECONDS.toSeconds(sec) - (TimeUnit.SECONDS.toMinutes(sec) * 60);
        String res = day + " д. " + hours + " ч. " + minute + " мин." + second + " сек";
        return res;
    }

    // НЕПОНЯТНО //
    public static String chardance(String s) {
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

    public static String circlepar(double r) {
        double square = 3.14 * r * r;
        double lenght = 2 * 3.14 * r;
        String result = square + " Площадь окружности " + lenght + " Длина окружности";
        return result;
    }

    public static boolean hole(double r, double a, double b) {
        double circlesquare = 3.14 * r * r;
        double hole = a * b;
        if (hole < circlesquare && hole>0){
            return true;
        }else{
            return false;
        }
    }

    public static String birthday2 (int year, int month, int day){
    Date now = new Date();
    int nowMonth = now.getMonth()+1;
    int nowYear = now.getYear()+1900;
    int nowDay1  = now.getDay() - day;
    int resultYear = nowYear - year;
    int resultMonth = nowMonth - month;
    String result = "" + resultYear + " years " + resultMonth + " month " + nowDay1 + " days";

    if (month > nowMonth) {
        resultYear --;
    }
    else if (month > nowMonth){
        int nowDay = now.getDate();

        if (day > nowDay)  {
            resultMonth--;
        }
    }
    return result;}
}


