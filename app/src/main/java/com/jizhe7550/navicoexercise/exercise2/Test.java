package com.jizhe7550.navicoexercise.exercise2;


public class Test {
    
    public static void test() {
        Chart chartA = new Chart(0, 0, 2, 2, Color.WHITE);
        Chart chartB = new Chart(1, 1, 3, 3, Color.BLACK);
        View view = new View(chartA, chartB);
        
        System.out.println("colour at (1, 1) is " + view.GetColor(1, 1));
        System.out.println("colour at (3, 3) is " + view.GetColor(3, 3));
    }
    
    /**
     * This is android studio project , please run with Java
     *
     * Test in test package ViewTestClass
     * @param args
     */
    public static void main(String[] args) {
        test();
    }
}
