package edu.iu.mysoladi.primesservice.service;

import org.springframework.stereotype.Service;

@Service
public class PrimesService implements IPrimesService {

    @Override
    public boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
