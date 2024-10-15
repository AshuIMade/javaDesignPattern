import com.desgnPatterns.others.io.FileDemo;
import com.desgnPatterns.others.io.InputOutputStreamDemo;

public class InputOutputRun {

    static void runFileDemo(){
        //FileDemo.demoFiles();
        FileDemo.dirList();
        try {
            InputOutputStreamDemo.demoIOStream();
        }catch (Exception e){
            System.out.println("we get this error");
        }

    }
}
