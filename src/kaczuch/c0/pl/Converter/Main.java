package kaczuch.c0.pl.Converter;
import kaczuch.c0.pl.Converter.*;
import kaczuch.c0.pl.Converter.View.ConverterView;

import java.awt.*;


public class Main
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                ConverterView cv = new ConverterView();
            }

        });
    }
}
