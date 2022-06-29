package com.ltp.spdb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltp.spdb.Repository.Grades;
import com.ltp.spdb.Repository.GradesRepoistory;

@Service
public class GreadesService {
    @Autowired
    GradesRepoistory gradesRepoistory;

    public List<Grades> getGrades(){
        return gradesRepoistory.getGrades();
    }

    public void addGrades(Grades grades){
        gradesRepoistory.addGrades(grades);
    }

    public Grades getNewGrade(){
        return gradesRepoistory.newGrade();
    }
}
