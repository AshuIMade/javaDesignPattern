package com.desgnPatterns.solid.dip;

import org.javatuples.Triplet;

import java.util.List;

// this close to user researching
public class Research {

    public Research(Relationships relationships){
        List<Triplet<Person,Relationship,Person>> relations = relationships.getRelations();
        relations.stream()
                .filter(x-> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
                .forEach(ch->System.out.println("Jhon has a child called " +ch.getValue2().name));

    }

}
