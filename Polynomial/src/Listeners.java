import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	public class Listeners {
	    private Operations op;
	    private Interface ifa;
	    
	    Listeners(Operations operations, Interface interf) {
	        op = operations;
	        ifa  = interf;
	        interf.addAdditionListener(new AdditionListener());
	        interf.addMultiplicationListener(new MultiplicationListener());
	        interf.addSubstractionListener(new SubstractionListener());
	        interf.addDerivationListener(new DerivationListener());
	        interf.addIntegrationListener(new IntegrationListener());
	    }
	    
	    class AdditionListener implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	        		if((ifa.getPoly1().equals("")) || (ifa.getPoly2().equals(""))) {
	        			ifa.showError("No input");
	        			}
	        		else{
	            	Polynomials Polynomial1=op.getting(ifa.getPoly1());
					Polynomials Polynomial2=op.getting(ifa.getPoly2());		
				    Polynomials Result=op.Addition(Polynomial1, Polynomial2);
				    ifa.setResults(Result.polyInString());
				    	}
	        		}
	        }
	    
	    class SubstractionListener implements ActionListener {
	        public void actionPerformed(ActionEvent e){ 	
	        		if((ifa.getPoly1().equals("")) || (ifa.getPoly2().equals(""))) {
	        			ifa.showError("No input");
	        			}
	        		else{
	            	Polynomials Polynomial1=op.getting(ifa.getPoly1());
					Polynomials Polynomial2=op.getting(ifa.getPoly2());			
				    Polynomials Result=op.Substraction(Polynomial1, Polynomial2);
				    ifa.setResults(Result.polyInString());
				    	}
	        		}
	        }
	    
	    class MultiplicationListener implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	        		if((ifa.getPoly1().equals("")) || (ifa.getPoly2().equals(""))) {
	        			ifa.showError("No input");
	        			}
	        		else{
	            	Polynomials Polynomial1=op.getting(ifa.getPoly1());
					Polynomials Polynomial2=op.getting(ifa.getPoly2());
				    Polynomials Result=op.Multiplication(Polynomial1, Polynomial2);
				    ifa.setResults(Result.polyInString());
	        			}
	        		}
	        }
	    
	    class  IntegrationListener implements ActionListener{
			   public void actionPerformed(ActionEvent e) {	       	
		   		       if((ifa.getPoly1().equals("")) && (ifa.getPoly2().equals(""))) {
		   			   ifa.showError("No input");
		   			   }	   		
		   		       else{
		   		       Polynomials Polynomial1=op.getting(ifa.getPoly1());
		   		       Polynomials Result=op.Integration(Polynomial1);
		   		       ifa.setResults(Result.polyInString());
		   		       	   }
		   		       }
			   } 
	    	    
	   class  DerivationListener implements ActionListener{
		   public void actionPerformed(ActionEvent e) {	       	
	   		       if((ifa.getPoly1().equals("")) && (ifa.getPoly2().equals(""))) {
	   			   ifa.showError("No input");
	   			   }	   		
	   		       else{	      
	   		       Polynomials Polynomial1=op.getting(ifa.getPoly1());
	   		       Polynomials Result=op.Derivation(Polynomial1);
	   		       ifa.setResults(Result.polyInString());
	   		       	   }
	   		       }
		   }
}
