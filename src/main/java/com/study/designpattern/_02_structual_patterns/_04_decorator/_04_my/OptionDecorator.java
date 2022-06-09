package com.study.designpattern._02_structual_patterns._04_decorator._04_my;

import java.util.List;

// Decorator
public class OptionDecorator implements OptionService {

    private OptionService optionService;

    public OptionDecorator(OptionService optionService) {
        this.optionService = optionService;
    }

    @Override
    public void addOption(List<String> options) {
        optionService.addOption(options);
    }
}
