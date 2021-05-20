package com.sda;

import com.sda.model.Arendator;
import com.sda.model.Fermier;
import com.sda.repository.ArendatoriRepository;
import com.sda.repository.FermierRepository;

public class Main {

    public static void main(String[] args) {

        Fermier fermier1 = new Fermier("AGRO", 123456, "agro@agro.ro");
        Fermier fermier2 = new Fermier("AgroJonny", 524682, "agrojonny@agro.com");

        FermierRepository fermierRepository = new FermierRepository();
        fermierRepository.save(fermier1);
        fermierRepository.save(fermier2);

        Arendator arendator1 = new Arendator("Ion", "Ionescu", 123456789, "ionut12@yahoo.com");
        Arendator arendator2 = new Arendator("Vasile", "Vasilescu", 1245646789, "v.gsjdyfg@yahoo.com");

        ArendatoriRepository arendatoriRepository = new ArendatoriRepository();

        arendatoriRepository.save(arendator1);
        arendatoriRepository.save(arendator2);

    }
}
