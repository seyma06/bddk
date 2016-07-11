package manager;

import entity.Bank;

/**
 * Created by Administrator on 29.06.2016.
 */
public class BankManage implements Manager {
    Bank bank = new Bank();

    @Override
    public void add(String name) {
        //todo id'yi bir sekilde bulmaliyim
        //bank.setBankName(name);
        bank.setBankID(id);

    }

    @Override
    public void view(int id) {
        bank.setBankID(id);
        System.out.println("Banka adı:"+bank.getBankName()+"    banka id:"+bank.getBankID());

    }

    @Override
    public void remove(int id) {
        bank.setBankID(id);
        bank.setBankName("");
        bank.setBankID(0);
    }
}
