import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static final String RED = "\033[0;31m";     // RED
    public static final String YELLOW = "\033[0;33m";  // YELLO
    public static final String GREEN = "\033[0;32m"; // GREEN

    public static void showAll(Composite c){
        String i []= {
                RED,YELLOW
        };

        ArrayList family = c.family();
        System.out.println(family.size());
        for (int j = 0, familySize = family.size(); j < familySize; j++) {
            Object o = family.get(j);
            if (j%2==0) {
                System.out.println(i[0] + o);

            } else {
                System.out.println(i[1] + o);
            }
        }

    }
    public static void main(String[] args) {



        FamilyMembers aneesParent = new FamilyMembers(
                1,
                "Anees",
                new Addrees("st. zero", "Zarqa"),
                new Details("Male", 95)
        );

        FamilyMembers rasheedParent = new FamilyMembers(
                2,
                "Rasheed",
                new Addrees("st. one", "Mafraq"),
                new Details("Male", 90)
        );

        FamilyMembers hikmat = new FamilyMembers(
                3,
                "Hikmat",
                new Addrees("st. two", "East Zarqa"),
                new Details("Male", 55)
        );

        FamilyMembers ibrahem = new FamilyMembers(
                4,
                "ibrahem",
                new Addrees("st. three", "West Zarqa"),
                new Details("Male", 30)
        );
        FamilyMembers taher = new FamilyMembers(
                5,
                "Taher",
                new Addrees("st. four", "Amman"),
                new Details("Male", 29)
        );

        FamilyMembers saed  = new FamilyMembers(
                6,
                "Saed",
                new Addrees("st. five", "Aqaba"),
                new Details("Male", 28)
        );

        aneesParent.addChildren(hikmat);
        



        Composite composite1 = new Composite();
        composite1.add(aneesParent);
        composite1.add(rasheedParent);

        showAll(composite1);
        System.out.println(GREEN+"-----------------------------------------");

        Composite composite2 = new Composite();
        composite2.add(rasheedParent);
        showAll(composite2);      

        System.out.println(GREEN+"-----------------------------------------");
        Composite composite3 = new Composite();
        composite3.add(composite1);
        composite3.add(saed);
         showAll(composite3);
        System.out.println(GREEN+"-----------------------------------------");








    }


}