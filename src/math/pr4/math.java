package math.pr4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class preferredWeapon extends JFrame {
    JButton firstWeapon = new JButton("Gauss Flayer");
    JButton secondWeapon = new JButton("Bolter");
    JLabel score = new JLabel("");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");

    private int scoreFirstWeapon = 0;
    private int scoreSecondWeapon = 0;

    public preferredWeapon() {
        super("Bolter vs Gauss Flayer");
        setLayout(null);
        Font fontForScore = new Font("Times new Roman", Font.PLAIN, 30);

        firstWeapon.setBounds(20, 200, 150, 20);
        secondWeapon.setBounds(310, 200, 150, 20);
        score.setBounds(200,50,100,40);
        score.setText(scoreFirstWeapon + " : " + scoreSecondWeapon);
        score.setFont(fontForScore);
        winner.setBounds(110,10,300,25);
        winner.setFont(fontForScore);
        lastScorer.setBounds(165,90,150,20);

        add(firstWeapon);
        add(secondWeapon);
        add(score);
        add(lastScorer);
        add(winner);

        firstWeapon.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                scoreFirstWeapon++;
                score.setText(scoreFirstWeapon + " : " + scoreSecondWeapon);
                lastScorer.setText("Preferred weapon: Gauss Flayer");
                winnerUpdate();

            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });

        secondWeapon.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                scoreSecondWeapon++;
                score.setText(scoreFirstWeapon + " : " + scoreSecondWeapon);
                lastScorer.setText("Preferred weapon: Bolter");
                winnerUpdate();
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });

        setSize(500, 300);
    }

    private void winnerUpdate() {
        if (scoreFirstWeapon > scoreSecondWeapon) {
            winner.setText("Winner: Gauss Flayer");
        } else if (scoreFirstWeapon < scoreSecondWeapon) {
            winner.setText("Winner: Bolter");
        } else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new preferredWeapon().setVisible(true);
    }
}