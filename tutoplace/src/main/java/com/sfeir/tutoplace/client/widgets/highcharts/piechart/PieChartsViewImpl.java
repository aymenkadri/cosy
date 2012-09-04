package com.sfeir.tutoplace.client.widgets.highcharts.piechart;

import org.moxieapps.gwt.highcharts.client.Chart;
import org.moxieapps.gwt.highcharts.client.Legend;
import org.moxieapps.gwt.highcharts.client.Point;
import org.moxieapps.gwt.highcharts.client.Series;
import org.moxieapps.gwt.highcharts.client.ToolTip;
import org.moxieapps.gwt.highcharts.client.ToolTipData;
import org.moxieapps.gwt.highcharts.client.ToolTipFormatter;
import org.moxieapps.gwt.highcharts.client.labels.DataLabelsData;
import org.moxieapps.gwt.highcharts.client.labels.DataLabelsFormatter;
import org.moxieapps.gwt.highcharts.client.labels.PieDataLabels;
import org.moxieapps.gwt.highcharts.client.plotOptions.PiePlotOptions;
import org.moxieapps.gwt.highcharts.client.plotOptions.PlotOptions;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.sfeir.tutoplace.client.widgets.highcharts.piechart.PieChartsActivity.PieChartsView;

public class PieChartsViewImpl extends Composite implements PieChartsView {

	private static HighChartsViewImplUiBinder uiBinder = GWT
			.create(HighChartsViewImplUiBinder.class);

	@UiField
	SimplePanel chart;
	
	interface HighChartsViewImplUiBinder extends UiBinder<Widget, PieChartsViewImpl> {
	}

	public PieChartsViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		chart.add(createChart());
	}
	
	private Chart createChart() {  
		  
        final Chart chart = new Chart()  
            .setType(Series.Type.PIE)  
            .setChartTitleText("Pourcentage des différents placements pour un portefeuille donné, 2010")  
            .setPlotBackgroundColor((String) null)  
            .setPlotBorderWidth(null)  
            .setPlotShadow(false)  
            .setAnimation(false)
            .setPiePlotOptions(new PiePlotOptions()  
                .setAllowPointSelect(true)  
                .setCursor(PlotOptions.Cursor.POINTER)
                .setAnimation(false)
                .setPieDataLabels(new PieDataLabels()  
                    .setConnectorColor("#000000")  
                    .setEnabled(true)  
                    .setColor("#000000")  
                    .setFormatter(new DataLabelsFormatter() {  
                        public String format(DataLabelsData dataLabelsData) {  
                            return "<b>" + dataLabelsData.getPointName() + "</b>: " + dataLabelsData.getYAsDouble() + " %";  
                        }  
                    })  
                )  
            )  
            .setLegend(new Legend()  
                .setLayout(Legend.Layout.VERTICAL)  
                .setAlign(Legend.Align.RIGHT)  
                .setVerticalAlign(Legend.VerticalAlign.TOP)  
                .setX(-100)  
                .setY(100)  
                .setFloating(true)  
                .setBorderWidth(1)  
                .setBackgroundColor("#FFFFFF")  
                .setShadow(true)  
            )  
            .setToolTip(new ToolTip()  
                .setFormatter(new ToolTipFormatter() {  
                    public String format(ToolTipData toolTipData) {  
                        return "<b>" + toolTipData.getPointName() + "</b>: " + toolTipData.getYAsDouble() + " %";  
                    }  
                })  
            );  
  
        chart.addSeries(chart.createSeries()  
            .setName("Browser share")  
            .setPoints(new Point[]{  
                new Point("Placement 1", 45.0),  
                new Point("Placement 2", 26.8),  
                new Point("Placement 3", 12.8)  
                    .setSliced(true)  
                    .setSelected(true),  
                new Point("Placement 4", 8.5),  
                new Point("Placement 5", 6.2),  
                new Point("Others", 0.7)  
            })  
        );  
  
        return chart;  
    }  
	
	
	
	

}
