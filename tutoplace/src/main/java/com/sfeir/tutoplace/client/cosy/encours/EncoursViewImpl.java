package com.sfeir.tutoplace.client.cosy.encours;

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
import com.sfeir.tutoplace.client.cosy.encours.EncoursActivity.EncoursView;

public class EncoursViewImpl extends Composite implements EncoursView {

	private static HighChartsViewImplUiBinder uiBinder = GWT
			.create(HighChartsViewImplUiBinder.class);

	@UiField
	SimplePanel chart;

	interface HighChartsViewImplUiBinder extends UiBinder<Widget, EncoursViewImpl> {
	}

	public EncoursViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		chart.add(createChart());
	}
	
	public Chart createChart() {  
		  
        final Chart chart = new Chart()  
            .setType(Series.Type.PIE)  
            .setChartTitleText("Répartition de l'encours")  
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
                new Point("Fonds Euro", 93.66),  
                new Point("Action Française - Général", 3.57),  
                new Point("Diversifiés International - Gestion Flexible", 1.91)  
                    .setSliced(true)  
                    .setSelected(true),  
                new Point("Actions Asiatique - Zones Particulières", 0.86),  
            })  
        );  
  
        return chart;  
    }  


}
