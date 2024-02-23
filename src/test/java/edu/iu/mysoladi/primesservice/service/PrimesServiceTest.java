package edu.iu.mysoladi.primesservice.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {

    PrimesService primesService = new PrimesService();

    @Test
    void _45_is_not_prime() {
        assertFalse(primesService.isPrime(45));
    }

    @Test
    void _47_is_prime() {
        assertTrue(primesService.isPrime(47));
    }

    @Test
    void _1_is_not_prime() {
        assertFalse(primesService.isPrime(1));
    }


}