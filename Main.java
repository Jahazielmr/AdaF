import java.io.*;
import java.util.ArrayList;
public class Main {

  static private String usage="Uso: java Main (-h|-help) | ([-d|-debug] <archivo>)";

    static public String getContents(File aFile) {

        StringBuilder contents = new StringBuilder();

        try {
            BufferedReader input = new BufferedReader(new FileReader(aFile));
            try {
                String line = null; //not declared within while loop

                while ((line = input.readLine()) != null) {
                    contents.append(line);
                    contents.append(System.getProperty("line.separator"));
                }
            } finally {
                input.close();
            }
        } catch (IOException ex) {//just don't say a word...
            //ex.printStackTrace();
        }

        return contents.toString();
    }

  static private void printHelp(boolean verbose){
	File ayuda=new File("README.txt");
	//si el archivo existe, imprimir lo demaś:
        if (verbose && ayuda.exists())
		System.out.println(getContents(ayuda));
	else//imprimir el uso:	
		System.out.println(usage);
	System.exit(0);
  } 


  static public void main(String argv[]) {
    
    boolean debug=false;
    
    switch(argv.length){
	case 0:
		printHelp(false);
		break;
	case 1://may be help or just the file
		if (argv[0].matches("-h|-help"))
			printHelp(true);
		break;
	case 2://can only be debug:
		if (argv[0].matches("-d|-debug"))
			debug=true;
		else
			printHelp(false);
		break;
	default://if none of the above: malformed 
		printHelp(false); 
		break;
		
    }
    
	/*
	String filename=argv[argv.length-1];
    try {     	
      long start=System.currentTimeMillis();
      parser p = new parser(new Ada95Lexer(new FileReader(filename)));
    
	     Object result = p.parse().value;
	
	ArrayList<String> parserErrores=p.getErrores();
	ArrayList<String> parserAdvertencias=p.getAdvertencias();
	
	for(String advertencia: parserAdvertencias){
		System.err.println(advertencia);
	}
	for(String error:parserErrores){
		System.err.println(error);
	}
	
	String pluralize_warnings="advertencia";
	pluralize_warnings+= (parserAdvertencias.size()==1)? "":"s";
	if(parserAdvertencias.size()>0){		
		System.err.print((parserAdvertencias.size())+" "+pluralize_warnings+". ");
	}
	
    /*
	//si no hay errores en el parser, hacer el semántico:
	result=null;
	FrontEndResult parsed=null;
	if(parserErrores.size()==0){		
		semantic s= new semantic(new Ada95Lexer(new FileReader(filename)));
		//if(debug){
			//result = s.debug_parse().value;
		//}else{
			result = s.parse().value;
			
		//}		
		parserErrores=s.getErrores();
		for(String error: parserErrores){
			System.err.println(error);
		}
	}
	//después del análisis semántico:
	//terminar la medición:
	long end=System.currentTimeMillis();
	float elapsed=(end-start);
	if(parserErrores.size() > 0){
		String pluralize_finding="encontr";
		String pluralize_errors="error";
		pluralize_finding+= (parserErrores.size()==1)? "ó":"aron";
		pluralize_errors+= (parserErrores.size()==1)? "":"es";		
		System.err.println("Se "+pluralize_finding+" "+(parserErrores.size())+" "+pluralize_errors+".");
		System.err.println("Compilación fallida (Tiempo total: "+elapsed+" milisegundos)");
	}else{
		if(result != null){
			if(result instanceof FrontEndResult){
				parsed=(FrontEndResult)result;
				if(debug){
					System.out.println(String.format("Generados %d cuádruplos",parsed.icode.size()));
					for(int i=0; i< parsed.icode.size(); i++){
						System.out.printf("%d\t%s\n", i, parsed.icode.get(i));
					}
					System.out.println("La tabla de símbolos a usar: ");
					System.out.println(parsed.table.toString());
				}
				//TODO: hacer acá lo siguiente
				String assemblyName=filename.replace(".adb", ".asm");
				Backend backend=new Backend(parsed.icode, parsed.table, debug);
				backend.assemble(assemblyName); // <= pasarle el nombre de archivo
				System.out.printf("Código objeto generado en: %s\n", assemblyName);
			}
		}	
		end=System.currentTimeMillis();
		elapsed=(end-start);
		System.out.println("Compilación exitosa (Tiempo total: "+elapsed+" milisegundos)");	
	}*/
	
	/*
    }catch (FileNotFoundException fnfex){
	System.err.println("No se encuentra el archivo \""+filename+"\"");
	System.err.println(usage);
	System.exit(1);
    }catch (Exception e) {
      e.printStackTrace();
    }*/
}
}
