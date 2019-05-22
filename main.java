import parser.* ; 
import lexer.* ; 
import node.* ; 
import java.io.* ; 




public class main {
  public static void main(String[] args) 
{
     if (args.length > 0)
{
        try {
           Lexer lexer = new Lexer (new PushbackReader(
              new FileReader(args[0])));
 
         Token t = lexer.next();
         
         String espaco = "TteclaEspaco";
    
         String enter = "TteclaEnter";
        
         String tab = "TTeclaTab1";

	while(t.getClass().getSimpleName().compareTo("EOF") != 0)
{
           	if(t.getClass().getSimpleName().compareTo(espaco) == 0)
     
     		System.out.print(' ');
         
 	else if(t.getClass().getSimpleName().compareTo(enter) == 0) {
 		
 			System.out.println('\n');
 			

 	}     	
	else if(t.getClass().getSimpleName().compareTo(tab) == 0)
     
     		System.out.print('\t');
          
	else {
                   System.out.print(t.getClass().getSimpleName());
    
      	}
           	t = lexer.next();
           }
        }
    
   catch (Exception e) {
           System.out.println (e) ;
        }
 
   } else {
        System.err.println("erro");
        System.exit(1);
     }
  }
} 