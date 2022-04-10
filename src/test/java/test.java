import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    @Test
    public void test1(){
        System.out.println("测试");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

    }

    @Test
    public void gonRen(){
        System.out.printf("请输入时间线 (2020-05)");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        LocalDateTime parse = LocalDateTime.parse(data);
        LocalDateTime plusMonths = parse.plusMonths(1);
        LocalDateTime minusDays = plusMonths.minusDays(1);
        int dayOfMonth = minusDays.getDayOfMonth();
        System.out.println(dayOfMonth);

        String restDay = "2020-02-01";
        LocalDateTime restDay1 = LocalDateTime.parse(restDay);
        long between = ChronoUnit.DAYS.between(restDay1, parse);
        System.out.printf("相差时间", between);

        ArrayList<LocalDate> list = new ArrayList<>();
        for (int i = 0; i < between; i+=4) {
        }
    }
}
