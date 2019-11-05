package file.system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 enum Brother
{DINESH,RAKESH,MAHI,MANOJ;


}


public class ListDelete {
    public static void main(String[] args) {
        System.out.println("value "+Brother.valueOf("DINESH").equals(Brother.DINESH));
        System.out.println("value 2 "+"DINESH".equals(Brother.DINESH));
    }
}
