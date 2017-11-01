/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomctr;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.*;
import java.awt.geom.*;
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
import javax.imageio.*;
import sun.audio.*;
/**
 *
 * @author MichaelParker
 */
class randomSelect extends RandomCTR{
  private  BufferedImage imgFlag;
  private  BufferedImage imgP1;
  private  BufferedImage imgP2;
  private  BufferedImage imgP3;
  private  BufferedImage imgP4;
  private  BufferedImage imgC1;
  private  BufferedImage imgC2;
  private  BufferedImage imgC3;
  private  BufferedImage imgC4;
  private  BufferedImage imgCrash;
  private  BufferedImage imgNtropy;
  private  BufferedImage imgCoco;
  private  BufferedImage imgCortex;
  private  BufferedImage imgDingodile;
  private  BufferedImage imgFake;
  private  BufferedImage imgPenta;
  private  BufferedImage imgPinstripe;
  private  BufferedImage imgPapu;
  private  BufferedImage imgRipper;
  private  BufferedImage imgTiny;
  private  BufferedImage imgNgin;
  private  BufferedImage imgKomodo;
  private  BufferedImage imgPura;
  private  BufferedImage imgPolar;
  public randomSelect() throws IOException{
        Graphics2D graphSettings;
        
        Random randPlayer1 = new Random();
        Random randPlayer2 = new Random(); 
        Random randPlayer3 = new Random(); 
        Random randPlayer4 = new Random();
        Random randCup = new Random();
               
        JLabel randPlayer1Label = new JLabel();
        JLabel randPlayer2Label = new JLabel();
        JLabel randPlayer3Label = new JLabel();
        JLabel randPlayer4Label = new JLabel();
        JLabel randCupLabel = new JLabel();
        
        try{
         imgP1 = ImageIO.read(getClass().getResource("Crash.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
          imgP2 = ImageIO.read(getClass().getResource("Crash.jpg"));  
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
          imgP3 = ImageIO.read(getClass().getResource("Crash.jpg"));  
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
          imgP4 = ImageIO.read(getClass().getResource("Crash.jpg"));  
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
          imgC1 = ImageIO.read(getClass().getResource("Wumpa.jpg"));  
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
          imgC2 = ImageIO.read(getClass().getResource("Crystal.jpg"));  
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
          imgC3 = ImageIO.read(getClass().getResource("Nitro.jpg"));  
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
          imgC4 = ImageIO.read(getClass().getResource("CrashCup.jpg"));  
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgCrash = ImageIO.read(getClass().getResource("Crash.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgNtropy = ImageIO.read(getClass().getResource("NTropy.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgCoco = ImageIO.read(getClass().getResource("Coco.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgCortex = ImageIO.read(getClass().getResource("Cortex.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgDingodile = ImageIO.read(getClass().getResource("Dingodile.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgFake = ImageIO.read(getClass().getResource("FakeCrash.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgPenta = ImageIO.read(getClass().getResource("PentaPenguin.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgPinstripe = ImageIO.read(getClass().getResource("Pinstripe.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgPapu = ImageIO.read(getClass().getResource("PapuPapu.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgRipper = ImageIO.read(getClass().getResource("RipperRoo.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgTiny = ImageIO.read(getClass().getResource("Tinyicon.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgNgin = ImageIO.read(getClass().getResource("NGin.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgKomodo = ImageIO.read(getClass().getResource("KomodoJoe.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgPura = ImageIO.read(getClass().getResource("Pura.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
         imgPolar = ImageIO.read(getClass().getResource("Polar.jpg"));
        } catch(IOException e){
            e.printStackTrace();
        }
        try{
            imgFlag = ImageIO.read(getClass().getResource("flag.png"));
        } catch(IOException e){
            e.printStackTrace();
        }
        ImageIcon imgP1a = new ImageIcon(imgP1);
        ImageIcon imgP2a = new ImageIcon(imgP2);
        ImageIcon imgP3a = new ImageIcon(imgP3);
        ImageIcon imgP4a = new ImageIcon(imgP4);
        ImageIcon imgC1a = new ImageIcon(imgC1);
        ImageIcon imgC2a = new ImageIcon(imgC2);
        ImageIcon imgC3a = new ImageIcon(imgC3);
        ImageIcon imgC4a = new ImageIcon(imgC4);
        ImageIcon imgCrash1 = new ImageIcon(imgCrash);
        ImageIcon imgNtropy1 = new ImageIcon(imgNtropy);
        ImageIcon imgCoco1 = new ImageIcon(imgCoco);
        ImageIcon imgCortex1 = new ImageIcon(imgCortex);
        ImageIcon imgDingodile1 = new ImageIcon(imgDingodile);
        ImageIcon imgFake1 = new ImageIcon(imgFake);
        ImageIcon imgPenta1 = new ImageIcon(imgPenta);
        ImageIcon imgPinstripe1 = new ImageIcon(imgPinstripe);
        ImageIcon imgPapu1 = new ImageIcon(imgPapu);
        ImageIcon imgRipper1 = new ImageIcon(imgRipper);
        ImageIcon imgTiny1 = new ImageIcon(imgTiny);
        ImageIcon imgNgin1 = new ImageIcon(imgNgin);
        ImageIcon imgKomodo1 = new ImageIcon(imgKomodo);
        ImageIcon imgPura1 = new ImageIcon(imgPura);
        ImageIcon imgPolar1 = new ImageIcon(imgPolar);
        ImageIcon imgFlag1 = new ImageIcon(imgFlag);
        
        
        int refreshChar1 = randPlayer1.nextInt(15) + 1;
        int refreshChar2 = randPlayer2.nextInt(15) + 1;
        int refreshChar3 = randPlayer1.nextInt(15) + 1;
        int refreshChar4 = randPlayer1.nextInt(15) + 1;
        
        Font myFont = new Font("Crash-A-Like", Font.PLAIN, 16);
                int randP1 = randPlayer1.nextInt(15) + 1;
        
        randPlayer1Label.setFont(myFont);
        randPlayer1Label.setText("Random Character for Player 1");
        switch (randP1) {
            case 1:
                randPlayer1Label.setText("P1: N. Tropy");
                imgP1a = imgNtropy1;
                break;
            case 2:
                randPlayer1Label.setText("P1: Crash");
                imgP1a = imgCrash1;
                break;
            case 3:
                randPlayer1Label.setText("P1: Cortex");
                imgP1a = imgCortex1;
                break;
            case 4:
                randPlayer1Label.setText("P1: Tiny");
                imgP1a = imgTiny1;
                break;
            case 5:
                randPlayer1Label.setText("P1: Coco");
                imgP1a = imgCoco1;
                break;
            case 6:
                randPlayer1Label.setText("P1: Pinstripe");
                imgP1a = imgPinstripe1;
                break;
            case 7:
                randPlayer1Label.setText("P1: Ripper Roo");
                imgP1a = imgRipper1;
                break;
            case 8:
                randPlayer1Label.setText("P1: N. Gin");
                imgP1a = imgNgin1;
                break;
            case 9:
                randPlayer1Label.setText("P1: Dingodile");
                imgP1a = imgDingodile1;
                break;
            case 10:
                randPlayer1Label.setText("P1: Polar");
                imgP1a = imgPolar1;
                break;
            case 11:
                randPlayer1Label.setText("P1: Pura");
                imgP1a = imgPura1;
                break;
            case 12:
                randPlayer1Label.setText("P1: Papu Papu");
                imgP1a = imgPapu1;
                break;
            case 13:
                randPlayer1Label.setText("P1: Komodo Joe");
                imgP1a = imgKomodo1;
                break;
            case 14:
                randPlayer1Label.setText("P1: Penta Penguin");
                imgP1a = imgPenta1;
                break;
            case 15:
                randPlayer1Label.setText("P1: Fake Crash");
                imgP1a = imgFake1;
                break;
            default:
                break;
        }
    
        
        int randP2 = randPlayer2.nextInt(15) + 1;
        randPlayer2Label.setFont(myFont);
        
        randPlayer2Label.setText("Random Character for Player 2");
        switch (randP2) {
            case 1:
                randPlayer2Label.setText("P2: N. Tropy");
                imgP2a = imgNtropy1;
                break;
            case 2:
                randPlayer2Label.setText("P2: Crash");
                imgP2a = imgCrash1;
                break;
            case 3:
                randPlayer2Label.setText("P2: Cortex");
                imgP2a = imgCortex1;
                break;
            case 4:
                randPlayer2Label.setText("P2: Tiny");
                imgP2a = imgTiny1;
                break;
            case 5:
                randPlayer2Label.setText("P2: Coco");
                imgP2a = imgCoco1;
                break;
            case 6:
                randPlayer2Label.setText("P2: Pinstripe");
                imgP2a = imgPinstripe1;
                break;
            case 7:
                randPlayer2Label.setText("P2: Ripper Roo");
                imgP2a = imgRipper1;
                break;
            case 8:
                randPlayer2Label.setText("P2: N. Gin");
                imgP2a = imgNgin1;
                break;
            case 9:
                randPlayer2Label.setText("P2: Dingodile");
                imgP2a = imgDingodile1;
                break;
            case 10:
                randPlayer2Label.setText("P2: Polar");
                imgP2a = imgPolar1;
                break;
            case 11:
                randPlayer2Label.setText("P2: Pura");
                imgP2a = imgPura1;
                break;
            case 12:
                randPlayer2Label.setText("P2: Papu Papu");
                imgP2a = imgPapu1;
                break;
            case 13:
                randPlayer2Label.setText("P2: Komodo Joe");
                imgP2a = imgKomodo1;
                break;
            case 14:
                randPlayer2Label.setText("P2: Penta Penguin");
                imgP2a = imgPenta1;
                break;
            case 15:
                randPlayer2Label.setText("P2: Fake Crash");
                imgP2a = imgFake1;
                break;
            default:
                break;
        }
        
        int randP3 = randPlayer3.nextInt(15) + 1;
        randPlayer3Label.setFont(myFont);
        randPlayer3Label.setText("Random Character for Player 3");
        switch (randP3) {
            case 1:
                randPlayer3Label.setText("P3: N. Tropy");
                imgP3a = imgNtropy1;
                break;
            case 2:
                randPlayer3Label.setText("P3: Crash");
                imgP3a = imgCrash1;
                break;
            case 3:
                randPlayer3Label.setText("P3: Cortex");
                imgP3a = imgCortex1;
                break;
            case 4:
                randPlayer3Label.setText("P3: Tiny");
                imgP3a = imgTiny1;
                break;
            case 5:
                randPlayer3Label.setText("P3: Coco");
                imgP3a = imgCoco1;
                break;
            case 6:
                randPlayer3Label.setText("P3: Pinstripe");
                imgP3a = imgPinstripe1;
                break;
            case 7:
                randPlayer3Label.setText("P3: Ripper Roo");
                imgP3a = imgRipper1;
                break;
            case 8:
                randPlayer3Label.setText("P3: N. Gin");
                imgP3a = imgNgin1;
                break;
            case 9:
                randPlayer3Label.setText("P3: Dingodile");
                imgP3a = imgDingodile1;
                break;
            case 10:
                randPlayer3Label.setText("P3: Polar");
                imgP3a = imgPolar1;
                break;
            case 11:
                randPlayer3Label.setText("P3: Pura");
                imgP3a = imgPura1;
                break;
            case 12:
                randPlayer3Label.setText("P3: Papu Papu");
                imgP3a = imgPapu1;
                break;
            case 13:
                randPlayer3Label.setText("P3: Komodo Joe");
                imgP3a = imgKomodo1;
                break;
            case 14:
                randPlayer3Label.setText("P3: Penta Penguin");
                imgP3a = imgPenta1;
                break;
            case 15:
                randPlayer3Label.setText("P3: Fake Crash");
                imgP3a = imgFake1;
                break;
            default:
                break;
        }
        
        int randP4 = randPlayer4.nextInt(15) + 1;
        randPlayer4Label.setFont(myFont);
        randPlayer4Label.setText("Random Character for Player 4");
        switch (randP4) {
            case 1:
                randPlayer4Label.setText("P4: N. Tropy");
                imgP4a = imgNtropy1;
                break;
            case 2:
                randPlayer4Label.setText("P4: Crash");
                imgP4a = imgCrash1;
                break;
            case 3:
                randPlayer4Label.setText("P4: Cortex");
                imgP4a = imgCortex1;
                break;
            case 4:
                randPlayer4Label.setText("P4: Tiny");
                imgP4a = imgTiny1;
                break;
            case 5:
                randPlayer4Label.setText("P4: Coco");
                imgP4a = imgCoco1;
                break;
            case 6:
                randPlayer4Label.setText("P4: Pinstripe");
                imgP4a = imgPinstripe1;
                break;
            case 7:
                randPlayer4Label.setText("P4: Ripper Roo");
                imgP4a = imgRipper1;
                break;
            case 8:
                randPlayer4Label.setText("P4: N. Gin");
                imgP4a = imgNgin1;
                break;
            case 9:
                randPlayer4Label.setText("P4: Dingodile");
                imgP4a = imgDingodile1;
                break;
            case 10:
                randPlayer4Label.setText("P4: Polar");
                imgP4a = imgPolar1;
                break;
            case 11:
                randPlayer4Label.setText("P4: Pura");
                imgP4a = imgPura1;
                break;
            case 12:
                randPlayer4Label.setText("P4: Papu Papu");
                imgP4a = imgPapu1;
                break;
            case 13:
                randPlayer4Label.setText("P4: Komodo Joe");
                imgP4a = imgKomodo1;
                break;
            case 14:
                randPlayer4Label.setText("P4: Penta Penguin");
                imgP4a = imgPenta1;
                break;
            case 15:
                randPlayer4Label.setText("P4: Fake Crash");
                imgP4a = imgFake1;
                break;
            default:
                break;
        }
        
        
 
        int randC = randCup.nextInt(4) + 1;
        randCupLabel.setFont(myFont);
        randCupLabel.setText("Random Cup");
        switch(randC){
            case 1:
                randCupLabel.setText("Wumpa Cup");
                imgC1a = imgC1a;
                break;
            case 2:
                randCupLabel.setText("Crystal Cup");
                imgC1a = imgC2a;
                break;
            case 3:
                randCupLabel.setText("Nitro Cup");
                imgC1a = imgC3a;
                break;
            case 4:
                randCupLabel.setText("Crash Cup");
                imgC1a = imgC4a;
                break;
            default:
                break;
          }
        
          
        
        
        

        
        JFrame newFrame = new JFrame();
        newFrame.setSize(1600, 800);
        newFrame.setTitle("Random CTR");
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel buttonPanel = new JPanel();
        JPanel characterPanel = new JPanel();
        JPanel iconPanel = new JPanel();
        
        
        
        Box newBox = Box.createHorizontalBox();
        
        
        JButton button1 = new JButton();
        button1.setFont(myFont);
        button1.setText("P1: Select");
        JButton button2 = new JButton();
        button2.setFont(myFont);
        button2.setText("P2: Select");
        JButton button3 = new JButton();
        button3.setFont(myFont);
        button3.setText("P3: Select");
        JButton button4 = new JButton();
        button4.setFont(myFont);
        button4.setText("P4: Select");
        JButton button5 = new JButton();
        button5.setFont(myFont);
        button5.setText("Select Cup");
        JButton button6 = new JButton();
        button6.setFont(myFont);
        button6.setText("Reset");
        
        newBox.add(button1);
        newBox.add(button2);
        newBox.add(button3);
        newBox.add(button4);
        newBox.add(button5);
        newBox.add(button6);
        
        buttonPanel.add(newBox);
        
        JLabel randP1Icon = new JLabel(imgP1a);
        JLabel randP2Icon = new JLabel(imgP2a);
        JLabel randP3Icon = new JLabel(imgP3a);
        JLabel randP4Icon = new JLabel(imgP4a);
        JLabel randCIcon = new JLabel(imgC1a);
        JLabel background = new JLabel(imgFlag1);
        
        button1.addActionListener(new ActionListener() {
                                
				public void actionPerformed(ActionEvent e) {
					randPlayer1Label.setVisible(true);
                                        randP1Icon.setVisible(true);
                                              
				}
            });
        button2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					randPlayer2Label.setVisible(true);
                                        randP2Icon.setVisible(true);
        
				}
            });
        button3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					randPlayer3Label.setVisible(true);
                                        randP3Icon.setVisible(true);
					
				}
            });
        button4.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					randPlayer4Label.setVisible(true);
                                        randP4Icon.setVisible(true);
					
				}
            }); 
        button5.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					randCupLabel.setVisible(true);
                                        randCIcon.setVisible(true);
					
				}
            }); 
        button6.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					randCupLabel.setVisible(false);
                                        randCIcon.setVisible(false);
                                        randPlayer1Label.setVisible(false);
                                        randP1Icon.setVisible(false);
                                        
                                        randPlayer2Label.setVisible(false);
                                        randP2Icon.setVisible(false);
                                        randPlayer3Label.setVisible(false);
                                        randP3Icon.setVisible(false);
                                        randPlayer4Label.setVisible(false);
                                        randP4Icon.setVisible(false);
                                        
                                        
                                        
                                        
				}
                                
            }); 
        
      
        newFrame.setContentPane(background);
        newFrame.setVisible(true);
        newFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        characterPanel.add(randPlayer1Label);
        
        randPlayer1Label.setVisible(false);
        
        characterPanel.add(randPlayer2Label);
        randPlayer2Label.setVisible(false);
        
        characterPanel.add(randPlayer3Label);
        randPlayer3Label.setVisible(false);
        
        characterPanel.add(randPlayer4Label);
        randPlayer4Label.setVisible(false);
        
        characterPanel.add(randCupLabel);
        randCupLabel.setVisible(false);
        
        
        
        randPlayer1Label.setLocation(200, 100);
        randPlayer2Label.setLocation(200, 100);
        randPlayer3Label.setLocation(200, 100);
        randPlayer4Label.setLocation(250, 100);
        
        iconPanel.add(randP1Icon);
        iconPanel.add(randP2Icon);
        iconPanel.add(randP3Icon);
        iconPanel.add(randP4Icon);
        iconPanel.add(randCIcon);
        randP1Icon.setVisible(false);
        randP2Icon.setVisible(false);
        randP3Icon.setVisible(false);
        randP4Icon.setVisible(false);
        randCIcon.setVisible(false);
        randCIcon.setLocation(600, 300);
        
        newFrame.add(iconPanel, gbc);
        
        newFrame.add(characterPanel, gbc);
        
        newFrame.add(buttonPanel, gbc);
        
        
        
        
        newFrame.pack();
        
        iconPanel.setLocation(200,200);
        buttonPanel.setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}




public abstract class RandomCTR {
      
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
   
    randomSelect rand = new randomSelect();

        
    }
    
}
