package com.nhnacademy.residentmanagementsystem.repository;

import com.nhnacademy.residentmanagementsystem.dto.response.ResidentBirthDeathReportResponseDto;
import com.nhnacademy.residentmanagementsystem.entity.BirthDeathReportResident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirthDeathReportResidentRepository extends JpaRepository<BirthDeathReportResident
        , BirthDeathReportResident.BirthDeathReportResidentPk> {

    ResidentBirthDeathReportResponseDto findByBirthDeathReportResidentPk(BirthDeathReportResident.BirthDeathReportResidentPk birthDeathReportResidentPk);
}

