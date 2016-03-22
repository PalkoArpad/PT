public class Operations {
	public Operations(){}
	
	Polynomials getting(String str){
		int[] coef = new int[50];
		int deg = 0;
		String[] parts = str.split("\\+");
		
		for(int i = 0; i < parts.length; i++){
			String[] parts1 = parts[i].split("(x\\^)");
			for(int j = 0; j < parts1.length; j++){
				coef[Integer.parseInt(parts1[1])] = Integer.parseInt(parts1[0]);
				if(deg < Integer.parseInt(parts1[1])){
					deg = Integer.parseInt(parts1[1]);
				}
			}
		}
		return new Polynomials(deg,coef);
}
	
	Polynomials Addition(Polynomials p1, Polynomials p2){
		int d;
		if(p1.getDegree() > p2.getDegree()){
			d = p1.getDegree();
		}
		else{
			d = p2.getDegree();
		}
		int[] coefa = new int[d+1];
		for(int i = 0; i <= d; i++){
			coefa[i] = p1.getCoefficient(i) + p2.getCoefficient(i);
		}
		return new Polynomials(d,coefa);
	}
	
	Polynomials Substraction(Polynomials p1, Polynomials p2){
		int d;
		if(p1.getDegree() > p2.getDegree()){
			d = p1.getDegree();
		}
		else{
			d = p2.getDegree();
		}
		int[] coefs = new int[d+1];
		for(int i = 0; i <= d; i++){
			coefs[i] = p1.getCoefficient(i) + (-1)*p2.getCoefficient(i);
		}
		return new Polynomials(d,coefs);
	}
	
	Polynomials Multiplication(Polynomials p1, Polynomials p2){
		int d = p1.getDegree() + p2.getDegree();
		int[] coefm = new int[d+1];
		
		for(int i = 0; i <= p1.getDegree(); i++)
		{
		    for(int j = 0; j <= p2.getDegree(); j++){
		    	
		    	coefm[i+j] += p1.getCoefficient(i)*p2.getCoefficient(j);
		    }
		}
		
		return new Polynomials(d, coefm);
	}
	
	Polynomials Integration(Polynomials p)
	{
		int d = p.getDegree()+1;
		int[] coefi = new int[d+1];

		for(int i = d; i > 0; i--)
		{
			coefi[i] = (p.getCoefficient(i-1) / (i));
		}
		return new Polynomials(d,coefi);
	}
	
	Polynomials Derivation (Polynomials p){
		
		int d = p.getDegree();
		int[] coefd = new int[d];
		for(int i = d; i > 1; i--)
		{
			coefd[i-1] = p.getCoefficient(i)*(i);}
		
		return new Polynomials(d-1,coefd);
			
	}
}