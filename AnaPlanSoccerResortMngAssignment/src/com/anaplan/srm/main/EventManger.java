package com.anaplan.srm.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.anaplan.srm.entity.Country;
import com.anaplan.srm.entity.Guest;

public class EventManger {
	public static void main(String[] args) {

        List<Guest> guestList = new ArrayList<>();
        /*guestList.add(new Guest("Ramesh", "03-03-1990", "USA", "English", "Eat"));
        guestList.add(new Guest("Rakesh", "02-05-1995", "SPAIN", "Spanish", "Drink"));
        guestList.add(new Guest("Roshan", "01-09-1996", "FRANCE", "French", "WaterSports"));
        guestList.add(new Guest("Raju", "03-03-1998", "CHINA", "Chinese", "Dance"));
        guestList.add(new Guest("Ramu", "03-05-1992", "GERMANY", "German", "Travel"));
*/

        guestList.add(new Guest("Ramesh", "03-03-1990", "USA", "English", "Eat", true, false, 20, true, true, true));
        guestList.add(new Guest("Rakesh", "02-05-1995", "SPAIN", "Spanish", "Drink", false, true, 25, false, true, false));
        guestList.add(new Guest("Roshan", "01-09-1996", "FRANCE", "French", "WaterSports", false, true, 30, false, true, true));
        guestList.add(new Guest("Raju", "03-03-1998", "CHINA", "Chinese", "Dance", true, true, 21, true, true, true));
        guestList.add(new Guest("Ramu", "03-05-1992", "GERMANY", "German", "Travel", false, false, 17, false, false, false));


        
        // Guest from Spain age above 18, love music , dance & drink 
        
        List<Guest> spainMusicAndDanceDrinkers = guestList.stream()
                .filter(guest -> guest.getGuestCountry().equals("Spain"))
                .filter(guest -> guest.isLovesMusicAndDance())
                .filter(guest -> guest.isLovesToDrink())
                .filter(guest -> guest.getAge() > 18)
                .collect(Collectors.toList());
        System.out.println("Guests from Spain who love music and dance, love to drink, and age above 18:");
        spainMusicAndDanceDrinkers.forEach(System.out::println);

        

        // Guest from France & playing sports
        List<Guest> franceSportLovers = guestList.stream()
                .filter(guest -> guest.getGuestCountry().equals("France"))
                .filter(guest -> guest.isLovesPlayingSports())
                .collect(Collectors.toList());
        System.out.println("Guests from France who love playing sports:");
        franceSportLovers.forEach(System.out::println);


        // Guest age above 70
        long guestsAbove70 = guestList.stream()
                .filter(guest -> guest.getAge() > 70)
                .count();
        System.out.println("Number of guests above 70 years: " + guestsAbove70);


       // Guest Who can speak/read Chinese 
        List<Guest> chineseReaders = guestList.stream()
                .filter(guest -> guest.isSpeaksChinese())
                .filter(guest -> guest.isLovesToRead())
                .collect(Collectors.toList());
        System.out.println("Guests who speak Chinese and love to read:");
        chineseReaders.forEach(System.out::println);

          
        
        //Guest Country
        Predicate<Guest> patternAmerican =g -> {
            return Country.USA.equals(g.getGuestCountry());
        };
        guestList.stream().filter(patternAmerican).forEach(guest -> System.out.println(guest));
    }
}
