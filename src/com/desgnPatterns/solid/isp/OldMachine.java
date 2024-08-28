package com.desgnPatterns.solid.isp;

public class OldMachine implements IOldMachineInterface{

    @Override
    public void print(Document document) {

    }

    @Override
    public void scan(Document document) {
        //no scan so what can youdo
        //1 thrwow error
        //throw new Exception("exception");
        //other is no implementation just do do any thing
    }

    @Override
    public void fax(Document document) {

    }
}
