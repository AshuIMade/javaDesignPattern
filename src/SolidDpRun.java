import com.desgnPatterns.solid.dip.Person;
import com.desgnPatterns.solid.dip.Relationships;
import com.desgnPatterns.solid.dip.Research;
import com.desgnPatterns.solid.isp.Document;
import com.desgnPatterns.solid.isp.ModernMachine;
import com.desgnPatterns.solid.isp.MultiFunctionMachine;
import com.desgnPatterns.solid.lsp.Demo;
import com.desgnPatterns.solid.lsp.Rectangle;
import com.desgnPatterns.solid.lsp.Square;
import com.desgnPatterns.solid.ocp.*;
import com.desgnPatterns.solid.srp.Journal;
import com.desgnPatterns.solid.srp.Persistence;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class SolidDpRun {
    public static void runSolids() throws IOException {
        //runSRP();
        //runOCP();
        //runLsp();
        //runIsp();
        runDip();
    }
    private static void runSRP() throws IOException {
        System.out.println("Hello from SRP");
        Journal journal = new Journal();
        journal.add("I ate a bug");
        journal.add("My pig died");
        Persistence persistence = new Persistence();
        String fileName = "E:\\javatemp\\temp.txt";
        persistence.save(journal,fileName,true);
        Runtime.getRuntime().exec("Notepad.exe "+fileName);
        System.out.println("Reacd from File" +persistence.load(fileName).toString());
        System.out.println(journal.toString()+" "+journal.getCount());
        Journal journal1 =new Journal();
        journal1.add("WHt is the number");
        System.out.println(journal1.toString()+" "+journal1.getCount());
    }
    private static void runOCP(){

        System.out.println("Hello from OCP");

        final Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        final Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        final Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple,tree,house);
        OldProductFilter oldProductFilter = new OldProductFilter();
        oldProductFilter.filterByColor(products,Color.GREEN).forEach(p->System.out.println("-"+p.name+ " is green."));

        ProductFilter productFilter = new ProductFilter();
        final ColorSpecification colorSpecification = new ColorSpecification(Color.BLUE);

        productFilter.filter(products,colorSpecification).forEach(p -> System.out.println("-new" +p.name+" is blue."));

        final AndSpecification<Product> productAndSpecification = new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE));

        productFilter.filter(products,productAndSpecification).forEach(p->System.out.println("-new and: " +p.name+" is Blue and Green"));
        /*final Prd apple2 = new Prd("Apple", Color.GREEN, Size.SMALL);
        final Prd tree2 = new Prd("Tree", Color.GREEN, Size.LARGE);
        final Prd house2 = new Prd("House", Color.BLUE, Size.LARGE);
        List<Prd> prds = List.of(tree2,apple2,house2);

        AndSpec<Prd> prdandFilter = new AndSpec<>(new ColorSpec(Color.GREEN),new SizeSpec(Size.SMALL));
        //new AndSpec<>(new ColorSpec(Color.GREEN),new SizeSpec(Size.LARGE))
        ProdFilt prodFilt = new ProdFilt();
        //prodFilt.
        prodFilt.filter(prds,prdandFilter  ).forEach(p->System.out.println("-new and: " +p.name+" is Blue and Green"));
    */
    }
    private static void runLsp(){
        Demo.useIt(new Rectangle(2,5));
        Rectangle square = new Square();
        square.setWidth(5);
        Demo.useIt(square);
    }
    private static void runIsp(){
        ModernMachine modernMachine =new ModernMachine();
        modernMachine.print(new Document());
    }
    private static void runDip(){
        System.out.println("Hello from Dip");
        Person parent = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent,child1);
        relationships.addParentAndChild(parent,child2);
        Research research = new Research(relationships);


    }

}
