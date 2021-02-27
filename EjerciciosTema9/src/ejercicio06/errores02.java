package ejercicio06;

public class errores02 {
    
    public static void comprobar(String c) throws Exception {
        
        if (c.contains("@.")) {

        	throw new Exception("DirCorreoIncorrectaException");
        } 

        else if (c.contains("@")) {

        	String [] division1 = c.split("@", 2);

        	if(division1[1].contains(".")) {

        		String [] division2 = division1[1].split("\\.", 2);

        		if(division2[1].equals("")) {

        			throw new Exception("DirCorreoIncorrectaException"); 
        		}
        	} 
        	
        	else {
    
        		throw new Exception("DirCorreoIncorrectaException");
        	}

        } 
        
        else {
    
        	throw new Exception("DirCorreoIncorrectaException");   
    }
    
}

    public static void main(String [] args) throws Exception {
    
    	String correo = "aaaaaaaaaaaaaaa@aah.com";
        
        comprobar(correo);
        
    }

}

