//Author: N Theja
//Date: 23-10-2020
//Desc: Salutations And Names
public class Salutations {	
		    public static void main(String[] args){
		    	String salutation[][]=new String[2][];
				String arr1[]= {"Mr","Mrs","Miss"};
				String arr2[]={"Pratheek","surya","aishwarya","rohan","rakesh"};
				salutation[0]= arr1;
				salutation[1]= arr2;
				
				for(int i=0;i<salutation.length;i++) {
			    	   for(int j=0;j<salutation[i].length;j++) {
			    		 System.out.print(" "+salutation[i][j]);	
			    	   }
			    	   System.out.println();
			       }
				System.out.println(salutation[0][0]+"."+salutation[1][0]);
				System.out.println(salutation[0][2]+"."+salutation[1][1]);
				System.out.println(salutation[0][1]+"."+salutation[1][2]);
				System.out.println(salutation[0][0]+"."+salutation[1][3]);
				System.out.println(salutation[0][0]+"."+salutation[1][4]);
		    }
		}
	


