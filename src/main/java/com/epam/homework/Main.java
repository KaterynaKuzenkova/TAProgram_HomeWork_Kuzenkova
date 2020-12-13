package com.epam.homework;

import com.epam.homework.adapter.*;
import com.epam.homework.builder.Report;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        Report.ReportBuilder reportBuilder = new Report.ReportBuilderImpl();
        reportBuilder.setCreatedDate(ZonedDateTime.now());
        reportBuilder.setMessage("input message");
        reportBuilder.setIsReported(true);
        Report report = reportBuilder.build();
        System.out.println(report);

        Enricher enricher = new EnricherImpl();
        EnricherAdapter enricherAdapter = new EnricherAdapter(enricher);
        Exgester exgester = new ExgesterImpl(enricherAdapter);
        System.out.println(exgester.generateReport());

    }
}
