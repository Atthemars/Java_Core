package geekbrains.lesson_2;
import java.security.PublicKey;

public enum DayOfTheWeek {//Создаю перечисление дней недели
    MONDAY("ПОНЕДЕЛЬНИК", 8),
    TUESDAY("ВТОРНИК", 8),
    WEDNESDAY("СРЕДА", 8),
    THURSDAY("ЧЕТВЕРГ", 8),
    FRIDAY("ПЯТНИЦА", 8),
    SATURDAY("СУББОТА", 0),
    SUNDAY("ВОСКРЕСЕНИЕ", 0);
    private String rus;
    private int hour;


    //геттеры для руских обозначений дней недели и количества рабочих часов в дне. Хотел присваивать им оставшееся рабочее время, e.g. пн 40, вт 32...
    public String getRus() {
        return rus;
    }

    public int getHour() {
        return hour;
    }

    DayOfTheWeek(String rus, int hour) {
        this.rus = rus;
        this.hour = hour;
    }

}

