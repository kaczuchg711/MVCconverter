package kaczuch.c0.pl.Converter.Controller;

import kaczuch.c0.pl.Converter.Model.ConverterModel;
import kaczuch.c0.pl.Converter.View.ConverterView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class ConverterController
{
    private ConverterModel conventerModel;
    private ConverterView conventerView;

    public ConverterController(ConverterModel conventerModel, ConverterView conventerView)
    {
        this.conventerModel = conventerModel;
        this.conventerView = conventerView;

        this.conventerView.addConverterListener(new ConventerLisner());
    }

    class ConventerLisner implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            double input = 0;

            input = conventerView.getInputValue();

            double result = 0;
            JButton source = (JButton) e.getSource();

            String[] buttonsTexts =
                    {
                            "g to oz",
                            "cm to inch",
                            "l to gal",
                            "oz to g",
                            "inch to cm",
                            "gal to l"
                    };


            ArrayList<String> t = new ArrayList<>(Arrays.asList(buttonsTexts));

            String text = source.getText();

            switch (t.indexOf(text))
            {
                case 0:
                    result = conventerModel.g_to_oz(input);
                    break;
                case 1:
                    result = conventerModel.cm_to_inches(input);
                    break;
                case 2:
                    result = conventerModel.l_to_gal(input);
                    break;
                case 3:
                    result = conventerModel.oz_to_g(input);
                    break;
                case 4:
                    result = conventerModel.inches_to_cm(input);
                    break;
                case 5:
                    result = conventerModel.gal_to_l(input);
                    break;

            }

            conventerView.setResult(result);

        }
    }
}

