package org.letscode;

public enum OrigemEscolaEnum {

    PUBLICA("Escola publica", 6.0, "pu"),
    PRIVADA("Escola privada", 7.0, "pr"),
    MILITAR("Escola militar", 8.0,"mt");

    private final String nomeOrigem;
    private final double media;
    private final String codigo;

    OrigemEscolaEnum(String nomeOrigemParam,double mediaParam, String codigo){
        nomeOrigem = nomeOrigemParam;
        media = mediaParam;
        this.codigo= codigo;
    }

    public static OrigemEscolaEnum valueOfCodigo(String codigo){
        for (OrigemEscolaEnum origem : OrigemEscolaEnum.values()) {
            if (origem.getCodigo().equals(codigo)) {
                return origem;
            }
        }
        return PRIVADA;
    }


    public double getMedia() {
        return media;
    }

    public String getNomeOrigem() {
        return nomeOrigem;
    }

    public String getCodigo() {
        return codigo;
    }
}
