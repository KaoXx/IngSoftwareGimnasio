package Code;

import java.util.Objects;
import java.util.UUID;

public class Member {
    UUID uuid;
    int memberNumber;
    char name,tlfNumber,email,bankNumber,feeType;

    public Member(UUID uuid, int memberNumber, char name, char tlfNumber, char email, char bankNumber, char feeType) {
        this.uuid = UUID.randomUUID();
        this.memberNumber = memberNumber;
        this.name = name;
        this.tlfNumber = tlfNumber;
        this.email = email;
        this.bankNumber = bankNumber;
        this.feeType = feeType;
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

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getTlfNumber() {
        return tlfNumber;
    }

    public void setTlfNumber(char tlfNumber) {
        this.tlfNumber = tlfNumber;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(char bankNumber) {
        this.bankNumber = bankNumber;
    }

    public char getFeeType() {
        return feeType;
    }

    public void setFeeType(char feeType) {
        this.feeType = feeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return getMemberNumber() == member.getMemberNumber() && getName() == member.getName() && getTlfNumber() == member.getTlfNumber() && getEmail() == member.getEmail() && getBankNumber() == member.getBankNumber() && getFeeType() == member.getFeeType() && Objects.equals(getUuid(), member.getUuid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid(), getMemberNumber(), getName(), getTlfNumber(), getEmail(), getBankNumber(), getFeeType());
    }

    @Override
    public String toString() {
        return "Member{" +
                "uuid=" + uuid +
                ", memberNumber=" + memberNumber +
                ", name=" + name +
                ", tlfNumber=" + tlfNumber +
                ", email=" + email +
                ", bankNumber=" + bankNumber +
                ", feeType=" + feeType +
                '}';
    }
}
