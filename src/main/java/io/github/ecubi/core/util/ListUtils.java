package io.github.ecubi.core.util;

import java.util.List;
import java.util.stream.Collectors;

public class ListUtils {
    public static <T> List<T> removeDuplicate(List<T> list){
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static <T> List<T> addElement(List<T> list, T element){
        if(!list.contains(element) && element != null){
            list.add(element);
        }
        return list;
    }

    public static <T> List<T> addElements(List<T> list, List<T> elements){
        elements.forEach(element ->{
            addElement(list,element);
        });
        return list;
    }
}
