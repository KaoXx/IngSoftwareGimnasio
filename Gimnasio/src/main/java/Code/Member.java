package Code;

import java.util.Objects;
import java.util.UUID;

public class Member {
    UUID uuid;
    int memberNumber;
    String name,tlfNumber,email,bankNumber,feeType,password, tipoCuenta;
    Trainer trainer;
    public Member(UUID uuid, int memberNumber, String name, String tlfNumber, String email, String bankNumber, String feeType, String password, String tipoCuenta, Trainer trainer) {
        this.uuid = uuid;
        this.memberNumber = memberNumber;
        this.name = name;
        this.tlfNumber = tlfNumber;
        this.email = email;
        this.bankNumber = bankNumber;
        this.feeType = feeType;
        this.password = password;
        this.tipoCuenta=tipoCuenta;
        this.trainer=trainer;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
    
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTlfNumber() {
        return tlfNumber;
    }

    public void setTlfNumber(String tlfNumber) {
        this.tlfNumber = tlfNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "uuid=" + uuid +
                ", memberNumber=" + memberNumber +
                ", name='" + name + '\'' +
                ", tlfNumber='" + tlfNumber + '\'' +
                ", email='" + email + '\'' +
                ", bankNumber='" + bankNumber + '\'' +
                ", feeType='" + feeType + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
