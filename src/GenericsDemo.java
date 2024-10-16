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
        GenericsBounded<Integer> gb = new GenericsBounded<>(new Integer[]{10,15,56,88});
        System.out.println("Avg: "+gb.average());
    }
}
