package Code;

import java.util.Objects;
import java.util.UUID;

public class Member {
    UUID uuid;
    int memberNumber;
    String name,tlfNumber,email,bankNumber,feeType,password;
    Trainer trainer;

    public Member(int memberNumber, String name, String tlfNumber, String  email,String password, String bankNumber, String feeType) {
        uuid = UUID.randomUUID();
        this.memberNumber = memberNumber;
        this.name = name;
        this.tlfNumber = tlfNumber;
        this.email = email;
        this.password = password;
        this.bankNumber = bankNumber;
        this.feeType = feeType;
        trainer = null;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
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
                ", idtrainer=" + trainer.uid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return getMemberNumber() == member.getMemberNumber() && Objects.equals(getUuid(), member.getUuid()) && Objects.equals(getName(), member.getName()) && Objects.equals(getTlfNumber(), member.getTlfNumber()) && Objects.equals(getEmail(), member.getEmail()) && Objects.equals(getBankNumber(), member.getBankNumber()) && Objects.equals(getFeeType(), member.getFeeType()) && Objects.equals(getPassword(), member.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid(), getMemberNumber(), getName(), getTlfNumber(), getEmail(), getBankNumber(), getFeeType(), getPassword());
    }

}
