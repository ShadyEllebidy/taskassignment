package org.redischool.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Scheduel")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode(of = {"id"})
@Builder(toBuilder = true)
@Getter
public class Schedule {
    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "DATE")
    private Date date;
    @Column(name = "ENDTIME")
    private Date endTime;
    @Column(name = "STARTTIME")
    private Date startTime;
    @Column(name = "HOLIDAY")
    private Boolean holiDay;

    @Column(name = "EMPLOYEEOBJECT")
    private Employee employeeObject;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Employee_ID")
    private Employee employee;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "scheduel")
    private Set<Assignment> assignments;

}
