package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl;

public class Test {

    public static void main(String[] args) {

        Organizer organizer = new Organizer();
        organizer.setId(123);
        organizer.setName("Apple India");
        System.out.println(organizer.getId());
        System.out.println(organizer.getName());

        Event event = new Event();
        event.setId(456);
        event.setName("iPhone 13 Launch");
        event.setDescription("Grand Launch");

        System.out.println(event.getId());
        System.out.println(event.getName());
        System.out.println(event.getDescription());


        EventManager em = new EventManagerImpl();
        Event event1 = em.create(456);
        System.out.println(event1);
        System.out.println(event1.getId());

    }
}
