package about_interface.game_dev.B;

import about_interface.game_dev.A.SortObject;
import about_interface.game_dev.bianjie.ISortable;

public class UseSortObject {
    public static void main(String[] args) {
        ISortable sortObject = new SortObject();
        long[] array={1,2,3};
        sortObject.sort(array,0,array.length);
    }
}
