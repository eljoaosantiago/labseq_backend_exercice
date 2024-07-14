package com.joaosantiago.labseq;

import com.joaosantiago.labseq.LabseqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labseq")
public class LabseqController {

    @Autowired
    private LabseqService labseqService;

    @GetMapping("/{n}")
    public long getLabseqValue(@PathVariable("n") int n) {
        return labseqService.getLabseqValue(n);
    }
}