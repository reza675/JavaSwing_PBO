package com.latihanKuis;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetailPenyewaan extends JFrame implements ActionListener{
    JLabel labelKategoriSewa = new JLabel();
    JLabel labelsubjudul = new JLabel("Silahkan mengisi detail penyewaan:");
    JLabel labelNamaPenyewa = new JLabel("Nama Penyewa");
    JLabel labelNomorTelepon = new JLabel("Nomor Telepon");
    JLabel labelHari = new JLabel("Lama Sewa/Hari");

    JTextField namaPenyewaTextField = new JTextField();
    JTextField nomorTeleponTextField = new JTextField();
    JTextField lamaSewaTextField = new JTextField();

    JRadioButton radioButtonMobil1 = new JRadioButton("Ferari $2000");
    JRadioButton radioButtonMobil2 = new JRadioButton("Honda $1000");
    JRadioButton radioButtonMobil3 = new JRadioButton("Toyota $1500");
    JRadioButton radioButtonMotor1 = new JRadioButton("Suzuki $200");
    JRadioButton radioButtonMotor2 = new JRadioButton("Yamaha $300");
    JRadioButton radioButtonMotor3 = new JRadioButton("Supra $400");

    JButton submitButton = new JButton("Submit");
    JButton kembaliButton = new JButton("Kembali");

    DetailPenyewaan(String kategoriSewa) {
        setVisible(true);
        setSize(480, 360);
        setTitle("Detail Penyawaan");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(50,50,50));

        labelKategoriSewa.setText("Kategori Kendaraan " + kategoriSewa);
        labelKategoriSewa.setForeground(Color.WHITE);
        labelKategoriSewa.setFont(new Font("Arial",Font.BOLD,20));
        labelKategoriSewa.setBounds(20, 20, 300, 30);

        labelsubjudul.setForeground(Color.WHITE);
        labelsubjudul.setFont(new Font("Arial",Font.BOLD,14));
        labelsubjudul.setBounds(20, 50, 300, 30);

        labelNamaPenyewa.setForeground(Color.WHITE);
        labelNamaPenyewa.setFont(new Font("Arial",Font.BOLD,14));
        labelNamaPenyewa.setBounds(20, 90, 150, 20);

        labelNomorTelepon.setForeground(Color.WHITE);
        labelNomorTelepon.setFont(new Font("Arial",Font.BOLD,14));
        labelNomorTelepon.setBounds(20, 130, 150, 20);

        labelHari.setForeground(Color.WHITE);
        labelHari.setFont(new Font("Arial",Font.BOLD,14));
        labelHari.setBounds(20, 200, 150, 20);

        namaPenyewaTextField.setBounds(200, 90, 240, 25);
        nomorTeleponTextField.setBounds(200,130,240,25);
        lamaSewaTextField.setBounds(200, 200, 240, 25);

        submitButton.setForeground(Color.WHITE);
        submitButton.setBackground(Color.GREEN);
        submitButton.setFont(new Font("Arial",Font.BOLD,14));
        submitButton.setBounds(100, 250, 100, 40);

        kembaliButton.setForeground(Color.WHITE);
        kembaliButton.setBackground(Color.RED);
        kembaliButton.setFont(new Font("Arial",Font.BOLD,14));
        kembaliButton.setBounds(250, 250, 100, 40);



        if(kategoriSewa.equals("Mobil")){
            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(radioButtonMobil1);
            buttonGroup.add(radioButtonMobil2);
            buttonGroup.add(radioButtonMobil3);

            radioButtonMobil1.setForeground(Color.WHITE);
            radioButtonMobil2.setForeground(Color.WHITE);
            radioButtonMobil3.setForeground(Color.WHITE);
            radioButtonMobil1.setBackground(new Color(50,50,50));
            radioButtonMobil2.setBackground(new Color(50,50,50));
            radioButtonMobil3.setBackground(new Color(50,50,50));

            radioButtonMobil1.setBounds(50,170,120,20);
            radioButtonMobil2.setBounds(170,170,120,20);
            radioButtonMobil3.setBounds(290,170,120,20);
            add(radioButtonMobil1);
            add(radioButtonMobil2);
            add(radioButtonMobil3);
        }else if(kategoriSewa.equals("Motor")){
            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(radioButtonMotor1);
            buttonGroup.add(radioButtonMotor2);
            buttonGroup.add(radioButtonMotor3);

            radioButtonMotor1.setForeground(Color.WHITE);
            radioButtonMotor2.setForeground(Color.WHITE);
            radioButtonMotor3.setForeground(Color.WHITE);
            radioButtonMotor1.setBackground(new Color(50,50,50));
            radioButtonMotor2.setBackground(new Color(50,50,50));
            radioButtonMotor3.setBackground(new Color(50,50,50));

            radioButtonMotor1.setBounds(50,170,120,20);
            radioButtonMotor2.setBounds(170,170,120,20);
            radioButtonMotor3.setBounds(290,170,120,20);
            add(radioButtonMotor1);
            add(radioButtonMotor2);
            add(radioButtonMotor3);
        
        }
        add(labelKategoriSewa);
        add(labelsubjudul);
        add(labelNamaPenyewa);
        add(labelNomorTelepon);
        add(labelHari);
        add(namaPenyewaTextField);
        add(nomorTeleponTextField);
        add(lamaSewaTextField);
        add(submitButton);
        add(kembaliButton);

        submitButton.addActionListener(this);
        kembaliButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource() == submitButton){
                String jenisKendaraan = "";
                String namaPenyewa = namaPenyewaTextField.getText();
                String nomorTelepon = nomorTeleponTextField.getText();
                int lamaSewa = Integer.parseInt(lamaSewaTextField.getText());
                int hargaPerHari = 0;

                if (radioButtonMobil1.isSelected()) {
                    hargaPerHari = 2000;
                    jenisKendaraan = "Ferari";
                } else if (radioButtonMobil2.isSelected()) {
                    hargaPerHari = 1000;
                    jenisKendaraan = "Honda";
                } else if (radioButtonMobil3.isSelected()) {
                    hargaPerHari = 1500;
                    jenisKendaraan = "Toyota";
                } else if (radioButtonMotor1.isSelected()) {
                    hargaPerHari = 200;
                    jenisKendaraan = "Suzuki";
                } else if (radioButtonMotor2.isSelected()) {
                    hargaPerHari = 300;
                    jenisKendaraan = "Yamaha";
                } else if (radioButtonMotor3.isSelected()) {
                    hargaPerHari = 400;
                    jenisKendaraan = "Supra";
                }

                int totalHarga = lamaSewa * hargaPerHari;

                new DetailTotal(namaPenyewa, nomorTelepon, jenisKendaraan, lamaSewa, totalHarga);
                this.dispose();
    
            }else if(e.getSource() == kembaliButton){
                new PilihanKendaraan();
                this.dispose();
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, "Harap masukkan data dengan benar.");
        }
        
    }
    
}
