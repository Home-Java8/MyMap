package com.framework.map.hashmap.example;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://info.javarush.ru/translation/2014/04/27/Как-HashMap-работает-в-Java-.html}
 */
public class Country {

    String name;
    long population;

    public Country(String name, long population) {
        super();
        this.name = name;
        this.population = population;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPopulation() {
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }

    // Если длина имени в объекте Country - четное число, то возвращаем 31(любое случайное число), а если нечетное - 95 (любое случайное число).
    // Указанный ниже метод - это не самый лучший способ генерации хеш-кода, но мы воспользуемся им для более четкого понимания хеш-карт.
    @Override
    public int hashCode() {
        if( this.name.length()%2 == 0 )
            return 31;
        else
            return 95;
    }

    @Override
    public boolean equals(Object obj) {
        Country other = (Country) obj;

        if (name.equalsIgnoreCase((other.name)))
            return true;
        return false;
    }
}