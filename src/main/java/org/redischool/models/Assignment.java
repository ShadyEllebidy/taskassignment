package org.redischool.models;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.UUID;

public class Assignment {

    private UUID id;
    private Task task;
    private Language language;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Scheduel_ID")
    private Schedule schedule;
}
