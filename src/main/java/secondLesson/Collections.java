package secondLesson;

import java.util.HashMap;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Hello");
//        list.add("Next");
//        list.add("One more");
//        System.out.println(list.size());
//
//        перебор по коллекции
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        List<String> nextList = new ArrayList<>();
//        nextList.addAll(list);
//
//        System.out.println(nextList);

        // сеты
//        Set<String> setList = new HashSet<>();
//        setList.add("Hello");
//        setList.add("2");
//        setList.add("3");
//        setList.add("Hello");
//        System.out.println(setList);

        Map<Integer, String> map = new HashMap<>();
        //как положить ключ
        map.put(1, "one");
        map.put(2, "two");
        System.out.println(map);
        System.out.println(map.get(2));

        //как перебирать значения по мапе
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }
    }
}
