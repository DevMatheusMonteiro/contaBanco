public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nome;
    private float saldo;

    public ContaTerminal(){}

    public ContaTerminal(int numero, String agencia, String nome, float saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSaldo() {
        String saldoFormatado = String.format("%.2f", saldo).replace(".", ",");
        return saldoFormatado;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %s já está disponível para saque.", getNome(), getAgencia(), getNumero(), getSaldo());
    }
}
