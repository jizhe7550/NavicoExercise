package com.jizhe7550.navicoexercise.exercise2;

public class View {
    public Chart chartA;
    public Chart chartB;
    private boolean isOverlap;
    private Chart overlapChart;
    
    public View(Chart chartA, Chart chartB)
    {
        this.chartA = chartA;
        this.chartB = chartB;
        this.isOverlap = DoChartsOverlap(chartA, chartB);
        if (isOverlap) {
            int overlapTopLeftX = Math.max(chartA.topLeft.x, chartB.topLeft.x);
            int overlapTopLeftY = Math.max(chartA.topLeft.y, chartB.topLeft.y);
            int overlapBottomRightX = Math.min(chartA.bottomRight.x, chartB.bottomRight.x);
            int overlapBottomRightY = Math.min(chartA.bottomRight.y, chartB.bottomRight.y);
            int overlapRed = (chartA.bgColor.red + chartB.bgColor.red) / 2;
            int overlapGreen = (chartA.bgColor.green + chartB.bgColor.green) / 2;
            int overlapBlue = (chartA.bgColor.blue + chartB.bgColor.blue) / 2;
            Color overlapColor = new Color(overlapRed, overlapGreen, overlapBlue);
            
            overlapChart = new Chart(overlapTopLeftX, overlapTopLeftY,
                    overlapBottomRightX, overlapBottomRightY, overlapColor);
        }
    }
    
    public Color GetColor(int x, int y) {
        Point point = new Point(x, y);
        if (isOverlap && PointInChart(overlapChart, point)) {
            return overlapChart.bgColor;
        } else if (PointInChart(chartA, point)) {
            return chartA.bgColor;
        } else if (PointInChart(chartB, point)) {
            return chartB.bgColor;
        } else {
            return Color.BLACK;
        }
    }
    
    public static boolean PointInChart(Chart chart, Point point) {
        int pointX = point.x;
        int pointY = point.y;
        
        return pointX >= chart.topLeft.x && pointX <= chart.bottomRight.x
                && pointY >= chart.topLeft.y && pointY <= chart.bottomRight.y;
    }
    
    public static boolean DoChartsOverlap(Chart chart1, Chart chart2) {
        boolean nonOverlap = chart1.topLeft.x > chart2.bottomRight.x || chart1.topLeft.y > chart2.bottomRight.y
                || chart1.bottomRight.x < chart2.topLeft.x || chart1.bottomRight.y < chart2.topLeft.y;
        
        return !nonOverlap;
    }
}
