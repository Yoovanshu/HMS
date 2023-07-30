package User;

import java.util.Objects;
import java.util.Scanner;

public class HMS {
    public static void main(String[] args) {
//        System.out.println("Who are you? Doctor or Patient or Admin: ");
//        Scanner scan = new Scanner(System.in);
//        String user = scan.nextLine();

        Patient p1 = new Patient("23", "Singh", "111111");
        Patient p2 = new Patient("24", "YOYO", "222222");
        Patient p3 = new Patient("25", "HONEY", "333333");

        PatientList plist = new PatientList();
        plist.Insert(p1);
        plist.Insert(p2);
        plist.Insert(p3);

        System.out.println(plist.searchByID("23").getName());

        System.out.println(plist.searchByContact("333333").getName());

        System.out.println(plist.searchByName("YOYO").getId());
    }
}
