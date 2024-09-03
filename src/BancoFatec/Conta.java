/**
 * 
 */
package BancoFatec;

/**
 * 
 */
public class Conta {

	private static int totalContas = 0;
	private Cliente titular;
	private int nConta;
	private double saldo;
	
	public Conta(Cliente titular, double saldo) {
		super();
		totalContas++;
		this.titular = titular;
		this.nConta = totalContas;
		this.saldo = saldo;
	}

	public static int getTotalContas() {
		return totalContas;
	}

	public Cliente getTitular() {
		return titular;
	}

	public int getnConta() {
		return nConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "Conta [titular=" + titular + ", nConta=" + nConta + ", saldo=" + saldo + "]";
	}
	
	//métodos da Conta
	
	public boolean depositar(double valor) {
		if(valor >= 0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta cDestino) {
		if(valor <= this.saldo) {
			this.sacar(valor);
			cDestino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
		
	
}
