package ru.mirea.lab21.task5;

import java.util.*;

public class Solution<T, V, K> {
    private final T genericVar1;
    private final V genericVar2;
    private final K genericVar3;

    public Solution(T genericVar1, V genericVar2, K genericVar3) {
        this.genericVar1 = genericVar1;
        this.genericVar2 = genericVar2;
        this.genericVar3 = genericVar3;
    }

    @SafeVarargs
    public final List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, elements);
        return list;
    }

    @SafeVarargs
    public final Set<V> newHashSet(V... elements) {
        Set<V> set = new HashSet<>();
        Collections.addAll(set, elements);
        return set;
    }

    public Map<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Количество ключей и значений должно совпадать.");
        }

        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        Solution<Integer, String, Character> solution = new Solution<>(42, "Hello", 'A');

        List<Integer> intList = solution.newArrayList(1, 2, 3, 4, 5);
        System.out.println("ArrayList: " + intList);

        Set<String> stringSet = solution.newHashSet("apple", "banana", "cherry");
        System.out.println("HashSet: " + stringSet);

        Character[] keys = {'a', 'b', 'c'};
        String[] values = {"apple", "banana", "cherry"};
        Map<Character, String> charStringMap = solution.newHashMap(keys, values);
        System.out.println("HashMap: " + charStringMap);
    }
}