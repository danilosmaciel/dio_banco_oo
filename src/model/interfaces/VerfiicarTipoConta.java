package model.interfaces;

public interface VerfiicarTipoConta {
    boolean ehCorrente(IConta conta);
    boolean ehPoupanca(IConta conta);
}
