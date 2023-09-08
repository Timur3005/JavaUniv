package fifth;

import javax.swing.*;
import java.awt.*;

public class RealVsMilanView extends JFrame {

    static Integer realScores = 0;
    static Integer milanScores = 0;
    static String lastScorer = "N/A";
    static String winner = "DRAW";

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("main view");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 800);
        JButton buttonRealMadrid = new JButton("Real Madrid");
        JButton buttonMilan = new JButton("AC Milan");
        JLabel jResult = new JLabel("Result: "+realScores.toString()+" X "+milanScores);
        JLabel jLastScore = new JLabel("Last Scorer: "+lastScorer);
        JLabel jWinner = new JLabel("Winner: "+winner);

        jFrame.setLayout(new GridLayout(   1,5));

        jFrame.add(buttonRealMadrid);
        jFrame.add(jResult);
        jFrame.add(jLastScore);
        jFrame.add(jWinner);
        jFrame.add(buttonMilan);

        buttonMilan.addActionListener(e -> {
            milanScores++;
            lastScorer = "AC Milan";
            jResult.setText("Result: "+realScores.toString()+" X "+milanScores);
            jLastScore.setText("Last Scorer: "+lastScorer);
            compareAndSet();
            jWinner.setText("Winner: "+winner);

        });
        buttonRealMadrid.addActionListener(e -> {
            realScores++;
            lastScorer = "Real Madrid";
            jResult.setText("Result: "+ realScores +" X "+milanScores);
            compareAndSet();
            jWinner.setText("Winner: "+winner);
        });

        jFrame.setVisible(true);
    }

    private static void compareAndSet(){
        if (realScores>milanScores){
            winner = "Real Madrid";
        } else if (realScores.equals(milanScores)) {
            winner = "DRAW";
        }
        else{
            winner = "AC Milan";
        }
    }
}
