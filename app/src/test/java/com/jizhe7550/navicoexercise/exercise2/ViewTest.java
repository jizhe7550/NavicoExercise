package com.jizhe7550.navicoexercise.exercise2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theory;

import static org.junit.Assert.*;

public class ViewTest {
    
    @Test
    public void testGetColor() {
        Chart chartTop = new Chart(0, 0, 2, 2, Color.BLACK);
        Chart chartBottom = new Chart(0, 1, 2, 3, Color.WHITE);
        View view = new View(chartTop, chartBottom);
        Color testColor = view.GetColor(0, 0);
        assertTrue(testColor.equals(Color.BLACK));
        testColor = view.GetColor(1, 1);
        assertTrue(testColor.equals(Color.GRAY));
        testColor = view.GetColor(5, 5);
        assertTrue(testColor.equals(Color.BLACK));
        
    }
    
    @Test
    public void testPointInChart() {
        Point point = new Point(1, 1);
        Chart chart = new Chart(0, 0, 2, 2);
        boolean result = View.PointInChart(chart, point);
    
        assertTrue(result);
        
        Point point2 = new Point(0, 0);
        Chart chart2 = new Chart(0, 0, 2, 2);
        boolean result2 = View.PointInChart(chart2, point2);
    
        assertTrue(result2);
    
        Point point3 = new Point(0, 1);
        Chart chart3 = new Chart(0, 0, 2, 2);
        boolean result3 = View.PointInChart(chart3, point3);
    
        assertTrue(result3);
    
        Point point4 = new Point(2, 2);
        Chart chart4 = new Chart(0, 0, 2, 2);
        boolean result4 = View.PointInChart(chart4, point4);
    
        assertTrue(result4);
    }
    
    @Test
    public void testDoChartsOverlap() {
        Chart bigChart1 = new Chart(0, 0, 3, 3);
        Chart testChart1 = new Chart(1, 1, 2, 2);
        boolean result1 = View.DoChartsOverlap(bigChart1, testChart1);
    
        assertTrue(result1);
    
        Chart bigChart2 = new Chart(0, 0, 3, 3);
        Chart testChart2 = new Chart(1, 1, 4, 4);
        boolean result2 = View.DoChartsOverlap(bigChart2, testChart2);
    
        assertTrue(result2);
    
        Chart bigChart3 = new Chart(0, 0, 3, 3);
        Chart testChart3 = new Chart(0, 0, 3, 3);
        boolean result3 = View.DoChartsOverlap(bigChart3, testChart3);
    
        assertTrue(result3);
    
        Chart bigChart4 = new Chart(0, 0, 3, 3);
        Chart testChart4 = new Chart(0, 0, 1, 1);
        boolean result4 = View.DoChartsOverlap(bigChart4, testChart4);
    
        assertTrue(result4);
    
        Chart bigChart5 = new Chart(0, 0, 3, 3);
        Chart testChart5 = new Chart(2, 2, 3, 3);
        boolean result5 = View.DoChartsOverlap(bigChart5, testChart5);
    
        assertTrue(result5);
    }
    
    
    @Test
    public void testNonOverlap()
    {
        Chart chart1 = new Chart(2, 2, 3, 3);
        Chart testChart1 = new Chart(0, 2, 1, 3);
        boolean result1 = View.DoChartsOverlap(chart1, testChart1);
    
        assertTrue(result1);
    
        Chart chart2 = new Chart(2, 2, 3, 3);
        Chart testChart2 = new Chart(2, 0, 3, 1);
        boolean result2 = View.DoChartsOverlap(chart2, testChart2);
    
        assertTrue(result2);
    
        Chart chart3 = new Chart(2, 2, 3, 3);
        Chart testChart3 = new Chart(2, 4, 3, 5);
        boolean result3 = View.DoChartsOverlap(chart3, testChart3);
    
        assertTrue(result3);
    
        Chart chart4 = new Chart(2, 2, 3, 3);
        Chart testChart4 = new Chart(4, 2, 5, 3);
        boolean result4 = View.DoChartsOverlap(chart4, testChart4);
    
        assertTrue(result4);
    
        Chart chart5 = new Chart(2, 2, 3, 3);
        Chart testChart5 = new Chart(5, 5, 10, 10);
        boolean result5 = View.DoChartsOverlap(chart5, testChart5);
    
        assertTrue(result5);
    }
}