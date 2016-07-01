import entity.Bank;
import manager.BankManage;

import java.util.Scanner;

/**
 * Created by Administrator on 29.06.2016.
 */
public class Menu {
    public static void main(String[] args) {
        int ID;
        String name;

        BankManage bank = new BankManage();

        Scanner data = new Scanner(System.in);
        System.out.print("Banka ID sini giriniz");
        ID = data.nextInt();
        System.out.print("Banka adını giriniz");
        name = data.next();
        bank.add(ID,name);
        bank.view(ID);
    }

}


