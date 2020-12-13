package com.epam.homework.adapter;

import com.epam.homework.builder.Report;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class EnricherAdapter implements Exgester {

    private Enricher enricher;

    public EnricherAdapter(Enricher enricher) {
        this.enricher = enricher;
    }

    @Override
    public Report generateReport() {
        OldReport oldReport = this.enricher.generateReport();
        ZonedDateTime zonedDateTime = ZonedDateTime
                .of(LocalDateTime
                                .of(oldReport.getCreateDate().toLocalDate(), oldReport.getCreateTime().toLocalTime()),
                        ZoneOffset.UTC);
        return new Report.ReportBuilderImpl()
                .setMessage(oldReport.getMessage())
                .setIsReported(oldReport.isReported())
                .setCreatedDate(zonedDateTime)
                .setUpdatedDate(zonedDateTime)
                .build();
    }
}
