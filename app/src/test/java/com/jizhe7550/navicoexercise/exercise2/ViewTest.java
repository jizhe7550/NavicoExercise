package com.jizhe7550.navicoexercise.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ViewTest {
    
    @Test
    public void testGetColor() {
        Chart chartA = new Chart(0, 0, 2, 2, Color.BLACK);
        Chart chartB = new Chart(0, 1, 2, 3, Color.WHITE);
        View view = new View(chartA, chartB);
        
        //point in chartA
        Color testColor = view.GetColor(0, 0);
        assertTrue(testColor.equals(Color.BLACK));
        
        //point in overlap
        testColor = view.GetColor(1, 1);
        assertTrue(testColor.equals(Color.GRAY));
    
        //point in ChartB
        testColor = view.GetColor(1, 3);
        assertTrue(testColor.equals(Color.WHITE));
        
        //point out of both chartA and chart B
        testColor = view.GetColor(5, 5);
        assertTrue(testColor.equals(Color.BLACK));
        
    }
    
    @Test
    public void testPointInChart() {
        //point in Chart
        Point point = new Point(1, 1);
        Chart chart = new Chart(0, 0, 2, 2);
        boolean result = View.PointInChart(chart, point);
        assertTrue(result);
    
        //point out if Chart
        Point point2 = new Point(2, 3);
        Chart chart2 = new Chart(0, 0, 2, 2);
        boolean result4 = View.PointInChart(chart2, point2);
        assertFalse(result4);
    }
    
    @Test
    public void testDoChartsOverlap() {
        //ChartA is bigger than ChartB,  and ChartB is in ChartA
        Chart ChartA1 = new Chart(0, 0, 3, 3);
        Chart ChartB1 = new Chart(1, 1, 2, 2);
        boolean result1 = View.DoChartsOverlap(ChartA1, ChartB1);
        assertTrue(result1);
    
        //ChartA and ChartB have some overlapped areas.
        Chart ChartA2 = new Chart(0, 0, 3, 3);
        Chart ChartB2 = new Chart(1, 1, 4, 4);
        boolean result2 = View.DoChartsOverlap(ChartA2, ChartB2);
        assertTrue(result2);
    
        //ChartA and ChartB completely overlap.
        Chart ChartA3 = new Chart(0, 0, 3, 3);
        Chart ChartB3 = new Chart(0, 0, 3, 3);
        boolean result3 = View.DoChartsOverlap(ChartA3, ChartB3);
        assertTrue(result3);
    
        //ChartA is bigger than ChartB,  and ChartB is in ChartA
        Chart ChartA4 = new Chart(0, 0, 3, 3);
        Chart ChartB4 = new Chart(0, 0, 1, 1);
        boolean result4 = View.DoChartsOverlap(ChartA4, ChartB4);
        assertTrue(result4);
    }
    
    
    @Test
    public void testNonOverlap()
    {
        //ChartA and ChartB have no overlapped area.
        Chart chartA = new Chart(2, 2, 3, 3);
        Chart ChartB = new Chart(0, 2, 1, 3);
        boolean result1 = View.DoChartsOverlap(chartA, ChartB);
        assertFalse(result1);
    }
}