package com.mphasis.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class project {
	
public static void main(String[]args)throws IOException {
	int operation = 0;
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter 1 for create file and add,2 for delete file,3 for display file,4 for search file: ");
		operation=sc.nextInt();
		switch(operation)
		{
		case 1:
			String path="G:\\New folder\\";
			Scanner sc1=new Scanner(System.in);
			
			ArrayList<String> al=new ArrayList<>();
			while(true) {
			System.out.println("enter the file name to create");
			String filename=sc.next();
			String finalname=path+filename;
			System.out.println(finalname);
		
			//create file
			File f=new File(finalname);
			boolean b=f.createNewFile();
			if(b!=true) {
				System.out.println("the file not created");
			}
			else {
				al.add(filename);
				System.out.println("file created");
			break;
			}
			

		
		System.out.println("the collection of files is "+ al);
		}
		
		
		case 2:
			//delete code
			String path1="G:\\New folder\\";
			Scanner sc2=new Scanner(System.in);
			System.out.println("enter the file name to be deleted");
			String filname=sc.next();
			String finalfile=path1+filname;
			File file=new File(finalfile);
			file.delete();
			System.out.println("file deleted");
			break;
			
		case 3:
		
			String path2="G:\\New folder\\";
			System.out.println("Enter the file nameto display:");
			File f=new File(path2);
			File filename[]=f.listFiles();
			for(File ff:filename) {
				System.out.println(ff.getName());
			}
			break;
			
		case 4:
			//search
			String path3="G:\\New folder\\";
			File f1=new File(path3);
			Scanner sc3=new Scanner(System.in);
			System.out.println("enter the file name to search");
			String filsearchname=sc3.next();
			File filename1[]=f1.listFiles();
			int flag=0;
			for(File ff:filename1) {
				if(ff.getName().equals(filsearchname)) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
				
				
			}

			if(flag==1) {
				System.out.println("found the file");
			}
			else {
				System.out.println("file is not found");
			}
			break;
	}
}
}
}