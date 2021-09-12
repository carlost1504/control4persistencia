package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class InfretructureDepartment {
	
	public ArrayList<Bilboard> Data;
	public double ValPeligro = 160;
	
	public void lectorData() {
		Data=new ArrayList<Bilboard>();
		try {
			String DataAddress = "C:\\Users\\carlo\\eclipse-workspace\\seguimiento_3\\seg4_valla\\Doc\\BillboardDataExported.csv";
			File file = new File(DataAddress);
			
			FileInputStream fis = new FileInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
			
			boolean exit=true;
			String title = reader.readLine();
			Bilboard p;
			while (exit==true) {
				String [] array;
				
				String line = reader.readLine();
				System.out.println(line);
				if(line!=null) {
					array=line.split("|");
					p=new Bilboard(Double.parseDouble(array[0]), Double.parseDouble(array[1]), Boolean.parseBoolean(array[2]), array[3]);
					System.out.println(array.length);
					Data.add(p);
					array=null;
				}else {
					exit=false;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> tString(){
		ArrayList<String> datos=new ArrayList<String>();
		boolean exit=true;
		int i=0;
		while (exit==false) {
			if(Data!=null) {
				datos.add(Data.get(i).toString());
			}else {
				exit=false;
			}
			i++;
		}
		return datos;
	}
	
	public ArrayList<String> tString1(){
		ArrayList<String> datos=new ArrayList<String>();
		boolean exit=true;
		int i=0;
		while (exit==false) {
			if(Data!=null) {
				datos.add(Data.get(i).toString1());
			}else {
				exit=false;
			}
			i++;
		}
		return datos;
	}
	
	public void calculateArea() {
		double Area=0;
		for(int i=0;i<Data.size();i++) {
			//System.out.println("entre Area");
			Area=Data.get(i).getHeight()*Data.get(i).getWidth();
			Data.get(i).setArea(Area);
			boolean InUse=false;
			if(ValPeligro < Area) {
				InUse = true;
				Data.get(i).setInUse(InUse);
				Data.get(i).isInUse();
				//System.out.println("entre Area v " +Data.get(i).isInUse());
			}else {
				InUse = false;
				Data.get(i).setInUse(InUse);
				//System.out.println("entre Area  f "+Data.get(i).isInUse());
			}
		}
		
		
		
	}
	
	public void saveText() {
		System.out.println("entre 1");
		try {
			File ret= new File("DataValidity.csv");
			FileOutputStream fos=new FileOutputStream(ret);
			fos.write(inputData().getBytes() );
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.print(inputData());
	}
	
	public String inputData() {
		System.out.println("entre 2");
		String text="";
		for (int j = 0; j < Data.size(); j++) {
			text=text+ Data.get(j).toString2();
			//System.out.print(text);
		}
		
		return text;
	}
	
}
