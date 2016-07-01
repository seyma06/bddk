package manager;

import entity.Branch;

/**
 * Created by Administrator on 29.06.2016.
 */
public class BranchManage implements Manage {

    Branch branch = new Branch();

    @Override
    public void add(int id, String name) {
        branch.setBranchID(id);
        branch.setBranchName(name);
    }

    @Override
    public void view(int id) {
        branch.setBranchID(id);
        System.out.println("Şube adı:"+branch.getBranchName()+"    şube id:"+branch.getBranchID());
    }

    @Override
    public void remove(int id) {
        branch.setBranchID(id);
        branch.setBranchName("");
        branch.setBranchID(0);
    }
}
