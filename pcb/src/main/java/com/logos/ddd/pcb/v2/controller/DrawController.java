package com.logos.ddd.pcb.v2.controller;

import com.logos.ddd.pcb.v1.application.DrawService;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrawController {
    private final DrawService drawService;

    public DrawController(DrawService drawService) {
        this.drawService = drawService;
    }

    @PatchMapping("/link-chip/{startChipId}/{endChipId}")
    public void linkChip(@PathVariable Long startChipId, @PathVariable Long endChipId) {
        drawService.linkChip(startChipId, endChipId);
    }
}
