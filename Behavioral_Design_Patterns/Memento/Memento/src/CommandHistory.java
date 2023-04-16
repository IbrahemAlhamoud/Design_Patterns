import java.util.LinkedList;
import java.util.Stack;

public class CommandHistory {


        private static Stack<MementoInterface> mementoInterfaceStack = new Stack<>();
        private static LinkedList<String> printMsg = new LinkedList<>();

        private static  boolean check = false;


    public static LinkedList<String> getPrintMsg() {
        return printMsg;
    }


    public static Stack<MementoInterface> getMementoInterfaceStack() {
        return mementoInterfaceStack;
    }

    public static void setMementoInterfaceStack(Stack<MementoInterface> mementoInterfaceStack1) {
        mementoInterfaceStack = mementoInterfaceStack1;
    }

    public static boolean isCheck() {
        return check;
    }

    public static void setCheck(boolean check) {
        CommandHistory.check = check;
    }
}

