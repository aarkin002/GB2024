import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserInfo {
    public static void info(String userdata) {
        //Проверяем данные по кол-ву
        if(userdata.split(" ").length > 6){
            throw new RuntimeException("Вы ввели, слишком много данных");
        }

        String phonenumber = usrPhone(userdata);
        String usrdate = usrDate(userdata);
        String[] usrname = usrName(userdata).split(" ");
        String gender = usrGender(userdata);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("<%s>", usrname[0]));
        sb.append(String.format("<%s>", usrname[1]));
        sb.append(String.format("<%s>", usrname[2]));
        sb.append(String.format("<%s>", usrdate));
        sb.append(String.format("<%s>", phonenumber));
        sb.append(String.format("<%s>", gender));
        sb.append(String.format("\n"));

        //Пишем в файл
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(String.format("%s.txt", usrname[0]), true), "utf-8"))) {
            writer.write(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Успешно");
    }

    //ПОЛ
    static String usrGender(String userdata){
        Matcher mg = Pattern.compile("\\b[fm]\\b").matcher(userdata);
        StringBuilder buildname = new StringBuilder();

        while (mg.find()) {
            buildname.append(userdata.substring(mg.start(), mg.end()));
        }

        String usrname = buildname.toString();
        if(usrname.length() == 0){
            throw new RuntimeException("Вы не ввели, или ввели пол не соответствующий формату 'm' или  'f'");
        }

        return usrname;
    }

    //ФИО
    static String usrName(String userdata) {
        Matcher mn = Pattern.compile("\\b[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+\\b").matcher(userdata);
        StringBuilder buildname = new StringBuilder();

        while (mn.find()) {
            buildname.append(userdata.substring(mn.start(), mn.end()));
        }

        String usrname = buildname.toString();
        if (usrname.length() == 0) {
            throw new RuntimeException("Вы не ввели, или ввели ФИО не соответствуюее формату 'Яркин Алексей Александрович'");
        }

        return usrname;
    }

    //Дата
    static String usrDate(String userdata) {
        Matcher md = Pattern.compile("\\b\\d{2}\\.\\d{2}\\.\\d{4}\\b").matcher(userdata);
        StringBuilder builddate = new StringBuilder();

        while (md.find()) {
            builddate.append(userdata.substring(md.start(), md.end()));
        }

        String usrdate = builddate.toString();
        if(usrdate.length() == 0){
            throw new RuntimeException("Вы не ввели, или ввели дату не соответствующую формату '10.10.1989'");
        }

        return usrdate;
    }

    //Номер телефона
    static String usrPhone(String userdata) {
        Matcher mp = Pattern.compile("\\b[+-]*\\d{11}\\b").matcher(userdata);
        StringBuilder buildphone = new StringBuilder();

        while (mp.find()) {
            buildphone.append(userdata.substring(mp.start(), mp.end()));
        }

        String phonenumber = buildphone.toString();

        if(phonenumber.length() == 0){
            throw new RuntimeException("Вы не ввели, или ввели номер телефона не соответствующий формату [+-]79213131841");
        }
        return phonenumber;
    }
}

//Вызываем
class PrinterInfo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите данные в формате 'Yarkin Alexey Alexandrovich 10.10.1989 m +79213131841' без ковычек: ");
        String s = sc.nextLine();
        UserInfo.info(s);
    }
}