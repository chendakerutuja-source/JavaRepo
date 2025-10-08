package mon;

public class FirstNonRepeated {

	public static void main(String[] args) {
	      String str="pipeline";
	      
	      for(char words:str.toCharArray())
	      {
	    	  if(str.indexOf(words)==str.lastIndexOf(words))
	    	  {
	    		  System.out.println("Nonrepeated word is: "+words);
	    		  break;
	    	  }
	      }

	}

}
