package com.gqt.projj.pakage1;

import java.util.Scanner;

public class arraycode {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the count of universities: ");
        int uni = sc.nextInt();
        
        int arr[][][][]= new int [uni][][][];
        
        for (int i=0;i<arr.length;i++) {
        	System.out.println("enter the count of colleges inside universities: "+(i+1));
        	arr[i]=new int [sc.nextInt()][][];
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.println("inside university "+(i+1));
        	
        for(int j=0;j<arr[i].length;j++) {
        	System.out.println("enter the count of classes in a college "+(j+1));
        	arr[i][j]= new int [sc.nextInt()][];
        
        	for(int k=0;k<arr[i][j].length;k++) {
            	System.out.println("enter the count of students in a class"+(k+1));
            	
            	arr[i][j][k]=new int [sc.nextInt()];
        }}}
        
        for (int i=0;i<arr.length;i++) {
        	System.out.println("inside university: "+(i+1));
        	
        for (int j=0;j<arr[i].length;j++) {
        	System.out.println("inside college:"+(j+1));
        	
        for	(int k=0;k<arr[i][j].length;k++) {
        	System.out.println("inside class"+(k+1));
        	
        for (int l=0;l<arr[i][j][k].length;l++) {
        	System.out.println("enter the marks of student no: "+(l+1));
        	arr[i][j][k][l]=sc.nextInt();
        }}}
        }
        
        
        for (int i=0;i<arr.length;i++) {
        	System.out.println("inside university: "+(i+1));
        	
        for (int j=0;j<arr[i].length;j++) {
        for	(int k=0;k<arr[i][j].length;k++) {
        	System.out.println("inside class"+(k+1));
        	
        for (int l=0;l<arr[i][j][k].length;l++) {
        	System.out.println("enter the marks of student no: "+(l+1)+"is "+arr[i][j][k][l]);
        	
        
  
        
        
        }}}}}}


