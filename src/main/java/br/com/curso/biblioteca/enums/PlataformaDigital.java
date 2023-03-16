package br.com.curso.biblioteca.enums;

public enum PlataformaDigital {
    NATIONAL_GEOGRAPHIC("National Geographic", "https://www.nationalgeographic.org/"),
    REVISTA_VEJA("Revista Veja", "https://www.revista.veja.br/wp/"),
    RBCMS("Revista Brasileira de Ciências Médicas e da Saúde", "http://www.rbcms.com.br/");

    private String descricao;

    private String url;

    private PlataformaDigital(String descricao, String url) {
        this.descricao = descricao;
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

}