package com.vishwamtech.adapterdesignpattern.controller;

import com.vishwamtech.adapterdesignpattern.adapterService.AdapterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdapterController {


    AdapterService weightMachineAdapter;
    public AdapterController(AdapterService weightMachineAdapter) {
        this.weightMachineAdapter = weightMachineAdapter;
    }
    @GetMapping("/getWeightInKg")
    public String getWeightInKg() {
        return String.valueOf(weightMachineAdapter.getWeightInKg());
    }
}
