import com.desgnPatterns.others.generics.BeforeGenerics;
import com.desgnPatterns.others.generics.GenClass;
import com.desgnPatterns.others.generics.GenTwo;
import com.desgnPatterns.others.generics.GenericsBounded;

public class GenericsDemo {
    public static void demoGeneric(){
        GenClass<Integer> genericInteger = new GenClass<>(56);
        genericInteger.showType();
        //genericInteger = new GenClass<String>("values");
        BeforeGenerics bg= new BeforeGenerics("AM string ");
        bg.showType();
        BeforeGenerics bg2= new BeforeGenerics(15);
        int v = (int) bg2.getObject();
        bg2.showType();
        bg2 = bg;
        try {
            v= (int) bg2.getObject();
        }catch (Exception e){
            System.out.println("This is what Generics solved by allowing " +
                    "class cast exception to be identified at compile time " +
                    "instead of runtime like this "
                    +e.fillInStackTrace());
        }
        bg2.showType();
    }
    public static void demoTwoGenerics(){
        GenTwo<Integer,String> twoGen= new GenTwo<>(22,"Still alive");
        twoGen.showTypes();
        demoBoundedGenerics();
    }
    public static void demoBoundedGenerics(){
        //Gene
        GenericsBounded<Integer> gb = new GenericsBounded<>(new Integer[]{10,15,56,88});
        System.out.println("Avg: "+gb.average());
        GenericsBounded<Double> gb2 = new GenericsBounded<>(new Double[]{1.2,2.3,5.6,5.6});
        //the following is not ok becouse it is bounded
        //GenericsBounded<String> strGen = new GenericsBounded<String>(new String[]{"1","3"});
        wildCardMethodGenericsDemo();
    }
    public static void wildCardMethodGenericsDemo(){
        GenericsBounded<Integer> intGen= new GenericsBounded<>(new Integer[]{10,5,6,8});
        GenericsBounded<Double> doubleGen= new GenericsBounded<>(new Double[]{12.3,25.6,12.0,13.9});
        // this is wrong becouse it only compares the sam type
        //intGen.sameAvg(doubleGen); // not ok
        GenericsBounded<Integer> intGen2= new GenericsBounded<>(new Integer[]{10,5,6,8});
        intGen.sameAvg(intGen2);// this is ok
        intGen.sameAvgTwo(doubleGen);//this is ok becouse the method is declared to compare any instance of the generic class

    }
    public static void boundedWildCardMethodGenericsDemo(){

    }
}
