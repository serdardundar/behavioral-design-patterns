package com.gh.sd.behavioralpatterns.chainofresponsibility;

import com.gh.sd.behavioralpatterns.chainofresponsibility.Employee.Role;

import java.time.LocalDate;
import java.time.Period;

//Represents a request in our chain of responsibility
public class LeaveService {

    public enum Type {SICK, PTO, LOP}

    public enum Status {PENDING, APPROVED, REJECTED}

    private final Type type;

    private final LocalDate from;

    private final LocalDate to;

    private Role processedBy;

    private Status status;

    public LeaveService(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.PENDING;
    }

    public Type getType() {
        return type;
    }

    public int getNoOfDays() {
        return Period.between(from, to).getDays();
    }

    public void approve(Role approverName) {
        this.status = Status.APPROVED;
        this.processedBy = approverName;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return type + " leave for " + getNoOfDays() + " day(s) " + status
            + " by " + processedBy;
    }

    public static class Builder {
        private Type type;
        private LocalDate from;
        private LocalDate to;

        private Builder() {

        }

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder from(LocalDate from) {
            this.from = from;
            return this;
        }

        public Builder to(LocalDate to) {
            this.to = to;
            return this;
        }

        public LeaveService build() {
            return new LeaveService(type, from, to);
        }
    }
}
