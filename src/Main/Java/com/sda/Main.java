package com.sda;

import com.sda.model.Fermier;
import com.sda.repository.FermierRepository;

public class Main {

    public static void main(String[] args) {

        Fermier fermier1 = new Fermier("AGRO", 123456, "agro@agro.ro");
        Fermier fermier2 = new Fermier("AgroJonny", 524682, "agrojonny@agro.com");

        FermierRepository fermierRepository = new FermierRepository();
        fermierRepository.save(fermier1);
        fermierRepository.save(fermier2);

        
    }
}
