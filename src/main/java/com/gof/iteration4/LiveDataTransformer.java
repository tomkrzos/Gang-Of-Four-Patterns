package com.gof.iteration4;

public class LiveDataTransformer implements DataTransformer {
    private static final String REPLACE_FROM = "0";
    private static final String REPLACE_TO = "1";

    @Override
    public String transform(String s) {
        return s.replaceAll(REPLACE_FROM, REPLACE_TO);
    }
}