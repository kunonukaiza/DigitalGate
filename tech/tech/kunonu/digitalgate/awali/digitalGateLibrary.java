/*
 * classes for DigitalGate project
 */

package tech.kunonu.digitalgate.awali;

import java.util.Scanner;

/**
 *
 * @author Kaiza Kunonu
*GitHub @kunonukaiza
 */
public class digitalGateLibrary {
    

	private String name;
	
	public digitalGateLibrary(String name)// start of 'digitaGateLibrary' constructor
	{ 
		this.name = name;
                
	} // end 'digitalGateLibrary' constructor
        
        private static digitalGateLibrary gate1 = new digitalGateLibrary("Mamwimote");
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void mgeni()  // start of mgeni() method
	{
		System.out.println("Karibu nyumbani kwa " + gate1.getName() +"!\n" 
				              +"Tafadhari andika jina la mwenyeji wako!\n");
					Scanner jinaLaMtafutwa = new Scanner(System.in);
					final String mwenyeMgeni = jinaLaMtafutwa.nextLine();
					
					
					  switch(mwenyeMgeni)
					    {
					      case "Kaiza":
					      case "kaiza":
					      case "KAIZA":
					      case "Kaizer":
					      case "KAIZER":
					      case "kaizer":
					      case "caiza":
					    	  System.out.println("Mpigie au mtumie meseji Kaiza kwa namba hii: 0629831936\n"
							    		+ "Ili aje akusaidie kufungua geti!\n");
							    break;
							    
					      case "Debora":
					      case "debora":
					      case "DEBORA":
					    	  System.out.println("Mpigie au mtumie meseji Debora kwa namba hii: 0621609385\n"
							    		+ "Ili aje akusaidie kufungua geti!\n");
					    	  
					    	  break;
					    	  
					      case "Clever":
					      case "clever":
					      case "CLEVER":
					      case"kleva":
					      case "Kleva":
					    	  System.out.println("Mpigie au mtumie meseji Clever kwa namba hii: 0745820931\n"
							    		+ "Ili aje akusaidie kufungua geti!\n");
					    	  break;
					    	  
					      case "Mamwimote":
					      case "mamwimote":
					      case "MAMWIMOTE":
					      case "Mama Mwimote":
					      case "mama mwimote":
					      case "mamamwimote":
					      case "MamaMwimote":
					      case "MAMAMWIMOTE":
					      case "MAMA MWIMOTE":
					    	  System.out.println("Mpigie au mtumie meseji Mama Mwimote kwa namba hii: 0752876877\n"
							    		+ "Ili aje akusaidie kufungua geti!\n");
					    	  break;			    	  			    	  
					    	  
								
								default:
									System.out.println("Hmmmnh!\n"
											+ mwenyeMgeni + " sio jina la mwenyeji wa humu ndani!\n"
											+ "Huenda umekosea kuandika, jaribu kuandika tena.\n");
									break;
					    }
					  
	}
	
	public static  void mwenyeji(String jinaLaMwenyeji, int idadiYaKUkosea) 
	{
		 switch(jinaLaMwenyeji)
		    {
		      case "Kaiza":
		      case "kaiza":
		      case "KAIZA":
		    	  System.out.print( "Waoow! " + jinaLaMwenyeji + " tafadhali andika funguo yako ya geti:");
		    	  Scanner gatePinKaiza1 = new Scanner(System.in);
		    	  final int DIGITAL_KEY_KAIZA1 = gatePinKaiza1.nextInt();
		    	  
		    	  
		    	  switch ( DIGITAL_KEY_KAIZA1 )
		    	   {
		    	      case 2025:
		    	           System.out.println("\n" + jinaLaMwenyeji +"! "
		    	  		              + "karibu tena nyumbani kwa " + gate1.getName()+ "!\n"
							          + "Tulikukumbuka wenzio!\n"
							          + "Subiri kidogo geti litafunguka.\n" );
		    	       break;
		    	       
		    	    
		    	       default:
		    	    	   
		    	    	   int idadiYaKukosea = 0;
		    	    	   while( idadiYaKukosea < 2)
		    	    	     {
		    		          System.out.println( "\n" + jinaLaMwenyeji + " umekosea kuingiza nywila yako!\n"
		    		  		             + "Tafadhali jaribu kuingiza tena kwa umakini.");
		    		  
		    		          Scanner gatePinKaiza2 = new Scanner(System.in);
			    	          final int DIGITAL_KEY_KAIZA2 = gatePinKaiza2.nextInt();
			    	  
			    	          if(DIGITAL_KEY_KAIZA2 == 2025)
			    	        	  {System.out.println("\n" + jinaLaMwenyeji +"!"
			    	  		              + "karibu tena nyumbani kwa " + gate1.getName() + "!\n"
								          + "Tulikukumbuka wenzio!\n"
								          + "Subiri kidogo geti litafunguka.\n" );
			    	        	  idadiYaKukosea += 3;
			    	        	 
			    	        	  }
			    	          
			    	          else
			    	        	  ++idadiYaKukosea;
			    	           
			    	       }
		    	    	   
		    	    	   if(idadiYaKukosea == 2)
		    	    	   System.out.println("Umezidi idadi ya kukosea kuingiza nywila inayoruhusiwa.");
		    	    	   System.out.println();
			    	  
		    		  break;
		    	  }
		    	  
		    	  idadiYaKUkosea +=3;
					break;
					
		      case "Debora":
		      case "debora":
		      case "DEBORA":
		    	  System.out.print("Waoow! " + jinaLaMwenyeji + " tafadhali andika funguo yako ya geti: ");
		    	  Scanner gatePinDebora = new Scanner(System.in);
		    	  final int DIGITAL_KEY_DEBORA = gatePinDebora.nextInt();
		    	  
		    	  
		    	  switch ( DIGITAL_KEY_DEBORA )
		    	   {
		    	  case 2001:
		    		  System.out.println("\nDebora! Karibu nyumbani kwa " + gate1.getName() + "!\n"
									+ "Tulikukumbuka wenzio!\n"
									+ "Subiri kidogo geti litafunguka." );
				    	  break;
		    	    
		    	  default:
		    		  int idadiYaKukosea = 0;
	    	    	   while( idadiYaKukosea < 2)
	    	    	     {
	    		          System.out.println( "\n" + jinaLaMwenyeji + " umekosea kuandika funguo yako!\n"
	    		  		             + "Tafadhali jaribu tena. Ukikosea mara tatu funguo yako inafungiwa.");
	    		  
	    		          Scanner gatePinDebora2 = new Scanner(System.in);
		    	          final int DIGITAL_KEY_DEBORA2 = gatePinDebora2.nextInt();
		    	  
		    	          if(DIGITAL_KEY_DEBORA2 == 2001)
		    	        	  {System.out.println("\n" + jinaLaMwenyeji +"!"
		    	  		              + " karibu tena nyumbani kwa " + gate1.getName() + "!\n"
							          + "Tulikukumbuka wenzio!\n"
							          + "Subiri kidogo geti litafunguka.\n" );
		    	        	  idadiYaKukosea += 3;
		    	        	 
		    	        	  }
		    	          
		    	          else
		    	        	  ++idadiYaKukosea;
		    	           
		    	       }
	    	    	   
	    	    	   if(idadiYaKukosea == 2)
	    	    	   System.out.println("Umezidi idadi ya kukosea kuandika funguo inayoruhusiwa.");
	    	    	   System.out.println();
		    	  
		    		  break;
		    	  }
		    	  idadiYaKUkosea +=3;
					break;
		    	 
		    	  
		      case "Clever":
		      case "clever":
		      case "CLEVER":
		      case "kleva":
		      case "Kleva":
		      case "KLEVA":
		      case "Cleva":
		      case "cleva":
		      case "CLEVA":
		    	  System.out.print( jinaLaMwenyeji + " tafadhali andika funguo yako ya geti: ");
		    	  Scanner gatePinClever = new Scanner(System.in);
		    	  final int DIGITAL_KEY_CLEVER = gatePinClever.nextInt();
		    	  
		    	  
		    	  switch ( DIGITAL_KEY_CLEVER )
		    	   {
		    	  case 2002:
		    		  System.out.println("Clever! Karibu nyumbani kwa " + gate1.getName() + "!\n"
									+ "Tulikukumbuka wenzio!\n "
									+ "Subiri kidogo geti litafunguka.\n" );
		    		  
				    	  break;
		    	    
		    	  default:
		    		  int idadiYaKukosea = 0;
	    	    	   while( idadiYaKukosea < 2)
	    	    	     {
	    		          System.out.println( "\n" + jinaLaMwenyeji + " umekosea kuandika funguo yako!\n"
	    		  		             + "Tafadhali jaribu tena.Ukikosea zaidi ya mara tatu funguo yako inafungiwa.");
	    		  
	    		          Scanner gatePinClever2 = new Scanner(System.in);
		    	          final int DIGITAL_KEY_CLEVER2 = gatePinClever2.nextInt();
		    	  
		    	          if(DIGITAL_KEY_CLEVER2 == 2002)
		    	        	  {System.out.println("\n" + jinaLaMwenyeji +"!"
		    	  		              + " karibu tena nyumbani kwa " + gate1.getName() + "!\n"
							          + "Tulikukumbuka wenzio!\n"
							          + "Subiri kidogo geti litafunguka.\n" );
		    	        	  idadiYaKukosea += 3;
		    	        	 
		    	        	  }
		    	          
		    	          else
		    	        	  ++idadiYaKukosea;
		    	           
		    	       }
	    	    	   
	    	    	   if(idadiYaKukosea == 2)
	    	    	   System.out.println("Umezidi idadi ya kukosea kuingiza nywila inayoruhusiwa.");
	    	    	   System.out.println();
	    	    	  
	    	    	   break;
		    	   }
		    	  idadiYaKUkosea +=3;
		    	  break;
		    	  
		    	  
		      case "Mamwimote":
		      case "mamwimote":
		      case "MAMWIMOTE":
		      case "mama mwimote":
		      case "Mama Mwimote":
		      case "MAMA MWIMOTE":
		    	  System.out.print(jinaLaMwenyeji + " tafadhali andika funguo yako ya geti: ");
		    	  Scanner gatePinMamwimote = new Scanner(System.in);
		    	  final int DIGITAL_KEY_MAMWIMOTE = gatePinMamwimote.nextInt();
		    	  
		    	  
		    	  switch ( DIGITAL_KEY_MAMWIMOTE )
		    	   {
		    	  case 1973:
		    		  System.out.println( jinaLaMwenyeji + "Karibu nyumbani kwako.\n"
									+ "Tulikukumbuka wenzio!\n"
									+ "Subiri kidogo geti litafunguka." );
		    		  
				    	  break;
		    	    
		    	  default:
		    		  int idadiYaKukosea = 0;
	    	    	   while( idadiYaKukosea < 2)
	    	    	     {
	    		          System.out.println( "\n" + jinaLaMwenyeji + " umekosea kuandika funguo yako!\n"
	    		  		             + "Tafadhali jaribu tena.Ukikosea zaidi ya mara tatu funguo yako inafunguwa.");
	    		  
	    		          Scanner gatePinMamwimote2 = new Scanner(System.in);
		    	          final int DIGITAL_KEY_MAMWIMOTE2 = gatePinMamwimote2.nextInt();
		    	  
		    	          if(DIGITAL_KEY_MAMWIMOTE2 == 1973)
		    	        	  {System.out.println("\n" + jinaLaMwenyeji +"!"
		    	  		              + " karibu tena nyumbani kwako!\n"
							          + "Tulikukumbuka wenzio!\n"
							          + "Subiri kidogo geti litafunguka.\n" );
		    	        	  idadiYaKukosea += 3;
		    	        	 
		    	        	  }
		    	          
		    	          else
		    	        	  ++idadiYaKukosea;
		    	           
		    	       }
	    	    	   
	    	    	   if(idadiYaKukosea == 2)
	    	    	   System.out.println("Umezidi idadi ya kukosea kuandika funguo inayoruhusiwa.");
	    	    	   System.out.println();
		    	  
		    		  break;
		    	   }
		    	  idadiYaKUkosea +=3;
		    
	break;			    	  			    	  
		    	  
	}

}
}
