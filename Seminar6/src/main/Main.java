package main;

import builder.Builder;
import builder.ContBancar;
import builder.ContBancarBuilder;
import builder.ContBuilder;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder contBuilder = new ContBuilder();
        contBuilder.setNumeClient("Andreea").setCardAtasat(true);
        ContBancar contBancar1= (ContBancar) contBuilder.build();



        ContBancar contBancar2= (ContBancar) contBuilder.setNumeClient("Maria").setPrimesteSalariu(true).build();
        System.out.println(contBancar1);
        System.out.println(contBancar2);


        final Map<String, Integer> documente = new HashMap<>();
        documente.put("CI", 2);
        documente.put("Adeverinta", 6);

        final prototype.model.ContBancar cb = new prototype.model.ContBancar("Andrei",documente,8);
        final prototype.model.ContBancar cb2 = (prototype.model.ContBancar) cb.Cloneaza();

        System.out.println(cb == cb2);
        System.out.println(cb);
        System.out.println(cb2);
    }
}
