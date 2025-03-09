package com.latihanKuis;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PilihanKendaraan extends JFrame implements ActionListener{
    JLabel labelPembuka = new JLabel("Selamat Datang User Koclok");
    JButton buttonMotor = new JButton("Motor");
    JButton buttonMobil = new JButton("Mobil");
    
    PilihanKendaraan() {
        setVisible(true);
        setSize(480, 360);
        setTitle("Pilihan Kendaraan");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(50,50,50));

        labelPembuka.setForeground(Color.WHITE);
        labelPembuka.setFont(new Font("Arial",Font.BOLD,20));
        labelPembuka.setBounds(100, 100, 300, 40);

        add(labelPembuka);
        add(buttonMobil);
        add(buttonMotor);

        buttonMobil.setBounds(120, 180, 100, 40);
        buttonMotor.setBounds(240, 180, 100, 40);

        buttonMobil.setForeground(Color.WHITE);
        buttonMobil.setBackground(Color.GREEN);
        buttonMobil.setFont(new Font("Arial",Font.BOLD,15));

        
        buttonMotor.setForeground(Color.WHITE);
        buttonMotor.setBackground(Color.BLUE);
        buttonMotor.setFont(new Font("Arial",Font.BOLD,15));

        buttonMobil.addActionListener(this);
        buttonMotor.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == buttonMobil) {
                new DetailPenyewaan("Mobil");
                this.dispose();

            } else if (e.getSource() == buttonMotor) {
                new DetailPenyewaan("Motor");
                this.dispose();
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }

    
}