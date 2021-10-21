package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SorterFinderTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Test was succesfull: " + result.wasSuccessful());

        System.out.println("Time measure began");
        TimeTest timeTest = new TimeTest();
        long[][] time = timeTest.measure(10);

        System.out.println("Bubble sort results:");
        for (int i = 0; i < time[0].length; i++) {
            System.out.print(time[0][i] + "ms ");
        }
        System.out.println();

        System.out.println("Quick sort results:");
        for (int i = 0; i < time[1].length; i++) {
            System.out.print(time[1][i] + "ms ");
        }

    }
}
