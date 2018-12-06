package com.chuange.aishijing.dto.classes;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author augus
 * @create 2018/11/26 23:12
 */

public class AddFirstClassesDTO {
    @NotNull
    private String firstSectionName;
    private String firstSectionId;
    private List<AddSecondClassDTO> secondClasses = new ArrayList<AddSecondClassDTO>();

    @Override
    public String toString() {
        return "AddFirstClassesDTO{" +
                "firstSectionId='" + firstSectionId + '\'' +
                '}';
    }

    public AddFirstClassesDTO(@NotNull String firstSectionName, String firstSectionId, List<AddSecondClassDTO> secondClasses) {
        this.firstSectionName = firstSectionName;
        this.firstSectionId = firstSectionId;
        this.secondClasses = secondClasses;
    }

    public AddFirstClassesDTO() {
    }

    public String getFirstSectionId() {
        return firstSectionId;
    }

    public void setFirstSectionId(String firstSectionId) {
        this.firstSectionId = firstSectionId;
    }

    public AddFirstClassesDTO(String firstSectionName, List<AddSecondClassDTO> secondClasses) {
        this.firstSectionName = firstSectionName;
        this.secondClasses = secondClasses;
    }

    public String getFirstSectionName() {
        return firstSectionName;
    }

    public void setFirstSectionName(String firstSectionName) {
        this.firstSectionName = firstSectionName;
    }

    public void addSecondClasses(AddSecondClassDTO addSecondClassDTO) {
        if (secondClasses == null) {
            secondClasses = new ArrayList<AddSecondClassDTO>();
        }
        secondClasses.add(addSecondClassDTO);
    }

    public List<AddSecondClassDTO> getSecondClasses() {
        return secondClasses;
    }

    public void setSecondClasses(List<AddSecondClassDTO> secondClasses) {
        this.secondClasses = secondClasses;
    }
}