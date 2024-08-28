package com.desgnPatterns.solid.isp;

public interface IOldMachineInterface {
    void print(Document document);
    void scan(Document document);
    void fax(Document document);
}
