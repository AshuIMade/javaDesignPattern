package com.desgnPatterns.solid.dip;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> finsAllChildrenOf(String name);
}
