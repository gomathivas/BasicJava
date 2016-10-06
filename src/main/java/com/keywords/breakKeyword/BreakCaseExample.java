package com.keywords.breakKeyword;

/**
 * Created by gpunyakoti on 10/6/2016.
 */
public class BreakCaseExample {

    private void testBreakForLoop() {
        System.out.println("Break Keyword test in for loop");
        for (int i = 0; i < 100; i += 10) {

            if (i > 50) {
                System.out.println("For count > 50 :" + i);
                break;
            }
            System.out.println("count = " + i);
        }
    }

    private void testBreakWhileLoop() {
        System.out.println("Break Keyword test in while loop");
        int i = 0;
        while (true) {
            i += 5;

            if (i > 10) {
                System.out.println("while number > 10 " + i);
                break;
            }
            System.out.println("number = " + i);
        }
    }

    private void testBreakSwitchCase() {
        System.out.println("Break And case Keyword test in switch case");
        int month_index = 2;
        String month = "";
        switch (month_index) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
        }
        System.out.println("The month of month index " + month_index + " is" + month);
    }

    private void testBreakLabel() {
        System.out.println("Break Keyword test in while loop");
        int outerLoopCount = 1;
        testBreak:
        while (true) {
            for (int i = 1; i < 300; i += 50) {
                if (i > 200) {
                    System.out.println("Breaks inner For Loop");
                    break;
                }
                if (outerLoopCount > 3) {
                    System.out.println("Break outer loop with label teatBreak");
                    break testBreak;
                }
            }
            outerLoopCount++;
        }
    }

    public static void main(String[] args) {
        BreakCaseExample b = new BreakCaseExample();
        b.testBreakForLoop();
        b.testBreakWhileLoop();
        b.testBreakSwitchCase();
        b.testBreakLabel();
    }
}
