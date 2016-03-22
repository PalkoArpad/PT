public class Polynomials {
			public int degree;
			public int[] coefficient;
	
	
	public Polynomials(int deg, int[] coef){
		coefficient = new int[deg];
		coefficient = coef;
		setDegree(deg);
	}
	
	public int getDegree(){
		return degree;
	}
	
	public void setDegree(int degree){
		this.degree=degree;
	}
	
	public int getCoefficient(int i){
		return coefficient[i];
	}
	
	public void setCoefficient(int i, int a){
		coefficient[i] = a;
	}
	
	public String polyInString(){
		String polyString = new String();
		int d = this.degree;
		for(int i = d; i >= 0; i--){
			if(i == d){
				if(i == 0){
					polyString = polyString + Integer.toString(this.getCoefficient(i));
				}
				else {
					if(this.getCoefficient(i) != 0){
						polyString = polyString + Integer.toString(this.getCoefficient(i)) + "x^" + i;
					}
				}
			}
			else{
				if(i == 0){
					if(this.getCoefficient(i) > 0){
						polyString = polyString + "+" + Integer.toString(this.getCoefficient(i));		
					}
				}
				else{
					if(this.getCoefficient(i) > 0){
						polyString = polyString + "+" + Integer.toString(this.getCoefficient(i)) + "x^" + i;
					}
					if(this.getCoefficient(i) < 0){
						polyString = polyString + Integer.toString(this.getCoefficient(i)) + "x^" + i;
					}
				}
			}
		}
		return polyString;
	}
}