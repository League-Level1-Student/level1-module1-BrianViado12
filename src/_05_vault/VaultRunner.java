package _05_vault;

public class VaultRunner {
	public static void main(String[] args) {
	Vault vault = new Vault();
	Bond bond = new Bond ();
	System.out.println(bond.findCode(vault));
	}
}
