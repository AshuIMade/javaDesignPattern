import com.desgnPatterns.stuctural.adapters.adapter.DrawPoint;
import com.desgnPatterns.stuctural.adapters.adapter.Point;

public class StructuralDpRun {
    public static void demoAdapterDp(){
        //given interface is point drawerlike
        Point point = new Point(2,3);
        DrawPoint.drawPoint(point);
        DrawPoint.drawLine();
        //but we want to draw rectangle but how

    }
}
