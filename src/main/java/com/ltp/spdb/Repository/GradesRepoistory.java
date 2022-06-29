package com.ltp.spdb.Repository;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class GradesRepoistory {

    private List<Grades> gradesList= new ArrayList<>();

    public List<Grades> getGrades(){
        return gradesList;
    } 

    public Grades newGrade(){
        return( new Grades());
    }
    

    public void addGrades(Grades grades){
        gradesList.add(grades);
    }
    
}
