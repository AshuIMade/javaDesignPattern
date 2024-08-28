package com.desgnPatterns.solid.isp;

public class MultiFunctionMachine implements IMultiFunctionMachine{
    public IPrintInterface printInterface;
    public IScanInterface scanInterface;
    public MultiFunctionMachine(IPrintInterface printInterface,IScanInterface scanInterface){
        this.printInterface=printInterface;
        this.scanInterface=scanInterface;
    }
    @Override
    public void print(Document document) {
        System.out.println("printing...");
        printInterface.print(document);
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning...");
        scanInterface.scan(document);
    }
}
