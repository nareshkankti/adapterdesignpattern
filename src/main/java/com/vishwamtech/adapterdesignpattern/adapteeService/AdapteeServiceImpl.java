package com.vishwamtech.adapterdesignpattern.adapteeService;

import org.springframework.stereotype.Service;

@Service
public class AdapteeServiceImpl implements AdapteeService{
    @Override
    public double getWeightInPound() {
        return 20;
    }
}
