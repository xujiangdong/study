package com.example.javabase;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author XuJD
 * @create 2018-11-20 13:44
 **/
public class Test {

    @org.junit.Test
    public void a(){
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.MONTH,-2);
        Date twoMonthBefore = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String before = sdf.format(twoMonthBefore);
        System.out.println(before);
    }
    @org.junit.Test
    public void intMax(){
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE + 1;
        int c = Integer.MAX_VALUE - 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("-----------------------");
        int a1 = Integer.MIN_VALUE;
        int b1 = Integer.MIN_VALUE - 1;
        int c1 = Integer.MIN_VALUE + 1;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
    }

    /**
     * jdk8 时间工具类 不可变类（线程安全）
     * 1、LocalDate 不带时间的日期（年月日）
     * 2、LocalTime 不带日期的时间（时分秒）
     * 3、LocalDataTime 日期时间，不带时区偏移量
     * 4、ZonedDateTime  日期时间，带时区偏移量
     * 5、DateTimeFormatter 时间格式化类
     * 6 Period:计算两个LocalDate直接日期差
     * 7 Duration:计算时间值(天\时\秒\毫秒\纳秒)差
     * 8 ChronoUnit:计算相隔天数
     */
    @org.junit.Test
    public void dateForJDK8(){
        /*--------LocalDate------------*/
        Date now = new Date();
        LocalDate ld = LocalDate.now();
        LocalDate ld3 = LocalDate.now();
        System.out.println(now);
        System.out.println(ld);
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();
        DayOfWeek dayOfWeek = ld.getDayOfWeek();
        System.out.println("年："+year+" 月："+month+" 日："+day+" 今年的第多少天："+dayOfYear+" 星期几："+dayOfWeek);
        //指定日期
        LocalDate ld1 = LocalDate.of(2020,10,26);
        System.out.println(ld1);
        //日期比较
        System.out.println(ld.isBefore(ld1)+"---");
        System.out.println(ld.isAfter(ld1)+"--");
        System.out.println(ld.equals(ld1)+"----");
        System.out.println(ld.equals(ld3)+"----");
        // 获取两个日期之间相差日期
        Period per = Period.between(ld, ld1);
        System.out.println("days:" + per.getDays());
        System.out.println("years:" + per.getYears());
        System.out.println("months:" + per.getMonths());
        Long chronoUnit = ChronoUnit.DAYS.between(ld, ld1);
        System.out.println("chronoUnit:" + chronoUnit);
        //闰年判断
        System.out.println(ld.isLeapYear()+"----");
        //日期格式化
        String d = "1999-05-26";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d1 = LocalDate.parse(d,dateTimeFormatter);
        String d2 = d1.format(dateTimeFormatter);
        System.out.println("d1:"+d1+"   d2:"+d2);
        //日期向后扩展
        LocalDate ld3dayAfter = ld.plusDays(3);
        LocalDate ld3weekAfter = ld.plusWeeks(3);
        LocalDate ld3monthAfter = ld.plusMonths(3);
        LocalDate ld3yearAfter = ld.plusYears(3);
        System.out.println("三天后："+ld3dayAfter+"     三周后："+ld3weekAfter+"   三个月后："+ld3monthAfter+"   三年后："+ld3yearAfter);
        //日期向前扩展
        LocalDate ld3dayBefore = ld.minusDays(3);
        LocalDate ld3weekBefore = ld.minusWeeks(3);
        LocalDate ld3monthBefore = ld.minusMonths(3);
        LocalDate ld3yearBefore = ld.minusYears(3);
        System.out.println("三天前："+ld3dayBefore+"     三周前："+ld3weekBefore+"   三个月前："+ld3monthBefore+"   三年前："+ld3yearBefore);
    }

    @org.junit.Test
    public void timeForJDK8(){
        /*--------LocalTime------------*/
        LocalTime lt = LocalTime.now();
        LocalTime lt3 = LocalTime.now();
        System.out.println(lt);
        System.out.println(lt3);
        int hour = lt.getHour();
        int minute = lt.getMinute();
        int second = lt.getSecond();
        System.out.println("时："+hour+"    分："+minute+"    秒："+second);
        //指定时间
        LocalTime lt1 = LocalTime.of(15,45,30);
        System.out.println(lt1);
        //时间比较
        System.out.println(lt.isBefore(lt1)+"---");
        System.out.println(lt.isAfter(lt1)+"--");
        System.out.println(lt.equals(lt1)+"----");
        System.out.println(lt.equals(lt3)+"----");
        //时间向后扩展
        LocalTime lt3HourAfter = lt.plusHours(3);
        LocalTime lt3MinuteAfter = lt.plusMinutes(3);
        LocalTime lt3SecondAfter = lt.plusSeconds(3);
        System.out.println("三小时后："+lt3HourAfter+"     三分后："+lt3MinuteAfter+"   三秒后："+lt3SecondAfter);
        //时间向前扩展
        LocalTime lt3HourBefore = lt.minusHours(3);
        LocalTime lt3MinuteBefore = lt.minusMinutes(3);
        LocalTime lt3SecondBefore = lt.minusSeconds(3);
        System.out.println("三小时前："+lt3HourBefore+"     三分前："+lt3MinuteBefore+"   三秒前："+lt3SecondBefore);
    }

    @org.junit.Test
    public void dateTimeForJDK8(){
        /*--------LocalDateTime------------*/
        Date now = new Date();
        LocalDateTime ld = LocalDateTime.now();
        LocalDateTime ld3 = LocalDateTime.now();
        System.out.println(now);
        System.out.println(ld);
        System.out.println(ld3);
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();
        DayOfWeek dayOfWeek = ld.getDayOfWeek();
        System.out.println("年："+year+" 月："+month+" 日："+day+" 今年的第多少天："+dayOfYear+" 星期几："+dayOfWeek);
        int hour = ld.getHour();
        int minute = ld.getMinute();
        int second = ld.getSecond();
        System.out.println("时："+hour+"    分："+minute+"    秒："+second);
        //指定日期
        LocalDateTime ld1 = LocalDateTime.of(2020,10,26,10,45,30);
        System.out.println(ld1);
        //日期比较
        System.out.println(ld.isBefore(ld1)+"---");
        System.out.println(ld.isAfter(ld1)+"--");
        System.out.println(ld.equals(ld1)+"----");
        System.out.println(ld.equals(ld3)+"----");
        //日期格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String d2 = ld.format(dateTimeFormatter);
        LocalDateTime d1 = LocalDateTime.parse(d2,dateTimeFormatter);
        System.out.println("d1:"+d1+"   d2:"+d2);
        //日期向后扩展
        LocalDateTime ld3dayAfter = ld.plusDays(3);
        LocalDateTime ld3weekAfter = ld.plusWeeks(3);
        LocalDateTime ld3monthAfter = ld.plusMonths(3);
        LocalDateTime ld3yearAfter = ld.plusYears(3);
        System.out.println("三天后："+ld3dayAfter+"     三周后："+ld3weekAfter+"   三个月后："+ld3monthAfter+"   三年后："+ld3yearAfter);
        //日期向前扩展
        LocalDateTime ld3dayBefore = ld.minusDays(3);
        LocalDateTime ld3weekBefore = ld.minusWeeks(3);
        LocalDateTime ld3monthBefore = ld.minusMonths(3);
        LocalDateTime ld3yearBefore = ld.minusYears(3);
        System.out.println("三天前："+ld3dayBefore+"     三周前："+ld3weekBefore+"   三个月前："+ld3monthBefore+"   三年前："+ld3yearBefore);
        //时间向后扩展
        LocalDateTime lt3HourAfter = ld.plusHours(3);
        LocalDateTime lt3MinuteAfter = ld.plusMinutes(3);
        LocalDateTime lt3SecondAfter = ld.plusSeconds(3);
        System.out.println("三小时后："+lt3HourAfter+"     三分后："+lt3MinuteAfter+"   三秒后："+lt3SecondAfter);
        //时间向前扩展
        LocalDateTime lt3HourBefore = ld.minusHours(3);
        LocalDateTime lt3MinuteBefore = ld.minusMinutes(3);
        LocalDateTime lt3SecondBefore = ld.minusSeconds(3);
        System.out.println("三小时前："+lt3HourBefore+"     三分前："+lt3MinuteBefore+"   三秒前："+lt3SecondBefore);
        //时间差
        Duration duration = Duration.between(ld,ld1);
        //相差天数
        System.out.println(duration.toDays());
        //相差小时
        System.out.println(duration.toHours());
        //相差分钟
        System.out.println(duration.toMinutes());
        //相差毫秒
        System.out.println(duration.toMillis());
        //相差纳秒
        System.out.println(duration.toNanos());

    }


    /*map遍历四种*/
    @org.junit.Test
    public void mapTest(){
        Map<String,String> map = new HashMap<>();
        map.put("a","一");
        map.put("b","二");
        map.put("c","三");
        map.put("d","四");
        /*1:在遍历中获取key和value*/
        System.out.println("----方式一------");
        for(Entry<String,String> entry : map.entrySet()){
            System.out.println("key:"+entry.getKey()+"---value:"+entry.getValue());
        }
        /*2:遍历种获取key和value,效率比1低很多*/
        System.out.println("----方式二------");
        for(String key : map.keySet()){
            System.out.println("key:"+key+"--value:"+map.get(key));
        }
        /*3:key和value分开获取*/
        System.out.println("----方式三------");
        for(String key : map.keySet()){
            System.out.println(key);
        }
        for(String value : map.values()){
            System.out.println(value);
        }
        /*4:通过迭代器itearator遍历,jdk1.5之前只能使用这种方式*/
        System.out.println("----方式四------");
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            //iterator.remove(); //可以删除entry
            Entry entry = (Entry) iterator.next();
            System.out.println("key:"+entry.getKey()+"---value:"+entry.getValue());
        }
        /*5:jdk8中lambda表达式遍历*/
        System.out.println("----方式五------");
        map.forEach((k,v)-> System.out.println("key:"+k+"---value:"+v));
    }

    @org.junit.Test
    public void et(){
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = new String("hello");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));
    }

    public  String nonScientificNotation(String num) {
        if(StringUtils.isEmpty(num)){
            return null;
        }
        Pattern pattern = Pattern.compile("-?[0-9]*.[0-9]*E[0-9]*");
        Matcher match = null;
        match = pattern.matcher(num);
        if (match.matches()) {
            BigDecimal decimal = new BigDecimal(num);
            num = decimal.toPlainString();
        }
        return num;
    }

    @org.junit.Test
    public void test11(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("1");
        Set<String> set = new HashSet<String>(list);
        System.out.println(set.toArray(new String[set.size()]));
    }

}
