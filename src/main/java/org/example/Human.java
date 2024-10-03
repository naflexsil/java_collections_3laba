package org.example;

import java.util.Comparator;
import java.util.Objects;
import java.util.*;

public record Human(String firstName, String lastName, int age) implements Comparable<Human> {

    // метод сравнив. текущ. объект с объектом, переданным в кач-ве аргумента
    @Override
    public int compareTo(Human other) {
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return age == human.age &&
                Objects.equals(firstName, human.firstName) &&
                Objects.equals(lastName, human.lastName);
    }

    public static void handleHumanTasks() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Kotoliy", "Orientalov", 31));
        humans.add(new Human("Emelya", "Nikitosikov", 30));
        humans.add(new Human("Bob", "Malish", 20));
        humans.add(new Human("Masyanya", "Valinov", 35));


        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet:");
        for (Human human : hashSet) {
            System.out.println(human);
        }


        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\nLinkedHashSet:");
        for (Human human : linkedHashSet) {
            System.out.println(human);
        }


        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\nTreeSet:");
        for (Human human : treeSet) {
            System.out.println(human);
        }


        Set<Human> treeSetWithComparator = new TreeSet<>(new HumanComparatorByLastName());
        treeSetWithComparator.addAll(humans);
        System.out.println("\nTreeSet with comparator by last name:");
        for (Human human : treeSetWithComparator) {
            System.out.println(human);
        }


        Set<Human> treeSetWithAnonymousComparator = new TreeSet<>((h1, h2) -> Integer.compare(h1.age(), h2.age())); // лямбда
        treeSetWithAnonymousComparator.addAll(humans);
        System.out.println("\nTreeSet with an anonymous age comparator:");
        for (Human human : treeSetWithAnonymousComparator) {
            System.out.println(human);
        }

        System.out.println("\n// difference:");
        // не сохраняет порядок элементов и не допускает дубликатов.
        System.out.println("HashSet: does not preserve the order of the elements and does not allow duplicates");
        // сохраняет порядок добавления элементов и не допускает дубликатов
        System.out.println("LinkedHashSet: preserves the order of adding elements and does not allow duplicates");
        // сортирует элементы по естественному порядку (по фамилии) и не допускает дубликатов
        System.out.println("TreeSet: sorts the elements according to the natural order (by last name) and does not allow duplicates");
        // с компаратором: сортирует элементы по фамилии, как определено в компараторе
        System.out.println("TreeSet with comparator: Sorts items by last name as defined in the comparator");
        // с анонимным компаратором: сортирует элементы по возрасту, как определено в анонимном компараторе
        System.out.println("TreeSet with an anonymous comparator: Sorts items by age as defined in the anonymous comparator");
    }

    public static class HumanComparatorByLastName implements Comparator<Human> {
        @Override
        public int compare(Human h1, Human h2) {
            return h1.lastName().compareTo(h2.lastName());
        }
    }
}


