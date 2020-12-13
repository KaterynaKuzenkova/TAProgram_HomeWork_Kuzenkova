package com.epam.homework.adapter;

import java.sql.Date;
import java.sql.Time;

public class EnricherImpl implements Enricher {

    @Override
    public OldReport generateReport() {
        return new OldReport(new Date(1607878854000L), new Time(1607878854000L), "old input message", true);
    }
}
