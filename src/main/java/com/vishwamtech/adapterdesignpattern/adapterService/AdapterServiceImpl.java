package com.vishwamtech.adapterdesignpattern.adapterService;

import com.vishwamtech.adapterdesignpattern.adapteeService.AdapteeService;
import org.springframework.stereotype.Service;

@Service
public class AdapterServiceImpl implements AdapterService{
    AdapteeService weightMachine;

    public AdapterServiceImpl(AdapteeService weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPound();
        //Convert it to KGs
        double weightInKg = weightInPound * .45;
        System.out.println("weightInKg: " + weightInKg);
        return weightInKg;
    }
}
