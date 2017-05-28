package coinbase.api.v2.http;

public enum CoinbaseHttpLanguage {
    
    DEUTSCH         ("de", "Deutsch"),
    ENGLISH         ("en", "English"),
    ESPANOL         ("es", "Español"),
    MEXICAN         ("es-mx", "Español - Méjico"),
    FRANCAIS        ("fr", "Français"),
    INDONESIA       ("id", "bahasa Indonesia"),
    ITALIANO        ("it", "Italiano"),
    NEDERLANDS      ("nl", "Nederlands"),
    PORTUGUES       ("pt", "Português"),
    BRAZILIAN       ("pt-br", "Português - Brazil"),
    ;
    
    private String code;
    private String status;
    
    private CoinbaseHttpLanguage(String code, String status) {
        this.code = code;
        this.status = status;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getStatus() {
        return status;
    }
    
    public static CoinbaseHttpLanguage getByCode(String code) {
        CoinbaseHttpLanguage[] values = CoinbaseHttpLanguage.values();
        for (CoinbaseHttpLanguage value : values) {
            if (value.code.equalsIgnoreCase(code)) {
                return value;
            }
        }
        return null;
    }

}
