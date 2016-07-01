package entity;

/**
 * Created by Administrator on 29.06.2016.
 */
public class Branch {
    private int bankID;
    private int branchID;
    private String branchName;

    public int getBankID() {  return bankID;  }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public int getBranchID() {
        return branchID;
    }

    public void setBranchID(int branchID) {
        this.branchID = branchID;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
