/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author marti
 */
public class gui extends JFrame{
    JButton CalculateLMM1,CalculateWMM1,CalculateLqMM1,CalculateWqMM1,CalculateUtilizationFactorMM1,CalculatePercentIdleMM1,CalculatePercentKMM1,
            CalculateLMD1,CalculateWMD1,CalculateLqMD1,CalculateWqMD1,CalculateUtilizationFactorMD1,
            CalculateLMM2,CalculateWMM2,CalculateLqMM2,CalculateWqMM2,CalculatePo,CalculateP;
    JTextField lambda,meu,k,m;
    Font f;
    JComboBox type;
    String arr[]={"MM1","MD1","MM2"};
    JLabel result;
    public gui(){
        setTitle("");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1920,1080);
        setContentPane(new JLabel(new ImageIcon("IMG-20191201-WA0008.png")));

        setResizable(true);

        lambda =new JTextField("Lambda");
        lambda.setBounds(450, 200, 100, 30);
        add(lambda);

        meu =new JTextField("meu");
        meu.setBounds(650, 200, 100, 30);
        add(meu);

        type=new JComboBox(arr);
        type.setBounds(850, 200, 100, 30);
        add(type);

        CalculateLMM1=new JButton("L");
        CalculateLMM1.setBounds(350, 325, 60, 50);
        add(CalculateLMM1);

        CalculateWMM1=new JButton("W");
        CalculateWMM1.setBounds(570, 325, 60, 50);
        add(CalculateWMM1);

        CalculateLqMM1=new JButton("Lq");
        CalculateLqMM1.setBounds(780, 325, 60, 50);
        add(CalculateLqMM1);

        CalculateWqMM1=new JButton("Wq");
        CalculateWqMM1.setBounds(980, 325, 60, 50);
        add(CalculateWqMM1);

        CalculateUtilizationFactorMM1=new JButton("Utilization Factor");
        CalculateUtilizationFactorMM1.setBounds(400, 525, 135, 50);
        add(CalculateUtilizationFactorMM1);

        CalculatePercentIdleMM1=new JButton("Percent Idle");
        CalculatePercentIdleMM1.setBounds(635, 525, 135, 50);
        add(CalculatePercentIdleMM1);

        CalculatePercentKMM1=new JButton("Percent K");
        CalculatePercentKMM1.setBounds(850, 525, 135, 50);
        add(CalculatePercentKMM1);

        k=new JTextField("K");
        k.setBounds(1010, 530, 50, 40);
        add(k);

        f=new Font("TimesRoman", Font.BOLD, 20);

        result=new JLabel();
        result.setBounds(610, 600, 250, 100);
        result.setFont(f);
        result.setText("");
        add(result);


        CalculateLMM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM1 obj=new MM1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateL();
                    result.setText("L = "+ String.valueOf(obj.getL()) );
                }



            }
        });


        CalculateWMM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM1 obj=new MM1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateW();
                    result.setText("W = "+String.valueOf(obj.getW()));
                }}
        });

        CalculateLqMM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM1 obj=new MM1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateLq();
                    result.setText("Lq = "+String.valueOf(obj.getLq()));
                }}
        });

        CalculateWqMM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM1 obj=new MM1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateWq();
                    result.setText("Wq = "+String.valueOf(obj.getWq()));
                }}
        });


        CalculateUtilizationFactorMM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM1 obj=new MM1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateUtilizationFactor();
                    result.setText("Uti. Fact. = "+String.valueOf(obj.getUtilizationFactor()));
                }}
        });


        CalculatePercentIdleMM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM1 obj=new MM1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculatePercentIdle();
                    result.setText("Percent Idle = "+String.valueOf(obj.getPercentIdle()));
                }}
        });


        CalculatePercentKMM1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())||"M".equals(m.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM1 obj=new MM1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.setK(Integer.parseInt(k.getText()));
                    obj.CalculatePercentK();
                    result.setText("Percent K = "+String.valueOf(obj.getPercentK()));
                }}
        });

        //////////////////////////////////////////////////////////////////////////////////////////

        CalculateLMD1=new JButton("L");
        CalculateLMD1.setBounds(350, 325, 60, 50);
        CalculateLMD1.setVisible(false);
        add(CalculateLMD1);


        CalculateWMD1=new JButton("W");
        CalculateWMD1.setBounds(570, 325, 60, 50);
        CalculateWMD1.setVisible(false);
        add(CalculateWMD1);

        CalculateLqMD1=new JButton("Lq");
        CalculateLqMD1.setBounds(780, 325, 60, 50);
        CalculateLqMD1.setVisible(false);
        add(CalculateLqMD1);

        CalculateWqMD1=new JButton("Wq");
        CalculateWqMD1.setBounds(980, 325, 60, 50);
        CalculateWqMD1.setVisible(false);
        add(CalculateWqMD1);

        CalculateUtilizationFactorMD1=new JButton("Utilization Factor");
        CalculateUtilizationFactorMD1.setBounds(630, 500, 135, 50);
        CalculateUtilizationFactorMD1.setVisible(false);
        add(CalculateUtilizationFactorMD1);


        CalculateLMD1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MD1 obj=new MD1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateL();
                    result.setText("L = "+String.valueOf(obj.getL()) );
                }}
        });

        CalculateWMD1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MD1 obj=new MD1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateW();
                    result.setText("W = "+String.valueOf(obj.getW()));
                }}
        });

        CalculateLqMD1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MD1 obj=new MD1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateLq();
                    result.setText("Lq = "+String.valueOf(obj.getLq()));
                }}
        });

        CalculateWqMD1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MD1 obj=new MD1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateWq();
                    result.setText("Wq = "+String.valueOf(obj.getWq()));
                }}
        });


        CalculateUtilizationFactorMD1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MD1 obj=new MD1();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.CalculateUtilizationFactor();
                    result.setText("Uti. Fact. = "+String.valueOf(obj.getUtilizationFactor()));
                }}
        });
        ///////////////////////////////////////////////////////////////////////////////////////////


        CalculateLMM2=new JButton("L");
        CalculateLMM2.setBounds(300, 325, 60, 50);
        CalculateLMM2.setVisible(false);
        add(CalculateLMM2);

        m=new JTextField("M");
        m.setBounds(275, 200, 100, 30);
        m.setVisible(false);
        add(m);

        CalculateWMM2=new JButton("W");
        CalculateWMM2.setBounds(470, 325, 60, 50);
        CalculateWMM2.setVisible(false);
        add(CalculateWMM2);

        CalculateLqMM2=new JButton("Lq");
        CalculateLqMM2.setBounds(670, 325, 60, 50);
        CalculateLqMM2.setVisible(false);
        add(CalculateLqMM2);

        CalculateWqMM2=new JButton("Wq");
        CalculateWqMM2.setBounds(300, 525, 60, 50);
        CalculateWqMM2.setVisible(false);
        add(CalculateWqMM2);

        CalculatePo=new JButton("Po");
        CalculatePo.setBounds(470, 525, 60, 50);
        CalculatePo.setVisible(false);
        add(CalculatePo);

        CalculateP=new JButton("P");
        CalculateP.setBounds(670, 525, 60, 50);
        CalculateP.setVisible(false);
        add(CalculateP);

        CalculateLMM2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())||"M".equals(m.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM2 obj=new MM2();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.setM(Integer.parseInt(m.getText()));
                    obj.CalculateL();
                    result.setText("L = "+String.valueOf(obj.getL()) );
                }}
        });

        CalculateWMM2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())||"M".equals(m.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM2 obj=new MM2();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.setM(Integer.parseInt(m.getText()));
                    obj.CalculateW();
                    result.setText("W = "+String.valueOf(obj.getW()));
                }}
        });

        CalculateLqMM2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())||"M".equals(m.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM2 obj=new MM2();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.setM(Integer.parseInt(m.getText()));
                    obj.CalculateLq();
                    result.setText("Lq = "+String.valueOf(obj.getLq()));
                }}
        });

        CalculateWqMM2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())||"M".equals(m.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM2 obj=new MM2();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.setM(Integer.parseInt(m.getText()));
                    obj.CalculateWq();
                    result.setText("Wq = "+String.valueOf(obj.getWq()));
                }}
        });


        CalculateP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())||"M".equals(m.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM2 obj=new MM2();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.setM(Integer.parseInt(m.getText()));
                    obj.CalculateP();
                    result.setText("P = "+String.valueOf(obj.getP()));
                }}
        });


        CalculatePo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if("Lambda".equals(lambda.getText())||"meu".equals(meu.getText())||"M".equals(m.getText())){
                    JOptionPane.showMessageDialog(null, "Enter all required fields", "ALERT", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    MM2 obj=new MM2();
                    obj.setArrivalsMean(Float.parseFloat(lambda.getText()));
                    obj.setUnitsMean(Float.parseFloat(meu.getText()));
                    obj.setM(Integer.parseInt(m.getText()));
                    obj.CalculatePo();
                    result.setText("Po = "+String.valueOf(obj.getPo()));
                }}
        });

        ///////////////////////////////////////////////////////////////////////////////
        type.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if(type.getSelectedItem()=="MD1"){
                    CalculateUtilizationFactorMD1.setVisible(true);
                    CalculateWqMD1.setVisible(true);
                    CalculateLqMD1.setVisible(true);
                    CalculateLMD1.setVisible(true);
                    CalculateWMD1.setVisible(true);


                    CalculateUtilizationFactorMM1.setVisible(false);
                    CalculateWqMM1.setVisible(false);
                    CalculateLqMM1.setVisible(false);
                    CalculateLMM1.setVisible(false);
                    CalculateWMM1.setVisible(false);
                    CalculatePercentIdleMM1.setVisible(false);
                    CalculatePercentKMM1.setVisible(false);
                    k.setVisible(false);


                    CalculateWqMM2.setVisible(false);
                    CalculateLqMM2.setVisible(false);
                    CalculateLMM2.setVisible(false);
                    CalculateWMM2.setVisible(false);
                    CalculateP.setVisible(false);
                    CalculatePo.setVisible(false);
                    m.setVisible(false);
                }

                else if(type.getSelectedItem()=="MM1"){
                    CalculateUtilizationFactorMD1.setVisible(false);
                    CalculateWqMD1.setVisible(false);
                    CalculateLqMD1.setVisible(false);
                    CalculateLMD1.setVisible(false);
                    CalculateWMD1.setVisible(false);


                    CalculateUtilizationFactorMM1.setVisible(true);
                    CalculateWqMM1.setVisible(true);
                    CalculateLqMM1.setVisible(true);
                    CalculateLMM1.setVisible(true);
                    CalculateWMM1.setVisible(true);
                    CalculatePercentIdleMM1.setVisible(true);
                    CalculatePercentKMM1.setVisible(true);
                    k.setVisible(true);

                    CalculateWqMM2.setVisible(false);
                    CalculateLqMM2.setVisible(false);
                    CalculateLMM2.setVisible(false);
                    CalculateWMM2.setVisible(false);
                    CalculateP.setVisible(false);
                    CalculatePo.setVisible(false);
                    m.setVisible(false);
                }
                else if(type.getSelectedItem()=="MM2"){
                    CalculateUtilizationFactorMD1.setVisible(false);
                    CalculateWqMD1.setVisible(false);
                    CalculateLqMD1.setVisible(false);
                    CalculateLMD1.setVisible(false);
                    CalculateWMD1.setVisible(false);


                    CalculateUtilizationFactorMM1.setVisible(false);
                    CalculateWqMM1.setVisible(false);
                    CalculateLqMM1.setVisible(false);
                    CalculateLMM1.setVisible(false);
                    CalculateWMM1.setVisible(false);
                    CalculatePercentIdleMM1.setVisible(false);
                    CalculatePercentKMM1.setVisible(false);
                    k.setVisible(false);


                    CalculateWqMM2.setVisible(true);
                    CalculateLqMM2.setVisible(true);
                    CalculateLMM2.setVisible(true);
                    CalculateWMM2.setVisible(true);
                    CalculateP.setVisible(true);
                    CalculatePo.setVisible(true);
                    m.setVisible(true);
                    result.setBounds(1000, 400, 200, 100);
                }
            }
        });


    }
}