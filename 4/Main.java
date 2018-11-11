package com.company;

import javax.swing.*;
import java.awt.*;

public class Main  extends JFrame {
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private JLabel labelResultShow = new JLabel("0", SwingConstants.CENTER);
    private JLabel labelResultShow2 = new JLabel("0", SwingConstants.CENTER);
    private JLabel labelScorerShow = new JLabel("", SwingConstants.CENTER);
    private JLabel labelWinnerShow = new JLabel("", SwingConstants.CENTER);
    private int value1 = 0;
    private int value2 = 0;
    private String text;

    private void winner(int a, int b) {
        if (a > b)
            labelWinnerShow.setText(button1.getText());
        else if (a == b)
            labelWinnerShow.setText("Draw");
        else labelWinnerShow.setText(button2.getText());
    }

    private Main() {
        super("Football Match");
        setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
        setSize(450,300);
        setLayout(new GridLayout(4,3));
        add(button1);
        JLabel label = new JLabel("VS", SwingConstants.CENTER);
        add(label); add(button2);
        JLabel labelResult = new JLabel("Result: ", SwingConstants.CENTER);
        add(labelResult); add(labelResultShow); add(labelResultShow2);
        JLabel labelScorer = new JLabel("Last Scorer: ", SwingConstants.CENTER);
        add(labelScorer); add(labelScorerShow);
        JLabel label2 = new JLabel();
        add(label2);
        JLabel labelWinner = new JLabel("Winner: ", SwingConstants.CENTER);
        add(labelWinner); add(labelWinnerShow);

        button1.addActionListener(e -> {
            value1+=1;
            text = String.valueOf(value1);
            labelResultShow.setText(text);
            labelScorerShow.setText(button1.getText());
            winner(value1, value2);
        });

        button2.addActionListener(e -> {
            value2 += 1;
            text = String.valueOf(value2);
            labelResultShow2.setText(text);
            labelScorerShow.setText(button2.getText());
            winner(value1, value2);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
