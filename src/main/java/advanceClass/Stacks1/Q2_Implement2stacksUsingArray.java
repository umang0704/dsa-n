package advanceClass.Stacks1;

public class Q2_Implement2stacksUsingArray {
    private static Integer[] store;
    private static Integer top1, top2;

    static void pushS1(Integer data) {
        if (top1 + 1 != top2) {
            store[++top1] = data;
            printStacks();
        } else {
            System.out.println("Overflow");
        }
    }

    static void pushS2(Integer data) {
        if (top2 - 1 != top1) {
            store[--top2] = data;
            printStacks();
        } else {
            System.out.println("Overflow");
        }

    }

    static void pop2() {
        if (top2 < store.length) {
            System.out.println(store[top2++]);
        }
    }

    static void pop1() {
        if (top1 > -1) System.out.println(store[top1--]);
    }

    static void peek1() {
        if (top1 != -1) System.out.println(store[top1]);
    }

    static void peep2() {
        if (top2 != store.length) System.out.println(store[top2]);
    }

    static void printStacks() {
        System.out.print("Stack 1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(store[i] + " ");
        }
        System.out.println();
        System.out.print("Stack 2: ");
        for (int i = store.length - 1; i >= top2; i--) {
            System.out.print(store[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 5;
        store = new Integer[size];
        top1 = -1;
        top2 = size;
        printStacks();
        pushS1(-2);
        pushS2(10);
        pushS2(11);
        pushS1(21);
        pushS1(1);
        pushS2(11);


    }
}
