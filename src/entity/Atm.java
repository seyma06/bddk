package entity;

/**
 * Created by Administrator on 29.06.2016.
 */
public class Atm {
    private int bankID;
    private int atmID;
    private String atmName;

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public int getAtmID() {
        return atmID;
    }

    public void setAtmID(int atmID) {
        this.atmID = atmID;
    }

    public String getAtmName() {
        return atmName;
    }

    public void setAtmName(String atmName) {  this.atmName = atmName;  }
}
