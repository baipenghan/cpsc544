package ubc.cpsc544;

import java.awt.BasicStroke;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * A line chart demo showing the use of a custom drawing supplier.
 * 
 */
public class LineChartComparison {

	private ChartPanel chartPanel;
	private List<String> names;

	/**
	 * Creates a new demo.
	 */
	public LineChartComparison(List<String> names) {
		this.names = names;
		final CategoryDataset dataset = createDataset();
		final JFreeChart chart = createChart(dataset);
		this.chartPanel = new ChartPanel(chart);
		getChartPanel().setPreferredSize(new java.awt.Dimension(500, 270));
		// setContentPane(getChartPanel());

	}

	/**
	 * Creates a sample dataset.
	 * 
	 * @return a sample dataset.
	 */
	private CategoryDataset createDataset() {

		// row keys...
		final String series1 = "Me";
		final String series2 = "Jenny";
		final String series3 = "Ken";
		final String series4 = "Me (last year)";

		// column keys...
		final String type1 = "Jan";
		final String type2 = "Feb";
		final String type3 = "Mar";
		final String type4 = "April";
		final String type5 = "May";
		final String type6 = "June";
		final String type7 = "July";
		final String type8 = "Aug";
		final String type9 = "Sept";
		final String type10 = "Oct";
		final String type11 = "Nov";
		final String type12 = "Dec";

		// create the dataset...
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		final double[][] data = new double[][] { { 330.0, 430.0, 350.0, 880.0, 540.0, 100.0, 430.0, 350.0, 680.0, 540.0, 100.0, 430.0 },
				{ 100.0, 630.0, 350.0, 980.0, 540.0, 100.0, 430.0, 350.0, 680.0, 410.0, 330.0, 430.0 }, { 410.0, 330.0, 220.0, 340.0, 620.0, 410.0, 330.0, 220.0, 340.0, 620.0, 410.0, 330.0 },
				{ 340.0, 620.0, 410.0, 330.0, 220.0, 540.0, 100.0, 430.0, 350.0, 680.0, 540.0, 100.0}};

		dataset.addValue(data[0][0], series1, type1);
		dataset.addValue(data[0][1], series1, type2);
		dataset.addValue(data[0][2], series1, type3);
		dataset.addValue(data[0][3], series1, type4);
		dataset.addValue(data[0][4], series1, type5);
		dataset.addValue(data[0][5], series1, type6);
		dataset.addValue(data[0][6], series1, type7);
		dataset.addValue(data[0][7], series1, type8);
		dataset.addValue(data[0][8], series1, type9);
		dataset.addValue(data[0][9], series1, type10);
		dataset.addValue(data[0][10], series1, type11);
		dataset.addValue(data[0][11], series1, type12);

		if (names.contains("Jenny")) {
			dataset.addValue(data[1][0], series2, type1);
			dataset.addValue(data[1][1], series2, type2);
			dataset.addValue(data[1][2], series2, type3);
			dataset.addValue(data[1][3], series2, type4);
			dataset.addValue(data[1][4], series2, type5);
			dataset.addValue(data[1][5], series2, type6);
			dataset.addValue(data[1][6], series2, type7);
			dataset.addValue(data[1][7], series2, type8);
			dataset.addValue(data[1][8], series2, type9);
			dataset.addValue(data[1][9], series2, type10);
			dataset.addValue(data[1][10], series2, type11);
			dataset.addValue(data[1][11], series2, type12);
		}
		if (names.contains("Ken")) {
			dataset.addValue(data[2][0], series3, type1);
			dataset.addValue(data[2][1], series3, type2);
			dataset.addValue(data[2][2], series3, type3);
			dataset.addValue(data[2][3], series3, type4);
			dataset.addValue(data[2][4], series3, type5);
			dataset.addValue(data[2][5], series3, type6);
			dataset.addValue(data[2][6], series3, type7);
			dataset.addValue(data[2][7], series3, type8);
			dataset.addValue(data[2][8], series3, type9);
			dataset.addValue(data[2][9], series3, type10);
			dataset.addValue(data[2][10], series3, type11);
			dataset.addValue(data[2][11], series3, type12);
		}
		if (names.contains("Me (last year)")) {
			dataset.addValue(data[3][0], series4, type1);
			dataset.addValue(data[3][1], series4, type2);
			dataset.addValue(data[3][2], series4, type3);
			dataset.addValue(data[3][3], series4, type4);
			dataset.addValue(data[3][4], series4, type5);
			dataset.addValue(data[3][5], series4, type6);
			dataset.addValue(data[3][6], series4, type7);
			dataset.addValue(data[3][7], series4, type8);
			dataset.addValue(data[3][8], series4, type9);
			dataset.addValue(data[3][9], series4, type10);
			dataset.addValue(data[3][10], series4, type11);
			dataset.addValue(data[3][11], series4, type12);
		}
		return dataset;

	}

	/**
	 * Creates a sample chart.
	 * 
	 * @param dataset
	 *            the dataset.
	 * 
	 * @return a chart.
	 */
	private JFreeChart createChart(final CategoryDataset dataset) {

		final JFreeChart chart = ChartFactory.createLineChart("", // chart title
				"", // domain axis label
				"Enerygy Consumption (kWH)", // range axis label
				dataset, // data
				PlotOrientation.VERTICAL, // orientation
				true, // include legend
				true, // tooltips
				false // urls
				);

		// final StandardLegend legend = (StandardLegend) legendTitle;
		// legend.setDisplaySeriesShapes(true);

		final Shape[] shapes = new Shape[3];
		int[] xpoints;
		int[] ypoints;

		// right-pointing triangle
		xpoints = new int[] { -3, 3, -3 };
		ypoints = new int[] { -3, 0, 3 };
		shapes[0] = new Polygon(xpoints, ypoints, 3);

		// vertical rectangle
		shapes[1] = new Rectangle2D.Double(-2, -3, 3, 6);

		// left-pointing triangle
		xpoints = new int[] { -3, 3, 3 };
		ypoints = new int[] { 0, -3, 3 };
		shapes[2] = new Polygon(xpoints, ypoints, 3);

		final DrawingSupplier supplier = new DefaultDrawingSupplier(DefaultDrawingSupplier.DEFAULT_PAINT_SEQUENCE, DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE,
				DefaultDrawingSupplier.DEFAULT_STROKE_SEQUENCE, DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE, shapes);
		final CategoryPlot plot = chart.getCategoryPlot();
		plot.setDrawingSupplier(supplier);

		// chart.setBackgroundPaint(Color.yellow);

		// set the stroke for each series...
		plot.getRenderer().setSeriesStroke(0, new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1.0f, new float[] { 10.0f, 6.0f }, 0.0f));
		plot.getRenderer().setSeriesStroke(1, new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1.0f, new float[] { 6.0f, 6.0f }, 0.0f));
		plot.getRenderer().setSeriesStroke(2, new BasicStroke(2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1.0f, new float[] { 2.0f, 6.0f }, 0.0f));

		// customise the renderer...
		final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
		// renderer.setDrawShapes(true);
		renderer.setItemLabelsVisible(true);
		// renderer.setLabelGenerator(new StandardCategoryLabelGenerator());

		// customise the range axis...
		final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		rangeAxis.setAutoRangeIncludesZero(false);
		rangeAxis.setUpperMargin(0.12);

		// LegendTitle legendTitle = chart.getLegend();
		// legendTitle.setVisible(true);

		return chart;

	}

	public ChartPanel getChartPanel() {
		return chartPanel;
	}

}
