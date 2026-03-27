package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /*
        Есть таблица работников (id, name, surname, department_id, salary) и таблица департаментов(id, name);
        1. Вывести максимальную зп каждого департамента и имя департамента
        2. Вывести имя депратамента, где средняя зп будет наибольшей среди всех


        SELECT d.name FROM department d
        JOIN employee e ON d.id = e.department_id
        GROUP BY d.id, d.name
        ORDER BY AVG(e.salary) DESC
        LIMIT 1
     */

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println(list.getFirst() + " " + list.getLast());
        System.out.println(list.size());
    }


}

