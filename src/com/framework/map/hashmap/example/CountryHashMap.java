package com.framework.map.hashmap.example;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 25/12/2014
 * {@link http://info.javarush.ru/translation/2014/04/27/Как-HashMap-работает-в-Java-.html}
 */
public class CountryHashMap {

    public static void main(String[] args) {
        Country  india = new Country("India", 1000);
        Country  japan = new Country("Japan", 10000);
        Country france = new Country("France", 2000);
        Country russia = new Country("Russia", 20000);

        HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
        countryCapitalMap.put(india, "Delhi");
        countryCapitalMap.put(japan, "Tokyo");
        countryCapitalMap.put(france, "Paris");
        countryCapitalMap.put(russia, "Moscow");

        Iterator<Country> countryCapitalIter = countryCapitalMap.keySet().iterator(); //установите debug-точку на этой строке(23)
        while( countryCapitalIter.hasNext() ){
            Country countryObj = countryCapitalIter.next();
            String     capital = countryCapitalMap.get(countryObj);
            System.out.println("City: " + countryObj.getName() + "; Capital - " + capital + "; Population = " + countryObj.getPopulation() + ";");
        }
    }
}