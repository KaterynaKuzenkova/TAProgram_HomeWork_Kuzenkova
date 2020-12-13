package com.epam.homework;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        ReportBuilder reportBuilder = new ReportBuilderImpl();
        reportBuilder.setCreatedDate(ZonedDateTime.now());
        reportBuilder.setMessage("input message");
        reportBuilder.setIsReported(true);
        Report report = reportBuilder.build();
        System.out.println(report);


    }

    static class Report {
        private ZonedDateTime createdDate;
        private ZonedDateTime updatedDate;
        private String message;
        private boolean isReported;

        @Override
        public String toString() {
            return "Report{" +
                    "createdDate=" + createdDate +
                    ", updatedDate=" + updatedDate +
                    ", message='" + message + '\'' +
                    ", isReported=" + isReported +
                    '}';
        }
    }

    interface ReportBuilder {
        ReportBuilder setCreatedDate(ZonedDateTime createdDate);

        ReportBuilder setUpdatedDate(ZonedDateTime updatedDate);

        ReportBuilder setMessage(String message);

        ReportBuilder setIsReported(boolean isReported);

        Report build();
    }

    static class ReportBuilderImpl implements ReportBuilder {
        Report report = new Report();

        @Override
        public ReportBuilder setCreatedDate(ZonedDateTime createdDate) {
            report.createdDate = createdDate;
            return this;
        }

        @Override
        public ReportBuilder setUpdatedDate(ZonedDateTime updatedDate) {
            report.updatedDate = updatedDate;
            return this;
        }

        @Override
        public ReportBuilder setMessage(String message) {
            report.message = message;
            return this;
        }

        @Override
        public ReportBuilder setIsReported(boolean isReported) {
            report.isReported = isReported;
            return this;
        }

        @Override
        public Report build() {
            return report;
        }
    }
}
