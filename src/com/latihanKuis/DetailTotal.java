package com.latihanKuis;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

class DetailTotal extends JFrame implements ActionListener {
    JLabel labelJudul = new JLabel("Detail dan Total Harga");  
    JLabel labelNama, labelTelepon, labelKendaraan, labelHari, labelTotal;
    JButton selesaiButton = new JButton ("Selesai");
    
    DetailTotal(String nama, String telepon, String kendaraan, int hari, int total) {
        setTitle("Detail dan Total Harga");
        setSize(480, 360);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(50,50,50));

        labelJudul.setForeground(Color.WHITE);
        labelJudul.setFont(new Font("Arial", Font.BOLD, 20));
        labelJudul.setBounds(20, 20, 300, 40);
        
        JLabel labelNama = new JLabel("Nama Penyewa: " + nama);
        labelNama.setForeground(Color.WHITE);
        labelNama.setFont(new Font("Arial", Font.BOLD, 15));
        labelNama.setBounds(20, 70, 300, 30);


        JLabel labelTelepon = new JLabel("Nomor Telepon: " + telepon);
        labelTelepon.setForeground(Color.WHITE);
        labelTelepon.setFont(new Font("Arial", Font.BOLD, 15));
        labelTelepon.setBounds(20, 100, 300, 30);

        JLabel labelKendaraan = new JLabel("Jenis Kendaraan: " + kendaraan);
        labelKendaraan.setForeground(Color.WHITE);
        labelKendaraan.setFont(new Font("Arial", Font.BOLD, 15));
        labelKendaraan.setBounds(20, 130, 300, 30);

        JLabel labelHari = new JLabel("Lama Sewa: " + hari + " hari");
        labelHari.setForeground(Color.WHITE);
        labelHari.setFont(new Font("Arial", Font.BOLD, 15));
        labelHari.setBounds(20, 160, 300, 30);
        JLabel labelTotal = new JLabel("Total Harga: $" + total);
        labelTotal.setForeground(Color.WHITE);
        labelTotal.setFont(new Font("Arial", Font.BOLD, 15));
        labelTotal.setBounds(20, 190, 300, 30);

        selesaiButton.setForeground(Color.WHITE);
        selesaiButton.setBackground(Color.GREEN);
        selesaiButton.setFont(new Font("Arial", Font.BOLD, 15));
        selesaiButton.setBounds(150, 220, 100, 30);
        selesaiButton.addActionListener(this);

        add(labelJudul);
        add(labelNama);
        add(labelTelepon);
        add(labelKendaraan);
        add(labelHari);
        add(labelTotal);
        add(selesaiButton);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selesaiButton) {
            dispose();
        }
    }
}
