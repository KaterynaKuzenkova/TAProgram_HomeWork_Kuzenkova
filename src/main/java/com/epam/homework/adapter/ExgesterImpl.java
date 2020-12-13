package com.epam.homework.adapter;

import com.epam.homework.builder.Report;

public class ExgesterImpl implements Exgester {

    private EnricherAdapter enricherAdapter;

    public ExgesterImpl(EnricherAdapter enricherAdapter) {
        this.enricherAdapter = enricherAdapter;
    }

    @Override
    public Report generateReport() {
        return enricherAdapter.generateReport();
    }
}
