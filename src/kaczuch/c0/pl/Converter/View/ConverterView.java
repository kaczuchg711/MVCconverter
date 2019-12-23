package kaczuch.c0.pl.Converter.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ConverterView extends JFrame
{
    private MainPanel panel;

    static class MainPanel extends JPanel
    {
        private static final int WIDTH = 400;
        private static final int HEIGHT = 200;

        private InputPanel ip;

        private ButtonsPanel bp;

        private LabelPanel lp;

        static private class InputPanel extends JPanel
        {
            private JTextField tf1;

            public InputPanel()
            {
                ArrayList<JTextField> list = new ArrayList<>();
                this.tf1 = new JTextField("0");

                list.add(tf1);

                GridLayout l = new GridLayout(1, 3);
                l.setHgap(5);

                this.setLayout(l);
                this.setPreferredSize(new Dimension(150, 20));

                for (JTextField t : list)
                {
                    this.add(t);
                }
            }

            public JTextField getTf1()
            {
                return tf1;
            }
        }

        static private class ButtonsPanel extends JPanel
        {
            private JButton b1;
            private JButton b2;
            private JButton b3;
            private JButton b4;
            private JButton b5;
            private JButton b6;

            public ButtonsPanel()
            {
                ArrayList<JButton> list = new ArrayList<JButton>();
                this.b1 = new JButton("g to oz");
                this.b2 = new JButton("cm to inch");
                this.b3 = new JButton("l to gal");
                this.b4 = new JButton("oz to g");
                this.b5 = new JButton("inch to cm");
                this.b6 = new JButton("gal to l");

                list.add(b1);
                list.add(b2);
                list.add(b3);
                list.add(b4);
                list.add(b5);
                list.add(b6);

                GridLayout l = new GridLayout(2, 3);
                l.setVgap(5);
                l.setHgap(5);

                this.setLayout(l);

                for (JButton b : list)
                {
                    this.add(b);
                }
            }

            public JButton[] getAllButtons()
            {
                JButton[] table = {this.b1, this.b2, this.b3, this.b4, this.b5, this.b6};
                return table;
            }
        }

        static private class LabelPanel extends JPanel
        {
            JLabel l1;

            public LabelPanel()
            {

                this.setPreferredSize(new Dimension(150, 20));

                ArrayList<JLabel> list = new ArrayList<JLabel>();
                l1 = new JLabel("a");

                list.add(l1);

                GridLayout gl = new GridLayout(1, 3);
                gl.setHgap(5);

                this.setLayout(gl);

                for (JLabel l : list)
                {
                    this.setBackground(new Color(0xD0D0D0));
                    this.add(l);
                }

            }

            public JLabel getL1()
            {
                return l1;
            }

        }

        public MainPanel()
        {
//            this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            this.setLocation(100, 100);

            ip = new InputPanel();
            bp = new ButtonsPanel();
            lp = new LabelPanel();

            FlowLayout l = new FlowLayout();
            l.setVgap(20);
            this.setLayout(l);

            this.add(this.ip);
            this.add(this.bp);
            this.add(this.lp);
        }

        public InputPanel getIp()
        {
            return ip;
        }

        public LabelPanel getLp()
        {
            return lp;
        }

        public ButtonsPanel getBp()
        {
            return bp;
        }
    }

    public ConverterView()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Converter");
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(new Color(0x474747));

        this.panel = new MainPanel();
        this.add(panel);

        this.pack();

    }

    public MainPanel getPanel()
    {
        return panel;
    }

    public double getInputValue()
    {
        return Double.parseDouble(this.getPanel().getIp().getTf1().getText());
    }

    public void setResult(double result)
    {
        panel.getLp().getL1().setText(String.valueOf(result));
    }

    public void addConverterListener(ActionListener listenForCalcButtons)
    {
        JButton[] buttons = this.getPanel().getBp().getAllButtons();

        for (JButton b : buttons)
        {
            b.addActionListener(listenForCalcButtons);
        }
    }
}