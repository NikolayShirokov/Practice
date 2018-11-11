package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main  extends JFrame {
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel label = new JLabel("VS", SwingConstants.CENTER);
    JLabel labelResult = new JLabel("Result: ", SwingConstants.CENTER);
    JLabel labelResultShow = new JLabel("0", SwingConstants.CENTER);
    JLabel labelResultShow2 = new JLabel("0", SwingConstants.CENTER);
    JLabel labelScorer = new JLabel("Last Scorer: ", SwingConstants.CENTER);
    JLabel labelScorerShow = new JLabel("", SwingConstants.CENTER);
    JLabel labelWinner = new JLabel("Winner: ", SwingConstants.CENTER);
    JLabel labelWinnerShow = new JLabel("", SwingConstants.CENTER);
    JLabel label2 = new JLabel();
    int value1 = 0;
    int value2 = 0;
    String text;

    public void winner (int a, int b) {
        if (a > b)
            labelWinnerShow.setText(button1.getText());
        else if (a == b)
            labelWinnerShow.setText("Draw");
        else if (a < b)
            labelWinnerShow.setText(button2.getText());
    }

    public Main() {
        super("Football Match");
        setDefaultCloseOperation(Main.EXIT_ON_CLOSE);
        setSize(450,300);
        setLayout(new GridLayout(4,3));
        add(button1, BorderLayout.NORTH); add(label); add(button2, BorderLayout.NORTH);
        add(labelResult); add(labelResultShow); add(labelResultShow2);
        add(labelScorer); add(labelScorerShow); add(label2);
        add(labelWinner); add(labelWinnerShow);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value1+=1;
                text = String.valueOf(value1);
                labelResultShow.setText(text);
                labelScorerShow.setText(button1.getText());
                winner(value1, value2);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value2 += 1;
                text = String.valueOf(value2);
                labelResultShow2.setText(text);
                labelScorerShow.setText(button2.getText());
                winner(value1, value2);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
