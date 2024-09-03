import com.desgnPatterns.creational.builders.builder1.BuiltInBuilderForString;
import com.desgnPatterns.creational.builders.builderHtml.HtmlBuilder;

public class CreationlDpRun {
    public static void runCreational(){
        builderOneDemo();
        htmlBuilderDemo();
    }
    public static void builderOneDemo(){
        BuiltInBuilderForString.withOutStringBuilder();
        BuiltInBuilderForString.demoBUiltinStingBUilder();
    }
    public static void htmlBuilderDemo(){
        HtmlBuilder htmlBuilder = new HtmlBuilder("ul");
        htmlBuilder.addChild("li","hello");
        htmlBuilder.addChild("li","world");
        System.out.println(htmlBuilder);
    }
}
