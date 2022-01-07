import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.math.*;
class Ass6B2 extends JFrame implements ActionListener
{
	JMenuBar mbar;
	JMenu file,compute,operation,sort;
	JMenuItem load,save,exit,sum,average;
	JMenuItem asc,dsc,maximum,minimum,median;
	JMenuItem search;
	JTextField tf;
	int n=50,ch;
	int arr[];
	Ass6B2()
	{
		arr = new int[50];
		setLayout(new BorderLayout());
		mbar=new JMenuBar();
		file = new JMenu("File");
		compute = new JMenu("Compute");
		operation=new JMenu("Operation");
		sort = new JMenu("Sort");
		load = new JMenuItem("Load");
		save = new JMenuItem("Save");
		exit = new JMenuItem("Exit");
		sum = new JMenuItem("Sum");
		average = new JMenuItem("Average");
		maximum = new JMenuItem("Maximum");
		minimum = new JMenuItem("Minimum");
		median = new JMenuItem("Median");
		asc = new JMenuItem("Ascending");
		dsc = new JMenuItem("Descending");
		search = new JMenuItem("Search");
		tf = new JTextField(50);
	        file.add(load);
		file.add(save);
                file.add(exit);
		compute.add(sum);
		compute.add(average);
		compute.add(maximum);
		compute.add(minimum);
		compute.add(median);
		operation.add(search);
		operation.add(sort);
		sort.add(asc);
		sort.add(dsc);
		mbar.add(file);
		mbar.add(compute);
		mbar.add(operation);
		setJMenuBar(mbar);
		setLayout(new BorderLayout());
		add(tf,BorderLayout.SOUTH);
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		load.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		asc.addActionListener(this);
		dsc.addActionListener(this);
		sum.addActionListener(this);
		average.addActionListener(this);
		maximum.addActionListener(this);
		minimum.addActionListener(this);
		median.addActionListener(this);
		search.addActionListener(this);


	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Load"))
		{
		tf.setText("");
		Random random = new Random();
		for(int i=0;i<n;i++)
		arr[i] = random.nextInt(100) + 1;
		for(int i=0;i<n;i++)
		tf.setText(tf.getText()+","+arr[i]);
		}
		
	if(e.getActionCommand().equals("Save"))
	{
		try{
		BufferedWriter outputWriter = new BufferedWriter(new FileWriter("numbers.txt"));
		for(int i=0;i<n;i++)
		outputWriter.write(arr[i]+",");
		outputWriter.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	if(e.getActionCommand().equals("Exit"))
	{
		dispose();
	}
	if(e.getActionCommand().equals("Ascending"))
	{
		int temp;
		for(int i=0;i<n;i++)
		for(int j=0;j<n-1;j++)
		{
		if(arr[j] > arr[j+1])
		{
		temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		}
		}
		
		tf.setText("");
		for(int i=0;i<n;i++)
		tf.setText(tf.getText()+","+arr[i]);
	}
	if(e.getActionCommand().equals("Descending"))
	{
	int temp;
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n-1;j++)
	{
	if(arr[j] < arr[j+1])
	{
	temp=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
	}
	}
	}
	tf.setText("");
	for(int i=0;i<n;i++)
	tf.setText(tf.getText()+","+arr[i]);
	}
	}
	public static void main(String args[])
	{
		new Ass6B2();
	}
}
