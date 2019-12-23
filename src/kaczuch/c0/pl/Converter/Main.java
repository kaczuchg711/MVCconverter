package kaczuch.c0.pl.Converter;

import kaczuch.c0.pl.Converter.Controller.ConverterController;
import kaczuch.c0.pl.Converter.Model.ConverterModel;
import kaczuch.c0.pl.Converter.View.ConverterView;

public class Main
{
    public static void main(String[] args)
    {

        ConverterView cv = new ConverterView();
        ConverterModel cm = new ConverterModel();
        ConverterController cc = new ConverterController(cm, cv);

        cv.setVisible(true);
    }
}