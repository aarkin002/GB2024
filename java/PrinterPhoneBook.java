import java.util.*;
import java.util.stream.Collectors;




class PhoneBook {
    HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum){
        if(phoneBook.containsKey(name)){
            phoneBook.get(name).add(phoneNum);
        }else{
            ArrayList<Integer> arrTmp = new ArrayList<>();
            arrTmp.add(phoneNum);
            phoneBook.put(name, arrTmp);
        }
    }
    public ArrayList<Integer> find (String name){
        if (phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }else{
            return new ArrayList<>();
        }
    }

    public HashMap<String, ArrayList<Integer>> getPhoneBook(){
        return phoneBook;
    }

    public void sortedPhoneBook(){
        Map<String, ArrayList<Integer>> sortedMap = phoneBook.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> e.getValue().size()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        TreeMap::new
                ));
        System.out.println(sortedMap);

    }


}


// Для проверки

public class PrinterPhoneBook {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.print("Ищем номера Иванова: ");
        System.out.println(myPhoneBook.find(name1));
        System.out.print("Выводим телефонную книгу без сортировки: ");
        System.out.println(myPhoneBook.getPhoneBook());
        System.out.print("Выводим телефонную книгу с сортировкой: ");
        myPhoneBook.sortedPhoneBook();
        System.out.print("Ищем пользователя 'Me' которого нет в книге: ");
        System.out.println(myPhoneBook.find("Me"));
    }
}