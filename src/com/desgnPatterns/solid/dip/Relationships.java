package com.desgnPatterns.solid.dip;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.javatuples.Triplet;

//close to db having stored relationshiped data
public class Relationships implements RelationshipBrowser {
    private List<Triplet<Person, Relationship,Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent,Person child){
        relations.add(new Triplet<>(parent,Relationship.PARENT,child));
        relations.add(new Triplet<>(child,Relationship.CHILD,parent));
    }

    public List<Triplet<Person,Relationship,Person>> getRelations(){
        return relations;
    }

    @Override
    public List<Person> finsAllChildrenOf(String name) {
        return relations.stream()
                .filter(x -> Objects.equals(x.getValue0().name,name) && x.getValue1() == Relationship.PARENT)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
