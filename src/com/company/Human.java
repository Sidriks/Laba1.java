package com.company;
import java.text.DecimalFormat;
import java.time.*;
public class Human {
    private String lastName;
    private String position;
    private LocalDate dateSignContract;
    private LocalDate termContract;
    private int salary;

    public String getLastName() {
        return lastName;
    }

    public boolean trySetLastName(String lastName) {
        if(lastName!= null)
        {
        this.lastName = lastName;
        return true;
    }
        return false;
    }

    public String getPosition() {
        return position;
    }

    public boolean trySetPosition(String position) {
        if(position!= null)
        {
        this.position = position;
    return true;
        }
        return false;
    }

    public LocalDate getDateSignContract() {
        return dateSignContract;
    }

    public boolean trySetDateSignContract(String dateSignContract) {
        if(dateSignContract!= null)
        {
            try {
                this.dateSignContract = LocalDate.parse(dateSignContract);
                return true;

            }catch(Exception xe)
            {
                return false;
            }
        }

        return false;
    }

    public LocalDate getTermContract() {
        return termContract;
    }

    public boolean trySetTermContract(String termContract) {
        if(termContract!= null)
        {
            try {
                this.termContract = LocalDate.parse(termContract);
                return true;

            }catch(Exception xe)
            {
            return false;
            }
        }

        return false;
    }

    public int getSalary() {
        return salary;
    }

    public boolean trySetSalary(int salary) {
        if (salary >0) {
                this.salary = salary;
                return true;
        }
        return false;
    }
}

