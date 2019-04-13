package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Give
        HomeworkQueue andrzej = new HomeworkQueue("Andrzej");
        HomeworkQueue krysek = new HomeworkQueue("Krysek");
        HomeworkQueue artur = new HomeworkQueue("Artur");

        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");

        andrzej.registerObserver(mentor1);
        krysek.registerObserver(mentor2);
        artur.registerObserver(mentor2);

        //When
        andrzej.addLink("github/andrzeja1");
        artur.addLink("github/artur1");
        andrzej.addLink("github/andrzej2");
        krysek.addLink("github/krysek1");
        //Then
        assertEquals(2,mentor1.getQueueLong());
        assertEquals(2,mentor2.getQueueLong());
    }
}
