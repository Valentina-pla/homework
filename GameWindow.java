package lesson1;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private int winWidth = 1300;
    private int winHeight = 768;
    private int winPosX = 150;
    private int winPosY = 90;

    private JPanel gui;
    private GameMap map;

    private JPanel appControlsPanel;
    private JButton btnStartGame;
    private JButton btnExitGame;
    private JButton btnRestartGame;
    private JButton btnPlayerInfo;
    private JButton btnEnemyInfo;
    private JButton btnMapSize;


    GameWindow() {

        setWindow();
        map = new GameMap();
        setUpAppControl();
        setUpGui();
        add(gui, BorderLayout.NORTH);
        add(map);

        setVisible(true);


    }

    private void setUpGui() {

        gui = new JPanel();
        gui.setLayout(new GridLayout(1, 1));
        setUpAppControl();

        gui.add(appControlsPanel);


    }

    private void setUpAppControl() {
        appControlsPanel = new JPanel();
        appControlsPanel.setLayout(new GridLayout(1, 1));

        btnStartGame = new JButton("Start game");
        btnRestartGame = new JButton("Restart game");
        btnPlayerInfo = new JButton("Player Info");
        btnEnemyInfo = new JButton("Enemy Info");
        btnMapSize = new JButton("Map Size");
        btnExitGame = new JButton("Exit game");


        appControlsPanel.add(btnStartGame);
        appControlsPanel.add(btnRestartGame);
        appControlsPanel.add(btnPlayerInfo);
        appControlsPanel.add(btnEnemyInfo);
        appControlsPanel.add(btnMapSize);
        appControlsPanel.add(btnExitGame);


    }


    private void setWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(winWidth, winHeight);
        setLocation(winPosX, winPosY);
        setResizable(false);
        setTitle("Window");

    }
}
