package com.project.calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mycalculator extends JFrame {
	static String s="";
	public Mycalculator() {
		JPanel pan=new JPanel();
		JPanel pan1=new JPanel();
		Dimension dim=new Dimension();
		dim.height=20;
		dim.width=200;
		JButton but0=new JButton("0");
		JButton but1=new JButton("1");
		JButton but2=new JButton("2");
		JButton but3=new JButton("3");
		JButton but4=new JButton("4");
		JButton but5=new JButton("5");
		JButton but6=new JButton("6");
		JButton but7=new JButton("7");
		JButton but8=new JButton("8");
		JButton but9=new JButton("9");
		JButton butMul=new JButton("*");
		JButton butDiv=new JButton("/");
		JButton butAdd=new JButton("+");
		JButton butSub=new JButton("-");
		JButton butErase=new JButton("C");
		JButton butCalc=new JButton("=");
		JTextField text =new JTextField();
		text.setPreferredSize(dim);
		this.setSize(500,400);
		this.setLocation(500,500);
		this.setTitle("my calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan.add(text);
		pan1.setLayout(new GridLayout(6,3));
		pan1.add(but0);
		pan1.add(but1);
		pan1.add(but2);
		pan1.add(but3);
		pan1.add(but4);
		pan1.add(but5);
		pan1.add(but6);
		pan1.add(but7);
		pan1.add(but8);
		pan1.add(but9);
		pan1.add(butMul);
		pan1.add(butDiv);
		pan1.add(butAdd);
		pan1.add(butSub);
		pan1.add(butErase);
		pan1.add(butCalc);
		this.add(pan,BorderLayout.NORTH);
		this.add(pan1);
		
		
		//button actions 
		but0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				s=s+"0";
				text.setText(s);
				
			}
			
		});
		
		but1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"1";
				text.setText(s);
				
			}
			
		});
		
		but2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"2";
				text.setText(s);
				
			}
			
		});
		
		but3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"3";
				text.setText(s);
				
			}
			
		});
		
		but4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"4";
				text.setText(s);
				
			}
			
		});
		
		but5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"5";
				text.setText(s);
				
			}
			
		});
		
		but6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"6";
				text.setText(s);
				
			}
			
		});
		
		but7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"7";
				text.setText(s);
				
			}
			
		});
		
		but8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"8";
				text.setText(s);
				
			}
			
		});
		
		but9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"9";
				text.setText(s);
				
			}
			
		});
		
		butMul.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"*";
				text.setText(s);
				
			}
			
		});
		
		butDiv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"/";
				text.setText(s);
				
			}
			
		});
		
		butAdd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"+";
				text.setText(s);
				
			}
			
		});
		
		butSub.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				s=s+"-";
				text.setText(s);
				
			}
			
		});
		
		butErase.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				text.setText("");
				s="";
			}
			
		});
		
		butCalc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				int result=calcul(s);
				text.setText(""+result+"");
				
			}
			
		});
		
		
	
		this.setVisible(true);
	}
	
	public int calcul(String s) {
		int result=0,part1,part2;
		int i=0;
		boolean flag=true;
		int j=0;
		String oper="";
		String s1="";
		String s2="";
		int len=s.length();
		
		while(i<len && j<len) {
			if(s.charAt(j)=='*') {
				flag=false;
				j++;
				oper="mul";
				
			}
			else if(s.charAt(j)=='+') {
				j++;
				flag=false;
				oper="add";
			}
			
			else if(s.charAt(j)=='-') {
				j++;
				flag=false;
				oper="sub";
			}
			else if(s.charAt(j)=='/') {
				j++;
				flag=false;
				oper="div";
			}
			if(flag==true) {
				s1+=String.valueOf(s.charAt(j));			
				j++;
			}
			else if(flag==false) {
				s2+=String.valueOf(s.charAt(j));			
				j++;
			}
				i++;
		}
		
		if(oper.equals("mul")) {
			 part1=Integer.parseInt(s1);
			 part2=Integer.parseInt(s2);
			 result=part1*part2;
		}
		else if(oper.equals("div")) {
			 part1=Integer.parseInt(s1);
			 part2=Integer.parseInt(s2);
			 result=part1/part2;
		}
		else if(oper.equals("add")) {
			 part1=Integer.parseInt(s1);
			 part2=Integer.parseInt(s2);
			 result=part1+part2;
		}
		else if(oper.equals("sub")) {
			 part1=Integer.parseInt(s1);
			 part2=Integer.parseInt(s2);
			 result=part1-part2;
		}
		
		return result;
	}
	
}
