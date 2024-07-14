package com.joaosantiago.labseq;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LabseqService {

    private final Map<Integer, Long> cache = new HashMap<>();

    public LabseqService() {
        // Initialize base cases
        cache.put(0, 0L);
        cache.put(1, 1L);
        cache.put(2, 0L);
        cache.put(3, 1L);
    }

    public long getLabseqValue(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        // Recursive calculation with caching
        long value = getLabseqValue(n - 4) + getLabseqValue(n - 3);
        cache.put(n, value);
        return value;
    }
}