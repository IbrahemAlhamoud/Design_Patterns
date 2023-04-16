
import java.util.LinkedList;
import java.util.Stack;

public class CommandHistory {

    private static Stack<String> history =new Stack<>();


    private static String s ="";
    private static String s2 ="";

    private static  String CountDelete  ;

    private static boolean CheckNext= false;
    private static boolean CheckPrevious= false;

    private static LinkedList<String> printMsg = new LinkedList<>();
    private static LinkedList<String> s1 = new LinkedList<>();

    private static LinkedList<String> add = new LinkedList<>();
    private static  int Count  ;

    private static  int CountTran  ;

    private static Integer Point = 100 ;



    public static Integer getPoint() {
        return Point;
    }

    public static void setPoint(Integer point) {
        Point = point;
    }


    public static LinkedList<String> getPrintMsg() {
        return printMsg;
    }

    public static String getCountDelete() {
        return CountDelete;
    }

    public static void setCountDelete(String countDelete) {
        CountDelete = countDelete;
    }

    public static boolean isCheckPrevious() {
        return CheckPrevious;
    }

    public static void setCheckPrevious(boolean checkPrevious) {
        CheckPrevious = checkPrevious;
    }

    public static boolean getCheckNext() {
        return CheckNext;
    }

    public static void setCheckNext(boolean checkNext) {
        CheckNext = checkNext;
    }

    public static int getCountTran() {
        return CountTran;
    }

    public static void setCountTran(int countTran) {
        CountTran = countTran;
    }

    public static int getCount() {
        return Count;
    }

    public static void setCount(int count) {
        Count = count;
    }

    public static void setS2(String s2) {
        CommandHistory.s2 = s2;
    }

    public static String getS2() {
        return s2;
    }

    public static void setS(String s) {
        CommandHistory.s = s;
    }

    public static LinkedList<String> getAdd() {
        return add;
    }

    public static LinkedList<String> getS1() {
        return s1;
    }

    public static Stack<String> getHistory() {
        return history;
    }

    public static String convert (){
        //System.out.println(getHistory().size());
        String arr = history.pop();
        s=s.concat(arr);
        getS1().add(s);
        s2=getS1().getLast();
        getS1().clear();



        return  s2;

    }




}
