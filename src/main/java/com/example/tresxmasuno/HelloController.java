package com.example.tresxmasuno;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private LineChart<Number, Number> lcGrafica;
    @FXML private TextField tfNumero;

    @FXML void iniciar() {
        double numero= Double.parseDouble(tfNumero.getText());
        XYChart.Series series = new XYChart.Series();
        series.setName(numero+"");
        for (int i=0;numero>1;i++){
            if(numero%2==0){
                numero=numero/2;
            }else {
                numero=(3*numero)+1;
            }
            series.getData().add(new XYChart.Data(i, numero));
            //System.out.println(numero);
        }
        lcGrafica.getData().add(series);

    }
}