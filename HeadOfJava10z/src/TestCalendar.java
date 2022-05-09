import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {


        Calendar c = Calendar.getInstance();   //создаем экземпляр дочернего лкасса Календар
        c.set(2004, 0, 7, 15, 40);  //устанавливаем время
        long day1 = c.getTimeInMillis();   //Превращаем в большое колтчество миллисекунд
        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);    //обавляе эквивалент часа в миллисекундах, затем обновляем время( += означает day1 =day1+day1+..
        System.out.println("Новый час " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);     //обавляем к дате 35 дней и оказываемся в феврале
        System.out.println("Добавить 35 дней " + c.getTime());
        c.roll(c.DATE, 35);            //Прокручиваем дату на 35 дней В результате добавляем 35 дней но месяц не меняется
        System.out.println("Прокрутить 35 дней " + c.getTime());
        c.set(c.DATE, 1);      //десь мы не используем инкремента а просто устанавливаем дату
        System.out.println("становить дату в 1 " + c.getTime());

    }
}