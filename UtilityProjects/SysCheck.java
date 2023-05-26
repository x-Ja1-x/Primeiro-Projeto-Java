package util;

public class SysCheck {

	private String email;
	private String CPF;
	private double balance;
	
	public void UserData(String email, String CPF, double balance) {
		this.email = email;
		this.CPF = CPF;
		this.balance = balance;
	}

	public void Userdata(String CPF, double balance) {
		this.CPF = CPF;
		this.balance = balance;
	}

	public void Userdata(double balance) {
		this.balance = balance;
	}

	public void Userdata(String email, String CPF) {
		this.email = email;
		this.CPF = CPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public double getBalance() {
		return balance;
	}
	
	public void addProduct(double value) {
		this.balance += value; 
		
	}
	public void remProduct(double value) {
		this.balance -= value;
	
	}
	public static double[] tamList(int tam) {
		double [] vect = new double[tam];
		return vect;
	}
	
	public String Valid() {
		if (getEmail() == null && getCPF() != null) {
			return "Dados do usuário: " 
					  + "Email Não informado"
				      + ", CPF: " + getCPF();
		}
		if(getCPF() == null && getEmail() != null) {
			return "Dados do usuário: " 
					  + "Email: " + getEmail()
				      + ", CPF Não informado";
			
		}
		if(getCPF() == null && getEmail() == null) {
			return "Dados do usuário: " 
			  + "Email Não informado"
		      + ", CPF Não informado";
		}else {
		return "Dados do usuário: " 
			  + "Email: " + getEmail()
		      + ", CPF: " + getCPF();
		} 
				
	}
}
