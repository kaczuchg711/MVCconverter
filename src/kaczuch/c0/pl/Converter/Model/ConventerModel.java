package kaczuch.c0.pl.Converter.Model;

public class ConventerModel
{
    public double inches_to_cm(double input)
    {
        return Math.round(input * 2.54 * 100.) / 100.;
    }

    public double cm_to_inches(double input)
    {
        return Math.round(input / 2.54 * 100.) / 100.;
    }

    public double gallon_to_litre(double input)
    {
        return Math.round(input * 3.78541178 * 100) / 100.;
    }

    public double litre_to_gallon(double input)
    {
        return Math.round((input / 3.78541178 * 100.) / 100.);
    }

    public double g_to_oz(double input)
    {
        return Math.round((input * 28.3495231 * 100) / 100.);
    }

    public double oz_to_g(double input)
    {
        return Math.round((input / 28.3495231 * 100.) / 100.);
    }
}