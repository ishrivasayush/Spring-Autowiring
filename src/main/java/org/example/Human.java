package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    public Human() {
    }

    // @Autowired
    @Autowired
    @Qualifier("humanHeart")
    private Heart heart;

    public Human(Heart heart) {
        this.heart = heart;
    }


/*
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

 */
    public void startPumping()
    {
        if (heart!=null) {
            heart.pump();
            System.out.println(heart.getNoOfHeart());
            System.out.println(heart.getNameOfAnimal());
        }
        else {
            System.out.println("yor are dead....");
        }
    }
}
