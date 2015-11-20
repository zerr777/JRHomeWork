package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main (String[] args){

        removeTheFirstNameDuplicates(createMap());
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ivanov", "Ivan");
        map.put("Ivanov1", "Ivan1");
        map.put("Ivanov2", "Ivan2");
        map.put("Ivanov3", "Ivan3");
        map.put("Ivanov4", "Ivan4");
        map.put("Ivanov5", "Ivan1");
        map.put("Ivanov6", "Ivan2");
        map.put("Ivanov7", "Ivan3");
        map.put("Ivanov8", "Ivan4");
        map.put("Ivanov9", "Ivan5");
        //напишите тут ваш код
    return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        for (Map.Entry<String, String> pair: map.entrySet()){
            removeItemFromMapByValue(map, pair.getValue());

        }
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
