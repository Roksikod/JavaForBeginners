package ru.itmo.basics.lesson12;

public class PromoCode {

    private String code;
    private Boolean isExpired;

    public PromoCode(String code, Boolean isExpired) {
        this.code = code;
        this.isExpired = isExpired;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

    @Override
    public String toString() {
        return "PromoCode{" +
                "code='" + code + '\'' +
                ", isExpired=" + isExpired +
                '}';
    }
}
