/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanmenggambar;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.BasicStroke;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author hp
 */
public class LatihanMenggambar extends JApplet {

    public static void main(String[] args) {
        JFrame frame = new JFrame ();
        frame.setTitle("Menggambar Pemandangan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new LatihanMenggambar ();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public void init () {
        JPanel panel = new Panel2D ();
        getContentPane().add(panel);
    }
    
    class Panel2D extends JPanel {
        
        public Panel2D (){
            setPreferredSize(new Dimension(1010, 570)); // mengatur ukuran panel
            setBackground(Color.blue); // mengatur warna background
        }
        
        public void paintComponent (Graphics g){
            super.paintComponent(g);
            
            g.setColor(new Color(103, 206, 2)); // memberikan warna hijau
            g.fillRect(0, 320, 1020, 300); // mengisi warna
            g.setColor(new Color(1, 191, 254)); // memberikan warna biru muda
            g.fillRect(0, 0, 1020, 320); // mengisi warna
            
            // membuat jalan
            g.setColor(Color.BLACK);
            g.fillRect(0, 300, 1020, 100);
            
            // membuat garis pada jalan
            Graphics2D gd = (Graphics2D) g;
            gd.setColor(Color.white);
            float[] dash = {20.0f};
            BasicStroke strok = new BasicStroke(3.0f, BasicStroke.CAP_SQUARE,
            BasicStroke.JOIN_MITER, 1.0f, dash, 0.0f);
            gd.setStroke(strok);
            gd.draw(new Line2D.Double(10, 350, 1000, 350));
            
            // membuat matahari
            g.setColor(new Color(253, 172, 2)); // memberikan warna kuning
            g.fillOval(475, 190, 100, 100); // mengisi warna
            
            // membuat pegunungan
            g.setColor(new Color(0, 145, 0)); // warna hijau
            int xPoly[]= {450, 600, 300};
            int yPoly[]= {200, 300, 300};
            Graphics2D gd2 = (Graphics2D) g;
            gd2.fillPolygon(xPoly, yPoly, xPoly.length);
            
            g.setColor(new Color(0, 145, 0)); //warna hijau
            int xPoly2[]= {600, 750, 450};
            int yPoly2[]= {200, 300, 300};
            gd2.fillPolygon(xPoly2, yPoly2, xPoly2.length);
            
            // menggambar awan
            gd2.setColor(Color.WHITE); // memberikan warna putih
            
            //awan pertama, 3 bentuk oval yang berdempetan
            g.fillOval(30, 70, 100, 50);
            g.fillOval(90, 70, 90, 10);
            g.fillOval(125, 70, 100, 50);
            
            // awan kedua, 1bentuk oval
            g.fillOval(330, 70, 200, 50);
            
            //awan ketiga
            g.fillOval(730, 70, 100, 50);
            g.fillOval(790,  70, 90, 40);
            g.fillOval(825, 70, 100, 50);
            
            // membuat ban mobil
            g.setColor(Color.red); // memberikan warna pink
            g.fillRect(210, 305, 100, 30); // membuat badan bawah mobil
            g.fillOval(210, 280, 100, 45); // membuat badan atas mobil
            g.fillArc(180, 298, 60, 70, 0, 180);// membuat bemper belakang
            g.fillArc(285, 298, 60, 70, 0, 180);// membuat bemper depan
            
            // membuat lampu
            g.setColor(Color.yellow); // memberikan warna lampu kuning
            g.fillArc(318, 301, 23, 23, 0, 80);// membuat lampu depan
            
            // membuat ban depan
            g.setColor(Color.BLACK); // memberikan warna hitam
            g.fillOval(298, 313, 32, 32); // membuat tempat ban depan
            g.setColor(Color.WHITE); // memberikan warna putih
            g.fillOval(304, 319, 20, 20); // membuat ban depan
            
            // membuat ban belakang
            g.setColor(Color.BLACK); // memberikan warna hitam
            g.fillOval(198, 313, 32, 32); // membuat tempat ban dbelakang
            g.setColor(Color.WHITE); // memberikan warna putih
            g.fillOval(204, 319, 20, 20); // membuat ban belakang
            
            // membuat jendela depan
            g.setColor(Color.BLACK); // memberikan warna hitam
            g.fillArc(230, 285, 70, 40, 0, 90); // membuat dasar jendela depan
            g.setColor(Color.GRAY); // memberikan warna abu-abu
            g.fillArc(234, 286, 64, 36, 0, 90);// membuat kaca jendela depan
            
            // membuat jendela belakang
            g.setColor(Color.BLACK); // memberikan warna hitam
            g.fillArc(220, 285, 70, 40, 90, 90); // membuat dasar jendela depan
            g.setColor(Color.GRAY); // memberikan warna abu-abu
            g.fillArc(222, 286, 64, 36, 90, 90);// membuat kaca jendela depan
        
            g.setColor(Color.GREEN);
            g.fillOval(360, 210, 30, 50);
            g.fillOval(350, 230, 30, 30);
            g.fillOval(370, 230, 30, 30);
            g.fillRect(370, 240, 9, 60);
            
            // membuat pohon pertama
            g.setColor(Color.GREEN);
            g.fillOval(660, 210, 30, 50);
            g.fillOval(650, 230, 30, 30);
            g.fillOval(670, 230, 30, 30);
            g.fillRect(670, 240, 9, 60);
            
            // membuat pohon kedua
            g.setColor(Color.GREEN);
            g.fillOval(860, 210, 30, 50);
            g.fillOval(850, 230, 30, 30);
            g.fillOval(870, 230, 30, 30);
            g.fillRect(870, 240, 9, 60);
            
            // membuat pohon ketiga
            g.setColor(Color.GREEN);
            g.fillOval(150, 210, 30, 50);
            g.fillOval(140, 230, 30, 30);
            g.fillOval(160, 230, 30, 30);
            g.fillRect(160, 240, 9, 60);
            
            // membuat pohon keempat
            g.setColor(Color.GREEN);
            g.fillOval(780, 300, 30, 40);
            g.fillOval(770, 320, 30, 30);
            g.fillOval(790, 320, 30, 30);
            g.fillRect(790, 340, 9, 60);
            
            // membuat pohon kelima
            g.setColor(Color.GREEN);
            g.fillOval(930, 300, 30, 40);
            g.fillOval(920, 320, 30, 30);
            g.fillOval(940, 320, 30, 30);
            g.fillRect(940, 340, 9, 60);
            
           // membuat pohon keenam
            g.setColor(Color.GREEN);
            g.fillOval(80, 300, 30, 40);
            g.fillOval(70, 320, 30, 30);
            g.fillOval(90, 320, 30, 30);
            g.fillRect(90, 340, 9, 60);
            
            // membuat pohon ketujuh
            g.setColor(Color.GREEN);
            g.fillOval(390, 300, 30, 40);
            g.fillOval(380, 320, 30, 30);
            g.fillOval(400, 320, 30, 30);
            g.fillRect(400, 340, 9, 60);
            
            // membuat pohon keempat
            g.setColor(Color.GREEN);
            g.fillOval(590, 300, 30, 40);
            g.fillOval(580, 320, 30, 30);
            g.fillOval(600, 320, 30, 30);
            g.fillRect(600, 340, 9, 60);
            
            // membuat tanaman pertama
            g.setColor(new Color(0, 140, 0)); // memberikan warna hijau
            g.fillOval(0, 550, 30, 30);
            g.fillOval(25, 550, 30, 30);
            g.fillOval(50, 550, 30, 30);
            g.fillOval(15, 530, 30, 30);
            g.fillOval(32, 530, 30, 30);
            
            // mebuat tanaman kedua
            g.fillOval(90, 430, 30, 30);
            g.fillOval(115, 430, 30, 30);
            g.fillOval(140, 430, 30, 30);
            g.fillOval(105, 410, 30, 30);
            g.fillOval(122, 410, 30, 30);
            
            // mebuat tanaman ketiga
            g.fillOval(180, 500, 30, 30);
            g.fillOval(203, 500, 30, 30);
            g.fillOval(230, 500, 30, 30);
            g.fillOval(195, 480, 30, 30);
            g.fillOval(212, 480, 30, 30);
            
            // mebuat tanaman keempat
            g.fillOval(270, 430, 30, 30);
            g.fillOval(295, 430, 30, 30);
            g.fillOval(320, 430, 30, 30);
            g.fillOval(285, 410, 30, 30);
            g.fillOval(302, 410, 30, 30);
            
            // mebuat tanaman kelima
            g.fillOval(390, 550, 30, 30);
            g.fillOval(415, 550, 30, 30);
            g.fillOval(440, 550, 30, 30);
            g.fillOval(405, 530, 30, 30);
            g.fillOval(422, 530, 30, 30);
            
            // mebuat tanaman keenam
            g.fillOval(510, 430, 30, 30);
            g.fillOval(535, 430, 30, 30);
            g.fillOval(560, 430, 30, 30);
            g.fillOval(525, 410, 30, 30);
            g.fillOval(542, 410, 30, 30);
            
            // mebuat tanaman ketujuh
            g.fillOval(600, 500, 30, 30);
            g.fillOval(625, 500, 30, 30);
            g.fillOval(650, 500, 30, 30);
            g.fillOval(615, 480, 30, 30);
            g.fillOval(632, 480, 30, 30);
            
            // mebuat tanaman kedelapan
            g.fillOval(690, 430, 30, 30);
            g.fillOval(715, 430, 30, 30);
            g.fillOval(740, 430, 30, 30);
            g.fillOval(705, 410, 30, 30);
            g.fillOval(722, 410, 30, 30);
            
            // mebuat tanaman kesimbilan
            g.fillOval(780, 550, 30, 30);
            g.fillOval(805, 550, 30, 30);
            g.fillOval(830, 550, 30, 30);
            g.fillOval(795, 530, 30, 30);
            g.fillOval(812, 530, 30, 30);
            
            // mebuat tanaman kesepuluh
            g.fillOval(870, 430, 30, 30);
            g.fillOval(895, 430, 30, 30);
            g.fillOval(920, 430, 30, 30);
            g.fillOval(885, 410, 30, 30);
            g.fillOval(902, 410, 30, 30);
            
            // mebuat tanaman kesebelas
            g.fillOval(960, 500, 30, 30);
            g.fillOval(985, 500, 30, 30);
            g.fillOval(1010, 500, 30, 30);
            g.fillOval(975, 480, 30, 30);
            g.fillOval(992, 480, 30, 30);
            
            
            
            
            
        }
    }
}
