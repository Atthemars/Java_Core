package geekbrains.lesson_2;
import java.util.Scanner;
/*4. Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.

Возвращает кол-во оставшихся рабочих часов до конца
недели по заданному текущему дню. Считается, что
текущий день ещё не начался, и рабочие часы за него
должны учитываться.

public class DayOfWeekMain {

public static void main(final String[] args) {
System.out.println(getWorkingHours(DayOfWeek.MONDAY));
}
 */
public class DayOfTheWeekMain extends Exception {
    private int index;

    public static void main(String[] args){

        //Task DayOfTheWeek: Реализовал через индекс и через valuesOf + foreach для себя посмотреть, попрактиковаться.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скопируйте и вставьте в консоль интересующий вас день недели из списка ниже:");
        for (DayOfTheWeek d : DayOfTheWeek.values()) {
            System.out.println(d);//оглашаю все элементы перечисления
        }

        String daySelected = scanner.nextLine();

        switch (DayOfTheWeek.valueOf(daySelected)) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY:
                System.out.println("Сегодня: " + DayOfTheWeek.valueOf(daySelected).getRus() +
                        ", осталось " + getWorkingHours(DayOfTheWeek.valueOf(daySelected)) + " рабочих часов");
                break;
            case FRIDAY:
                System.out.println("Сегодня: " + DayOfTheWeek.valueOf(daySelected).getRus() + ", через "
                        + getWorkingHours(DayOfTheWeek.valueOf(daySelected)) + " часов пора напиться");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Выходной, лень даже считать сколько осталось до нового похода в ад на 5 дней");
                break;
        }
        System.out.println("Введите в консоли порядковый номер дня недели: 1(пн) - 7(вскр)");
        int index = (scanner.nextInt() - 1);//водим индекс и оператор свич выдаёт соответствующий ответ

        switch (DayOfTheWeek.values()[index]) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY:
                System.out.println("Сегодня: " + DayOfTheWeek.values()[index].getRus() +
                        ", осталось " + getWorkingHours(DayOfTheWeek.values()[index]) + " рабочих часов");
                break;
            case FRIDAY:
                System.out.println("Сегодня: " + DayOfTheWeek.values()[index].getRus() + ", через "
                        + getWorkingHours(DayOfTheWeek.values()[index]) + " часов пора напиться");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Выходной, лень даже считать сколько осталось до нового похода в ад на 5 дней");
                break;
        }
    }

    //DayOfTheWeek: Метод для определения оставшегося рабочего времени
    public static int getWorkingHours(DayOfTheWeek dayOfWeek) {
        int result = 0;
        for (int i = dayOfWeek.ordinal(); i < dayOfWeek.values().length; i++)
            result += dayOfWeek.values()[i].getHour();
        return result;
    }

    //DayOfTheWeek: сеттер для первой реализации
    public void setDayIndex(int index) {
            if (index >= 0 && index <= 6) {
                this.index = index;

            } else {
                System.out.println("Ошибка! Введите корректный порядковый номер дня недели от 1(пн) - 7(вскр)");
            }
        }
    }
