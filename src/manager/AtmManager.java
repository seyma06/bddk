package manager;

import entity.Atm;

/**
 * Created by Administrator on 29.06.2016.
 */
public class AtmManage implements Manager {

    Atm atm = new Atm();

    @Override
    public void add(String name) {
        //todo id'yi bir sekilde bulmaliyim
        //atm.setAtmID(id);
        atm.setAtmName(name);
    }

    @Override
    public void view(int id) {
        atm.setAtmID(id);
        System.out.println("Atm adı:"+atm.getAtmName()+"    atm id:"+atm.getAtmID());

    }

    @Override
    public void remove(int id) {
        atm.setAtmID(id);
        atm.setAtmName("");
        atm.setAtmID(0);
    }
}
